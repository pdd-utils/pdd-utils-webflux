package com.pdd.pop.sdk.message;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;
import javax.websocket.CloseReason;
import javax.websocket.DeploymentException;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;

import com.pdd.pop.sdk.common.constant.UrlEnum;
import com.pdd.pop.sdk.common.util.CloudInnerUtils;
import com.pdd.pop.sdk.common.util.StringUtils;
import com.pdd.pop.ext.glassfish.tyrus.client.ClientManager;
import com.pdd.pop.ext.glassfish.tyrus.container.grizzly.client.GrizzlyClientContainer;

import com.pdd.pop.ext.codahale.metrics.ExponentiallyDecayingReservoir;
import com.pdd.pop.ext.codahale.metrics.Histogram;
import com.pdd.pop.ext.codahale.metrics.Meter;
import com.pdd.pop.sdk.common.logger.PopLogger;
import com.pdd.pop.sdk.common.logger.PopLoggerFactory;
import com.pdd.pop.sdk.common.util.DigestUtil;
import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.sdk.message.handler.SessionCloseHandler;
import com.pdd.pop.sdk.message.model.HeartBeatMessage;
import com.pdd.pop.sdk.message.model.ServerMessage;
import com.pdd.pop.sdk.message.model.TimeMetrics;


public class WsClient {

    private String wsAddress;
    private String clientId;
    private String clientSecret;

    private WebSocketContainer container;
    private Session session;
    private MessageHandler messageHandler;

    private SessionCloseHandler sessionCloseHandler;
    private ThreadPoolExecutor threadPool;


    private int threadCount = Runtime.getRuntime().availableProcessors() * 10; // 并发处理的线程数量
    private int fetchPeriod = 15;
    private int queueSize = 2000; // 消息缓冲队列大小
    private long heartbeatIntervalMillis;
    private long heartbeatTimeoutMillis;
    private HeartbeatMonitor heartbeatMonitor;
    private WsClientStatus status;

    private static int retryCnt = 0;

    private static final PopLogger logger = PopLoggerFactory.getLogger(WsClient.class);
    private static final Long HEARTBEAT_DEFAULT_INTERVAL_MILLIS = 5 * 1000L;

    private static final Long HEARTBEAT_DEFAULT_TIMEOUT_MILLIS = 3 * 60 * 1000L;
    
    private static final int RETRY_MAX = 10;

    public WsClient(String clientId, String clientSecret) {
        this("", clientId, clientSecret, null, false);
    }

    public WsClient(String clientId, String clientSecret, MessageHandler messageHandler) {
        this("", clientId, clientSecret, messageHandler, false);
    }

    public WsClient(String clientId, String clientSecret, MessageHandler messageHandler, boolean isMultithreading) {
        this("", clientId, clientSecret, messageHandler, isMultithreading);
    }


    public WsClient(String wsAddress, String clientId, String clientSecret, MessageHandler messageHandler) {
        this(wsAddress, clientId, clientSecret, messageHandler, false);
    }

    public WsClient(String wsAddress, String clientId, String clientSecret, MessageHandler messageHandler, boolean isMultithreading) {
        this.wsAddress = wsAddress;
        if (this.wsAddress != null && this.wsAddress.startsWith("wss") && CloudInnerUtils.isInPddCloud()) {
            this.wsAddress = wsAddress.replaceFirst("wss", "ws");
        }
        
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.messageHandler = messageHandler;
        this.heartbeatIntervalMillis = HEARTBEAT_DEFAULT_INTERVAL_MILLIS;
        this.heartbeatTimeoutMillis = HEARTBEAT_DEFAULT_TIMEOUT_MILLIS;
        if (isMultithreading) {
            this.threadPool = new ThreadPoolExecutor(threadCount, threadCount, fetchPeriod * 2, TimeUnit.MICROSECONDS,
                    new ArrayBlockingQueue<Runnable>(queueSize), new AbortPolicy());
        }


    }

    public void registerSessionCloseHandler(SessionCloseHandler sessionCloseHandler) {

        this.sessionCloseHandler = sessionCloseHandler;

    }
    //
    // public void registerAckResultHandler(SendAckResultHandler sendAckResultHandler) {
    //
    // this.sendAckResultHandler = sendAckResultHandler;
    //
    // }
    //
    // public SendAckResultHandler getSendAckResultHandler() {
    // return sendAckResultHandler;
    // }

    private void startReconnect() {
        if (heartbeatMonitor != null) {
            heartbeatMonitor.shutdown();
        }
        heartbeatMonitor = new HeartbeatMonitor(heartbeatIntervalMillis, heartbeatTimeoutMillis);
        heartbeatMonitor.start();

    }

    public synchronized void connect() {
        try {
            // 如果在线 则返回
            if (status == WsClientStatus.ONLINE) {
                return;
            }
            doConnect();
            startReconnect();
            logger.info("webSocket client connected.");
        } catch (Exception e) {
            closeSession();
            logger.error("webSocket client connect error.", e);
            throw new RuntimeException(e);

        }
    }

    private void closeSession() {
        try {
            if (this.session != null) {
                this.session.close();
            }
            logger.info("wsClient session close.");
        } catch (Exception e) {
            logger.error("wsClient session close fail", e);
        }
    }

    private void closeHeartbeatMonitor() {
        if (heartbeatMonitor != null) {
            heartbeatMonitor.shutdown();
            logger.info("heartbeatMonitor close.");
        }
    }

    public void close() {
        closeSession();
        closeHeartbeatMonitor();
        status = WsClientStatus.OFFLINE;
        logger.info("wsClient close.");
    }

    /**
     * 检查当前客户端是否在线. 注意, 由于自动重连的原因, 这个方法可能先返回false, 再次调用时返回true
     *
     * @return
     */
    public boolean isOnline() {
        return WsClientStatus.ONLINE.equals(status);
    }

    /**
     * 关闭事件时调用此方法
     *
     * @param closeReason
     */
    protected synchronized void onClose(CloseReason closeReason) {
        this.status = WsClientStatus.OFFLINE;
        if (sessionCloseHandler != null) {
            try {
                logger.debug("execute sessionCloseHandler method");
                sessionCloseHandler.onClose(this, closeReason);
            } catch (Exception e) {
                logger.debug("execute sessionCloseHandler method error", e);
            }
        }

    }

    public HeartbeatMonitor getHeartbeatMonitor() {
        return heartbeatMonitor;
    }

    public Session getSession() {
        return session;
    }

    public MessageHandler getMessageHandler() {
        return messageHandler;
    }

    public ThreadPoolExecutor getThreadPool() {
        return threadPool;
    }

    public void setMessageHandler(MessageHandler messageHandler) {
        this.messageHandler = messageHandler;
    }

    /**
     * @throws DeploymentException
     * @throws IOException
     * @throws URISyntaxException
     */
    private void doConnect() throws DeploymentException, IOException, URISyntaxException {
        container = ClientManager.createClient(GrizzlyClientContainer.class.getName());
        // ContainerProvider.getWebSocketContainer();
        long systemTime = System.currentTimeMillis();
        session = container.connectToServer(new WsClientEndPoint(this),
                new URI(handleWsAddress() + "/message/" + clientId + "/" + systemTime + "/"
                        + DigestUtil.md5Base64Sign32((this.clientId + String.valueOf(systemTime) + this.clientSecret))));
        status = WsClientStatus.ONLINE;
    }

    private void reconnect() {
        if (retryCnt++ >= RETRY_MAX) {
            logger.info("reconnect aborted because of reaching max retry times of  " + RETRY_MAX);
            heartbeatMonitor.shutdown();
            return;
        }
        try {
            // heartbeatMonitor.shutdown();
            doConnect();
            retryCnt = 0;
        } catch (Exception e) {
            logger.error("[wsClient reconnect error]", e);
        }
    }

    private String handleWsAddress() {
        String address = this.wsAddress;
        if (StringUtils.isEmpty(address)) {
            address = UrlEnum.MESSAGE.getUrl();
        }
        if (address.startsWith("wss") && CloudInnerUtils.isInPddCloud()) {
            address = address.replaceFirst("wss", "ws");
        }
        return address;
    }

    /**
     * 简易版的客户端状态枚举
     */
    private enum WsClientStatus {
        ONLINE, OFFLINE
    }

    class HeartbeatMonitor {

        private Histogram histogram = new Histogram(new ExponentiallyDecayingReservoir());

        private Meter meter = new Meter();

        public Meter getMeter() {
            return meter;
        }

        public Histogram getHistogram() {
            return histogram;
        }

        public void setHistogram(Histogram histogram) {
            this.histogram = histogram;
        }

        /**
         * 心跳间隔
         */
        private final long heartbeatInterval;

        /**
         * 超时时间
         */
        private final long sessionTimeout;

        /**
         * 上次hb发送时间戳
         */
        private volatile long lastHeartbeatSendInMis;

        /**
         * 上次hb接受时间戳
         */
        private volatile long lastHeartbeatRecInMis;
        private MonitorState state;
        private ScheduledExecutorService schedule;
        private static final long SESSION_KEEP_INTERVAL = 30 * 1000L;

        public HeartbeatMonitor(long heartbeatInterval, long sessionTimeout) {
            this.heartbeatInterval = heartbeatInterval;
            this.sessionTimeout = sessionTimeout;
            this.lastHeartbeatRecInMis = System.currentTimeMillis();
            this.schedule = Executors.newScheduledThreadPool(1);
            this.state = MonitorState.RUNNING;
        }

        private TimeMetrics getTimeMetrics() {
            TimeMetrics timeMetrics = new TimeMetrics();
            timeMetrics.setCount(histogram.getCount());
            timeMetrics.setMax(histogram.getSnapshot().getMax());
            timeMetrics.setMean(histogram.getSnapshot().getMean());
            timeMetrics.setMedian(histogram.getSnapshot().getMedian());
            timeMetrics.setMin(histogram.getSnapshot().getMin());
            timeMetrics.setThPercentile75(histogram.getSnapshot().get75thPercentile());
            timeMetrics.setThPercentile95(histogram.getSnapshot().get95thPercentile());
            timeMetrics.setThPercentile99(histogram.getSnapshot().get99thPercentile());
            timeMetrics.setMeanRate(meter.getMeanRate());
            timeMetrics.setOneMinuteRate(meter.getOneMinuteRate());
            return timeMetrics;
        }

        public void start() {
            schedule.scheduleWithFixedDelay(new Runnable() {
                public void run() {
                    try {
                        if (WsClientStatus.ONLINE.equals(status) && session != null
                                && session.getBasicRemote() != null) {
                            session.getBasicRemote()
                                    .sendText(JsonUtil.transferToJson(new HeartBeatMessage(getTimeMetrics())));
                            lastHeartbeatSendInMis = System.currentTimeMillis();
                            logger.debug("send heartbeat by client");
                        } else {
                            logger.debug("send heartbeat fail ,reason is session is close");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }, 0, heartbeatInterval, TimeUnit.MILLISECONDS);

            schedule.scheduleWithFixedDelay(new Runnable() {
                public void run() {
                    Long lastHeardbeatTimediff = System.currentTimeMillis() - lastHeartbeatRecInMis;
                    if (WsClientStatus.OFFLINE.equals(status)) {
                        logger.debug("do reconnet , the WsClientStatus is " + WsClientStatus.OFFLINE);
                        reconnect();
                    } else if (lastHeardbeatTimediff > sessionTimeout) {
                        logger.debug("do reconnet , the last heardbeat time diff is " + lastHeardbeatTimediff);
                        reconnect();
                    } else {
                        logger.debug("the last heardbeat time diff is " + lastHeardbeatTimediff);
                    }
                }
            }, 0, SESSION_KEEP_INTERVAL, TimeUnit.MILLISECONDS);
        }

        public void shutdown() {
            this.state = MonitorState.SHUTDOWN;
            this.schedule.shutdown();
        }

        public void rcvHeartbeat(ServerMessage serverMessage) {
            logger.debug(String.format("receive heartbeat from server, server time=%d", serverMessage.getTime()));
            this.lastHeartbeatRecInMis = System.currentTimeMillis();
        }

        // public boolean isHeartbeatOnline() {
        // return (System.currentTimeMillis() - lastHeartbeatRecInMis) <= sessionTimeout;
        // }
    }

    private enum MonitorState {
        RUNNING, SHUTDOWN,
    }

}
