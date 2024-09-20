package com.pdd.pop.sdk.http.api.ark.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddFlightOrderQuerysnResponse extends PopBaseHttpResponse {

    /**
     * 结果
     */
    @JsonProperty("query_order_sn_response")
    private QueryOrderSnResponse queryOrderSnResponse;

    public QueryOrderSnResponse getQueryOrderSnResponse() {
        return queryOrderSnResponse;
    }

    public static class QueryOrderSnResponse {

        /**
         * 拼多多订单号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * 状态中文描述
         */
        @JsonProperty("status_desc")
        private String statusDesc;

        public String getOrderSn() {
            return orderSn;
        }

        public String getStatusDesc() {
            return statusDesc;
        }
    }
}