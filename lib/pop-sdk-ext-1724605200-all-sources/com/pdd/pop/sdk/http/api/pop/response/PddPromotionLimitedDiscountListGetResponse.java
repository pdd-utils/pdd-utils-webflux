package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddPromotionLimitedDiscountListGetResponse extends PopBaseHttpResponse {

    /**
     * 还在线（包括已开始和未开始）的活动数量
     */
    @JsonProperty("online_sum")
    private Long onlineSum;

    /**
     * 活动信息
     */
    @JsonProperty("open_goods_activity_list")
    private List<OpenGoodsActivityListItem> openGoodsActivityList;

    /**
     * 0:生成时间升序  1:生成时间降序
     */
    @JsonProperty("order")
    private Integer order;

    /**
     * 页码
     */
    @JsonProperty("page_no")
    private Long pageNo;

    /**
     * 页大小
     */
    @JsonProperty("page_size")
    private Long pageSize;

    /**
     * 报名的活动总量
     */
    @JsonProperty("record_sum")
    private Long recordSum;

    public Long getOnlineSum() {
        return onlineSum;
    }

    public List<OpenGoodsActivityListItem> getOpenGoodsActivityList() {
        return openGoodsActivityList;
    }

    public Integer getOrder() {
        return order;
    }

    public Long getPageNo() {
        return pageNo;
    }

    public Long getPageSize() {
        return pageSize;
    }

    public Long getRecordSum() {
        return recordSum;
    }

    public static class OpenGoodsActivityListItem {

        /**
         * 活动id
         */
        @JsonProperty("activity_id")
        private Long activityId;

        /**
         * 活动名称
         */
        @JsonProperty("activity_name")
        private String activityName;

        /**
         * 活动类型
         */
        @JsonProperty("activity_type")
        private Integer activityType;

        /**
         * 结束操作来源：  0: 活动时间到了，活动结束  1: 商家在MMS后台人为点击结束  2: 活动被系统结束
         */
        @JsonProperty("end_operation_source")
        private Integer endOperationSource;

        /**
         * 结束时间（单位：s）
         */
        @JsonProperty("end_time")
        private Long endTime;

        /**
         * 商品id
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 商品名称
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * 商品剩余库存
         */
        @JsonProperty("online_quantity")
        private Long onlineQuantity;

        /**
         * 价格信息
         */
        @JsonProperty("price_info")
        private List<OpenGoodsActivityListItemPriceInfoItem> priceInfo;

        /**
         * 开始时间（单位：s）
         */
        @JsonProperty("start_time")
        private Long startTime;

        /**
         * 活动状态
         */
        @JsonProperty("status")
        private Integer status;

        public Long getActivityId() {
            return activityId;
        }

        public String getActivityName() {
            return activityName;
        }

        public Integer getActivityType() {
            return activityType;
        }

        public Integer getEndOperationSource() {
            return endOperationSource;
        }

        public Long getEndTime() {
            return endTime;
        }

        public Long getGoodsId() {
            return goodsId;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public Long getOnlineQuantity() {
            return onlineQuantity;
        }

        public List<OpenGoodsActivityListItemPriceInfoItem> getPriceInfo() {
            return priceInfo;
        }

        public Long getStartTime() {
            return startTime;
        }

        public Integer getStatus() {
            return status;
        }
    }

    public static class OpenGoodsActivityListItemPriceInfoItem {

        /**
         * 活动报名库存
         */
        @JsonProperty("activity_quantity")
        private Long activityQuantity;

        /**
         * 活动剩余库存
         */
        @JsonProperty("activity_stock_quantity")
        private Long activityStockQuantity;

        /**
         * 活动 ID
         */
        @JsonProperty("detail_id")
        private Long detailId;

        /**
         * 折扣比例。实际折扣为：discount/1000，例如：300表示3折
         */
        @JsonProperty("discount")
        private Long discount;

        /**
         * 折扣范围
         */
        @JsonProperty("discount_range")
        private String discountRange;

        /**
         * 最大的sku活动拼团价
         */
        @JsonProperty("max_pre_sale_price")
        private Long maxPreSalePrice;

        /**
         * 最小的sku活动拼团价
         */
        @JsonProperty("min_pre_sale_price")
        private Long minPreSalePrice;

        /**
         * sku维度的活动信息
         */
        @JsonProperty("open_sku_prices")
        private List<OpenGoodsActivityListItemPriceInfoItemOpenSkuPricesItem> openSkuPrices;

        /**
         * 活动价生效时用户限购数量 0:不限购
         */
        @JsonProperty("user_activity_limit")
        private Long userActivityLimit;

        public Long getActivityQuantity() {
            return activityQuantity;
        }

        public Long getActivityStockQuantity() {
            return activityStockQuantity;
        }

        public Long getDetailId() {
            return detailId;
        }

        public Long getDiscount() {
            return discount;
        }

        public String getDiscountRange() {
            return discountRange;
        }

        public Long getMaxPreSalePrice() {
            return maxPreSalePrice;
        }

        public Long getMinPreSalePrice() {
            return minPreSalePrice;
        }

        public List<OpenGoodsActivityListItemPriceInfoItemOpenSkuPricesItem> getOpenSkuPrices() {
            return openSkuPrices;
        }

        public Long getUserActivityLimit() {
            return userActivityLimit;
        }
    }

    public static class OpenGoodsActivityListItemPriceInfoItemOpenSkuPricesItem {

        /**
         * 活动拼团价（单位：分）
         */
        @JsonProperty("activity_price")
        private Long activityPrice;

        /**
         * 折扣比例
         */
        @JsonProperty("discount")
        private String discount;

        /**
         * 原拼团价（单位：分）
         */
        @JsonProperty("group_price")
        private Long groupPrice;

        /**
         * skuid
         */
        @JsonProperty("sku_id")
        private Long skuId;

        /**
         * sku名称
         */
        @JsonProperty("sku_name")
        private String skuName;

        public Long getActivityPrice() {
            return activityPrice;
        }

        public String getDiscount() {
            return discount;
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