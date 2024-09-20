package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddGoodsPriceCheckResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("goodsid_price_check_response")
    private GoodsidPriceCheckResponse goodsidPriceCheckResponse;

    public GoodsidPriceCheckResponse getGoodsidPriceCheckResponse() {
        return goodsidPriceCheckResponse;
    }

    public static class GoodsidPriceCheckResponse {

        /**
         * 
         */
        @JsonProperty("result")
        private Long result;

        public Long getResult() {
            return result;
        }
    }
}