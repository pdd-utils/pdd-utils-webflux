package com.pdd.pop.sdk.http.api.ark.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddTrainCallbackOtcbookResponse extends PopBaseHttpResponse {

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
        private String code;

        /**
         * 
         */
        @JsonProperty("msg")
        private String msg;

        public String getCode() {
            return code;
        }

        public String getMsg() {
            return msg;
        }
    }
}