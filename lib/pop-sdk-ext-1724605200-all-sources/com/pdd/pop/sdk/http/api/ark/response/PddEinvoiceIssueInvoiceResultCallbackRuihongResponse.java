package com.pdd.pop.sdk.http.api.ark.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddEinvoiceIssueInvoiceResultCallbackRuihongResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("response")
    private Response response;

    public Response getResponse() {
        return response;
    }

    public static class Response {

        /**
         * 
         */
        @JsonProperty("code")
        private Integer code;

        /**
         * 
         */
        @JsonProperty("message")
        private String message;

        public Integer getCode() {
            return code;
        }

        public String getMessage() {
            return message;
        }
    }
}