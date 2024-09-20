package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddGoodsSizespecTemplateUpdateResponse extends PopBaseHttpResponse {

    /**
     * 响应
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
        @JsonProperty("error_code")
        private Integer errorCode;

        /**
         * 错误描述
         */
        @JsonProperty("error_msg")
        private String errorMsg;

        /**
         * 更新成功
         */
        @JsonProperty("result")
        private Boolean result;

        /**
         * 请求成功
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