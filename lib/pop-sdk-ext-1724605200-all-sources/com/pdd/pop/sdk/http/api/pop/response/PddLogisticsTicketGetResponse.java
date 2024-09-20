package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddLogisticsTicketGetResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("logistics_ticket_get_response")
    private LogisticsTicketGetResponse logisticsTicketGetResponse;

    public LogisticsTicketGetResponse getLogisticsTicketGetResponse() {
        return logisticsTicketGetResponse;
    }

    public static class LogisticsTicketGetResponse {

        /**
         * 工单列表
         */
        @JsonProperty("logistics_ticket_list")
        private List<LogisticsTicketGetResponseLogisticsTicketListItem> logisticsTicketList;

        /**
         * 列表总数
         */
        @JsonProperty("total_count")
        private Integer totalCount;

        public List<LogisticsTicketGetResponseLogisticsTicketListItem> getLogisticsTicketList() {
            return logisticsTicketList;
        }

        public Integer getTotalCount() {
            return totalCount;
        }
    }

    public static class LogisticsTicketGetResponseLogisticsTicketListItem {

        /**
         * 附件列表
         */
        @JsonProperty("attach_url")
        private List<String> attachUrl;

        /**
         * 末端品牌代码
         */
        @JsonProperty("cabinet_code")
        private String cabinetCode;

        /**
         * 赔付金额(单位:分)
         */
        @JsonProperty("compensate_amount")
        private Long compensateAmount;

        /**
         * 赔付状态 0:默认,1:未赔付,2:已赔付
         */
        @JsonProperty("compensate_state")
        private Integer compensateState;

        /**
         * create_type
         */
        @JsonProperty("create_type")
        private Integer createType;

        /**
         * 工单创建时间戳
         */
        @JsonProperty("created_at")
        private Long createdAt;

        /**
         * 备注
         */
        @JsonProperty("description")
        private String description;

        /**
         * duty
         */
        @JsonProperty("duty")
        private Integer duty;

        /**
         * 物流商回传凭证
         */
        @JsonProperty("express_attachment")
        private List<LogisticsTicketGetResponseLogisticsTicketListItemExpressAttachmentItem> expressAttachment;

        /**
         * 物流商快递编码
         */
        @JsonProperty("express_company_id")
        private Long expressCompanyId;

        /**
         * 处理人
         */
        @JsonProperty("express_dealer")
        private String expressDealer;

        /**
         * 处理人联系方式
         */
        @JsonProperty("express_dealer_contact")
        private String expressDealerContact;

        /**
         * 物流商处理结果
         */
        @JsonProperty("handle_result")
        private String handleResult;

        /**
         * 寄件单号
         */
        @JsonProperty("mail_order_sn")
        private String mailOrderSn;

        /**
         * 订单金额
         */
        @JsonProperty("pay_amount")
        private Long payAmount;

        /**
         * 订单号生成的物流单号
         */
        @JsonProperty("pre_delivery_id")
        private String preDeliveryId;

        /**
         * receive_address
         */
        @JsonProperty("receive_address")
        private String receiveAddress;

        /**
         * 联系人电话
         */
        @JsonProperty("receive_contact")
        private String receiveContact;

        /**
         * 联系人姓名
         */
        @JsonProperty("receive_name")
        private String receiveName;

        /**
         * 工单退回次数
         */
        @JsonProperty("retreat_count")
        private Long retreatCount;

        /**
         * send_address
         */
        @JsonProperty("send_address")
        private String sendAddress;

        /**
         * 0:默认,1:未签收,2:已签收
         */
        @JsonProperty("sign_state")
        private Integer signState;

        /**
         * 问题来源，	0:买家,1:卖家
         */
        @JsonProperty("source")
        private Integer source;

        /**
         * 物流商回复状态，0：待回复，1：已回复
         */
        @JsonProperty("status")
        private Integer status;

        /**
         * 物流投诉标签
         */
        @JsonProperty("sub_type_ids")
        private List<Integer> subTypeIds;

        /**
         * 工单id
         */
        @JsonProperty("ticket_id")
        private Long ticketId;

        /**
         * 问题描述
         */
        @JsonProperty("title")
        private String title;

        /**
         * 问题类型id
         */
        @JsonProperty("type_id")
        private Long typeId;

        /**
         * 工单最后更新时间戳
         */
        @JsonProperty("updated_at")
        private Long updatedAt;

        /**
         * 紧急度，0:中,1:紧急
         */
        @JsonProperty("urgent_type")
        private Integer urgentType;

        /**
         * 运单号(可能为空字符串)
         */
        @JsonProperty("waybill_no")
        private String waybillNo;

        /**
         * 国家/区域名称(集运物流工单)
         */
        @JsonProperty("area_name")
        private String areaName;

        /**
         * 用户投诉时上传的附件
         */
        @JsonProperty("attachment_urls_by_customer")
        private List<String> attachmentUrlsByCustomer;

        public List<String> getAttachUrl() {
            return attachUrl;
        }

        public String getCabinetCode() {
            return cabinetCode;
        }

        public Long getCompensateAmount() {
            return compensateAmount;
        }

        public Integer getCompensateState() {
            return compensateState;
        }

        public Integer getCreateType() {
            return createType;
        }

        public Long getCreatedAt() {
            return createdAt;
        }

        public String getDescription() {
            return description;
        }

        public Integer getDuty() {
            return duty;
        }

        public List<LogisticsTicketGetResponseLogisticsTicketListItemExpressAttachmentItem> getExpressAttachment() {
            return expressAttachment;
        }

        public Long getExpressCompanyId() {
            return expressCompanyId;
        }

        public String getExpressDealer() {
            return expressDealer;
        }

        public String getExpressDealerContact() {
            return expressDealerContact;
        }

        public String getHandleResult() {
            return handleResult;
        }

        public String getMailOrderSn() {
            return mailOrderSn;
        }

        public Long getPayAmount() {
            return payAmount;
        }

        public String getPreDeliveryId() {
            return preDeliveryId;
        }

        public String getReceiveAddress() {
            return receiveAddress;
        }

        public String getReceiveContact() {
            return receiveContact;
        }

        public String getReceiveName() {
            return receiveName;
        }

        public Long getRetreatCount() {
            return retreatCount;
        }

        public String getSendAddress() {
            return sendAddress;
        }

        public Integer getSignState() {
            return signState;
        }

        public Integer getSource() {
            return source;
        }

        public Integer getStatus() {
            return status;
        }

        public List<Integer> getSubTypeIds() {
            return subTypeIds;
        }

        public Long getTicketId() {
            return ticketId;
        }

        public String getTitle() {
            return title;
        }

        public Long getTypeId() {
            return typeId;
        }

        public Long getUpdatedAt() {
            return updatedAt;
        }

        public Integer getUrgentType() {
            return urgentType;
        }

        public String getWaybillNo() {
            return waybillNo;
        }

        public String getAreaName() {
            return areaName;
        }

        public List<String> getAttachmentUrlsByCustomer() {
            return attachmentUrlsByCustomer;
        }
    }

    public static class LogisticsTicketGetResponseLogisticsTicketListItemExpressAttachmentItem {

        /**
         * 物流商回传凭证链接
         */
        @JsonProperty("url")
        private String url;

        public String getUrl() {
            return url;
        }
    }
}