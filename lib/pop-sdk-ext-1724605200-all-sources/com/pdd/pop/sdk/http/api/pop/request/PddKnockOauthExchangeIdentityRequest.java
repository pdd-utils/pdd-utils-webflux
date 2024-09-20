package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKnockOauthExchangeIdentityResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddKnockOauthExchangeIdentityRequest extends PopBaseHttpRequest<PddKnockOauthExchangeIdentityResponse> {

    /**
     * 获取登录信息请求体
     */
    @JsonProperty("knock_oauth_identity_exchange_req")
    private KnockOauthIdentityExchangeReq knockOauthIdentityExchangeReq;

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
        return "pdd.knock.oauth.exchange.identity";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKnockOauthExchangeIdentityResponse> getResponseClass() {
        return PddKnockOauthExchangeIdentityResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "knock_oauth_identity_exchange_req", knockOauthIdentityExchangeReq);
    }

    public void setKnockOauthIdentityExchangeReq(KnockOauthIdentityExchangeReq knockOauthIdentityExchangeReq) {
        this.knockOauthIdentityExchangeReq = knockOauthIdentityExchangeReq;
    }

    public static class KnockOauthIdentityExchangeReq {

        /**
         * accessToken
         */
        @JsonProperty("access_token")
        private String accessToken;

        public void setAccessToken(String accessToken) {
            this.accessToken = accessToken;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}