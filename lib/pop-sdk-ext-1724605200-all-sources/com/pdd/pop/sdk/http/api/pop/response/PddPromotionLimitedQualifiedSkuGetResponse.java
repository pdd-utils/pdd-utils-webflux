package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddPromotionLimitedQualifiedSkuGetResponse extends PopBaseHttpResponse {

    /**
     * 不可选sku列表
     */
    @JsonProperty("in_valid_sku_List")
    private List<InValidSkuListItem> inValidSkuList;

    /**
     * 可选sku列表
     */
    @JsonProperty("valid_sku_list")
    private List<ValidSkuListItem> validSkuList;

    public List<InValidSkuListItem> getInValidSkuList() {
        return inValidSkuList;
    }

    public List<ValidSkuListItem> getValidSkuList() {
        return validSkuList;
    }

    public static class InValidSkuListItem {

        /**
         * 商品id
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 不可选原因
         */
        @JsonProperty("invalid_reason")
        private String invalidReason;

        /**
         * skuid
         */
        @JsonProperty("sku_id")
        private Long skuId;

        /**
         * sku是否可以设置营销工具活动价。0-sku有效，1-sku需上架，2-sku库存需≥3，3-sku参考价不符合规则
         */
        @JsonProperty("valid_status")
        private Integer validStatus;

        public Long getGoodsId() {
            return goodsId;
        }

        public String getInvalidReason() {
            return invalidReason;
        }

        public Long getSkuId() {
            return skuId;
        }

        public Integer getValidStatus() {
            return validStatus;
        }
    }

    public static class ValidSkuListItem {

        /**
         * 商品id
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 不可选原因
         */
        @JsonProperty("invalid_reason")
        private String invalidReason;

        /**
         * skuid
         */
        @JsonProperty("sku_id")
        private Long skuId;

        /**
         * sku是否可以设置营销工具活动价。0-sku有效，1-sku需上架，2-sku库存需≥3，3-sku参考价不符合规则
         */
        @JsonProperty("valid_status")
        private Integer validStatus;

        public Long getGoodsId() {
            return goodsId;
        }

        public String getInvalidReason() {
            return invalidReason;
        }

        public Long getSkuId() {
            return skuId;
        }

        public Integer getValidStatus() {
            return validStatus;
        }
    }
}