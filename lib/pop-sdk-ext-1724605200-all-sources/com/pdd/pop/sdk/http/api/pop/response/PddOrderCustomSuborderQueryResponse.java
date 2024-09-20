package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddOrderCustomSuborderQueryResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("order_custom_suborder_query_response")
    private OrderCustomSuborderQueryResponse orderCustomSuborderQueryResponse;

    public OrderCustomSuborderQueryResponse getOrderCustomSuborderQueryResponse() {
        return orderCustomSuborderQueryResponse;
    }

    public static class OrderCustomSuborderQueryResponse {

        /**
         * error_code
         */
        @JsonProperty("error_code")
        private Integer errorCode;

        /**
         * error_msg
         */
        @JsonProperty("error_msg")
        private String errorMsg;

        /**
         * result
         */
        @JsonProperty("result")
        private OrderCustomSuborderQueryResponseResult result;

        /**
         * success
         */
        @JsonProperty("success")
        private Boolean success;

        public Integer getErrorCode() {
            return errorCode;
        }

        public String getErrorMsg() {
            return errorMsg;
        }

        public OrderCustomSuborderQueryResponseResult getResult() {
            return result;
        }

        public Boolean getSuccess() {
            return success;
        }
    }

    public static class OrderCustomSuborderQueryResponseResult {

        /**
         * 申报状态
         */
        @JsonProperty("state")
        private String state;

        /**
         * 微信子订单号
         */
        @JsonProperty("sub_order_id")
        private String subOrderId;

        public String getState() {
            return state;
        }

        public String getSubOrderId() {
            return subOrderId;
        }
    }
}