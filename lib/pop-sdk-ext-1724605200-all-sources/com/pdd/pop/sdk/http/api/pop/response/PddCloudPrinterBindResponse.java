package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddCloudPrinterBindResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("cloud_printer_bind_response")
    private CloudPrinterBindResponse cloudPrinterBindResponse;

    public CloudPrinterBindResponse getCloudPrinterBindResponse() {
        return cloudPrinterBindResponse;
    }

    public static class CloudPrinterBindResponse {

        /**
         * 
         */
        @JsonProperty("errorCode")
        private Integer errorCode;

        /**
         * 
         */
        @JsonProperty("errorMsg")
        private String errorMsg;

        /**
         * 
         */
        @JsonProperty("result")
        private CloudPrinterBindResponseResult result;

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

        public CloudPrinterBindResponseResult getResult() {
            return result;
        }

        public Boolean getSuccess() {
            return success;
        }
    }

    public static class CloudPrinterBindResponseResult {

        /**
         * 
         */
        @JsonProperty("result")
        private Boolean result;

        /**
         * 
         */
        @JsonProperty("shareCode")
        private String shareCode;

        public Boolean getResult() {
            return result;
        }

        public String getShareCode() {
            return shareCode;
        }
    }
}