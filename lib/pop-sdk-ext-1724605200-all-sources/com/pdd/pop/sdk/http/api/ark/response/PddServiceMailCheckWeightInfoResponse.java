package com.pdd.pop.sdk.http.api.ark.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddServiceMailCheckWeightInfoResponse extends PopBaseHttpResponse {

    /**
     * 返回结果
     */
    @JsonProperty("response")
    private Response response;

    public Response getResponse() {
        return response;
    }

    public static class Response {

        /**
         * 错误代码
         */
        @JsonProperty("errorCode")
        private Integer errorCode;

        /**
         * 错误信息
         */
        @JsonProperty("errorMsg")
        private String errorMsg;

        /**
         * 同步结果
         */
        @JsonProperty("flag")
        private Boolean flag;

        public Integer getErrorCode() {
            return errorCode;
        }

        public String getErrorMsg() {
            return errorMsg;
        }

        public Boolean getFlag() {
            return flag;
        }
    }
}