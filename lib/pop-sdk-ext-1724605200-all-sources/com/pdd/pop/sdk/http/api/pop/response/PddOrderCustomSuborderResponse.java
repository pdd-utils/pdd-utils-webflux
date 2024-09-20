package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddOrderCustomSuborderResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("order_custom_suborder_response")
    private OrderCustomSuborderResponse orderCustomSuborderResponse;

    public OrderCustomSuborderResponse getOrderCustomSuborderResponse() {
        return orderCustomSuborderResponse;
    }

    public static class OrderCustomSuborderResponse {

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
         * success/fail
         */
        @JsonProperty("result")
        private String result;

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

        public String getResult() {
            return result;
        }

        public Boolean getSuccess() {
            return success;
        }
    }
}