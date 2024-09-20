package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddKttPurchaseOrderDeliveryResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("pdd_ktt_purchase_order_delivery_response")
    private InnerPddKttPurchaseOrderDeliveryResponse pddKttPurchaseOrderDeliveryResponse;

    public InnerPddKttPurchaseOrderDeliveryResponse getPddKttPurchaseOrderDeliveryResponse() {
        return pddKttPurchaseOrderDeliveryResponse;
    }

    public static class InnerPddKttPurchaseOrderDeliveryResponse {

        /**
         * 
         */
        @JsonProperty("error_code")
        private Integer errorCode;

        /**
         * 
         */
        @JsonProperty("error_msg")
        private String errorMsg;

        /**
         * 
         */
        @JsonProperty("result")
        private InnerPddKttPurchaseOrderDeliveryResponseResult result;

        /**
         * 
         */
        @JsonProperty("success")
        private Boolean success;

        public Integer getErrorCode() {
            return errorCode;
        }

        public String getErrorMsg() {
            return errorMsg;
        }

        public InnerPddKttPurchaseOrderDeliveryResponseResult getResult() {
            return result;
        }

        public Boolean getSuccess() {
            return success;
        }
    }

    public static class InnerPddKttPurchaseOrderDeliveryResponseResult {

        /**
         * 
         */
        @JsonProperty("is_all_success")
        private Boolean isAllSuccess;

        public Boolean getIsAllSuccess() {
            return isAllSuccess;
        }
    }
}