package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddVasOrderSyncNoauthResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("vas_order_sync_response")
    private VasOrderSyncResponse vasOrderSyncResponse;

    public VasOrderSyncResponse getVasOrderSyncResponse() {
        return vasOrderSyncResponse;
    }

    public static class VasOrderSyncResponse {

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