package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddVasOrderUpdateResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("vas_order_update_response")
    private VasOrderUpdateResponse vasOrderUpdateResponse;

    public VasOrderUpdateResponse getVasOrderUpdateResponse() {
        return vasOrderUpdateResponse;
    }

    public static class VasOrderUpdateResponse {

        /**
         * 订单号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        public String getOrderSn() {
            return orderSn;
        }
    }
}