package com.pdd.pop.sdk.http;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.sdk.common.util.PreconditionUtil;
import com.pdd.pop.sdk.http.token.AccessTokenResponse;
import com.pdd.pop.sdk.http.token.AuthTokenCreateRequest;
import com.pdd.pop.sdk.http.token.AuthTokenCreateResponse;
import com.pdd.pop.sdk.http.token.AuthTokenRefreshRequest;
import com.pdd.pop.sdk.http.token.AuthTokenRefreshResponse;

/**
 * @author xuanli
 * @Description: 鉴权Token访问客户端
 * @date 2018/12/4 17:30
 */
public class PopAccessTokenClient {

    private PopClient popClient;

    public PopAccessTokenClient(String clientId, String clientSecret) {
        this(clientId, clientSecret, "");
    }

    public PopAccessTokenClient(String clientId, String clientSecret, String oauthServerUrl) {
        HttpClientConfig config = HttpClientConfig.getDefault();
        config.setMaxTotal(2);
        config.setDefaultMaxPerRoute(2);
        this.popClient = new PopHttpClient(oauthServerUrl, clientId, clientSecret, config);
    }

    /**
     * 生成AccessToken
     * @param code : 授权码
     * @return
     * @throws Exception
     */
    public AccessTokenResponse generate(String code) throws Exception {
        PreconditionUtil.checkNotNull(code);
        AuthTokenCreateRequest createRequest = new AuthTokenCreateRequest();
        createRequest.setCode(code);
        AuthTokenCreateResponse createResponse = popClient.syncInvoke(createRequest);

        AccessTokenResponse result = new AccessTokenResponse();
        AuthTokenCreateResponse.PopAuthTokenCreateResponse response = createResponse.getPopAuthTokenCreateResponse();
        if (null != response) {
            result = JsonUtil.transferToObj(JsonUtil.transferToJson(response), AccessTokenResponse.class);
        }
        result.setRequestId(createResponse.getRequestId());
        result.setErrorResponse(createResponse.getErrorResponse());
        return result;
    }

    /**
     * 刷新AccessToken
     * @param refreshToken : 刷新码
     * @return
     * @throws Exception
     */
    public AccessTokenResponse refresh(String refreshToken) throws Exception {
        PreconditionUtil.checkNotNull(refreshToken);
        AuthTokenRefreshRequest refreshRequest = new AuthTokenRefreshRequest();
        refreshRequest.setRefreshToken(refreshToken);
        AuthTokenRefreshResponse refreshResponse = popClient.syncInvoke(refreshRequest);

        AccessTokenResponse result = new AccessTokenResponse();
        AuthTokenRefreshResponse.PopAuthTokenRefreshResponse response = refreshResponse.getPopAuthTokenRefreshResponse();
        if (null != response) {
            result = JsonUtil.transferToObj(JsonUtil.transferToJson(response), AccessTokenResponse.class);
        }
        result.setRequestId(refreshResponse.getRequestId());
        result.setErrorResponse(refreshResponse.getErrorResponse());
        return result;
    }

    public void destroy() {
        popClient.destroy();
    }
}
