package com.pdd.pop.sdk.http.token;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

/**
 * @see PddPopAuthTokenRefreshRequest
 */
public class AuthTokenRefreshRequest extends PopBaseHttpRequest<AuthTokenRefreshResponse> {

    /**
     * grantType==refresh_token 时需要
     */
    @JsonProperty("refresh_token")
    private String refreshToken;

    @Override
    public String getVersion() {
        return "V1";
    }

    @Override
    public String getDataType() {
        return "JSON";
    }

    @Override
    public Integer getPlatform() {
        return 0;
    }

    @Override
    public String getType() {
        return "pdd.pop.auth.token.refresh";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<AuthTokenRefreshResponse> getResponseClass() {
        return AuthTokenRefreshResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "refresh_token", refreshToken);
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}