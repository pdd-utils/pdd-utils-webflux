package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddKttPurchaseOrderInfoResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("ktt_purchase_order_info_response")
    private KttPurchaseOrderInfoResponse kttPurchaseOrderInfoResponse;

    public KttPurchaseOrderInfoResponse getKttPurchaseOrderInfoResponse() {
        return kttPurchaseOrderInfoResponse;
    }

    public static class KttPurchaseOrderInfoResponse {

        /**
         * 
         */
        @JsonProperty("error_code")
        private Integer errorCode;

        /**
         * 
         */
        @JsonProperty("error_msg")
        private String errorMsg;

        /**
         * 
         */
        @JsonProperty("result")
        private KttPurchaseOrderInfoResponseResult result;

        /**
         * 
         */
        @JsonProperty("success")
        private Boolean success;

        public Integer getErrorCode() {
            return errorCode;
        }

        public String getErrorMsg() {
            return errorMsg;
        }

        public KttPurchaseOrderInfoResponseResult getResult() {
            return result;
        }

        public Boolean getSuccess() {
            return success;
        }
    }

    public static class KttPurchaseOrderInfoResponseResult {

        /**
         * 团号
         */
        @JsonProperty("activity_no")
        private String activityNo;

        /**
         * 团标题
         */
        @JsonProperty("activity_title")
        private String activityTitle;

        /**
         * 售后状态 0-未发起售后，1-待供货商处理，2-已退款，3-已同意退款，待入账，4-待团长处理，5-已同意退货，待团长退货，6-团长已退货，待供货商确认收货，7-已撤销，8-已驳回，9-退款失败
         */
        @JsonProperty("after_sales_status")
        private Integer afterSalesStatus;

        /**
         * 团长备注
         */
        @JsonProperty("business_note")
        private String businessNote;

        /**
         * 团员备注
         */
        @JsonProperty("buyer_memo")
        private String buyerMemo;

        /**
         * 取消状态：0-未取消 、1-已取消
         */
        @JsonProperty("cancel_status")
        private Integer cancelStatus;

        /**
         * 创单时间
         */
        @JsonProperty("create_time")
        private Long createTime;

        /**
         * 自定义项列表
         */
        @JsonProperty("custom_item_list")
        private List<KttPurchaseOrderInfoResponseResultCustomItemListItem> customItemList;

        /**
         * 赠品列表
         */
        @JsonProperty("gift_order_list")
        private List<KttPurchaseOrderInfoResponseResultGiftOrderListItem> giftOrderList;

        /**
         * 物流汇总信息
         */
        @JsonProperty("logistics_list")
        private List<KttPurchaseOrderInfoResponseResultLogisticsListItem> logisticsList;

        /**
         * 团员昵称
         */
        @JsonProperty("nick_name")
        private String nickName;

        /**
         * 订单实付金额（分）
         */
        @JsonProperty("order_amount")
        private Long orderAmount;

        /**
         * 订单号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * 接龙号
         */
        @JsonProperty("participate_no")
        private Integer participateNo;

        /**
         * 支付状态（0：未支付已确认，1：已支付，2：未支付待确认，3：待结算，4-已关闭）
         */
        @JsonProperty("pay_status")
        private Integer payStatus;

        /**
         * 支付时间
         */
        @JsonProperty("pay_time")
        private Long payTime;

        /**
         * 收货地址（市）
         */
        @JsonProperty("receiver_address_city")
        private String receiverAddressCity;

        /**
         * 收货地址（详细地址）
         */
        @JsonProperty("receiver_address_detail")
        private String receiverAddressDetail;

        /**
         * 收货地址（区）
         */
        @JsonProperty("receiver_address_district")
        private String receiverAddressDistrict;

        /**
         * 收货地址（省）
         */
        @JsonProperty("receiver_address_province")
        private String receiverAddressProvince;

        /**
         * 收货人手机号
         */
        @JsonProperty("receiver_mobile")
        private String receiverMobile;

        /**
         * 收货人姓名
         */
        @JsonProperty("receiver_name")
        private String receiverName;

        /**
         * 退款金额（分）
         */
        @JsonProperty("refund_amount")
        private Long refundAmount;

        /**
         * 运费（分）
         */
        @JsonProperty("shipping_amount")
        private Long shippingAmount;

        /**
         * 发货状态（0：未发货，1：已发货）
         */
        @JsonProperty("shipping_status")
        private Integer shippingStatus;

        /**
         * 
         */
        @JsonProperty("sub_order_list")
        private List<KttPurchaseOrderInfoResponseResultSubOrderListItem> subOrderList;

        /**
         * 供货商备注
         */
        @JsonProperty("supplier_remark")
        private String supplierRemark;

        /**
         * 团长昵称
         */
        @JsonProperty("supply_nick_name")
        private String supplyNickName;

        /**
         * 团长昵称备注
         */
        @JsonProperty("supply_nick_name_remark")
        private String supplyNickNameRemark;

        /**
         * 更新时间
         */
        @JsonProperty("updated_at")
        private Long updatedAt;

        public String getActivityNo() {
            return activityNo;
        }

        public String getActivityTitle() {
            return activityTitle;
        }

        public Integer getAfterSalesStatus() {
            return afterSalesStatus;
        }

        public String getBusinessNote() {
            return businessNote;
        }

        public String getBuyerMemo() {
            return buyerMemo;
        }

        public Integer getCancelStatus() {
            return cancelStatus;
        }

        public Long getCreateTime() {
            return createTime;
        }

        public List<KttPurchaseOrderInfoResponseResultCustomItemListItem> getCustomItemList() {
            return customItemList;
        }

        public List<KttPurchaseOrderInfoResponseResultGiftOrderListItem> getGiftOrderList() {
            return giftOrderList;
        }

        public List<KttPurchaseOrderInfoResponseResultLogisticsListItem> getLogisticsList() {
            return logisticsList;
        }

        public String getNickName() {
            return nickName;
        }

        public Long getOrderAmount() {
            return orderAmount;
        }

        public String getOrderSn() {
            return orderSn;
        }

        public Integer getParticipateNo() {
            return participateNo;
        }

        public Integer getPayStatus() {
            return payStatus;
        }

        public Long getPayTime() {
            return payTime;
        }

        public String getReceiverAddressCity() {
            return receiverAddressCity;
        }

        public String getReceiverAddressDetail() {
            return receiverAddressDetail;
        }

        public String getReceiverAddressDistrict() {
            return receiverAddressDistrict;
        }

        public String getReceiverAddressProvince() {
            return receiverAddressProvince;
        }

        public String getReceiverMobile() {
            return receiverMobile;
        }

        public String getReceiverName() {
            return receiverName;
        }

        public Long getRefundAmount() {
            return refundAmount;
        }

        public Long getShippingAmount() {
            return shippingAmount;
        }

        public Integer getShippingStatus() {
            return shippingStatus;
        }

        public List<KttPurchaseOrderInfoResponseResultSubOrderListItem> getSubOrderList() {
            return subOrderList;
        }

        public String getSupplierRemark() {
            return supplierRemark;
        }

        public String getSupplyNickName() {
            return supplyNickName;
        }

        public String getSupplyNickNameRemark() {
            return supplyNickNameRemark;
        }

        public Long getUpdatedAt() {
            return updatedAt;
        }
    }

    public static class KttPurchaseOrderInfoResponseResultCustomItemListItem {

        /**
         * 标题
         */
        @JsonProperty("name")
        private String name;

        /**
         * 值
         */
        @JsonProperty("value")
        private String value;

        public String getName() {
            return name;
        }

        public String getValue() {
            return value;
        }
    }

    public static class KttPurchaseOrderInfoResponseResultGiftOrderListItem {

        /**
         * 赠品外部编码
         */
        @JsonProperty("external_sku_id")
        private String externalSkuId;

        /**
         * 赠品名
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * 赠品数量
         */
        @JsonProperty("goods_number")
        private Integer goodsNumber;

        /**
         * 宿主子订单号
         */
        @JsonProperty("host_sub_order_sn")
        private String hostSubOrderSn;

        public String getExternalSkuId() {
            return externalSkuId;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public Integer getGoodsNumber() {
            return goodsNumber;
        }

        public String getHostSubOrderSn() {
            return hostSubOrderSn;
        }
    }

    public static class KttPurchaseOrderInfoResponseResultLogisticsListItem {

        /**
         * 物流公司名
         */
        @JsonProperty("shipping_company")
        private String shippingCompany;

        /**
         * 物流单号
         */
        @JsonProperty("shipping_no")
        private String shippingNo;

        /**
         * 若为子单发货，返回发货的子单列表
         */
        @JsonProperty("sub_order_sn_list")
        private List<String> subOrderSnList;

        public String getShippingCompany() {
            return shippingCompany;
        }

        public String getShippingNo() {
            return shippingNo;
        }

        public List<String> getSubOrderSnList() {
            return subOrderSnList;
        }
    }

    public static class KttPurchaseOrderInfoResponseResultSubOrderListItem {

        /**
         * 取消件数
         */
        @JsonProperty("already_cancel_number")
        private Integer alreadyCancelNumber;

        /**
         * 取消状态：0-未取消 、1-已取消
         */
        @JsonProperty("cancel_status")
        private Integer cancelStatus;

        /**
         * 商品编号
         */
        @JsonProperty("external_sku_id")
        private String externalSkuId;

        /**
         * 商品价格
         */
        @JsonProperty("goods_amount")
        private Long goodsAmount;

        /**
         * 商品供货价(分)
         */
        @JsonProperty("goods_cost_price")
        private Long goodsCostPrice;

        /**
         * 
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 商品名
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * 商品数量
         */
        @JsonProperty("goods_number")
        private Integer goodsNumber;

        /**
         * 商品下单价（分）
         */
        @JsonProperty("goods_price")
        private Long goodsPrice;

        /**
         * 商品规格描述
         */
        @JsonProperty("goods_specification")
        private String goodsSpecification;

        /**
         * 退款金额（分）
         */
        @JsonProperty("refund_amount")
        private Long refundAmount;

        /**
         * 
         */
        @JsonProperty("sku_id")
        private Long skuId;

        /**
         * 子单号
         */
        @JsonProperty("sub_order_sn")
        private String subOrderSn;

        public Integer getAlreadyCancelNumber() {
            return alreadyCancelNumber;
        }

        public Integer getCancelStatus() {
            return cancelStatus;
        }

        public String getExternalSkuId() {
            return externalSkuId;
        }

        public Long getGoodsAmount() {
            return goodsAmount;
        }

        public Long getGoodsCostPrice() {
            return goodsCostPrice;
        }

        public Long getGoodsId() {
            return goodsId;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public Integer getGoodsNumber() {
            return goodsNumber;
        }

        public Long getGoodsPrice() {
            return goodsPrice;
        }

        public String getGoodsSpecification() {
            return goodsSpecification;
        }

        public Long getRefundAmount() {
            return refundAmount;
        }

        public Long getSkuId() {
            return skuId;
        }

        public String getSubOrderSn() {
            return subOrderSn;
        }
    }
}