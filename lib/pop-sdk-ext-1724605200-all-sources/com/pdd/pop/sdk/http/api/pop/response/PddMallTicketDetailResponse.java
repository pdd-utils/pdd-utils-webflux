package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddMallTicketDetailResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("mall_ticket_detail_response")
    private MallTicketDetailResponse mallTicketDetailResponse;

    public MallTicketDetailResponse getMallTicketDetailResponse() {
        return mallTicketDetailResponse;
    }

    public static class MallTicketDetailResponse {

        /**
         * 附件(图片)
         */
        @JsonProperty("attach_url")
        private List<MallTicketDetailResponseAttachUrlItem> attachUrl;

        /**
         * 创建时间(秒)
         */
        @JsonProperty("created_at")
        private Integer createdAt;

        /**
         * 创建类型
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
         * 流水记录
         */
        @JsonProperty("history_record")
        private List<MallTicketDetailResponseHistoryRecordItem> historyRecord;

        /**
         * 商家工单id
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
         * 问题描述
         */
        @JsonProperty("question")
        private String question;

        /**
         * 问题类型描述
         */
        @JsonProperty("type_desc")
        private String typeDesc;

        /**
         * 问题类型id
         */
        @JsonProperty("type_id")
        private Integer typeId;

        public List<MallTicketDetailResponseAttachUrlItem> getAttachUrl() {
            return attachUrl;
        }

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

        public List<MallTicketDetailResponseHistoryRecordItem> getHistoryRecord() {
            return historyRecord;
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

    public static class MallTicketDetailResponseAttachUrlItem {

        /**
         * url
         */
        @JsonProperty("url")
        private String url;

        public String getUrl() {
            return url;
        }
    }

    public static class MallTicketDetailResponseHistoryRecordItem {

        /**
         * 附件(图片)
         */
        @JsonProperty("attach_url")
        private List<MallTicketDetailResponseHistoryRecordItemAttachUrlItem> attachUrl;

        /**
         * content
         */
        @JsonProperty("content")
        private String content;

        /**
         * created_at
         */
        @JsonProperty("created_at")
        private Integer createdAt;

        /**
         * detail
         */
        @JsonProperty("detail")
        private String detail;

        /**
         * role
         */
        @JsonProperty("role")
        private Integer role;

        public List<MallTicketDetailResponseHistoryRecordItemAttachUrlItem> getAttachUrl() {
            return attachUrl;
        }

        public String getContent() {
            return content;
        }

        public Integer getCreatedAt() {
            return createdAt;
        }

        public String getDetail() {
            return detail;
        }

        public Integer getRole() {
            return role;
        }
    }

    public static class MallTicketDetailResponseHistoryRecordItemAttachUrlItem {

        /**
         * url
         */
        @JsonProperty("url")
        private String url;

        public String getUrl() {
            return url;
        }
    }
}