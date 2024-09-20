package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddServicemarketActivityIsvSendResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddServicemarketActivityIsvSendRequest extends PopBaseHttpRequest<PddServicemarketActivityIsvSendResponse> {

    /**
     * 参数
     */
    @JsonProperty("request")
    private Request request;

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
        return "pdd.servicemarket.activity.isv.send";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddServicemarketActivityIsvSendResponse> getResponseClass() {
        return PddServicemarketActivityIsvSendResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "request", request);
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public static class Request {

        /**
         * activity_ids
         */
        @JsonProperty("activity_ids")
        private List<Long> activityIds;

        /**
         * uuid
         */
        @JsonProperty("request_id")
        private String requestId;

        /**
         * 服务id，无领取规则时可不传
         */
        @JsonProperty("service_id")
        private Long serviceId;

        /**
         * 由内部提供
         */
        @JsonProperty("source")
        private String source;

        public void setActivityIds(List<Long> activityIds) {
            this.activityIds = activityIds;
        }

        public void setRequestId(String requestId) {
            this.requestId = requestId;
        }

        public void setServiceId(Long serviceId) {
            this.serviceId = serviceId;
        }

        public void setSource(String source) {
            this.source = source;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}