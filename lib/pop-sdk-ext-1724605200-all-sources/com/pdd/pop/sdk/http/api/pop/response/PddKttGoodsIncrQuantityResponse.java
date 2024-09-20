package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddKttGoodsIncrQuantityResponse extends PopBaseHttpResponse {

    /**
     * 结果
     */
    @JsonProperty("ktt_goods_incr_quantity_response")
    private KttGoodsIncrQuantityResponse kttGoodsIncrQuantityResponse;

    public KttGoodsIncrQuantityResponse getKttGoodsIncrQuantityResponse() {
        return kttGoodsIncrQuantityResponse;
    }

    public static class KttGoodsIncrQuantityResponse {

        /**
         * 
         */
        @JsonProperty("success")
        private Boolean success;

        public Boolean getSuccess() {
            return success;
        }
    }
}