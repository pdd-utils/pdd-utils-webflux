package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddCloudSecurityEventTrackingLoginResponse extends PopBaseHttpResponse {

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
        @JsonProperty("errorMessage")
        private String errorMessage;

        /**
         * 
         */
        @JsonProperty("success")
        private Boolean success;

        public Integer getErrorCode() {
            return errorCode;
        }

        public String getErrorMessage() {
            return errorMessage;
        }

        public Boolean getSuccess() {
            return success;
        }
    }
}