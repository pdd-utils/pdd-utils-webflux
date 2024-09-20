package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddDistributionExtraSyncResponse extends PopBaseHttpResponse {

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
         * 错误信息
         */
        @JsonProperty("errorMsg")
        private String errorMsg;

        /**
         * 结果实体字段
         */
        @JsonProperty("result")
        private ResponseResult result;

        /**
         * 接口响应是否成功
         */
        @JsonProperty("success")
        private Boolean success;

        public Integer getErrorCode() {
            return errorCode;
        }

        public String getErrorMsg() {
            return errorMsg;
        }

        public ResponseResult getResult() {
            return result;
        }

        public Boolean getSuccess() {
            return success;
        }
    }

    public static class ResponseResult {

        /**
         * 是否重复提交，重复提交=true,success则是 false
         */
        @JsonProperty("isRepeatSubmit")
        private Boolean isRepeatSubmit;

        /**
         * 是否成功提交
         */
        @JsonProperty("success")
        private Boolean success;

        public Boolean getIsRepeatSubmit() {
            return isRepeatSubmit;
        }

        public Boolean getSuccess() {
            return success;
        }
    }
}