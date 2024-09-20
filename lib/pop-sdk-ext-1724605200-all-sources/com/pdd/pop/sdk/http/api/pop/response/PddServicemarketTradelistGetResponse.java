package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddServicemarketTradelistGetResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("mall_balance_flow_search_response")
    private MallBalanceFlowSearchResponse mallBalanceFlowSearchResponse;

    public MallBalanceFlowSearchResponse getMallBalanceFlowSearchResponse() {
        return mallBalanceFlowSearchResponse;
    }

    public static class MallBalanceFlowSearchResponse {

        /**
         * 交易流水列表
         */
        @JsonProperty("data")
        private List<MallBalanceFlowSearchResponseDataItem> data;

        /**
         * 当前查询条件下所有订单总数
         */
        @JsonProperty("total_count")
        private Integer totalCount;

        public List<MallBalanceFlowSearchResponseDataItem> getData() {
            return data;
        }

        public Integer getTotalCount() {
            return totalCount;
        }
    }

    public static class MallBalanceFlowSearchResponseDataItem {

        /**
         * 交易金额，单位分
         */
        @JsonProperty("amount")
        private Long amount;

        /**
         * 流水类目名称，1-交易收入，2-优惠券结算，3-退款，4-提现，5-技术服务费，7-扣款
         */
        @JsonProperty("class_name")
        private String className;

        /**
         * 流水创建时间，单位秒
         */
        @JsonProperty("created_at")
        private Integer createdAt;

        /**
         * 资金流向，1-收入，2-支出
         */
        @JsonProperty("group_type")
        private Integer groupType;

        /**
         * 服务订单号
         */
        @JsonProperty("service_order_sn")
        private String serviceOrderSn;

        /**
         * 交易备注
         */
        @JsonProperty("trade_note")
        private String tradeNote;

        public Long getAmount() {
            return amount;
        }

        public String getClassName() {
            return className;
        }

        public Integer getCreatedAt() {
            return createdAt;
        }

        public Integer getGroupType() {
            return groupType;
        }

        public String getServiceOrderSn() {
            return serviceOrderSn;
        }

        public String getTradeNote() {
            return tradeNote;
        }
    }
}