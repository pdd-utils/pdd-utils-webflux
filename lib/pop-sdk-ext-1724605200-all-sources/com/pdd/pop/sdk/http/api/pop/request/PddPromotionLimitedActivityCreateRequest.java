package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddPromotionLimitedActivityCreateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddPromotionLimitedActivityCreateRequest extends PopBaseHttpRequest<PddPromotionLimitedActivityCreateResponse> {

    /**
     * 创建请求
     */
    @JsonProperty("request")
    private List<RequestItem> request;

    @Override
    public String getVersion() {
        return "V1";
    }

    @Override
    public String getDataType() {
        return "JSON";
    }

    @Override
    public Integer getPlatform() {
        return 0;
    }

    @Override
    public String getType() {
        return "pdd.promotion.limited.activity.create";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddPromotionLimitedActivityCreateResponse> getResponseClass() {
        return PddPromotionLimitedActivityCreateResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "request", request);
    }

    public void setRequest(List<RequestItem> request) {
        this.request = request;
    }

    public static class RequestItem {

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
         * 折扣比例，实际折扣为：discount/1000。例：300，表示3折
         */
        @JsonProperty("discount")
        private Long discount;

        /**
         * 限时折扣必填。结束时间（单位：s）
         */
        @JsonProperty("end_time")
        private Long endTime;

        /**
         * 商品id
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 活动库存的数量（限量活动时，必填）
         */
        @JsonProperty("quantity")
        private Long quantity;

        /**
         * 参与活动的sku数据列表
         */
        @JsonProperty("sku_price_list")
        private List<RequestItemSkuPriceListItem> skuPriceList;

        /**
         * 限时折扣必填。开始时间（单位：s）
         */
        @JsonProperty("start_time")
        private Long startTime;

        /**
         * 用户限购数量(0:不限购)
         */
        @JsonProperty("user_activity_limit")
        private Long userActivityLimit;

        public void setActivityName(String activityName) {
            this.activityName = activityName;
        }

        public void setActivityType(Integer activityType) {
            this.activityType = activityType;
        }

        public void setDiscount(Long discount) {
            this.discount = discount;
        }

        public void setEndTime(Long endTime) {
            this.endTime = endTime;
        }

        public void setGoodsId(Long goodsId) {
            this.goodsId = goodsId;
        }

        public void setQuantity(Long quantity) {
            this.quantity = quantity;
        }

        public void setSkuPriceList(List<RequestItemSkuPriceListItem> skuPriceList) {
            this.skuPriceList = skuPriceList;
        }

        public void setStartTime(Long startTime) {
            this.startTime = startTime;
        }

        public void setUserActivityLimit(Long userActivityLimit) {
            this.userActivityLimit = userActivityLimit;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class RequestItemSkuPriceListItem {

        /**
         * sku活动价格
         */
        @JsonProperty("activity_price")
        private Long activityPrice;

        /**
         * skuid
         */
        @JsonProperty("sku_id")
        private Long skuId;

        public void setActivityPrice(Long activityPrice) {
            this.activityPrice = activityPrice;
        }

        public void setSkuId(Long skuId) {
            this.skuId = skuId;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}