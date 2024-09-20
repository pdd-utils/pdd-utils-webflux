package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddGoodsSkuPriceUpdateResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("goods_update_sku_price_response")
    private GoodsUpdateSkuPriceResponse goodsUpdateSkuPriceResponse;

    public GoodsUpdateSkuPriceResponse getGoodsUpdateSkuPriceResponse() {
        return goodsUpdateSkuPriceResponse;
    }

    public static class GoodsUpdateSkuPriceResponse {

        /**
         * 
         */
        @JsonProperty("goods_commit_id")
        private Long goodsCommitId;

        /**
         * 是否成功
         */
        @JsonProperty("is_success")
        private Boolean isSuccess;

        public Long getGoodsCommitId() {
            return goodsCommitId;
        }

        public Boolean getIsSuccess() {
            return isSuccess;
        }
    }
}