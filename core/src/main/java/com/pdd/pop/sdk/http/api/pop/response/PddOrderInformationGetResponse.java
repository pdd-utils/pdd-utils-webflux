package com.pdd.pop.sdk.http.api.pop.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PddOrderInformationGetResponse extends PopBaseHttpResponse {
    @JsonProperty("order_info_get_response")
    private OrderInfoGetResponse orderInfoGetResponse;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OrderInfoGetResponseOrderInfoStoreInfo {
        @JsonProperty("store_id")
        private Long storeId;
        @JsonProperty("store_name")
        private String storeName;
        @JsonProperty("store_number")
        private String storeNumber;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OrderInfoGetResponseOrderInfoStepOrderInfo {
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
    public static class OrderInfoGetResponseOrderInfoServiceFeeDetailItem {
        @JsonProperty("service_fee")
        private Double serviceFee;
        @JsonProperty("service_name")
        private String serviceName;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OrderInfoGetResponseOrderInfoResendDeliveryListItem {
        @JsonProperty("logistics_id")
        private Integer logisticsId;
        @JsonProperty("tracking_number")
        private String trackingNumber;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OrderInfoGetResponseOrderInfoPromotionDetailListItem {
        @JsonProperty("discount_amount")
        private Double discountAmount;
        @JsonProperty("promotion_type")
        private Integer promotionType;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OrderInfoGetResponseOrderInfoOrderTagListItem {
        @JsonProperty("name")
        private String name;
        @JsonProperty("value")
        private Integer value;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OrderInfoGetResponseOrderInfoOrderDepotInfoWareSubInfoListItem {
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
    public static class OrderInfoGetResponseOrderInfoOrderDepotInfo {
        @JsonProperty("depot_code")
        private String depotCode;
        @JsonProperty("depot_id")
        private String depotId;
        @JsonProperty("depot_name")
        private String depotName;
        @JsonProperty("depot_type")
        private Integer depotType;
        @JsonProperty("ware_id")
        private String wareId;
        @JsonProperty("ware_name")
        private String wareName;
        @JsonProperty("ware_sn")
        private String wareSn;
        @JsonProperty("ware_sub_info_list")
        private List<OrderInfoGetResponseOrderInfoOrderDepotInfoWareSubInfoListItem> wareSubInfoList;
        @JsonProperty("ware_type")
        private Integer wareType;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OrderInfoGetResponseOrderInfoItemListItem {
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
    public static class OrderInfoGetResponseOrderInfoGiftListItem {
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
    public static class OrderInfoGetResponseOrderInfoGiftDeliveryListItem {
        @JsonProperty("logistics_id")
        private Integer logisticsId;
        @JsonProperty("tracking_number")
        private String trackingNumber;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OrderInfoGetResponseOrderInfoExtraDeliveryListItem {
        @JsonProperty("logistics_id")
        private Integer logisticsId;
        @JsonProperty("tracking_number")
        private String trackingNumber;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OrderInfoGetResponseOrderInfoConsolidateInfo {
        @JsonProperty("consolidate_type")
        private Integer consolidateType;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OrderInfoGetResponseOrderInfoCardInfoListItem {
        @JsonProperty("card_no")
        private String cardNo;
        @JsonProperty("mask_password")
        private String maskPassword;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OrderInfoGetResponseOrderInfo {
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
        private List<OrderInfoGetResponseOrderInfoCardInfoListItem> cardInfoList;
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
        private OrderInfoGetResponseOrderInfoConsolidateInfo consolidateInfo;
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
        private List<OrderInfoGetResponseOrderInfoExtraDeliveryListItem> extraDeliveryList;
        @JsonProperty("free_sf")
        private Integer freeSf;
        @JsonProperty("gift_delivery_list")
        private List<OrderInfoGetResponseOrderInfoGiftDeliveryListItem> giftDeliveryList;
        @JsonProperty("gift_list")
        private List<OrderInfoGetResponseOrderInfoGiftListItem> giftList;
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
        private List<OrderInfoGetResponseOrderInfoItemListItem> itemList;
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
        private OrderInfoGetResponseOrderInfoOrderDepotInfo orderDepotInfo;
        @JsonProperty("order_sn")
        private String orderSn;
        @JsonProperty("order_status")
        private Integer orderStatus;
        @JsonProperty("order_tag_list")
        private List<OrderInfoGetResponseOrderInfoOrderTagListItem> orderTagList;
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
        private List<OrderInfoGetResponseOrderInfoPromotionDetailListItem> promotionDetailList;
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
        private List<OrderInfoGetResponseOrderInfoResendDeliveryListItem> resendDeliveryList;
        @JsonProperty("return_freight_payer")
        private Integer returnFreightPayer;
        @JsonProperty("risk_control_status")
        private Integer riskControlStatus;
        @JsonProperty("self_contained")
        private Integer selfContained;
        @JsonProperty("seller_discount")
        private Double sellerDiscount;
        @JsonProperty("service_fee_detail")
        private List<OrderInfoGetResponseOrderInfoServiceFeeDetailItem> serviceFeeDetail;
        @JsonProperty("ship_additional_link_order")
        private String shipAdditionalLinkOrder;
        @JsonProperty("ship_additional_origin_order")
        private String shipAdditionalOriginOrder;
        @JsonProperty("shipping_time")
        private String shippingTime;
        @JsonProperty("shipping_type")
        private Integer shippingType;
        @JsonProperty("step_order_info")
        private OrderInfoGetResponseOrderInfoStepOrderInfo stepOrderInfo;
        @JsonProperty("stock_out_handle_status")
        private Integer stockOutHandleStatus;
        @JsonProperty("store_info")
        private OrderInfoGetResponseOrderInfoStoreInfo storeInfo;
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
    public static class OrderInfoGetResponse {
        @JsonProperty("order_info")
        private OrderInfoGetResponseOrderInfo orderInfo;
    }
}
