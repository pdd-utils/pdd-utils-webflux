package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddKttPurchaseOrderLogisticReplaceResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("ktt_purchase_order_logistics_replace_response")
    private KttPurchaseOrderLogisticsReplaceResponse kttPurchaseOrderLogisticsReplaceResponse;

    public KttPurchaseOrderLogisticsReplaceResponse getKttPurchaseOrderLogisticsReplaceResponse() {
        return kttPurchaseOrderLogisticsReplaceResponse;
    }

    public static class KttPurchaseOrderLogisticsReplaceResponse {

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
        private KttPurchaseOrderLogisticsReplaceResponseResult result;

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

        public KttPurchaseOrderLogisticsReplaceResponseResult getResult() {
            return result;
        }

        public Boolean getSuccess() {
            return success;
        }
    }

    public static class KttPurchaseOrderLogisticsReplaceResponseResult {

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