package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddOverseaCustomsClearanceSubmitResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("customs_clearance_submit_response")
    private CustomsClearanceSubmitResponse customsClearanceSubmitResponse;

    /**
     * 
     */
    @JsonProperty("request_id")
    private String requestId;

    public CustomsClearanceSubmitResponse getCustomsClearanceSubmitResponse() {
        return customsClearanceSubmitResponse;
    }

    public String getRequestId() {
        return requestId;
    }

    public static class CustomsClearanceSubmitResponse {

        /**
         * 海关服务提交数据请求的返回
         */
        @JsonProperty("call_customs_api_result")
        private String callCustomsApiResult;

        public String getCallCustomsApiResult() {
            return callCustomsApiResult;
        }
    }
}