package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddNextoneLogisticsWarehouseUpdateResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("response")
    private Response response;

    public Response getResponse() {
        return response;
    }

    public static class Response {

        /**
         * result
         */
        @JsonProperty("result")
        private ResponseResult result;

        public ResponseResult getResult() {
            return result;
        }
    }

    public static class ResponseResult {

        /**
         * after_sales_id
         */
        @JsonProperty("after_sales_id")
        private Long afterSalesId;

        /**
         * order_sn
         */
        @JsonProperty("order_sn")
        private String orderSn;

        public Long getAfterSalesId() {
            return afterSalesId;
        }

        public String getOrderSn() {
            return orderSn;
        }
    }
}