package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddServicemarketSettlementbillGetResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("settlement_bill_search_response")
    private SettlementBillSearchResponse settlementBillSearchResponse;

    public SettlementBillSearchResponse getSettlementBillSearchResponse() {
        return settlementBillSearchResponse;
    }

    public static class SettlementBillSearchResponse {

        /**
         * 结算明细列表
         */
        @JsonProperty("data")
        private List<SettlementBillSearchResponseDataItem> data;

        /**
         * 当前查询条件下所有订单总数
         */
        @JsonProperty("total_count")
        private Integer totalCount;

        public List<SettlementBillSearchResponseDataItem> getData() {
            return data;
        }

        public Integer getTotalCount() {
            return totalCount;
        }
    }

    public static class SettlementBillSearchResponseDataItem {

        /**
         * 服务订单号
         */
        @JsonProperty("service_order_sn")
        private String serviceOrderSn;

        /**
         * 当期结算金额，单位分
         */
        @JsonProperty("settle_amount")
        private Long settleAmount;

        /**
         * 结算月份
         */
        @JsonProperty("settle_month")
        private String settleMonth;

        /**
         * 结算时间
         */
        @JsonProperty("settle_time")
        private String settleTime;

        /**
         * 待结算金额，单位分
         */
        @JsonProperty("unsettle_amount")
        private Long unsettleAmount;

        /**
         * 服务名称
         */
        @JsonProperty("service_name")
        private String serviceName;

        /**
         * 订单类型：0-应用服务、1-客服外包、2-电子发票、3-店铺装修、4-推广托管、5-代运营服务
         */
        @JsonProperty("order_type")
        private Integer orderType;

        public String getServiceOrderSn() {
            return serviceOrderSn;
        }

        public Long getSettleAmount() {
            return settleAmount;
        }

        public String getSettleMonth() {
            return settleMonth;
        }

        public String getSettleTime() {
            return settleTime;
        }

        public Long getUnsettleAmount() {
            return unsettleAmount;
        }

        public String getServiceName() {
            return serviceName;
        }

        public Integer getOrderType() {
            return orderType;
        }
    }
}