package com.pdd.pop.sdk.http;

import cn.hutool.core.util.StrUtil;
import com.pdd.pop.sdk.common.constant.UrlEnum;
import com.pdd.pop.sdk.common.util.CloudInnerUtils;
import com.pdd.pop.sdk.common.util.SignUtils;
import com.pdd.pop.sdk.http.client.ApiPlatformType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Map;

@Slf4j
@RequiredArgsConstructor
public class PopHttpClient {

    protected final String clientId;
    protected final String clientSecret;
    protected String apiServerUrl;

    public <T extends PopBaseHttpResponse> Mono<T> syncInvoke(PopBaseHttpRequest<T> request) {
        return syncInvoke(request, null, null);
    }
    public <T extends PopBaseHttpResponse> Mono<T> syncInvoke(PopBaseHttpRequest<T> request,
                                                              String accessToken) {
        return syncInvoke(request, accessToken, null);
    }

    public <T extends PopBaseHttpResponse> Mono<T> syncInvoke(PopBaseHttpRequest<T> request, String accessToken,
                                                              PopClientInfo clientInfo) {
        return this.syncInvoke(request, accessToken, clientInfo, request.getResponseClass());
    }

    private <T extends PopBaseHttpResponse, K extends PopBaseHttpResponse> Mono<K> syncInvoke(
            PopBaseHttpRequest<T> request,
            String accessToken,
            PopClientInfo clientInfo,
            Class<K> valueType) {
        String url = this.handleInvokeServiceUrl(request.getPlatform());
        return this.syncPost(request, accessToken, url, valueType);
    }

    //
    private String handleInvokeServiceUrl(Integer platform) {
        String serverUrl = this.apiServerUrl;
        if (StrUtil.isBlank(serverUrl)) {
            serverUrl = this.getUrlByPlatform(platform);
        }

        if (serverUrl.startsWith("https") && CloudInnerUtils.isInPddCloud()) {
            serverUrl = serverUrl.replaceFirst("https", "http");
        }

        return serverUrl;
    }

    private String getUrlByPlatform(Integer platform) {
        switch (ApiPlatformType.getByCode(platform)) {
            case ARK:
                return UrlEnum.ARK.getUrl();
            case FILE:
                return UrlEnum.FILE.getUrl();
            case OPEN:
            default:
                return UrlEnum.OPEN.getUrl();
        }
    }

    public <T extends PopBaseHttpResponse, K extends PopBaseHttpResponse> Mono<K> syncPost(
            PopBaseHttpRequest<T> request,
            String accessToken, String url,
            Class<K> valueType) {
        WebClient webClient = WebClient.create(url);

        return webClient.post()
                .header("Pdd-Sdk-Type", "JAVA")
                .header("Pdd-Sdk-Version", "0.0.6")
                .bodyValue(assemblyNameValuePair(request.getParamsMap(), accessToken))
                .retrieve()
                .bodyToMono(valueType);
    }

    private Map<String, String> assemblyNameValuePair(Map<String, String> requestParams, String accessToken) {
        requestParams.put("client_id", this.clientId);
        if (StrUtil.isNotBlank(accessToken)) {
            requestParams.put("access_token", accessToken);
        }
        String signSrc = SignUtils.buildSignSource(requestParams, this.clientSecret);
        String sign = SignUtils.sign(signSrc, "md5");
        log.debug("SIGN_SRC:[{}],SIGN:[{}]", signSrc, sign);
        requestParams.put("sign", sign);
        return requestParams;
    }


}
