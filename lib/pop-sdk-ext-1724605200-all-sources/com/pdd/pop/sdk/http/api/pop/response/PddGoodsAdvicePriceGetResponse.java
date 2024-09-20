package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddGoodsAdvicePriceGetResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("goods_advice_price_get_response")
    private GoodsAdvicePriceGetResponse goodsAdvicePriceGetResponse;

    public GoodsAdvicePriceGetResponse getGoodsAdvicePriceGetResponse() {
        return goodsAdvicePriceGetResponse;
    }

    public static class GoodsAdvicePriceGetResponse {

        /**
         * 商品建议价列表
         */
        @JsonProperty("advice_price_list")
        private List<GoodsAdvicePriceGetResponseAdvicePriceListItem> advicePriceList;

        /**
         * 商品建议价数据总数
         */
        @JsonProperty("total")
        private Integer total;

        public List<GoodsAdvicePriceGetResponseAdvicePriceListItem> getAdvicePriceList() {
            return advicePriceList;
        }

        public Integer getTotal() {
            return total;
        }
    }

    public static class GoodsAdvicePriceGetResponseAdvicePriceListItem {

        /**
         * sku建议价，单位为分
         */
        @JsonProperty("advice_price")
        private Long advicePrice;

        /**
         * 商品ID
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 商品标题
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * sku拼单价，单位为分
         */
        @JsonProperty("group_price")
        private Long groupPrice;

        /**
         * skuID
         */
        @JsonProperty("sku_id")
        private Long skuId;

        /**
         * sku名
         */
        @JsonProperty("sku_name")
        private String skuName;

        public Long getAdvicePrice() {
            return advicePrice;
        }

        public Long getGoodsId() {
            return goodsId;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public Long getGroupPrice() {
            return groupPrice;
        }

        public Long getSkuId() {
            return skuId;
        }

        public String getSkuName() {
            return skuName;
        }
    }
}