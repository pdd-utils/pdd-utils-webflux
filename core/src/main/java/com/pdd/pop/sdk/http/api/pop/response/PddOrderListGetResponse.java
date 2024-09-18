package com.pdd.pop.sdk.http.api.pop.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PddOrderListGetResponse extends PopBaseHttpResponse {
    @JsonProperty("order_list_get_response")
    private OrderListGetResponse orderListGetResponse;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OrderListGetResponseOrderListItemStepOrderInfo {
        @JsonProperty("advanced_paid_fee")
        private Double advancedPaidFee;
        @JsonProperty("step_discount_amount")
        private Double stepDiscountAmount;
        @JsonProperty("step_paid_fee")
        private Double stepPaidFee;
        @JsonProperty("step_trade_status")
        private Integer stepTradeStatus;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OrderListGetResponseOrderListItemServiceFeeDetailItem {
        @JsonProperty("service_fee")
        private Double serviceFee;
        @JsonProperty("service_name")
        private String serviceName;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OrderListGetResponseOrderListItemResendDeliveryListItem {
        @JsonProperty("logistics_id")
        private Integer logisticsId;
        @JsonProperty("tracking_number")
        private String trackingNumber;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OrderListGetResponseOrderListItemPromotionDetailListItem {
        @JsonProperty("discount_amount")
        private Double discountAmount;
        @JsonProperty("promotion_type")
        private Integer promotionType;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OrderListGetResponseOrderListItemOrderTagListItem {
        @JsonProperty("name")
        private String name;
        @JsonProperty("value")
        private Integer value;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OrderListGetResponseOrderListItemOrderDepotInfoWareSubInfoListItem {
        @JsonProperty("ware_id")
        private Long wareId;
        @JsonProperty("ware_name")
        private String wareName;
        @JsonProperty("ware_quantity")
        private Long wareQuantity;
        @JsonProperty("ware_sn")
        private String wareSn;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OrderListGetResponseOrderListItemOrderDepotInfo {
        @JsonProperty("depot_code")
        private String depotCode;
        @JsonProperty("depot_id")
        private Long depotId;
        @JsonProperty("depot_name")
        private String depotName;
        @JsonProperty("depot_type")
        private Integer depotType;
        @JsonProperty("ware_id")
        private Long wareId;
        @JsonProperty("ware_name")
        private String wareName;
        @JsonProperty("ware_sn")
        private String wareSn;
        @JsonProperty("ware_sub_info_list")
        private List<OrderListGetResponseOrderListItemOrderDepotInfoWareSubInfoListItem> wareSubInfoList;
        @JsonProperty("ware_type")
        private Integer wareType;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OrderListGetResponseOrderListItemItemListItem {
        @JsonProperty("goods_count")
        private Integer goodsCount;
        @JsonProperty("goods_id")
        private String goodsId;
        @JsonProperty("goods_img")
        private String goodsImg;
        @JsonProperty("goods_name")
        private String goodsName;
        @JsonProperty("goods_price")
        private Double goodsPrice;
        @JsonProperty("goods_spec")
        private String goodsSpec;
        @JsonProperty("outer_goods_id")
        private String outerGoodsId;
        @JsonProperty("outer_id")
        private String outerId;
        @JsonProperty("sku_id")
        private String skuId;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OrderListGetResponseOrderListItemGiftListItem {
        @JsonProperty("goods_count")
        private Integer goodsCount;
        @JsonProperty("goods_id")
        private Long goodsId;
        @JsonProperty("goods_img")
        private String goodsImg;
        @JsonProperty("goods_name")
        private String goodsName;
        @JsonProperty("goods_price")
        private Double goodsPrice;
        @JsonProperty("goods_spec")
        private String goodsSpec;
        @JsonProperty("outer_goods_id")
        private String outerGoodsId;
        @JsonProperty("outer_id")
        private String outerId;
        @JsonProperty("sku_id")
        private Long skuId;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OrderListGetResponseOrderListItemGiftDeliveryListItem {
        @JsonProperty("logistics_id")
        private Integer logisticsId;
        @JsonProperty("tracking_number")
        private String trackingNumber;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OrderListGetResponseOrderListItemExtraDeliveryListItem {
        @JsonProperty("logistics_id")
        private Integer logisticsId;
        @JsonProperty("tracking_number")
        private String trackingNumber;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OrderListGetResponseOrderListItemConsolidateInfo {
        @JsonProperty("consolidate_type")
        private Integer consolidateType;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OrderListGetResponseOrderListItemCardInfoListItem {
        @JsonProperty("card_no")
        private String cardNo;
        @JsonProperty("mask_password")
        private String maskPassword;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OrderListGetResponseOrderListItem {
        @JsonProperty("address")
        private String address;
        @JsonProperty("address_mask")
        private String addressMask;
        @JsonProperty("after_sales_status")
        private Integer afterSalesStatus;
        @JsonProperty("bonded_warehouse")
        private String bondedWarehouse;
        @JsonProperty("buyer_memo")
        private String buyerMemo;
        @JsonProperty("capital_free_discount")
        private Double capitalFreeDiscount;
        @JsonProperty("card_info_list")
        private List<OrderListGetResponseOrderListItemCardInfoListItem> cardInfoList;
        @JsonProperty("cat_id_1")
        private Long catId1;
        @JsonProperty("cat_id_2")
        private Long catId2;
        @JsonProperty("cat_id_3")
        private Long catId3;
        @JsonProperty("cat_id_4")
        private Long catId4;
        @JsonProperty("city")
        private String city;
        @JsonProperty("city_id")
        private Integer cityId;
        @JsonProperty("confirm_status")
        private Integer confirmStatus;
        @JsonProperty("confirm_time")
        private String confirmTime;
        @JsonProperty("consolidate_info")
        private OrderListGetResponseOrderListItemConsolidateInfo consolidateInfo;
        @JsonProperty("country")
        private String country;
        @JsonProperty("country_id")
        private Integer countryId;
        @JsonProperty("created_time")
        private String createdTime;
        @JsonProperty("delivery_home_value")
        private Double deliveryHomeValue;
        @JsonProperty("delivery_install_value")
        private Double deliveryInstallValue;
        @JsonProperty("delivery_one_day")
        private Integer deliveryOneDay;
        @JsonProperty("discount_amount")
        private Double discountAmount;
        @JsonProperty("duo_duo_pay_reduction")
        private Double duoDuoPayReduction;
        @JsonProperty("duoduo_wholesale")
        private Integer duoduoWholesale;
        @JsonProperty("extra_delivery_list")
        private List<OrderListGetResponseOrderListItemExtraDeliveryListItem> extraDeliveryList;
        @JsonProperty("free_sf")
        private Integer freeSf;
        @JsonProperty("gift_delivery_list")
        private List<OrderListGetResponseOrderListItemGiftDeliveryListItem> giftDeliveryList;
        @JsonProperty("gift_list")
        private List<OrderListGetResponseOrderListItemGiftListItem> giftList;
        @JsonProperty("goods_amount")
        private Double goodsAmount;
        @JsonProperty("group_order_id")
        private Long groupOrderId;
        @JsonProperty("group_role")
        private Integer groupRole;
        @JsonProperty("group_status")
        private Integer groupStatus;
        @JsonProperty("home_delivery_type")
        private Integer homeDeliveryType;
        @JsonProperty("home_install_value")
        private Double homeInstallValue;
        @JsonProperty("inner_transaction_id")
        private String innerTransactionId;
        @JsonProperty("invoice_status")
        private Integer invoiceStatus;
        @JsonProperty("is_lucky_flag")
        private Integer isLuckyFlag;
        @JsonProperty("is_pre_sale")
        private Integer isPreSale;
        @JsonProperty("is_stock_out")
        private Integer isStockOut;
        @JsonProperty("item_list")
        private List<OrderListGetResponseOrderListItemItemListItem> itemList;
        @JsonProperty("last_ship_time")
        private String lastShipTime;
        @JsonProperty("logistics_id")
        private Long logisticsId;
        @JsonProperty("mkt_biz_type")
        private Integer mktBizType;
        @JsonProperty("only_support_replace")
        private Integer onlySupportReplace;
        @JsonProperty("open_address_id")
        private String openAddressId;
        @JsonProperty("order_change_amount")
        private Double orderChangeAmount;
        @JsonProperty("order_depot_info")
        private OrderListGetResponseOrderListItemOrderDepotInfo orderDepotInfo;
        @JsonProperty("order_sn")
        private String orderSn;
        @JsonProperty("order_status")
        private Integer orderStatus;
        @JsonProperty("order_tag_list")
        private List<OrderListGetResponseOrderListItemOrderTagListItem> orderTagList;
        @JsonProperty("pay_amount")
        private Double payAmount;
        @JsonProperty("pay_no")
        private String payNo;
        @JsonProperty("pay_time")
        private String payTime;
        @JsonProperty("pay_type")
        private String payType;
        @JsonProperty("platform_discount")
        private Double platformDiscount;
        @JsonProperty("postage")
        private Double postage;
        @JsonProperty("pre_sale_time")
        private String preSaleTime;
        @JsonProperty("promise_delivery_time")
        private String promiseDeliveryTime;
        @JsonProperty("promotion_detail_list")
        private List<OrderListGetResponseOrderListItemPromotionDetailListItem> promotionDetailList;
        @JsonProperty("province")
        private String province;
        @JsonProperty("province_id")
        private Integer provinceId;
        @JsonProperty("receive_time")
        private String receiveTime;
        @JsonProperty("receiver_address")
        private String receiverAddress;
        @JsonProperty("receiver_address_mask")
        private String receiverAddressMask;
        @JsonProperty("receiver_name")
        private String receiverName;
        @JsonProperty("receiver_name_mask")
        private String receiverNameMask;
        @JsonProperty("receiver_phone")
        private String receiverPhone;
        @JsonProperty("receiver_phone_mask")
        private String receiverPhoneMask;
        @JsonProperty("refund_status")
        private Integer refundStatus;
        @JsonProperty("remark")
        private String remark;
        @JsonProperty("remark_tag")
        private Integer remarkTag;
        @JsonProperty("remark_tag_name")
        private String remarkTagName;
        @JsonProperty("resend_delivery_list")
        private List<OrderListGetResponseOrderListItemResendDeliveryListItem> resendDeliveryList;
        @JsonProperty("return_freight_payer")
        private Integer returnFreightPayer;
        @JsonProperty("risk_control_status")
        private Integer riskControlStatus;
        @JsonProperty("self_contained")
        private Integer selfContained;
        @JsonProperty("seller_discount")
        private Double sellerDiscount;
        @JsonProperty("service_fee_detail")
        private List<OrderListGetResponseOrderListItemServiceFeeDetailItem> serviceFeeDetail;
        @JsonProperty("ship_additional_link_order")
        private String shipAdditionalLinkOrder;
        @JsonProperty("ship_additional_origin_order")
        private String shipAdditionalOriginOrder;
        @JsonProperty("shipping_time")
        private String shippingTime;
        @JsonProperty("shipping_type")
        private Integer shippingType;
        @JsonProperty("step_order_info")
        private OrderListGetResponseOrderListItemStepOrderInfo stepOrderInfo;
        @JsonProperty("stock_out_handle_status")
        private Integer stockOutHandleStatus;
        @JsonProperty("support_nationwide_warranty")
        private Integer supportNationwideWarranty;
        @JsonProperty("town")
        private String town;
        @JsonProperty("town_id")
        private Integer townId;
        @JsonProperty("tracking_number")
        private String trackingNumber;
        @JsonProperty("trade_type")
        private Integer tradeType;
        @JsonProperty("updated_at")
        private String updatedAt;
        @JsonProperty("urge_shipping_time")
        private String urgeShippingTime;
        @JsonProperty("yyps_date")
        private String yypsDate;
        @JsonProperty("yyps_time")
        private String yypsTime;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OrderListGetResponse {
        @JsonProperty("has_next")
        private Boolean hasNext;
        @JsonProperty("order_list")
        private List<OrderListGetResponseOrderListItem> orderList;
        @JsonProperty("total_count")
        private Integer totalCount;
    }
}
