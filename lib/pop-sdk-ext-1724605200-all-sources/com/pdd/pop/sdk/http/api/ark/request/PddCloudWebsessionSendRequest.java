package com.pdd.pop.sdk.http.api.ark.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.ark.response.PddCloudWebsessionSendResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddCloudWebsessionSendRequest extends PopBaseHttpRequest<PddCloudWebsessionSendResponse> {

    /**
     * 缓存类型
     */
    @JsonProperty("cache_type")
    private String cacheType;

    /**
     * 会话列表
     */
    @JsonProperty("session_info_list")
    private List<SessionInfoListItem> sessionInfoList;

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
        return 1;
    }

    @Override
    public String getType() {
        return "pdd.cloud.websession.send";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddCloudWebsessionSendResponse> getResponseClass() {
        return PddCloudWebsessionSendResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "cache_type", cacheType);
        setUserParam(params, "session_info_list", sessionInfoList);
    }

    public void setCacheType(String cacheType) {
        this.cacheType = cacheType;
    }

    public void setSessionInfoList(List<SessionInfoListItem> sessionInfoList) {
        this.sessionInfoList = sessionInfoList;
    }

    public static class SessionInfoListItem {

        /**
         * 建名称
         */
        @JsonProperty("key")
        private String key;

        /**
         * 值
         */
        @JsonProperty("value")
        private String value;

        /**
         * 过期时间
         */
        @JsonProperty("expir_time")
        private Long expirTime;

        /**
         * 操作
         */
        @JsonProperty("function")
        private String function;

        public void setKey(String key) {
            this.key = key;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public void setExpirTime(Long expirTime) {
            this.expirTime = expirTime;
        }

        public void setFunction(String function) {
            this.function = function;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}