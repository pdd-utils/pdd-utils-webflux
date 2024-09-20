package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddConsoDwsDataGetResponse extends PopBaseHttpResponse {

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
        private Boolean result;

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

        public Boolean getResult() {
            return result;
        }

        public Boolean getSuccess() {
            return success;
        }
    }
}