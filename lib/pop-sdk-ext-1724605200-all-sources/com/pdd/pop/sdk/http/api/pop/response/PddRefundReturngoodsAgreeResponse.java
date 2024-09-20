package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddRefundReturngoodsAgreeResponse extends PopBaseHttpResponse {

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
         * 接口调用错误编码
         */
        @JsonProperty("error_code")
        private Integer errorCode;

        /**
         * 接口调用错误描述
         */
        @JsonProperty("error_msg")
        private String errorMsg;

        /**
         * 返回内容
         */
        @JsonProperty("result")
        private ResponseResult result;

        /**
         * 接口是否调用成功
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
         * 售后id
         */
        @JsonProperty("after_sales_id")
        private Long afterSalesId;

        /**
         * 退货是否成功描述
         */
        @JsonProperty("message")
        private String message;

        /**
         * 订单号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * 退货是否成功
         */
        @JsonProperty("success")
        private Boolean success;

        public Long getAfterSalesId() {
            return afterSalesId;
        }

        public String getMessage() {
            return message;
        }

        public String getOrderSn() {
            return orderSn;
        }

        public Boolean getSuccess() {
            return success;
        }
    }
}