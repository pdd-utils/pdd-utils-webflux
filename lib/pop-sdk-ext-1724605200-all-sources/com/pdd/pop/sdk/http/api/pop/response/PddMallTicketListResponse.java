package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddMallTicketListResponse extends PopBaseHttpResponse {

    /**
     * respone
     */
    @JsonProperty("mall_ticket_list_response")
    private MallTicketListResponse mallTicketListResponse;

    public MallTicketListResponse getMallTicketListResponse() {
        return mallTicketListResponse;
    }

    public static class MallTicketListResponse {

        /**
         * list
         */
        @JsonProperty("list")
        private List<MallTicketListResponseListItem> list;

        /**
         * 总数
         */
        @JsonProperty("total")
        private Integer total;

        public List<MallTicketListResponseListItem> getList() {
            return list;
        }

        public Integer getTotal() {
            return total;
        }
    }

    public static class MallTicketListResponseListItem {

        /**
         * 创建时间(秒)
         */
        @JsonProperty("created_at")
        private Integer createdAt;

        /**
         * 问题类型id
         */
        @JsonProperty("create_type")
        private Integer createType;

        /**
         * 逾期时间(秒)
         */
        @JsonProperty("deadline")
        private Integer deadline;

        /**
         * 问题备注
         */
        @JsonProperty("description")
        private String description;

        /**
         * 创建类型
         */
        @JsonProperty("id")
        private String id;

        /**
         * 订单号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * 商家工单状态
         */
        @JsonProperty("progress")
        private Integer progress;

        /**
         * 问题备注
         */
        @JsonProperty("question")
        private String question;

        /**
         * 问题描述
         */
        @JsonProperty("type_desc")
        private String typeDesc;

        /**
         * 问题类型描述
         */
        @JsonProperty("type_id")
        private Integer typeId;

        public Integer getCreatedAt() {
            return createdAt;
        }

        public Integer getCreateType() {
            return createType;
        }

        public Integer getDeadline() {
            return deadline;
        }

        public String getDescription() {
            return description;
        }

        public String getId() {
            return id;
        }

        public String getOrderSn() {
            return orderSn;
        }

        public Integer getProgress() {
            return progress;
        }

        public String getQuestion() {
            return question;
        }

        public String getTypeDesc() {
            return typeDesc;
        }

        public Integer getTypeId() {
            return typeId;
        }
    }
}