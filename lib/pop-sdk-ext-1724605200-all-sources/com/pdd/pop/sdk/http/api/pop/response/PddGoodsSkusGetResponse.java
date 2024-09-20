package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddGoodsSkusGetResponse extends PopBaseHttpResponse {

    /**
     * sku信息
     */
    @JsonProperty("goods_sku_get_response")
    private GoodsSkuGetResponse goodsSkuGetResponse;

    public GoodsSkuGetResponse getGoodsSkuGetResponse() {
        return goodsSkuGetResponse;
    }

    public static class GoodsSkuGetResponse {

        /**
         * 该sku所在的商品ID
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 上下架状态，1=上架，0=下架
         */
        @JsonProperty("is_onsale")
        private Integer isOnsale;

        /**
         * 团购价，单位分
         */
        @JsonProperty("multi_price")
        private Long multiPrice;

        /**
         * SKU维度商家外部编码
         */
        @JsonProperty("out_sku_sn")
        private String outSkuSn;

        /**
         * 库存
         */
        @JsonProperty("quantity")
        private Long quantity;

        /**
         * 预扣库存
         */
        @JsonProperty("reserve_quantity")
        private Long reserveQuantity;

        /**
         * 单买价，单位分
         */
        @JsonProperty("single_price")
        private Long singlePrice;

        /**
         * skuId
         */
        @JsonProperty("sku_id")
        private Long skuId;

        /**
         * 规格列表
         */
        @JsonProperty("spec")
        private List<GoodsSkuGetResponseSpecItem> spec;

        public Long getGoodsId() {
            return goodsId;
        }

        public Integer getIsOnsale() {
            return isOnsale;
        }

        public Long getMultiPrice() {
            return multiPrice;
        }

        public String getOutSkuSn() {
            return outSkuSn;
        }

        public Long getQuantity() {
            return quantity;
        }

        public Long getReserveQuantity() {
            return reserveQuantity;
        }

        public Long getSinglePrice() {
            return singlePrice;
        }

        public Long getSkuId() {
            return skuId;
        }

        public List<GoodsSkuGetResponseSpecItem> getSpec() {
            return spec;
        }
    }

    public static class GoodsSkuGetResponseSpecItem {

        /**
         * 规格项ID
         */
        @JsonProperty("parent_spec_id")
        private Long parentSpecId;

        /**
         * 规格项
         */
        @JsonProperty("parent_spec_name")
        private String parentSpecName;

        /**
         * 规格ID
         */
        @JsonProperty("spec_id")
        private Long specId;

        /**
         * 规格值
         */
        @JsonProperty("spec_name")
        private String specName;

        /**
         * 规格备注
         */
        @JsonProperty("spec_note")
        private String specNote;

        public Long getParentSpecId() {
            return parentSpecId;
        }

        public String getParentSpecName() {
            return parentSpecName;
        }

        public Long getSpecId() {
            return specId;
        }

        public String getSpecName() {
            return specName;
        }

        public String getSpecNote() {
            return specNote;
        }
    }
}