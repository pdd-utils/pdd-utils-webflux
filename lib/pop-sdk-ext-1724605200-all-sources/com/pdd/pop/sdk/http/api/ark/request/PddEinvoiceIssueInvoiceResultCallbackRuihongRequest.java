package com.pdd.pop.sdk.http.api.ark.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.ark.response.PddEinvoiceIssueInvoiceResultCallbackRuihongResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddEinvoiceIssueInvoiceResultCallbackRuihongRequest extends PopBaseHttpRequest<PddEinvoiceIssueInvoiceResultCallbackRuihongResponse> {

    /**
     * 业务字段
     */
    @JsonProperty("data")
    private Data data;

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
        return 1;
    }

    @Override
    public String getType() {
        return "pdd.einvoice.issue.invoice.result.callback.ruihong";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddEinvoiceIssueInvoiceResultCallbackRuihongResponse> getResponseClass() {
        return PddEinvoiceIssueInvoiceResultCallbackRuihongResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "data", data);
    }

    public void setData(Data data) {
        this.data = data;
    }

    public static class Data {

        /**
         * 返回代码
         */
        @JsonProperty("code")
        private String code;

        /**
         * 接口版本号
         */
        @JsonProperty("einvoiceApiVersion")
        private String einvoiceApiVersion;

        /**
         * 发票详情
         */
        @JsonProperty("invoice")
        private DataInvoice invoice;

        /**
         * 商家ID回传
         */
        @JsonProperty("mallId")
        private String mallId;

        /**
         * 处理结果说明
         */
        @JsonProperty("message")
        private String message;

        /**
         * pdd 提交开票请求时的订单 号
         */
        @JsonProperty("orderNo")
        private String orderNo;

        /**
         * pdd 提交开票请求时的流水 号
         */
        @JsonProperty("serialNo")
        private String serialNo;

        public void setCode(String code) {
            this.code = code;
        }

        public void setEinvoiceApiVersion(String einvoiceApiVersion) {
            this.einvoiceApiVersion = einvoiceApiVersion;
        }

        public void setInvoice(DataInvoice invoice) {
            this.invoice = invoice;
        }

        public void setMallId(String mallId) {
            this.mallId = mallId;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public void setSerialNo(String serialNo) {
            this.serialNo = serialNo;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class DataInvoice {

        /**
         * 校验码。
         */
        @JsonProperty("checkCode")
        private String checkCode;

        /**
         * 发票代码＋发票号码。
         */
        @JsonProperty("code")
        private String code;

        /**
         * 购货方地址。
         */
        @JsonProperty("customerAddress")
        private String customerAddress;

        /**
         * 购货方银行账号。
         */
        @JsonProperty("customerBankAccount")
        private String customerBankAccount;

        /**
         * 购货方开户银行。
         */
        @JsonProperty("customerBankName")
        private String customerBankName;

        /**
         * 购货方纳税人识别号。
         */
        @JsonProperty("customerCode")
        private String customerCode;

        /**
         * 购货方名称。
         */
        @JsonProperty("customerName")
        private String customerName;

        /**
         * 购货方电话。
         */
        @JsonProperty("customerTel")
        private String customerTel;

        /**
         * 开票人。
         */
        @JsonProperty("drawer")
        private String drawer;

        /**
         * 税控码。
         */
        @JsonProperty("fiscalCode")
        private String fiscalCode;

        /**
         * 开票日期 格式为 yyyy-MM-dd HH:mm。
         */
        @JsonProperty("generateTime")
        private String generateTime;

        /**
         * 发票pdf文件base64格式
         */
        @JsonProperty("invPdf")
        private String invPdf;

        /**
         * 发票项目明细列表
         */
        @JsonProperty("items")
        private List<DataInvoiceItemsItem> items;

        /**
         * 不含税金额。
         */
        @JsonProperty("noTaxAmount")
        private String noTaxAmount;

        /**
         * 订单编号。
         */
        @JsonProperty("orderNo")
        private String orderNo;

        /**
         * 收款人。
         */
        @JsonProperty("payee")
        private String payee;

        /**
         * PDF 文件下载地址。
         */
        @JsonProperty("pdfUnsignedUrl")
        private String pdfUnsignedUrl;

        /**
         * 关联发票代码+号码。如果发票被冲 红，则与被冲红发票相互关联。
         */
        @JsonProperty("relatedCode")
        private String relatedCode;

        /**
         * 发票备注。
         */
        @JsonProperty("remark")
        private String remark;

        /**
         * 复核人。
         */
        @JsonProperty("reviewer")
        private String reviewer;

        /**
         * 发票状态 1:正常 3:红冲 4:被红 冲。
         */
        @JsonProperty("status")
        private String status;

        /**
         * 税额。
         */
        @JsonProperty("taxAmount")
        private String taxAmount;

        /**
         * 开票税盘号
         */
        @JsonProperty("taxDeviceNo")
        private String taxDeviceNo;

        /**
         * 销货方地址。
         */
        @JsonProperty("taxpayerAddress")
        private String taxpayerAddress;

        /**
         * 销货方银行账号。
         */
        @JsonProperty("taxpayerBankAccount")
        private String taxpayerBankAccount;

        /**
         * 销货方开户银行。
         */
        @JsonProperty("taxpayerBankName")
        private String taxpayerBankName;

        /**
         * 销货方纳税人识别号。
         */
        @JsonProperty("taxpayerCode")
        private String taxpayerCode;

        /**
         * 销货方名称。
         */
        @JsonProperty("taxpayerName")
        private String taxpayerName;

        /**
         * 销货方电话。
         */
        @JsonProperty("taxpayerTel")
        private String taxpayerTel;

        /**
         * 税价合计金额。
         */
        @JsonProperty("totalAmount")
        private String totalAmount;

        /**
         * 冲红原因。
         */
        @JsonProperty("validReason")
        private String validReason;

        /**
         * 冲红时间。
         */
        @JsonProperty("validTime")
        private String validTime;

        /**
         * 发票查看地址。
         */
        @JsonProperty("viewUrl")
        private String viewUrl;

        /**
         * 发票密码
         */
        @JsonProperty("cipherText")
        private String cipherText;

        /**
         * 发票二维码
         */
        @JsonProperty("qrCode")
        private String qrCode;

        public void setCheckCode(String checkCode) {
            this.checkCode = checkCode;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public void setCustomerAddress(String customerAddress) {
            this.customerAddress = customerAddress;
        }

        public void setCustomerBankAccount(String customerBankAccount) {
            this.customerBankAccount = customerBankAccount;
        }

        public void setCustomerBankName(String customerBankName) {
            this.customerBankName = customerBankName;
        }

        public void setCustomerCode(String customerCode) {
            this.customerCode = customerCode;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public void setCustomerTel(String customerTel) {
            this.customerTel = customerTel;
        }

        public void setDrawer(String drawer) {
            this.drawer = drawer;
        }

        public void setFiscalCode(String fiscalCode) {
            this.fiscalCode = fiscalCode;
        }

        public void setGenerateTime(String generateTime) {
            this.generateTime = generateTime;
        }

        public void setInvPdf(String invPdf) {
            this.invPdf = invPdf;
        }

        public void setItems(List<DataInvoiceItemsItem> items) {
            this.items = items;
        }

        public void setNoTaxAmount(String noTaxAmount) {
            this.noTaxAmount = noTaxAmount;
        }

        public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public void setPayee(String payee) {
            this.payee = payee;
        }

        public void setPdfUnsignedUrl(String pdfUnsignedUrl) {
            this.pdfUnsignedUrl = pdfUnsignedUrl;
        }

        public void setRelatedCode(String relatedCode) {
            this.relatedCode = relatedCode;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public void setReviewer(String reviewer) {
            this.reviewer = reviewer;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public void setTaxAmount(String taxAmount) {
            this.taxAmount = taxAmount;
        }

        public void setTaxDeviceNo(String taxDeviceNo) {
            this.taxDeviceNo = taxDeviceNo;
        }

        public void setTaxpayerAddress(String taxpayerAddress) {
            this.taxpayerAddress = taxpayerAddress;
        }

        public void setTaxpayerBankAccount(String taxpayerBankAccount) {
            this.taxpayerBankAccount = taxpayerBankAccount;
        }

        public void setTaxpayerBankName(String taxpayerBankName) {
            this.taxpayerBankName = taxpayerBankName;
        }

        public void setTaxpayerCode(String taxpayerCode) {
            this.taxpayerCode = taxpayerCode;
        }

        public void setTaxpayerName(String taxpayerName) {
            this.taxpayerName = taxpayerName;
        }

        public void setTaxpayerTel(String taxpayerTel) {
            this.taxpayerTel = taxpayerTel;
        }

        public void setTotalAmount(String totalAmount) {
            this.totalAmount = totalAmount;
        }

        public void setValidReason(String validReason) {
            this.validReason = validReason;
        }

        public void setValidTime(String validTime) {
            this.validTime = validTime;
        }

        public void setViewUrl(String viewUrl) {
            this.viewUrl = viewUrl;
        }

        public void setCipherText(String cipherText) {
            this.cipherText = cipherText;
        }

        public void setQrCode(String qrCode) {
            this.qrCode = qrCode;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class DataInvoiceItemsItem {

        /**
         * 增值税特殊管理。
         */
        @JsonProperty("addedValueTaxFlg")
        private String addedValueTaxFlg;

        /**
         * 税价合计金额。
         */
        @JsonProperty("amount")
        private String amount;

        /**
         * 商品分类编码。
         */
        @JsonProperty("catalogCode")
        private String catalogCode;

        /**
         * 商品编码。
         */
        @JsonProperty("code")
        private String code;

        /**
         * 商品名称。带商品税收分类编码简 称，例如：开票时传入商品名称为 “水费”，则这里会返回“水冰雪 水费”
         */
        @JsonProperty("name")
        private String name;

        /**
         * 不含税金额。
         */
        @JsonProperty("noTaxAmount")
        private String noTaxAmount;

        /**
         * 优惠政策标识。
         */
        @JsonProperty("preferentialPolicyFlg")
        private String preferentialPolicyFlg;

        /**
         * 商品单价。
         */
        @JsonProperty("price")
        private String price;

        /**
         * 数量。
         */
        @JsonProperty("quantity")
        private String quantity;

        /**
         * 规格型号。
         */
        @JsonProperty("spec")
        private String spec;

        /**
         * 税额。
         */
        @JsonProperty("taxAmount")
        private String taxAmount;

        /**
         * 税率。
         */
        @JsonProperty("taxRate")
        private String taxRate;

        /**
         * 发票行性质 0 正常行、1 折扣行、2 被折扣行。
         */
        @JsonProperty("type")
        private String type;

        /**
         * 单位。
         */
        @JsonProperty("uom")
        private String uom;

        /**
         * 零税率标识。
         */
        @JsonProperty("zeroTaxRateFlg")
        private String zeroTaxRateFlg;

        public void setAddedValueTaxFlg(String addedValueTaxFlg) {
            this.addedValueTaxFlg = addedValueTaxFlg;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public void setCatalogCode(String catalogCode) {
            this.catalogCode = catalogCode;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setNoTaxAmount(String noTaxAmount) {
            this.noTaxAmount = noTaxAmount;
        }

        public void setPreferentialPolicyFlg(String preferentialPolicyFlg) {
            this.preferentialPolicyFlg = preferentialPolicyFlg;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }

        public void setSpec(String spec) {
            this.spec = spec;
        }

        public void setTaxAmount(String taxAmount) {
            this.taxAmount = taxAmount;
        }

        public void setTaxRate(String taxRate) {
            this.taxRate = taxRate;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setUom(String uom) {
            this.uom = uom;
        }

        public void setZeroTaxRateFlg(String zeroTaxRateFlg) {
            this.zeroTaxRateFlg = zeroTaxRateFlg;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}