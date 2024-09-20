package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddInvoiceDetailUploadResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddInvoiceDetailUploadRequest extends PopBaseHttpRequest<PddInvoiceDetailUploadResponse> {

    /**
     * 申请流水号
     */
    @JsonProperty("application_id")
    private Long applicationId;

    /**
     * 抬头类型：0-个人，1-企业
     */
    @JsonProperty("business_type")
    private Integer businessType;

    /**
     * 开票金额，整数，单位：分
     */
    @JsonProperty("invoice_amount")
    private Long invoiceAmount;

    /**
     * 发票代码
     */
    @JsonProperty("invoice_code")
    private String invoiceCode;

    /**
     * 发票内容，pdf文件(电票回传)，图片文件(专票回传)，转码base64编码
     */
    @JsonProperty("invoice_file_content")
    private String invoiceFileContent;

    /**
     * 多张发票列表（如果本字段为空，invoice_code、invoice_no、invoice_amount、invoice_file_content这四个字段必须填写）
     */
    @JsonProperty("invoice_item_list")
    private List<InvoiceItemListItem> invoiceItemList;

    /**
     * 发票种类：0-电子发票，1-纸质发票，2-专票；目前只支持0
     */
    @JsonProperty("invoice_kind")
    private Integer invoiceKind;

    /**
     * 发票号码
     */
    @JsonProperty("invoice_no")
    private String invoiceNo;

    /**
     * 开票日期,时间戳（毫秒）
     */
    @JsonProperty("invoice_time")
    private Long invoiceTime;

    /**
     * 开票类型：0-蓝票，1-红票；目前 只支持0
     */
    @JsonProperty("invoice_type")
    private Integer invoiceType;

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
     * 原蓝票代码（红票必填）
     */
    @JsonProperty("original_invoice_code")
    private String originalInvoiceCode;

    /**
     * 原蓝票号码（红票必填）
     */
    @JsonProperty("original_invoice_no")
    private String originalInvoiceNo;

    /**
     * 专票回传必填，专票邮寄快递公司编码，见https: open.pinduoduo.com/application/document/api?id=pdd.logistics.companies.get返回的快递公司编码
     */
    @JsonProperty("paper_shipping_id")
    private Integer paperShippingId;

    /**
     * 专票回传必填，专票邮寄运单号
     */
    @JsonProperty("paper_tracking_number")
    private String paperTrackingNumber;

    /**
     * 开票人
     */
    @JsonProperty("payee_operator")
    private String payeeOperator;

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
     * 税号，企业必填
     */
    @JsonProperty("payer_register_no")
    private String payerRegisterNo;

    /**
     * 不含税金额，整数，单位：分
     */
    @JsonProperty("sum_price")
    private Long sumPrice;

    /**
     * 总税额，整数，单位：分
     */
    @JsonProperty("sum_tax")
    private Integer sumTax;

    /**
     * 税率,整数
     */
    @JsonProperty("tax_rate")
    private Integer taxRate;

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
        return "pdd.invoice.detail.upload";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddInvoiceDetailUploadResponse> getResponseClass() {
        return PddInvoiceDetailUploadResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "application_id", applicationId);
        setUserParam(params, "business_type", businessType);
        setUserParam(params, "invoice_amount", invoiceAmount);
        setUserParam(params, "invoice_code", invoiceCode);
        setUserParam(params, "invoice_file_content", invoiceFileContent);
        setUserParam(params, "invoice_item_list", invoiceItemList);
        setUserParam(params, "invoice_kind", invoiceKind);
        setUserParam(params, "invoice_no", invoiceNo);
        setUserParam(params, "invoice_time", invoiceTime);
        setUserParam(params, "invoice_type", invoiceType);
        setUserParam(params, "memo", memo);
        setUserParam(params, "order_sn", orderSn);
        setUserParam(params, "original_invoice_code", originalInvoiceCode);
        setUserParam(params, "original_invoice_no", originalInvoiceNo);
        setUserParam(params, "paper_shipping_id", paperShippingId);
        setUserParam(params, "paper_tracking_number", paperTrackingNumber);
        setUserParam(params, "payee_operator", payeeOperator);
        setUserParam(params, "payer_account", payerAccount);
        setUserParam(params, "payer_address", payerAddress);
        setUserParam(params, "payer_bank", payerBank);
        setUserParam(params, "payer_name", payerName);
        setUserParam(params, "payer_phone", payerPhone);
        setUserParam(params, "payer_register_no", payerRegisterNo);
        setUserParam(params, "sum_price", sumPrice);
        setUserParam(params, "sum_tax", sumTax);
        setUserParam(params, "tax_rate", taxRate);
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    public void setInvoiceAmount(Long invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
    }

    public void setInvoiceFileContent(String invoiceFileContent) {
        this.invoiceFileContent = invoiceFileContent;
    }

    public void setInvoiceItemList(List<InvoiceItemListItem> invoiceItemList) {
        this.invoiceItemList = invoiceItemList;
    }

    public void setInvoiceKind(Integer invoiceKind) {
        this.invoiceKind = invoiceKind;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public void setInvoiceTime(Long invoiceTime) {
        this.invoiceTime = invoiceTime;
    }

    public void setInvoiceType(Integer invoiceType) {
        this.invoiceType = invoiceType;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public void setOriginalInvoiceCode(String originalInvoiceCode) {
        this.originalInvoiceCode = originalInvoiceCode;
    }

    public void setOriginalInvoiceNo(String originalInvoiceNo) {
        this.originalInvoiceNo = originalInvoiceNo;
    }

    public void setPaperShippingId(Integer paperShippingId) {
        this.paperShippingId = paperShippingId;
    }

    public void setPaperTrackingNumber(String paperTrackingNumber) {
        this.paperTrackingNumber = paperTrackingNumber;
    }

    public void setPayeeOperator(String payeeOperator) {
        this.payeeOperator = payeeOperator;
    }

    public void setPayerAccount(String payerAccount) {
        this.payerAccount = payerAccount;
    }

    public void setPayerAddress(String payerAddress) {
        this.payerAddress = payerAddress;
    }

    public void setPayerBank(String payerBank) {
        this.payerBank = payerBank;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public void setPayerPhone(String payerPhone) {
        this.payerPhone = payerPhone;
    }

    public void setPayerRegisterNo(String payerRegisterNo) {
        this.payerRegisterNo = payerRegisterNo;
    }

    public void setSumPrice(Long sumPrice) {
        this.sumPrice = sumPrice;
    }

    public void setSumTax(Integer sumTax) {
        this.sumTax = sumTax;
    }

    public void setTaxRate(Integer taxRate) {
        this.taxRate = taxRate;
    }

    public static class InvoiceItemListItem {

        /**
         * 开票金额 单位:分
         */
        @JsonProperty("invoice_amount")
        private Long invoiceAmount;

        /**
         * 发票代码
         */
        @JsonProperty("invoice_code")
        private String invoiceCode;

        /**
         * 发票内容，pdf文件(电票回传)，图片文件(专票回传)，转码base64编码
         */
        @JsonProperty("invoice_file_content")
        private String invoiceFileContent;

        /**
         * 发票号码
         */
        @JsonProperty("invoice_no")
        private String invoiceNo;

        /**
         * 原蓝票代码（红票必填）
         */
        @JsonProperty("original_invoice_code")
        private String originalInvoiceCode;

        /**
         * 原蓝票号码（红票必填）
         */
        @JsonProperty("original_invoice_no")
        private String originalInvoiceNo;

        public void setInvoiceAmount(Long invoiceAmount) {
            this.invoiceAmount = invoiceAmount;
        }

        public void setInvoiceCode(String invoiceCode) {
            this.invoiceCode = invoiceCode;
        }

        public void setInvoiceFileContent(String invoiceFileContent) {
            this.invoiceFileContent = invoiceFileContent;
        }

        public void setInvoiceNo(String invoiceNo) {
            this.invoiceNo = invoiceNo;
        }

        public void setOriginalInvoiceCode(String originalInvoiceCode) {
            this.originalInvoiceCode = originalInvoiceCode;
        }

        public void setOriginalInvoiceNo(String originalInvoiceNo) {
            this.originalInvoiceNo = originalInvoiceNo;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}