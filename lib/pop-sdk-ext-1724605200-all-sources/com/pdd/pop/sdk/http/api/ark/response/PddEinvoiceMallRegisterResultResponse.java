package com.pdd.pop.sdk.http.api.ark.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddEinvoiceMallRegisterResultResponse extends PopBaseHttpResponse {

    /**
     * 响应体
     */
    @JsonProperty("response")
    private Response response;

    public Response getResponse() {
        return response;
    }

    public static class Response {

        /**
         * 错误码
         */
        @JsonProperty("code")
        private Integer code;

        /**
         * 错误信息
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