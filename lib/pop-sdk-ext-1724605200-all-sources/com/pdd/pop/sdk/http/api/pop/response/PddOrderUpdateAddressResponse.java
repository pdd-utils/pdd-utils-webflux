package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddOrderUpdateAddressResponse extends PopBaseHttpResponse {

    /**
     * 请求响应
     */
    @JsonProperty("response")
    private Response response;

    public Response getResponse() {
        return response;
    }

    public static class Response {

        /**
         * 请求返回结果
         */
        @JsonProperty("result")
        private ResponseResult result;

        /**
         * 是否请求成功
         */
        @JsonProperty("success")
        private Boolean success;

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

        public ResponseResult getResult() {
            return result;
        }

        public Boolean getSuccess() {
            return success;
        }

        public Integer getErrorCode() {
            return errorCode;
        }

        public String getErrorMsg() {
            return errorMsg;
        }
    }

    public static class ResponseResult {

        /**
         * 提示文案
         */
        @JsonProperty("msg")
        private String msg;

        /**
         * 订单号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        public String getMsg() {
            return msg;
        }

        public String getOrderSn() {
            return orderSn;
        }
    }
}