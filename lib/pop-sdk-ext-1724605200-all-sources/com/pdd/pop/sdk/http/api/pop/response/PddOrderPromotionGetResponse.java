package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddOrderPromotionGetResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("order_promotion_get_response")
    private OrderPromotionGetResponse orderPromotionGetResponse;

    public OrderPromotionGetResponse getOrderPromotionGetResponse() {
        return orderPromotionGetResponse;
    }

    public static class OrderPromotionGetResponse {

        /**
         * 订单优惠信息列表
         */
        @JsonProperty("order_promotion_list")
        private List<OrderPromotionGetResponseOrderPromotionListItem> orderPromotionList;

        public List<OrderPromotionGetResponseOrderPromotionListItem> getOrderPromotionList() {
            return orderPromotionList;
        }
    }

    public static class OrderPromotionGetResponseOrderPromotionListItem {

        /**
         * 订单号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * 商家优惠信息
         */
        @JsonProperty("seller_discount_details")
        private List<OrderPromotionGetResponseOrderPromotionListItemSellerDiscountDetailsItem> sellerDiscountDetails;

        public String getOrderSn() {
            return orderSn;
        }

        public List<OrderPromotionGetResponseOrderPromotionListItemSellerDiscountDetailsItem> getSellerDiscountDetails() {
            return sellerDiscountDetails;
        }
    }

    public static class OrderPromotionGetResponseOrderPromotionListItemSellerDiscountDetailsItem {

        /**
         * 优惠金额。单位：元
         */
        @JsonProperty("discount")
        private Double discount;

        /**
         * 优惠描述
         */
        @JsonProperty("discount_desc")
        private String discountDesc;

        public Double getDiscount() {
            return discount;
        }

        public String getDiscountDesc() {
            return discountDesc;
        }
    }
}