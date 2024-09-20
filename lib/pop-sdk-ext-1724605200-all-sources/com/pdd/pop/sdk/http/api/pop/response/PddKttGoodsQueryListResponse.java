package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddKttGoodsQueryListResponse extends PopBaseHttpResponse {

    /**
     * 结果
     */
    @JsonProperty("ktt_goods_query_list_response")
    private KttGoodsQueryListResponse kttGoodsQueryListResponse;

    public KttGoodsQueryListResponse getKttGoodsQueryListResponse() {
        return kttGoodsQueryListResponse;
    }

    public static class KttGoodsQueryListResponse {

        /**
         * 商品列表
         */
        @JsonProperty("goods_list")
        private List<KttGoodsQueryListResponseGoodsListItem> goodsList;

        /**
         * 总商品数量
         */
        @JsonProperty("total")
        private Long total;

        public List<KttGoodsQueryListResponseGoodsListItem> getGoodsList() {
            return goodsList;
        }

        public Long getTotal() {
            return total;
        }
    }

    public static class KttGoodsQueryListResponseGoodsListItem {

        /**
         * 商品归属快团团团号
         */
        @JsonProperty("activity_no")
        private String activityNo;

        /**
         * 商品分类名
         */
        @JsonProperty("category_name")
        private String categoryName;

        /**
         * 创建时间 毫秒时间戳
         */
        @JsonProperty("create_time")
        private Long createTime;

        /**
         * 商品描述
         */
        @JsonProperty("goods_desc")
        private String goodsDesc;

        /**
         * 商品ID
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 商品图列表
         */
        @JsonProperty("goods_image_list")
        private List<String> goodsImageList;

        /**
         * 商品名
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * 商品归属团是否删除
         */
        @JsonProperty("is_activity_delete")
        private Integer isActivityDelete;

        /**
         * 商品限购数，0 代表不限购
         */
        @JsonProperty("limit_buy")
        private Integer limitBuy;

        /**
         * 划线价 单位分
         */
        @JsonProperty("market_price")
        private Long marketPrice;

        /**
         * sku列表
         */
        @JsonProperty("sku_list")
        private List<KttGoodsQueryListResponseGoodsListItemSkuListItem> skuList;

        /**
         * 更新时间 毫秒时间戳
         */
        @JsonProperty("update_time")
        private Long updateTime;

        public String getActivityNo() {
            return activityNo;
        }

        public String getCategoryName() {
            return categoryName;
        }

        public Long getCreateTime() {
            return createTime;
        }

        public String getGoodsDesc() {
            return goodsDesc;
        }

        public Long getGoodsId() {
            return goodsId;
        }

        public List<String> getGoodsImageList() {
            return goodsImageList;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public Integer getIsActivityDelete() {
            return isActivityDelete;
        }

        public Integer getLimitBuy() {
            return limitBuy;
        }

        public Long getMarketPrice() {
            return marketPrice;
        }

        public List<KttGoodsQueryListResponseGoodsListItemSkuListItem> getSkuList() {
            return skuList;
        }

        public Long getUpdateTime() {
            return updateTime;
        }
    }

    public static class KttGoodsQueryListResponseGoodsListItemSkuListItem {

        /**
         * 外部商品编码
         */
        @JsonProperty("external_sku_id")
        private String externalSkuId;

        /**
         * 商品成本价，可能没有
         */
        @JsonProperty("goods_purchase_price")
        private Long goodsPurchasePrice;

        /**
         * 价格 单位分
         */
        @JsonProperty("price_in_fen")
        private Long priceInFen;

        /**
         * 剩余库存
         */
        @JsonProperty("quantity")
        private Long quantity;

        /**
         * sku库存类型 0-正常 1-无限
         */
        @JsonProperty("quantity_type")
        private Integer quantityType;

        /**
         * 预占库存 秒杀商品有
         */
        @JsonProperty("reserve_quantity")
        private Long reserveQuantity;

        /**
         * sku ID
         */
        @JsonProperty("sku_id")
        private Long skuId;

        /**
         * 已售库存
         */
        @JsonProperty("sold_quantity")
        private Long soldQuantity;

        /**
         * 规格列表
         */
        @JsonProperty("spec_list")
        private List<KttGoodsQueryListResponseGoodsListItemSkuListItemSpecListItem> specList;

        /**
         * 具体规格名
         */
        @JsonProperty("spec_name")
        private String specName;

        /**
         * sku缩略图
         */
        @JsonProperty("thumb_url")
        private String thumbUrl;

        /**
         * 总库存=剩余+预占+已售
         */
        @JsonProperty("total_quantity")
        private Long totalQuantity;

        public String getExternalSkuId() {
            return externalSkuId;
        }

        public Long getGoodsPurchasePrice() {
            return goodsPurchasePrice;
        }

        public Long getPriceInFen() {
            return priceInFen;
        }

        public Long getQuantity() {
            return quantity;
        }

        public Integer getQuantityType() {
            return quantityType;
        }

        public Long getReserveQuantity() {
            return reserveQuantity;
        }

        public Long getSkuId() {
            return skuId;
        }

        public Long getSoldQuantity() {
            return soldQuantity;
        }

        public List<KttGoodsQueryListResponseGoodsListItemSkuListItemSpecListItem> getSpecList() {
            return specList;
        }

        public String getSpecName() {
            return specName;
        }

        public String getThumbUrl() {
            return thumbUrl;
        }

        public Long getTotalQuantity() {
            return totalQuantity;
        }
    }

    public static class KttGoodsQueryListResponseGoodsListItemSkuListItemSpecListItem {

        /**
         * 子规格名
         */
        @JsonProperty("name")
        private String name;

        /**
         * 父规格名
         */
        @JsonProperty("parent_name")
        private String parentName;

        /**
         * 规格id
         */
        @JsonProperty("spec_id")
        private Long specId;

        public String getName() {
            return name;
        }

        public String getParentName() {
            return parentName;
        }

        public Long getSpecId() {
            return specId;
        }
    }
}