package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddCloudIsvPageCodeResponse extends PopBaseHttpResponse {

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
         * 错误码
         */
        @JsonProperty("errorCode")
        private Integer errorCode;

        /**
         * 服务端错误
         */
        @JsonProperty("errorMessage")
        private String errorMessage;

        /**
         * 插件token
         */
        @JsonProperty("pageCode")
        private String pageCode;

        /**
         * 失败
         */
        @JsonProperty("success")
        private Boolean success;

        public Integer getErrorCode() {
            return errorCode;
        }

        public String getErrorMessage() {
            return errorMessage;
        }

        public String getPageCode() {
            return pageCode;
        }

        public Boolean getSuccess() {
            return success;
        }
    }
}