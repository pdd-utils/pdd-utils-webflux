package com.pdd.pop.sdk.http;

import com.pdd.pop.sdk.common.constant.UrlEnum;
import com.pdd.pop.sdk.common.exception.PopClientException;
import com.pdd.pop.sdk.common.util.CloudInnerUtils;
import com.pdd.pop.sdk.common.util.PreconditionUtil;
import com.pdd.pop.sdk.common.util.StringUtils;
import com.pdd.pop.sdk.http.client.AbstractPopClient;
import com.pdd.pop.sdk.http.client.ApiPlatformType;
import com.pdd.pop.sdk.http.client.HttpClientFactory;
import com.pdd.pop.ext.apache.http.impl.client.CloseableHttpClient;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class PopHttpClient extends AbstractPopClient {

    private ExecutorService executorService;

    public PopHttpClient(String clientId, String clientSecret) {
        this(clientId, clientSecret, HttpClientConfig.getDefault());
    }

    public PopHttpClient(String apiServerUrl, String clientId, String clientSecret) {
        this(clientId, clientSecret, HttpClientConfig.getDefault());
        this.apiServerUrl = apiServerUrl;
    }

    public PopHttpClient(String apiServerUrl, String clientId, String clientSecret, HttpClientConfig config) {
        this(clientId, clientSecret, config);
        this.apiServerUrl = apiServerUrl;
    }

    public PopHttpClient(String clientId, String clientSecret, CloseableHttpClient closeableHttpClient) {
        PreconditionUtil.checkNotNull(closeableHttpClient);
        PreconditionUtil.checkNotNull(clientId);
        PreconditionUtil.checkNotNull(clientSecret);

        this.clientId = clientId;
        this.clientSecret = clientSecret;

        httpClient = closeableHttpClient;
        executorService = getDefaultExecutorService();
    }

    public PopHttpClient(String clientId, String clientSecret, HttpClientConfig config) {
        PreconditionUtil.checkNotNull(clientId);
        PreconditionUtil.checkNotNull(clientSecret);

        this.clientId = clientId;
        this.clientSecret = clientSecret;

        httpClient = HttpClientFactory.getHttpClient(config);
        if (config == null || config.getExecutorService() == null) {
            executorService = getDefaultExecutorService();
        } else {
            executorService = config.getExecutorService();
        }
    }

    /**
     * 同步执行请求
     *
     * @param request : 请求参数
     * @param <T>     响应类
     * @return 继承于 PopBaseHttpResponse的响应
     * @throws Exception
     */
    public <T extends PopBaseHttpResponse> T syncInvoke(PopBaseHttpRequest<T> request) throws Exception {
        return syncInvoke(request, null);
    }

    /**
     * 同步执行请求
     *
     * @param request     : 请求参数
     * @param accessToken : 鉴权token
     * @param <T>         响应类
     * @return 继承于 PopBaseHttpResponse的响应
     * @throws Exception
     */
    public <T extends PopBaseHttpResponse> T syncInvoke(PopBaseHttpRequest<T> request, String accessToken) throws Exception {
        return syncInvoke(request, accessToken, null);
    }

    /**
     * 同步执行请求
     *
     * @param request     : 请求参数
     * @param accessToken : 鉴权token
     * @param clientInfo  : 客户端信息
     * @param <T>         响应类
     * @return 继承于 PopBaseHttpResponse的响应
     * @throws Exception
     */
    public <T extends PopBaseHttpResponse> T syncInvoke(PopBaseHttpRequest<T> request, String accessToken, PopClientInfo clientInfo) throws Exception {
        return syncInvoke(request, accessToken, clientInfo, request.getResponseClass());
    }

    public <T extends PopBaseHttpResponse, K extends PopBaseHttpResponse> K syncInvokeCustomized(PopBaseHttpRequest<T> request, Class<K> valueType) throws Exception {
        return syncInvokeCustomized(request, null, valueType);
    }

    public <T extends PopBaseHttpResponse, K extends PopBaseHttpResponse> K syncInvokeCustomized(PopBaseHttpRequest<T> request, String accessToken, Class<K> valueType) throws Exception {
        return syncInvoke(request, accessToken, null, valueType);
    }

    private <T extends PopBaseHttpResponse, K extends PopBaseHttpResponse> K syncInvoke(PopBaseHttpRequest<T> request, String accessToken,
                                                                                        PopClientInfo clientInfo, Class<K> valueType) throws Exception {
        String url = handleInvokeServiceUrl(request.getPlatform());
        handleClientInfo(request, clientInfo);
        switch (request.getHttpMethod()) {
            case GET:
                return syncGet(request, accessToken, url, valueType);
            case POST:
                return syncPost(request, accessToken, url, valueType);
            default:
                throw new PopClientException(ClientErrorCode.ILLEGAL_HTTP_METHOD);
        }
    }

    /**
     * 异步执行请求
     *
     * @param request : 请求参数
     * @param <T>     响应类
     * @return Future<PopBaseHttpResponse>的响应
     * @throws Exception
     */
    public <T extends PopBaseHttpResponse> Future<T> asyncInvoke(final PopBaseHttpRequest<T> request) throws Exception {
        return asyncInvoke(request, null);
    }

    /**
     * 异步执行请求
     *
     * @param request     : 请求参数
     * @param accessToken : 鉴权token
     * @param <T>         响应类
     * @return Future<PopBaseHttpResponse>的响应
     * @throws Exception
     */
    public <T extends PopBaseHttpResponse> Future<T> asyncInvoke(final PopBaseHttpRequest<T> request, final String accessToken) throws Exception {
        return asyncInvoke(request, accessToken, null);
    }

    /**
     * 异步执行请求
     *
     * @param request     : 请求参数
     * @param accessToken : 鉴权token
     * @param clientInfo  : 客户端信息
     * @param <T>         响应类
     * @return Future<PopBaseHttpResponse>的响应
     * @throws Exception
     */
    public <T extends PopBaseHttpResponse> Future<T> asyncInvoke(final PopBaseHttpRequest<T> request, final String accessToken, PopClientInfo clientInfo) throws Exception {
        return asyncInvoke(request, accessToken, clientInfo, request.getResponseClass());
    }

    public <T extends PopBaseHttpResponse, K extends PopBaseHttpResponse> Future<K> asyncInvokeCustomized(PopBaseHttpRequest<T> request, Class<K> valueType) throws Exception {
        return asyncInvokeCustomized(request, null, valueType);
    }

    public <T extends PopBaseHttpResponse, K extends PopBaseHttpResponse> Future<K> asyncInvokeCustomized(final PopBaseHttpRequest<T> request, final String accessToken, final Class<K> valueType) throws Exception {
        return asyncInvoke(request, accessToken, null, valueType);
    }

    private <T extends PopBaseHttpResponse, K extends PopBaseHttpResponse> Future<K> asyncInvoke(final PopBaseHttpRequest<T> request, final String accessToken,
                                                                                                 PopClientInfo clientInfo, final Class<K> valueType) throws Exception {
        PreconditionUtil.checkNotNull(executorService);
        handleClientInfo(request, clientInfo);
        return executorService.submit(new Callable<K>() {
            public K call() throws Exception {
                return syncInvokeCustomized(request, accessToken, valueType);
            }
        });
    }

    private String handleInvokeServiceUrl(Integer platform) {
        String serverUrl = this.apiServerUrl;
        if (StringUtils.isEmpty(serverUrl)) {
            serverUrl = getUrlByPlatform(platform);
        }
        if (serverUrl.startsWith("https") && CloudInnerUtils.isInPddCloud()) {
            serverUrl = serverUrl.replaceFirst("https", "http");
        }
        return serverUrl;
    }

    private String getUrlByPlatform(Integer platform) {
        switch (ApiPlatformType.getByCode(platform)) {
            case OPEN:
                return UrlEnum.OPEN.getUrl();
            case ARK:
                return UrlEnum.ARK.getUrl();
            case FILE:
                return UrlEnum.FILE.getUrl();
            default:
                return UrlEnum.OPEN.getUrl();
        }
    }

    /**
     * 将PopClientInfo中的信息加入request
     *
     * @param request
     * @param clientInfo
     * @param <T>
     */
    private <T extends PopBaseHttpResponse> void handleClientInfo(PopBaseHttpRequest<T> request, PopClientInfo clientInfo) {

        if (clientInfo == null) {
            return;
        }

        Map<String, String> headers = request.getHeaders();
        if (headers == null) {
            headers = new HashMap<String, String>();
            request.setHeaders(headers);
        }

        if (!StringUtils.isEmpty(clientInfo.getPddClientPlatform())) {
            headers.put("pdd-client-platform", clientInfo.getPddClientPlatform());
        }
        if (!StringUtils.isEmpty(clientInfo.getPddClientIp())) {
            headers.put("pdd-client-ip", clientInfo.getPddClientIp());
        }
        if (!StringUtils.isEmpty(clientInfo.getPddClientUserAgent())) {
            headers.put("pdd-client-user-agent", clientInfo.getPddClientUserAgent());
        }
        if (!StringUtils.isEmpty(clientInfo.getPddId())) {
            headers.put("pdd-id", clientInfo.getPddId());
        }
    }

    /*@Override
    public void destroy() {
        executorService.submit(new Runnable() {
            public void run() {
                PopHttpClient.super.destroy();
            }
        });
        executorService.shutdown();
    }*/

    /**
     * 手动启用备域名
     * 若已开启自动切换，则此时自动切换会失效
     */
    public static void enableBackupDomain() {
        DomainSwitcher.manualBackupDomain();
    }

    /**
     * 取消手动启用备域名，并恢复到使用主域名
     * 若开启过自动切换，则自动切换会恢复
     */
    public static void disableBackupDomain() {
        DomainSwitcher.manualMainDomain();
        DomainSwitcher.disableManual();
    }

    /**
     * 开启主备域名自动切换
     */
    public static void startAutoDomainSwitch() {
        DomainSwitcher.startAutoDomainSwitch();
    }

    /**
     * 关闭主备域名自动切换
     */
    public static void stopAutoDomainSwitch() {
        DomainSwitcher.stopAutoDomainSwitch();
    }

    /** 主备域名切换器 */
    private static class DomainSwitcher {

        private static ScheduledExecutorService SCHEDULE = null;

        /** 域名探测周期，单位：秒 */
        private static final int DETECT_PERIOD = 5;

        /** 每个探测周期的探测次数 */
        private static final int DETECT_COUNT = 5;

        /** 是否手动指定主备域名 */
        private volatile static boolean manual = false;

        /** 手动启用主域名 */
        private synchronized static void manualMainDomain() {
            DomainSwitcher.manual = true;
            for (UrlEnum urlEnum : UrlEnum.values()) {
                urlEnum.setCurrentMain(true);
            }
        }

        /** 手动启用备域名 */
        private synchronized static void manualBackupDomain() {
            DomainSwitcher.manual = true;
            for (UrlEnum urlEnum : UrlEnum.values()) {
                urlEnum.setCurrentMain(false);
            }
        }

        /** 取消手动启用域名 */
        private synchronized static void disableManual() {
            DomainSwitcher.manual = false;
        }

        /** 开启主备域名自动切换 */
        private synchronized static void startAutoDomainSwitch() {
            if (null != SCHEDULE) {
                return;
            }
            SCHEDULE = Executors.newScheduledThreadPool(1);
            SCHEDULE.scheduleAtFixedRate(new Runnable() {
                public void run() {
                    if (DomainSwitcher.manual) {
                        return;
                    }
                    for (UrlEnum urlEnum : UrlEnum.values()) {
                        int failCount = 0;
                        for (int i = 0; i < DETECT_COUNT; i++) {
                            try {
                                InetAddress[] allByName = InetAddress.getAllByName(urlEnum.getMainDomain());
                                if (null == allByName || allByName.length <= 0) {
                                    throw new UnknownHostException(urlEnum.getMainDomain());
                                }
                            } catch (Exception e) {
                                failCount++;
                                // e.printStackTrace();
                            }
                        }
                        urlEnum.setCurrentMain(failCount < (DETECT_COUNT * 0.6));
                    }
                }
            }, 0, DETECT_PERIOD, TimeUnit.SECONDS);
        }

        /** 停止主备域名自动切换 */
        public synchronized static void stopAutoDomainSwitch() {
            if (null != SCHEDULE) {
                SCHEDULE.shutdownNow();
            }
            SCHEDULE = null;
        }
    }
}
