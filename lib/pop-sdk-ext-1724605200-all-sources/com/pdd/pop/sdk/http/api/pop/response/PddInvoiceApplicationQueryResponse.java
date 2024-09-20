package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddInvoiceApplicationQueryResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("invoice_application_query_response")
    private InvoiceApplicationQueryResponse invoiceApplicationQueryResponse;

    public InvoiceApplicationQueryResponse getInvoiceApplicationQueryResponse() {
        return invoiceApplicationQueryResponse;
    }

    public static class InvoiceApplicationQueryResponse {

        /**
         * 发票申请列表
         */
        @JsonProperty("invoice_application_list")
        private List<InvoiceApplicationQueryResponseInvoiceApplicationListItem> invoiceApplicationList;

        public List<InvoiceApplicationQueryResponseInvoiceApplicationListItem> getInvoiceApplicationList() {
            return invoiceApplicationList;
        }
    }

    public static class InvoiceApplicationQueryResponseInvoiceApplicationListItem {

        /**
         * 申请状态：0-已拒绝，1-申请中，2-已同意
         */
        @JsonProperty("application_status")
        private Integer applicationStatus;

        /**
         * 申请时间
         */
        @JsonProperty("apply_time")
        private Integer applyTime;

        /**
         * 抬头类型：0-个人，1-企业
         */
        @JsonProperty("business_type")
        private Integer businessType;

        /**
         * 开票金额，单位：分
         */
        @JsonProperty("invoice_amount")
        private String invoiceAmount;

        /**
         * 发票种类：0-电子，1-纸质，2-专票；目前只支持0和2
         */
        @JsonProperty("invoice_kind")
        private Integer invoiceKind;

        /**
         * 发票类型：0-蓝票，1-红票
         */
        @JsonProperty("invoice_type")
        private Integer invoiceType;

        /**
         * 开票方式 0=手动开票,1=自动开票
         */
        @JsonProperty("invoice_way")
        private Integer invoiceWay;

        /**
         * 店铺id
         */
        @JsonProperty("mall_id")
        private Long mallId;

        /**
         * 备注
         */
        @JsonProperty("memo")
        private String memo;

        /**
         * 订单号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * （企业抬头）开户账号
         */
        @JsonProperty("payer_account")
        private String payerAccount;

        /**
         * （企业抬头）地址
         */
        @JsonProperty("payer_address")
        private String payerAddress;

        /**
         * （企业抬头）开户银行
         */
        @JsonProperty("payer_bank")
        private String payerBank;

        /**
         * 发票抬头
         */
        @JsonProperty("payer_name")
        private String payerName;

        /**
         * （企业抬头）电话
         */
        @JsonProperty("payer_phone")
        private String payerPhone;

        /**
         * 企业税号，抬头为企业类型必填
         */
        @JsonProperty("payer_register_no")
        private String payerRegisterNo;

        /**
         * 是否正品发票：0=非正品发票，1=非正品发票
         */
        @JsonProperty("quality_goods_invoice")
        private Integer qualityGoodsInvoice;

        /**
         * 驳回原因
         */
        @JsonProperty("reason")
        private String reason;

        /**
         * 不含税金额，暂为null
         */
        @JsonProperty("sum_price")
        private String sumPrice;

        /**
         * 总税额，暂为null
         */
        @JsonProperty("sum_tax")
        private String sumTax;

        /**
         * 税率，暂为null
         */
        @JsonProperty("tax_rate")
        private String taxRate;

        /**
         * 开票申请触发类型：1-申请开票，2-改抬头
         */
        @JsonProperty("trigger_status")
        private Integer triggerStatus;

        public Integer getApplicationStatus() {
            return applicationStatus;
        }

        public Integer getApplyTime() {
            return applyTime;
        }

        public Integer getBusinessType() {
            return businessType;
        }

        public String getInvoiceAmount() {
            return invoiceAmount;
        }

        public Integer getInvoiceKind() {
            return invoiceKind;
        }

        public Integer getInvoiceType() {
            return invoiceType;
        }

        public Integer getInvoiceWay() {
            return invoiceWay;
        }

        public Long getMallId() {
            return mallId;
        }

        public String getMemo() {
            return memo;
        }

        public String getOrderSn() {
            return orderSn;
        }

        public String getPayerAccount() {
            return payerAccount;
        }

        public String getPayerAddress() {
            return payerAddress;
        }

        public String getPayerBank() {
            return payerBank;
        }

        public String getPayerName() {
            return payerName;
        }

        public String getPayerPhone() {
            return payerPhone;
        }

        public String getPayerRegisterNo() {
            return payerRegisterNo;
        }

        public Integer getQualityGoodsInvoice() {
            return qualityGoodsInvoice;
        }

        public String getReason() {
            return reason;
        }

        public String getSumPrice() {
            return sumPrice;
        }

        public String getSumTax() {
            return sumTax;
        }

        public String getTaxRate() {
            return taxRate;
        }

        public Integer getTriggerStatus() {
            return triggerStatus;
        }
    }
}