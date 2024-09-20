package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddInvoiceDetailInvalidResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("invoice_detail_invalid_response")
    private InvoiceDetailInvalidResponse invoiceDetailInvalidResponse;

    public InvoiceDetailInvalidResponse getInvoiceDetailInvalidResponse() {
        return invoiceDetailInvalidResponse;
    }

    public static class InvoiceDetailInvalidResponse {

        /**
         * errorCode
         */
        @JsonProperty("error_code")
        private Integer errorCode;

        /**
         * errorMsg
         */
        @JsonProperty("error_msg")
        private String errorMsg;

        /**
         * result
         */
        @JsonProperty("result")
        private InvoiceDetailInvalidResponseResult result;

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

        public InvoiceDetailInvalidResponseResult getResult() {
            return result;
        }

        public Boolean getSuccess() {
            return success;
        }
    }

    public static class InvoiceDetailInvalidResponseResult {

        /**
         * 红冲是否成功
         */
        @JsonProperty("result")
        private Boolean result;

        public Boolean getResult() {
            return result;
        }
    }
}