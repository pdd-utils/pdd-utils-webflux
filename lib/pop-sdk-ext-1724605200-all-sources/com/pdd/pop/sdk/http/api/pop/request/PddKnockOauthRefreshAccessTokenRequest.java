package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKnockOauthRefreshAccessTokenResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddKnockOauthRefreshAccessTokenRequest extends PopBaseHttpRequest<PddKnockOauthRefreshAccessTokenResponse> {

    /**
     * 刷新accessToken请求体
     */
    @JsonProperty("knock_oauth_token_refresh_req")
    private KnockOauthTokenRefreshReq knockOauthTokenRefreshReq;

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
        return "pdd.knock.oauth.refresh.access.token";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKnockOauthRefreshAccessTokenResponse> getResponseClass() {
        return PddKnockOauthRefreshAccessTokenResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "knock_oauth_token_refresh_req", knockOauthTokenRefreshReq);
    }

    public void setKnockOauthTokenRefreshReq(KnockOauthTokenRefreshReq knockOauthTokenRefreshReq) {
        this.knockOauthTokenRefreshReq = knockOauthTokenRefreshReq;
    }

    public static class KnockOauthTokenRefreshReq {

        /**
         * 分配的appId
         */
        @JsonProperty("app_id")
        private String appId;

        /**
         * 固定填写为REFRESH_TOKEN
         */
        @JsonProperty("grant_type")
        private String grantType;

        /**
         * refreshToken
         */
        @JsonProperty("refresh_token")
        private String refreshToken;

        public void setAppId(String appId) {
            this.appId = appId;
        }

        public void setGrantType(String grantType) {
            this.grantType = grantType;
        }

        public void setRefreshToken(String refreshToken) {
            this.refreshToken = refreshToken;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}