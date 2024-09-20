package com.pdd.pop.sdk.message;

import javax.websocket.ClientEndpoint;
import javax.websocket.CloseReason;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;

import com.pdd.pop.sdk.common.logger.PopLogger;
import com.pdd.pop.sdk.common.logger.PopLoggerFactory;
import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.sdk.message.model.AckMessage;
import com.pdd.pop.sdk.message.model.CommandType;
import com.pdd.pop.sdk.message.model.Message;
import com.pdd.pop.sdk.message.model.ServerMessage;

@ClientEndpoint
public class WsClientEndPoint {

    private static final PopLogger logger = PopLoggerFactory.getLogger(WsClientEndPoint.class);
    private WsClient wsClient;

    public WsClientEndPoint(WsClient wsClient) {
        this.wsClient = wsClient;
    }

    @OnOpen
    public void onOpen(Session session) {
        logger.debug(String.format("webSocket on open,session=%s", session.getId()));
    }

    @OnClose
    public void onClose(Session session, CloseReason closeReason) {
        logger.info(String.format("webSocket on close, session=%s, reason=%s", session.getId(),
                closeReason.toString()));
        if (wsClient != null) {
            wsClient.onClose(closeReason);
        }
    }

    @OnError
    public void onError(Session session, Throwable throwable) {
        logger.error("webSocket on error, session=" + session.getId() + ", throwable={}", throwable);
    }


    private void dealMessage(ServerMessage serverMessage) {
        try {
            Message messageValue = serverMessage.getMessage();
            wsClient.getMessageHandler().onMessage(messageValue);
            sendAck(serverMessage);
        } catch (Exception e) {
            logger.error("webSocket onMessage error.", e);
            sendFailAck(serverMessage, e.getMessage());
        }
    }


    @OnMessage
    public void onMessage(String message) {
        try {
            logger.debug("webSocket message received:[" + message + "]");
            final ServerMessage serverMessage = JsonUtil.transferToObj(message, ServerMessage.class);
            if (wsClient != null && wsClient.getMessageHandler() != null && serverMessage != null) {
                switch (serverMessage.getCommandType()) {
                    case Common:
                        // 统计客户端处理平均值 ,是不是要加个开关?
                        long dealStart = System.currentTimeMillis();
                        try {
                            if (wsClient.getThreadPool() != null) {
                                wsClient.getThreadPool().execute(new Runnable() {
                                    public void run() {
                                        dealMessage(serverMessage);
                                    }
                                });
                            } else {
                                dealMessage(serverMessage);
                            }
                        }
                        catch (Exception e) {
                            logger.error("webSocket onMessage error.", e);
                            sendFailAck(serverMessage, e.getMessage());
                        }
                        finally {
                            wsClient.getHeartbeatMonitor().getMeter().mark();
                        }
                        long dealTime = System.currentTimeMillis() - dealStart;
                        if (wsClient.getHeartbeatMonitor() != null) {
                            wsClient.getHeartbeatMonitor().getHistogram().update(dealTime);
                        }

                        break;
                    case HeartBeat:
                        rcvHb(serverMessage);
                        break;
                    case Fail:
                        handleFail(serverMessage);
                        break;
                    default:
                        break;
                }
            }
        } catch (Exception e) {
            logger.error("webSocket handle error.", e);
        }
    }

    private void handleFail(ServerMessage serverMessage) {
        logger.error(String.format("[receive fail msg from server],reason=%s", serverMessage.getMessage()));
    }

    private void rcvHb(ServerMessage serverMessage) {
        try {
            wsClient.getHeartbeatMonitor().rcvHeartbeat(serverMessage);
        } catch (Exception e) {
            logger.error("[heartbeat fail]", e);
        }
    }

    //在tomcatwebsock的实现下 即使网络断开了 ,无论使用同步发送 还是异步发送 都不会报错.
    private void sendAck(ServerMessage inMsg) {
        try {
            AckMessage ack = new AckMessage(inMsg.getId(), CommandType.Ack, inMsg.getSendTime(),
                    inMsg.getMessage().getType(), inMsg.getMessage().getMallID(), null);
            wsClient.getSession().getAsyncRemote().sendText(JsonUtil.transferToJson(ack));
//            if (wsClient.getSendAckResultHandler() != null) {
//                wsClient.getSendAckResultHandler().onAck(inMsg.getMessage(), true, null);
//            }

        } catch (Exception e) {
            logger.error("[send ack msg fail]", e);
//            if (wsClient.getSendAckResultHandler() != null) {
//                wsClient.getSendAckResultHandler().onAck(inMsg.getMessage(), false, e.getMessage());
//            }
        }
    }

    private void sendFailAck(ServerMessage inMsg, String failReson) {
        try {
            if (failReson != null && failReson.length() > 1000) {
                failReson = failReson.substring(0, 1000);
            }

            AckMessage ack = new AckMessage(inMsg.getId(), CommandType.Fail, inMsg.getSendTime(),
                    inMsg.getMessage().getType(), inMsg.getMessage().getMallID(), failReson);
            wsClient.getSession().getAsyncRemote().sendText(JsonUtil.transferToJson(ack));

        } catch (Exception e) {
            logger.error("[send ack msg fail]", e);

        }
    }

}
