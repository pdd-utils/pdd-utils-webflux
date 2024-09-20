package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddCustomsExpressInfoGetResponse extends PopBaseHttpResponse {

    /**
     * 返回的结果
     */
    @JsonProperty("express_waybill_response")
    private ExpressWaybillResponse expressWaybillResponse;

    public ExpressWaybillResponse getExpressWaybillResponse() {
        return expressWaybillResponse;
    }

    public static class ExpressWaybillResponse {

        /**
         * 快递三段码
         */
        @JsonProperty("route_code")
        private String routeCode;

        /**
         * 大头笔编码
         */
        @JsonProperty("sortation_code")
        private String sortationCode;

        /**
         * 大头笔名称
         */
        @JsonProperty("sortation_name")
        private String sortationName;

        /**
         * 报关商的一次请求的id
         */
        @JsonProperty("trace_id")
        private String traceId;

        public String getRouteCode() {
            return routeCode;
        }

        public String getSortationCode() {
            return sortationCode;
        }

        public String getSortationName() {
            return sortationName;
        }

        public String getTraceId() {
            return traceId;
        }
    }
}