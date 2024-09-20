package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKnockOauthExchangeAccessTokenResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddKnockOauthExchangeAccessTokenRequest extends PopBaseHttpRequest<PddKnockOauthExchangeAccessTokenResponse> {

    /**
     * 获取accessToken请求
     */
    @JsonProperty("knock_access_token_exchange_req")
    private KnockAccessTokenExchangeReq knockAccessTokenExchangeReq;

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
        return "pdd.knock.oauth.exchange.access.token";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKnockOauthExchangeAccessTokenResponse> getResponseClass() {
        return PddKnockOauthExchangeAccessTokenResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "knock_access_token_exchange_req", knockAccessTokenExchangeReq);
    }

    public void setKnockAccessTokenExchangeReq(KnockAccessTokenExchangeReq knockAccessTokenExchangeReq) {
        this.knockAccessTokenExchangeReq = knockAccessTokenExchangeReq;
    }

    public static class KnockAccessTokenExchangeReq {

        /**
         * 分配的appId
         */
        @JsonProperty("app_id")
        private String appId;

        /**
         * code
         */
        @JsonProperty("code")
        private String code;

        /**
         * 固定填写AUTHORIZATION_CODE
         */
        @JsonProperty("grant_type")
        private String grantType;

        /**
         * 签名
         */
        @JsonProperty("sign")
        private String sign;

        public void setAppId(String appId) {
            this.appId = appId;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public void setGrantType(String grantType) {
            this.grantType = grantType;
        }

        public void setSign(String sign) {
            this.sign = sign;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}