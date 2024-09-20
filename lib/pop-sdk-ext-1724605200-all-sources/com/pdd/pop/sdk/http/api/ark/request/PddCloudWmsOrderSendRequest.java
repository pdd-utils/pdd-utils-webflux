package com.pdd.pop.sdk.http.api.ark.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.ark.response.PddCloudWmsOrderSendResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddCloudWmsOrderSendRequest extends PopBaseHttpRequest<PddCloudWmsOrderSendResponse> {

    /**
     * 订单下发wms请求
     */
    @JsonProperty("wms_order_send_request")
    private WmsOrderSendRequest wmsOrderSendRequest;

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
        return "pdd.cloud.wms.order.send";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddCloudWmsOrderSendResponse> getResponseClass() {
        return PddCloudWmsOrderSendResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "wms_order_send_request", wmsOrderSendRequest);
    }

    public void setWmsOrderSendRequest(WmsOrderSendRequest wmsOrderSendRequest) {
        this.wmsOrderSendRequest = wmsOrderSendRequest;
    }

    public static class WmsOrderSendRequest {

        /**
         * 货主编码
         */
        @JsonProperty("owner_code")
        private String ownerCode;

        /**
         * 货主名称
         */
        @JsonProperty("owner_name")
        private String ownerName;

        /**
         * 仓库编码
         */
        @JsonProperty("warehouse_code")
        private String warehouseCode;

        /**
         * 仓库类型
         */
        @JsonProperty("warehouse_type")
        private String warehouseType;

        /**
         * 单据类型
         */
        @JsonProperty("order_type")
        private String orderType;

        /**
         * 出库单号
         */
        @JsonProperty("delivery_order_code")
        private String deliveryOrderCode;

        /**
         * 原始平台单号
         */
        @JsonProperty("source_order_code")
        private String sourceOrderCode;

        /**
         * 订单来源平台编码
         */
        @JsonProperty("source_platform_code")
        private String sourcePlatformCode;

        /**
         * 卖家店铺名称
         */
        @JsonProperty("shop_nick")
        private String shopNick;

        /**
         * 卖家名称
         */
        @JsonProperty("seller_nick")
        private String sellerNick;

        /**
         * 买家名称
         */
        @JsonProperty("buyer_nick")
        private String buyerNick;

        /**
         * 创建时间
         */
        @JsonProperty("create_time")
        private String createTime;

        /**
         * 下单时间
         */
        @JsonProperty("order_time")
        private String orderTime;

        /**
         * 付款时间
         */
        @JsonProperty("pay_time")
        private String payTime;

        /**
         * 操作(审核)时间
         */
        @JsonProperty("operate_time")
        private String operateTime;

        /**
         * 订单标记(用字符串格式来表示订单标记列表
         */
        @JsonProperty("order_flag")
        private String orderFlag;

        /**
         * 订单总金额
         */
        @JsonProperty("total_amount")
        private Integer totalAmount;

        /**
         * 订单折扣金额
         */
        @JsonProperty("discount_amount")
        private Integer discountAmount;

        /**
         * 快递费
         */
        @JsonProperty("freight")
        private Integer freight;

        /**
         * 实收金额
         */
        @JsonProperty("actual_amount")
        private Integer actualAmount;

        /**
         * 快递公司编码
         */
        @JsonProperty("logistics_code")
        private String logisticsCode;

        /**
         * 快递单号
         */
        @JsonProperty("logistics_no")
        private String logisticsNo;

        /**
         * 卖家留言
         */
        @JsonProperty("seller_message")
        private String sellerMessage;

        /**
         * 买家留言
         */
        @JsonProperty("buyer_message")
        private String buyerMessage;

        /**
         * 是否需要发票
         */
        @JsonProperty("invoice_flag")
        private Boolean invoiceFlag;

        /**
         * 发票
         */
        @JsonProperty("invoice_info")
        private WmsOrderSendRequestInvoiceInfo invoiceInfo;

        /**
         * 备注信息
         */
        @JsonProperty("remark")
        private String remark;

        /**
         * 无库存标记 预售
         */
        @JsonProperty("no_stack_tag")
        private String noStackTag;

        /**
         * 发件人信息
         */
        @JsonProperty("senderInfo")
        private WmsOrderSendRequestSenderInfo senderInfo;

        /**
         * 收件人信息
         */
        @JsonProperty("receiverInfo")
        private WmsOrderSendRequestReceiverInfo receiverInfo;

        /**
         * 订单列表，商品明细
         */
        @JsonProperty("order_line_list")
        private List<WmsOrderSendRequestOrderLineListItem> orderLineList;

        /**
         * 自定义字段
         */
        @JsonProperty("extendProps")
        private String extendProps;

        /**
         * 第三方token
         */
        @JsonProperty("token")
        private String token;

        /**
         * 客户编码
         */
        @JsonProperty("customerId")
        private String customerId;

        public void setOwnerCode(String ownerCode) {
            this.ownerCode = ownerCode;
        }

        public void setOwnerName(String ownerName) {
            this.ownerName = ownerName;
        }

        public void setWarehouseCode(String warehouseCode) {
            this.warehouseCode = warehouseCode;
        }

        public void setWarehouseType(String warehouseType) {
            this.warehouseType = warehouseType;
        }

        public void setOrderType(String orderType) {
            this.orderType = orderType;
        }

        public void setDeliveryOrderCode(String deliveryOrderCode) {
            this.deliveryOrderCode = deliveryOrderCode;
        }

        public void setSourceOrderCode(String sourceOrderCode) {
            this.sourceOrderCode = sourceOrderCode;
        }

        public void setSourcePlatformCode(String sourcePlatformCode) {
            this.sourcePlatformCode = sourcePlatformCode;
        }

        public void setShopNick(String shopNick) {
            this.shopNick = shopNick;
        }

        public void setSellerNick(String sellerNick) {
            this.sellerNick = sellerNick;
        }

        public void setBuyerNick(String buyerNick) {
            this.buyerNick = buyerNick;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public void setOrderTime(String orderTime) {
            this.orderTime = orderTime;
        }

        public void setPayTime(String payTime) {
            this.payTime = payTime;
        }

        public void setOperateTime(String operateTime) {
            this.operateTime = operateTime;
        }

        public void setOrderFlag(String orderFlag) {
            this.orderFlag = orderFlag;
        }

        public void setTotalAmount(Integer totalAmount) {
            this.totalAmount = totalAmount;
        }

        public void setDiscountAmount(Integer discountAmount) {
            this.discountAmount = discountAmount;
        }

        public void setFreight(Integer freight) {
            this.freight = freight;
        }

        public void setActualAmount(Integer actualAmount) {
            this.actualAmount = actualAmount;
        }

        public void setLogisticsCode(String logisticsCode) {
            this.logisticsCode = logisticsCode;
        }

        public void setLogisticsNo(String logisticsNo) {
            this.logisticsNo = logisticsNo;
        }

        public void setSellerMessage(String sellerMessage) {
            this.sellerMessage = sellerMessage;
        }

        public void setBuyerMessage(String buyerMessage) {
            this.buyerMessage = buyerMessage;
        }

        public void setInvoiceFlag(Boolean invoiceFlag) {
            this.invoiceFlag = invoiceFlag;
        }

        public void setInvoiceInfo(WmsOrderSendRequestInvoiceInfo invoiceInfo) {
            this.invoiceInfo = invoiceInfo;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public void setNoStackTag(String noStackTag) {
            this.noStackTag = noStackTag;
        }

        public void setSenderInfo(WmsOrderSendRequestSenderInfo senderInfo) {
            this.senderInfo = senderInfo;
        }

        public void setReceiverInfo(WmsOrderSendRequestReceiverInfo receiverInfo) {
            this.receiverInfo = receiverInfo;
        }

        public void setOrderLineList(List<WmsOrderSendRequestOrderLineListItem> orderLineList) {
            this.orderLineList = orderLineList;
        }

        public void setExtendProps(String extendProps) {
            this.extendProps = extendProps;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public void setCustomerId(String customerId) {
            this.customerId = customerId;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class WmsOrderSendRequestInvoiceInfo {

        /**
         * 发票类型
         */
        @JsonProperty("invoice_type")
        private String invoiceType;

        /**
         * 发票抬头
         */
        @JsonProperty("invoice_head")
        private String invoiceHead;

        /**
         * 发票内容
         */
        @JsonProperty("invoice_content")
        private String invoiceContent;

        /**
         * 税号
         */
        @JsonProperty("invoice_tax_number")
        private String invoiceTaxNumber;

        /**
         * 扩展字段
         */
        @JsonProperty("invoice_ext_fields")
        private String invoiceExtFields;

        public void setInvoiceType(String invoiceType) {
            this.invoiceType = invoiceType;
        }

        public void setInvoiceHead(String invoiceHead) {
            this.invoiceHead = invoiceHead;
        }

        public void setInvoiceContent(String invoiceContent) {
            this.invoiceContent = invoiceContent;
        }

        public void setInvoiceTaxNumber(String invoiceTaxNumber) {
            this.invoiceTaxNumber = invoiceTaxNumber;
        }

        public void setInvoiceExtFields(String invoiceExtFields) {
            this.invoiceExtFields = invoiceExtFields;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class WmsOrderSendRequestSenderInfo {

        /**
         * 地址信息
         */
        @JsonProperty("address")
        private WmsOrderSendRequestSenderInfoAddress address;

        /**
         * 电话
         */
        @JsonProperty("mobile")
        private String mobile;

        /**
         * 姓名
         */
        @JsonProperty("name")
        private String name;

        /**
         * 手机
         */
        @JsonProperty("phone")
        private String phone;

        /**
         * 邮编
         */
        @JsonProperty("zipcode")
        private String zipcode;

        public void setAddress(WmsOrderSendRequestSenderInfoAddress address) {
            this.address = address;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public void setZipcode(String zipcode) {
            this.zipcode = zipcode;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class WmsOrderSendRequestSenderInfoAddress {

        /**
         * 城市
         */
        @JsonProperty("city")
        private String city;

        /**
         * 详细地址
         */
        @JsonProperty("detail")
        private String detail;

        /**
         * 街道
         */
        @JsonProperty("district")
        private String district;

        /**
         * 省
         */
        @JsonProperty("province")
        private String province;

        /**
         * 镇
         */
        @JsonProperty("town")
        private String town;

        /**
         * 地区/国家
         */
        @JsonProperty("country")
        private String country;

        public void setCity(String city) {
            this.city = city;
        }

        public void setDetail(String detail) {
            this.detail = detail;
        }

        public void setDistrict(String district) {
            this.district = district;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public void setTown(String town) {
            this.town = town;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class WmsOrderSendRequestReceiverInfo {

        /**
         * 地址信息
         */
        @JsonProperty("address")
        private WmsOrderSendRequestReceiverInfoAddress address;

        /**
         * 电话
         */
        @JsonProperty("mobile")
        private String mobile;

        /**
         * 姓名
         */
        @JsonProperty("name")
        private String name;

        /**
         * 手机
         */
        @JsonProperty("phone")
        private String phone;

        /**
         * 邮编
         */
        @JsonProperty("zipcode")
        private String zipcode;

        public void setAddress(WmsOrderSendRequestReceiverInfoAddress address) {
            this.address = address;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public void setZipcode(String zipcode) {
            this.zipcode = zipcode;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class WmsOrderSendRequestReceiverInfoAddress {

        /**
         * 城市
         */
        @JsonProperty("city")
        private String city;

        /**
         * 详细地址
         */
        @JsonProperty("detail")
        private String detail;

        /**
         * 街道
         */
        @JsonProperty("district")
        private String district;

        /**
         * 省
         */
        @JsonProperty("province")
        private String province;

        /**
         * 镇
         */
        @JsonProperty("town")
        private String town;

        /**
         * 地区/国家
         */
        @JsonProperty("country")
        private String country;

        public void setCity(String city) {
            this.city = city;
        }

        public void setDetail(String detail) {
            this.detail = detail;
        }

        public void setDistrict(String district) {
            this.district = district;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public void setTown(String town) {
            this.town = town;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class WmsOrderSendRequestOrderLineListItem {

        /**
         * 单据行号
         */
        @JsonProperty("order_line_no")
        private String orderLineNo;

        /**
         * 交易平台订单
         */
        @JsonProperty("source_order_code")
        private String sourceOrderCode;

        /**
         * 子交易单号
         */
        @JsonProperty("sub_source_order_code")
        private String subSourceOrderCode;

        /**
         * 货主编码
         */
        @JsonProperty("owner_code")
        private String ownerCode;

        /**
         * 仓储系统商品编码
         */
        @JsonProperty("item_id")
        private String itemId;

        /**
         * 商品编码
         */
        @JsonProperty("item_code")
        private String itemCode;

        /**
         * 商品名称
         */
        @JsonProperty("item_name")
        private String itemName;

        /**
         * 应发商品数量
         */
        @JsonProperty("item_quantity")
        private Integer itemQuantity;

        /**
         * 零售价
         */
        @JsonProperty("retail_price")
        private String retailPrice;

        /**
         * 实际成交价
         */
        @JsonProperty("actual_price")
        private String actualPrice;

        /**
         * 单件商品折扣金额
         */
        @JsonProperty("discount_amount")
        private String discountAmount;

        /**
         * 批次编码
         */
        @JsonProperty("batch_code")
        private String batchCode;

        /**
         * 备注
         */
        @JsonProperty("remark")
        private String remark;

        /**
         * 商品扩展字段
         */
        @JsonProperty("order_ext_fields")
        private String orderExtFields;

        public void setOrderLineNo(String orderLineNo) {
            this.orderLineNo = orderLineNo;
        }

        public void setSourceOrderCode(String sourceOrderCode) {
            this.sourceOrderCode = sourceOrderCode;
        }

        public void setSubSourceOrderCode(String subSourceOrderCode) {
            this.subSourceOrderCode = subSourceOrderCode;
        }

        public void setOwnerCode(String ownerCode) {
            this.ownerCode = ownerCode;
        }

        public void setItemId(String itemId) {
            this.itemId = itemId;
        }

        public void setItemCode(String itemCode) {
            this.itemCode = itemCode;
        }

        public void setItemName(String itemName) {
            this.itemName = itemName;
        }

        public void setItemQuantity(Integer itemQuantity) {
            this.itemQuantity = itemQuantity;
        }

        public void setRetailPrice(String retailPrice) {
            this.retailPrice = retailPrice;
        }

        public void setActualPrice(String actualPrice) {
            this.actualPrice = actualPrice;
        }

        public void setDiscountAmount(String discountAmount) {
            this.discountAmount = discountAmount;
        }

        public void setBatchCode(String batchCode) {
            this.batchCode = batchCode;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public void setOrderExtFields(String orderExtFields) {
            this.orderExtFields = orderExtFields;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}