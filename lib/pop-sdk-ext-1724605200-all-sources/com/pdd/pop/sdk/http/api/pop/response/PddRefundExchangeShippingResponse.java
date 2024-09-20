package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddRefundExchangeShippingResponse extends PopBaseHttpResponse {

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
        @JsonProperty("result")
        private ResponseResult result;

        public ResponseResult getResult() {
            return result;
        }
    }

    public static class ResponseResult {

        /**
         * 
         */
        @JsonProperty("after_sales_id")
        private Long afterSalesId;

        /**
         * 操作结果信息。如果失败，会返回失败原因
         */
        @JsonProperty("message")
        private String message;

        /**
         * 
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * 是否操作成功
         */
        @JsonProperty("succ")
        private Boolean succ;

        public Long getAfterSalesId() {
            return afterSalesId;
        }

        public String getMessage() {
            return message;
        }

        public String getOrderSn() {
            return orderSn;
        }

        public Boolean getSucc() {
            return succ;
        }
    }
}