package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddVasOrderDivertResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("vas_order_divert_response")
    private VasOrderDivertResponse vasOrderDivertResponse;

    public VasOrderDivertResponse getVasOrderDivertResponse() {
        return vasOrderDivertResponse;
    }

    public static class VasOrderDivertResponse {

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