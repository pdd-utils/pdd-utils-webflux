package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddPromotionLimitedQualifiedGoodsGetResponse extends PopBaseHttpResponse {

    /**
     * 商品列表
     */
    @JsonProperty("goods_list")
    private List<GoodsListItem> goodsList;

    /**
     * 总数
     */
    @JsonProperty("total")
    private Long total;

    public List<GoodsListItem> getGoodsList() {
        return goodsList;
    }

    public Long getTotal() {
        return total;
    }

    public static class GoodsListItem {

        /**
         * 商品id
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        public Long getGoodsId() {
            return goodsId;
        }
    }
}