package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddVasOrderSearchResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("vas_order_search_response")
    private VasOrderSearchResponse vasOrderSearchResponse;

    public VasOrderSearchResponse getVasOrderSearchResponse() {
        return vasOrderSearchResponse;
    }

    public static class VasOrderSearchResponse {

        /**
         * 订单列表
         */
        @JsonProperty("orders")
        private List<VasOrderSearchResponseOrdersItem> orders;

        /**
         * 当前查询条件下所有订单总数
         */
        @JsonProperty("totalCount")
        private Integer totalCount;

        public List<VasOrderSearchResponseOrdersItem> getOrders() {
            return orders;
        }

        public Integer getTotalCount() {
            return totalCount;
        }
    }

    public static class VasOrderSearchResponseOrdersItem {

        /**
         * 实付价格
         */
        @JsonProperty("amount")
        private Long amount;

        /**
         * 订单创建时间
         */
        @JsonProperty("create_time")
        private Long createTime;

        /**
         * 店铺ID
         */
        @JsonProperty("mall_id")
        private Long mallId;

        /**
         * 服务订单ID
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * 支付状态，枚举值，0-未支付，1-已支付
         */
        @JsonProperty("pay_status")
        private Integer payStatus;

        /**
         * 支付时间
         */
        @JsonProperty("pay_time")
        private Long payTime;

        /**
         * 服务ID
         */
        @JsonProperty("service_id")
        private Long serviceId;

        /**
         * 服务名称
         */
        @JsonProperty("service_name")
        private String serviceName;

        /**
         * 服务SKUID
         */
        @JsonProperty("sku_id")
        private Long skuId;

        /**
         * 服务SKU名称
         */
        @JsonProperty("sku_spec")
        private String skuSpec;

        /**
         * 订单来源，0-线上订购，1-线下回流
         */
        @JsonProperty("source")
        private Integer source;

        /**
         * 订购时长
         */
        @JsonProperty("time_length")
        private Long timeLength;

        /**
         * 售后完成时间，如果没有申请过售后则为null
         */
        @JsonProperty("refund_finish_time")
        private Long refundFinishTime;

        /**
         * 售后状态，0-未售后，1-已售后
         */
        @JsonProperty("refund_status")
        private Integer refundStatus;

        /**
         * 店铺名称
         */
        @JsonProperty("mall_name")
        private String mallName;

        public Long getAmount() {
            return amount;
        }

        public Long getCreateTime() {
            return createTime;
        }

        public Long getMallId() {
            return mallId;
        }

        public String getOrderSn() {
            return orderSn;
        }

        public Integer getPayStatus() {
            return payStatus;
        }

        public Long getPayTime() {
            return payTime;
        }

        public Long getServiceId() {
            return serviceId;
        }

        public String getServiceName() {
            return serviceName;
        }

        public Long getSkuId() {
            return skuId;
        }

        public String getSkuSpec() {
            return skuSpec;
        }

        public Integer getSource() {
            return source;
        }

        public Long getTimeLength() {
            return timeLength;
        }

        public Long getRefundFinishTime() {
            return refundFinishTime;
        }

        public Integer getRefundStatus() {
            return refundStatus;
        }

        public String getMallName() {
            return mallName;
        }
    }
}