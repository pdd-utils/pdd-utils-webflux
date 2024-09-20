package com.pdd.pop.sdk.http;

import java.util.concurrent.ExecutorService;


public class HttpClientConfig {

    /**
     * connect
     */
    private int connectionTimeoutMillis = 5000;
    private int socketTimeoutMillis = 5000;
    private int connectionRequestTimeout = 1000;

    private static final int MAX_CONNECTION_TIMEOUT_MILLIS = 5000;
    private static final int MAX_SOCKET_TIMEOUT_MILLIS = 5000;
    private static final int MAX_CONNECTION_REQUEST_TIMEOUT = 1000;

    // 代理设置
    private String proxyHost = null;
    private int proxyPort = 0;
    private boolean proxyIsHttps = false;

    /**
     * thread
     */
    private int maxParallel = 10;
    private long threadKeepAliveTime = 30;

    private int maxTotal = 50;
    private int defaultMaxPerRoute = 20;

    private ExecutorService executorService = null;

    public static HttpClientConfig getDefault() {
        return new HttpClientConfig();
    }

    public long getThreadKeepAliveTime() {
        return threadKeepAliveTime;
    }

    public void setThreadKeepAliveTime(long threadKeepAliveTime) {
        this.threadKeepAliveTime = threadKeepAliveTime;
    }

    public int getMaxParallel() {
        return maxParallel;
    }

    public void setMaxParallel(int maxParallel) {
        this.maxParallel = maxParallel;
    }

    public int getConnectionTimeoutMillis() {
        return connectionTimeoutMillis;
    }

    public void setConnectionTimeoutMillis(int connectionTimeoutMillis) {
        if (connectionTimeoutMillis > MAX_CONNECTION_TIMEOUT_MILLIS) {
            connectionTimeoutMillis = MAX_CONNECTION_TIMEOUT_MILLIS;
        }
        this.connectionTimeoutMillis = connectionTimeoutMillis;
    }

    public int getSocketTimeoutMillis() {
        return socketTimeoutMillis;
    }

    public void setSocketTimeoutMillis(int socketTimeoutMillis) {
        if (socketTimeoutMillis > MAX_SOCKET_TIMEOUT_MILLIS) {
            socketTimeoutMillis = MAX_SOCKET_TIMEOUT_MILLIS;
        }
        this.socketTimeoutMillis = socketTimeoutMillis;
    }

    public int getMaxTotal() {
        return maxTotal;
    }

    public void setMaxTotal(int maxTotal) {
        this.maxTotal = maxTotal;
    }

    public int getDefaultMaxPerRoute() {
        return defaultMaxPerRoute;
    }

    public void setDefaultMaxPerRoute(int defaultMaxPerRoute) {
        this.defaultMaxPerRoute = defaultMaxPerRoute;
    }

    public ExecutorService getExecutorService() {
        return executorService;
    }

    public void setExecutorService(ExecutorService executorService) {
        this.executorService = executorService;
    }

    public int getConnectionRequestTimeout() {
        return connectionRequestTimeout;
    }

    public void setConnectionRequestTimeout(int connectionRequestTimeout) {
        if (connectionRequestTimeout > MAX_CONNECTION_REQUEST_TIMEOUT) {
            connectionRequestTimeout = MAX_CONNECTION_REQUEST_TIMEOUT;
        }
        this.connectionRequestTimeout = connectionRequestTimeout;
    }

    public void setProxy(String proxyHost, int proxyPort, boolean isHttps) {
        this.proxyHost = proxyHost;
        this.proxyPort = proxyPort;
        this.proxyIsHttps = isHttps;
    }

    public String getProxyHost() {
        return proxyHost;
    }

    public int getProxyPort() {
        return proxyPort;
    }

    public boolean getProxyIsHttps() {
        return proxyIsHttps;
    }

    public static final class HttpClientConfigBuilder {
        private int connectionTimeoutMillis = 5000;
        private int socketTimeoutMillis = 5000;
        private int connectionRequestTimeout = 1000;
        private int maxParallel = 10;
        private long threadKeepAliveTime = 30;
        private int maxTotal = 50;
        private int defaultMaxPerRoute = 20;
        private ExecutorService executorService = null;
        private String proxyHost = null;
        private int proxyPort = 0;
        private boolean proxyIsHttps = false;

        private HttpClientConfigBuilder() {
        }

        public static HttpClientConfigBuilder aHttpClientConfig() {
            return new HttpClientConfigBuilder();
        }

        public HttpClientConfigBuilder withConnectionTimeoutMillis(int connectionTimeoutMillis) {
            this.connectionTimeoutMillis = connectionTimeoutMillis;
            return this;
        }

        public HttpClientConfigBuilder withSocketTimeoutMillis(int socketTimeoutMillis) {
            this.socketTimeoutMillis = socketTimeoutMillis;
            return this;
        }

        public HttpClientConfigBuilder withConnectionRequestTimeout(int connectionRequestTimeout) {
            this.connectionRequestTimeout = connectionRequestTimeout;
            return this;
        }

        public HttpClientConfigBuilder withMaxParallel(int maxParallel) {
            this.maxParallel = maxParallel;
            return this;
        }

        public HttpClientConfigBuilder withThreadKeepAliveTime(long threadKeepAliveTime) {
            this.threadKeepAliveTime = threadKeepAliveTime;
            return this;
        }

        public HttpClientConfigBuilder withMaxTotal(int maxTotal) {
            this.maxTotal = maxTotal;
            return this;
        }

        public HttpClientConfigBuilder withDefaultMaxPerRoute(int defaultMaxPerRoute) {
            this.defaultMaxPerRoute = defaultMaxPerRoute;
            return this;
        }

        public HttpClientConfigBuilder withExecutorService(ExecutorService executorService) {
            this.executorService = executorService;
            return this;
        }

        public HttpClientConfigBuilder withProxy(String proxyHost, int proxyPort, boolean isHttps) {
            this.proxyHost = proxyHost;
            this.proxyPort = proxyPort;
            this.proxyIsHttps = isHttps;
            return this;
        }

        public HttpClientConfig build() {
            HttpClientConfig httpClientConfig = new HttpClientConfig();
            httpClientConfig.setConnectionTimeoutMillis(connectionTimeoutMillis);
            httpClientConfig.setSocketTimeoutMillis(socketTimeoutMillis);
            httpClientConfig.setConnectionRequestTimeout(connectionRequestTimeout);
            httpClientConfig.setMaxParallel(maxParallel);
            httpClientConfig.setThreadKeepAliveTime(threadKeepAliveTime);
            httpClientConfig.setMaxTotal(maxTotal);
            httpClientConfig.setDefaultMaxPerRoute(defaultMaxPerRoute);
            httpClientConfig.setExecutorService(executorService);
            httpClientConfig.setProxy(proxyHost, proxyPort, proxyIsHttps);
            return httpClientConfig;
        }
    }
}
