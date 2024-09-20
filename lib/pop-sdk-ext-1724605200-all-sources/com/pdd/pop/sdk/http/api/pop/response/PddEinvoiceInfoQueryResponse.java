package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddEinvoiceInfoQueryResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("einvoice_info_query_response")
    private EinvoiceInfoQueryResponse einvoiceInfoQueryResponse;

    public EinvoiceInfoQueryResponse getEinvoiceInfoQueryResponse() {
        return einvoiceInfoQueryResponse;
    }

    public static class EinvoiceInfoQueryResponse {

        /**
         * 
         */
        @JsonProperty("invoice_info_list")
        private List<EinvoiceInfoQueryResponseInvoiceInfoListItem> invoiceInfoList;

        public List<EinvoiceInfoQueryResponseInvoiceInfoListItem> getInvoiceInfoList() {
            return invoiceInfoList;
        }
    }

    public static class EinvoiceInfoQueryResponseInvoiceInfoListItem {

        /**
         * 购方地址
         */
        @JsonProperty("buyer_address")
        private String buyerAddress;

        /**
         * 购方银行账号
         */
        @JsonProperty("buyer_bank_account")
        private String buyerBankAccount;

        /**
         * 购方银行名称
         */
        @JsonProperty("buyer_bank_name")
        private String buyerBankName;

        /**
         * 购方名称(发票抬头)
         */
        @JsonProperty("buyer_name")
        private String buyerName;

        /**
         * 购方电话
         */
        @JsonProperty("buyer_phone_number")
        private String buyerPhoneNumber;

        /**
         * 购方税号
         */
        @JsonProperty("buyer_tax_no")
        private String buyerTaxNo;

        /**
         * 复核人
         */
        @JsonProperty("checker")
        private String checker;

        /**
         * 开票时间（毫秒，如：1594023438064），以服务商回传成功时间为准
         */
        @JsonProperty("create_time")
        private Long createTime;

        /**
         * 开票人
         */
        @JsonProperty("drawer")
        private String drawer;

        /**
         * 发票代码
         */
        @JsonProperty("invoice_code")
        private String invoiceCode;

        /**
         * 
         */
        @JsonProperty("invoice_item_list")
        private List<EinvoiceInfoQueryResponseInvoiceInfoListItemInvoiceItemListItem> invoiceItemList;

        /**
         * 发票号码
         */
        @JsonProperty("invoice_no")
        private String invoiceNo;

        /**
         * 发票开票日期（毫秒，如：1594023438064)
         */
        @JsonProperty("invoice_time")
        private Long invoiceTime;

        /**
         * 发票类型 0-蓝票，1-红票
         */
        @JsonProperty("invoice_type")
        private Integer invoiceType;

        /**
         * pdd订单号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * 原蓝票代码（红票时返回）
         */
        @JsonProperty("original_invoice_code")
        private String originalInvoiceCode;

        /**
         * 原蓝票号码（红票时返回）
         */
        @JsonProperty("original_invoice_no")
        private String originalInvoiceNo;

        /**
         * 收款人
         */
        @JsonProperty("payee")
        private String payee;

        /**
         * 发票下载地址，30分钟内有效
         */
        @JsonProperty("pdf_path")
        private String pdfPath;

        /**
         * 发票备注信息
         */
        @JsonProperty("remark")
        private String remark;

        /**
         * 销方地址
         */
        @JsonProperty("seller_address")
        private String sellerAddress;

        /**
         * 销方银行账号
         */
        @JsonProperty("seller_bank_account")
        private String sellerBankAccount;

        /**
         * 销方银行名称
         */
        @JsonProperty("seller_bank_name")
        private String sellerBankName;

        /**
         * 销方名称
         */
        @JsonProperty("seller_name")
        private String sellerName;

        /**
         * 销方电话
         */
        @JsonProperty("seller_phone_number")
        private String sellerPhoneNumber;

        /**
         * 销方税号
         */
        @JsonProperty("seller_tax_no")
        private String sellerTaxNo;

        /**
         * 价税合计金额(放大100倍，单位分)
         */
        @JsonProperty("total_amount")
        private Long totalAmount;

        /**
         * 合计金额（不含税，放大100倍，单位分）
         */
        @JsonProperty("total_price")
        private Long totalPrice;

        /**
         * 合计税额(放大100倍，单位分)
         */
        @JsonProperty("total_tax_amount")
        private Long totalTaxAmount;

        public String getBuyerAddress() {
            return buyerAddress;
        }

        public String getBuyerBankAccount() {
            return buyerBankAccount;
        }

        public String getBuyerBankName() {
            return buyerBankName;
        }

        public String getBuyerName() {
            return buyerName;
        }

        public String getBuyerPhoneNumber() {
            return buyerPhoneNumber;
        }

        public String getBuyerTaxNo() {
            return buyerTaxNo;
        }

        public String getChecker() {
            return checker;
        }

        public Long getCreateTime() {
            return createTime;
        }

        public String getDrawer() {
            return drawer;
        }

        public String getInvoiceCode() {
            return invoiceCode;
        }

        public List<EinvoiceInfoQueryResponseInvoiceInfoListItemInvoiceItemListItem> getInvoiceItemList() {
            return invoiceItemList;
        }

        public String getInvoiceNo() {
            return invoiceNo;
        }

        public Long getInvoiceTime() {
            return invoiceTime;
        }

        public Integer getInvoiceType() {
            return invoiceType;
        }

        public String getOrderSn() {
            return orderSn;
        }

        public String getOriginalInvoiceCode() {
            return originalInvoiceCode;
        }

        public String getOriginalInvoiceNo() {
            return originalInvoiceNo;
        }

        public String getPayee() {
            return payee;
        }

        public String getPdfPath() {
            return pdfPath;
        }

        public String getRemark() {
            return remark;
        }

        public String getSellerAddress() {
            return sellerAddress;
        }

        public String getSellerBankAccount() {
            return sellerBankAccount;
        }

        public String getSellerBankName() {
            return sellerBankName;
        }

        public String getSellerName() {
            return sellerName;
        }

        public String getSellerPhoneNumber() {
            return sellerPhoneNumber;
        }

        public String getSellerTaxNo() {
            return sellerTaxNo;
        }

        public Long getTotalAmount() {
            return totalAmount;
        }

        public Long getTotalPrice() {
            return totalPrice;
        }

        public Long getTotalTaxAmount() {
            return totalTaxAmount;
        }
    }

    public static class EinvoiceInfoQueryResponseInvoiceInfoListItemInvoiceItemListItem {

        /**
         * 价税合计(放大100倍,单位分)
         */
        @JsonProperty("amount")
        private Long amount;

        /**
         * 税收分类编码
         */
        @JsonProperty("catalog_code")
        private String catalogCode;

        /**
         * 商品名称
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * 不含税金额(放大100倍，单位分)
         */
        @JsonProperty("no_tax_amount")
        private Long noTaxAmount;

        /**
         * 含税单价（放大1000000倍）
         */
        @JsonProperty("price")
        private Long price;

        /**
         * 数量（放大1000000倍）
         */
        @JsonProperty("quantity")
        private Long quantity;

        /**
         * 规格型号
         */
        @JsonProperty("specification")
        private String specification;

        /**
         * 税率
         */
        @JsonProperty("tax_rate")
        private String taxRate;

        /**
         * 总税额(放大100倍，单位分)
         */
        @JsonProperty("total_tax")
        private Long totalTax;

        /**
         * 单位
         */
        @JsonProperty("unit")
        private String unit;

        /**
         * 零税率标识，1：免税，2：不征税，3：普通零税率
         */
        @JsonProperty("zero_tax_rate_flag")
        private Integer zeroTaxRateFlag;

        public Long getAmount() {
            return amount;
        }

        public String getCatalogCode() {
            return catalogCode;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public Long getNoTaxAmount() {
            return noTaxAmount;
        }

        public Long getPrice() {
            return price;
        }

        public Long getQuantity() {
            return quantity;
        }

        public String getSpecification() {
            return specification;
        }

        public String getTaxRate() {
            return taxRate;
        }

        public Long getTotalTax() {
            return totalTax;
        }

        public String getUnit() {
            return unit;
        }

        public Integer getZeroTaxRateFlag() {
            return zeroTaxRateFlag;
        }
    }
}