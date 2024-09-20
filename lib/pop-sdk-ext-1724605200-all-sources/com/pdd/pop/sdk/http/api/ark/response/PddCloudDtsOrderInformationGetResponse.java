package com.pdd.pop.sdk.http.api.ark.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddCloudDtsOrderInformationGetResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("order_info_get_response")
    private OrderInfoGetResponse orderInfoGetResponse;

    /**
     * 
     */
    @JsonProperty("service_fee_detail")
    private List<ServiceFeeDetailItem> serviceFeeDetail;

    public OrderInfoGetResponse getOrderInfoGetResponse() {
        return orderInfoGetResponse;
    }

    public List<ServiceFeeDetailItem> getServiceFeeDetail() {
        return serviceFeeDetail;
    }

    public static class OrderInfoGetResponse {

        /**
         * 订单详情对象
         */
        @JsonProperty("order_info")
        private OrderInfoGetResponseOrderInfo orderInfo;

        public OrderInfoGetResponseOrderInfo getOrderInfo() {
            return orderInfo;
        }
    }

    public static class OrderInfoGetResponseOrderInfo {

        /**
         * 收件详细地址
         */
        @JsonProperty("address")
        private String address;

        /**
         * 详细地址（打码)
         */
        @JsonProperty("address_mask")
        private String addressMask;

        /**
         * 售后状态  0：无售后 2：买家申请退款，待商家处理 3：退货退款，待商家处理 4：商家同意退款，退款中 5：平台同意退款，退款中 6：驳回退款， 待买家处理 7：已同意退货退款,待用户发货 8：平台处理中 9：平台拒 绝退款，退款关闭 10：退款成功 11：买家撤销 12：买家逾期未处 理，退款失败 13：买家逾期，超过有效期 14 : 换货补寄待商家处理 15:换货补寄待用户处理 16:换货补寄成功 17:换货补寄失败 18:换货补寄待用户确认完成
         */
        @JsonProperty("after_sales_status")
        private Integer afterSalesStatus;

        /**
         * 买家留言信息
         */
        @JsonProperty("buyer_memo")
        private String buyerMemo;

        /**
         * 团长免单优惠金额，只在团长免单活动中才会返回优惠金额
         */
        @JsonProperty("capital_free_discount")
        private Double capitalFreeDiscount;

        /**
         * 卡号信息列表
         */
        @JsonProperty("card_info_list")
        private List<OrderInfoGetResponseOrderInfoCardInfoListItem> cardInfoList;

        /**
         * 商品一级分类
         */
        @JsonProperty("cat_id_1")
        private Long catId1;

        /**
         * 商品二级分类
         */
        @JsonProperty("cat_id_2")
        private Long catId2;

        /**
         * 商品三级分类
         */
        @JsonProperty("cat_id_3")
        private Long catId3;

        /**
         * 商品四级分类
         */
        @JsonProperty("cat_id_4")
        private Long catId4;

        /**
         * 收件地城市
         */
        @JsonProperty("city")
        private String city;

        /**
         * 城市编码
         */
        @JsonProperty("city_id")
        private Integer cityId;

        /**
         * 成交状态：0：未成交、1：已成交、2：已取消
         */
        @JsonProperty("confirm_status")
        private Integer confirmStatus;

        /**
         * 成交时间
         */
        @JsonProperty("confirm_time")
        private String confirmTime;

        /**
         * 集运信息
         */
        @JsonProperty("consolidate_info")
        private OrderInfoGetResponseOrderInfoConsolidateInfo consolidateInfo;

        /**
         * 联系人手机号
         */
        @JsonProperty("contact_mobile")
        private String contactMobile;

        /**
         * 收件地国家
         */
        @JsonProperty("country")
        private String country;

        /**
         * 国家编码
         */
        @JsonProperty("country_id")
        private Integer countryId;

        /**
         * 创建时间
         */
        @JsonProperty("created_time")
        private String createdTime;

        /**
         * 送货入户费用 单位：元
         */
        @JsonProperty("delivery_home_value")
        private Double deliveryHomeValue;

        /**
         * 送货入户并安装 单位：元
         */
        @JsonProperty("delivery_install_value")
        private Double deliveryInstallValue;

        /**
         * 折扣金额（元）折扣金额=平台优惠+商家优惠+团长免单优惠金额
         */
        @JsonProperty("discount_amount")
        private Double discountAmount;

        /**
         * 多多支付立减金额，单位：元
         */
        @JsonProperty("duo_duo_pay_reduction")
        private Double duoDuoPayReduction;

        /**
         * 分包发货额外运单列表
         */
        @JsonProperty("extra_delivery_list")
        private List<OrderInfoGetResponseOrderInfoExtraDeliveryListItem> extraDeliveryList;

        /**
         * 是否顺丰包邮 1表示是 0表示否
         */
        @JsonProperty("free_sf")
        private Integer freeSf;

        /**
         * 赠品额外运单列表
         */
        @JsonProperty("gift_delivery_list")
        private List<OrderInfoGetResponseOrderInfoGiftDeliveryListItem> giftDeliveryList;

        /**
         * 赠品列表
         */
        @JsonProperty("gift_list")
        private List<OrderInfoGetResponseOrderInfoGiftListItem> giftList;

        /**
         * 商品金额（元）商品金额=商品销售价格商品数量-改价金额（接口暂无该字段）
         */
        @JsonProperty("goods_amount")
        private Double goodsAmount;

        /**
         * 团id
         */
        @JsonProperty("group_order_id")
        private Long groupOrderId;

        /**
         * 团身份。0-团员，1-团长
         */
        @JsonProperty("group_role")
        private Integer groupRole;

        /**
         * 成团状态：0：拼团中、1：已成团、2：团失败
         */
        @JsonProperty("group_status")
        private Integer groupStatus;

        /**
         * 送货入户并安装服务 0-不支持送货，1-送货入户不安装，2-送货入户并安装
         */
        @JsonProperty("home_delivery_type")
        private Integer homeDeliveryType;

        /**
         * 上门安装费用 单位：元
         */
        @JsonProperty("home_install_value")
        private Double homeInstallValue;

        /**
         * 身份证姓名
         */
        @JsonProperty("id_card_name")
        private String idCardName;

        /**
         * 身份证号码
         */
        @JsonProperty("id_card_num")
        private String idCardNum;

        /**
         * 支付申报订单号
         */
        @JsonProperty("inner_transaction_id")
        private String innerTransactionId;

        /**
         * 发票申请,1代表有 0代表无
         */
        @JsonProperty("invoice_status")
        private Integer invoiceStatus;

        /**
         * 是否抽奖订单，1-非抽奖订单，2-抽奖订单
         */
        @JsonProperty("is_lucky_flag")
        private Integer isLuckyFlag;

        /**
         * 是否为预售商品 1表示是 0表示否
         */
        @JsonProperty("is_pre_sale")
        private Integer isPreSale;

        /**
         * 是否缺货 0-无缺货处理 1： 有缺货处理
         */
        @JsonProperty("is_stock_out")
        private Integer isStockOut;

        /**
         * 订单中商品sku列表
         */
        @JsonProperty("item_list")
        private List<OrderInfoGetResponseOrderInfoItemListItem> itemList;

        /**
         * 订单承诺发货时间
         */
        @JsonProperty("last_ship_time")
        private String lastShipTime;

        /**
         * 快递公司编号
         */
        @JsonProperty("logistics_id")
        private Long logisticsId;

        /**
         * 只换不修，1:是，0:否
         */
        @JsonProperty("only_support_replace")
        private Integer onlySupportReplace;

        /**
         * 订单改价折扣金额，单位元
         */
        @JsonProperty("order_change_amount")
        private Double orderChangeAmount;

        /**
         * 仓库信息
         */
        @JsonProperty("order_depot_info")
        private OrderInfoGetResponseOrderInfoOrderDepotInfo orderDepotInfo;

        /**
         * 订单编号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * 发货状态，枚举值：1：待发货，2：已发货待签收，3：已签收
         */
        @JsonProperty("order_status")
        private Integer orderStatus;

        /**
         * 支付金额（元）支付金额=商品金额-折扣金额+邮费
         */
        @JsonProperty("pay_amount")
        private Double payAmount;

        /**
         * 支付单号
         */
        @JsonProperty("pay_no")
        private String payNo;

        /**
         * 支付时间
         */
        @JsonProperty("pay_time")
        private String payTime;

        /**
         * 支付方式，枚举值：QQ,WEIXIN,ALIPAY,LIANLIANPAY
         */
        @JsonProperty("pay_type")
        private String payType;

        /**
         * 用户购买手机号
         */
        @JsonProperty("phone_number_chosen_by_user")
        private String phoneNumberChosenByUser;

        /**
         * 平台优惠金额
         */
        @JsonProperty("platform_discount")
        private Double platformDiscount;

        /**
         * 邮费
         */
        @JsonProperty("postage")
        private Double postage;

        /**
         * 预售时间
         */
        @JsonProperty("pre_sale_time")
        private String preSaleTime;

        /**
         * 
         */
        @JsonProperty("promise_delivery_time")
        private String promiseDeliveryTime;

        /**
         * 收件地省份
         */
        @JsonProperty("province")
        private String province;

        /**
         * 省份编码
         */
        @JsonProperty("province_id")
        private Integer provinceId;

        /**
         * 确认收货时间
         */
        @JsonProperty("receive_time")
        private String receiveTime;

        /**
         * 收件人地址
         */
        @JsonProperty("receiver_address")
        private String receiverAddress;

        /**
         * 收件人地址（打码）
         */
        @JsonProperty("receiver_address_mask")
        private String receiverAddressMask;

        /**
         * 收件人姓名
         */
        @JsonProperty("receiver_name")
        private String receiverName;

        /**
         * 收件人姓名（打码）
         */
        @JsonProperty("receiver_name_mask")
        private String receiverNameMask;

        /**
         * 收件人电话，仅订单状态为待发货状态下返回明文，其他状态下返回脱敏手机号，例如“1387677”
         */
        @JsonProperty("receiver_phone")
        private String receiverPhone;

        /**
         * 收件人手机号（打码）
         */
        @JsonProperty("receiver_phone_mask")
        private String receiverPhoneMask;

        /**
         * 退款状态，枚举值：1：无售后或售后关闭，2：售后处理中，3：退款中，4： 退款成功
         */
        @JsonProperty("refund_status")
        private Integer refundStatus;

        /**
         * 商家订单备注
         */
        @JsonProperty("remark")
        private String remark;

        /**
         * 补寄额外运单列表
         */
        @JsonProperty("resend_delivery_list")
        private List<OrderInfoGetResponseOrderInfoResendDeliveryListItem> resendDeliveryList;

        /**
         * 退货包运费，1:是，0:否
         */
        @JsonProperty("return_freight_payer")
        private Integer returnFreightPayer;

        /**
         * 风控订单状态(0-正常订单， 1-风控中订单)
         */
        @JsonProperty("risk_control_status")
        private Integer riskControlStatus;

        /**
         * 是否门店自提，1-是，0-否
         */
        @JsonProperty("self_contained")
        private Integer selfContained;

        /**
         * 店铺优惠金额
         */
        @JsonProperty("seller_discount")
        private Double sellerDiscount;

        /**
         * 发货时间
         */
        @JsonProperty("shipping_time")
        private String shippingTime;

        /**
         * 定金订单信息 ，非定金订单该字段为null
         */
        @JsonProperty("step_order_info")
        private OrderInfoGetResponseOrderInfoStepOrderInfo stepOrderInfo;

        /**
         * 缺货处理状态 -1:无缺货处理 0: 缺货待处理 1缺货已处理
         */
        @JsonProperty("stock_out_handle_status")
        private Integer stockOutHandleStatus;

        /**
         * 门店信息
         */
        @JsonProperty("store_info")
        private OrderInfoGetResponseOrderInfoStoreInfo storeInfo;

        /**
         * 全国联保，1:是，0:否
         */
        @JsonProperty("support_nationwide_warranty")
        private Integer supportNationwideWarranty;

        /**
         * 收件地区县
         */
        @JsonProperty("town")
        private String town;

        /**
         * 区县编码
         */
        @JsonProperty("town_id")
        private Integer townId;

        /**
         * 快递运单号
         */
        @JsonProperty("tracking_number")
        private String trackingNumber;

        /**
         * 订单类型 0-普通订单、1-定金订单
         */
        @JsonProperty("trade_type")
        private Integer tradeType;

        /**
         * 订单最近一次更新时间
         */
        @JsonProperty("updated_at")
        private String updatedAt;

        /**
         * 合单ID
         */
        @JsonProperty("open_address_id")
        private String openAddressId;

        public String getAddress() {
            return address;
        }

        public String getAddressMask() {
            return addressMask;
        }

        public Integer getAfterSalesStatus() {
            return afterSalesStatus;
        }

        public String getBuyerMemo() {
            return buyerMemo;
        }

        public Double getCapitalFreeDiscount() {
            return capitalFreeDiscount;
        }

        public List<OrderInfoGetResponseOrderInfoCardInfoListItem> getCardInfoList() {
            return cardInfoList;
        }

        public Long getCatId1() {
            return catId1;
        }

        public Long getCatId2() {
            return catId2;
        }

        public Long getCatId3() {
            return catId3;
        }

        public Long getCatId4() {
            return catId4;
        }

        public String getCity() {
            return city;
        }

        public Integer getCityId() {
            return cityId;
        }

        public Integer getConfirmStatus() {
            return confirmStatus;
        }

        public String getConfirmTime() {
            return confirmTime;
        }

        public OrderInfoGetResponseOrderInfoConsolidateInfo getConsolidateInfo() {
            return consolidateInfo;
        }

        public String getContactMobile() {
            return contactMobile;
        }

        public String getCountry() {
            return country;
        }

        public Integer getCountryId() {
            return countryId;
        }

        public String getCreatedTime() {
            return createdTime;
        }

        public Double getDeliveryHomeValue() {
            return deliveryHomeValue;
        }

        public Double getDeliveryInstallValue() {
            return deliveryInstallValue;
        }

        public Double getDiscountAmount() {
            return discountAmount;
        }

        public Double getDuoDuoPayReduction() {
            return duoDuoPayReduction;
        }

        public List<OrderInfoGetResponseOrderInfoExtraDeliveryListItem> getExtraDeliveryList() {
            return extraDeliveryList;
        }

        public Integer getFreeSf() {
            return freeSf;
        }

        public List<OrderInfoGetResponseOrderInfoGiftDeliveryListItem> getGiftDeliveryList() {
            return giftDeliveryList;
        }

        public List<OrderInfoGetResponseOrderInfoGiftListItem> getGiftList() {
            return giftList;
        }

        public Double getGoodsAmount() {
            return goodsAmount;
        }

        public Long getGroupOrderId() {
            return groupOrderId;
        }

        public Integer getGroupRole() {
            return groupRole;
        }

        public Integer getGroupStatus() {
            return groupStatus;
        }

        public Integer getHomeDeliveryType() {
            return homeDeliveryType;
        }

        public Double getHomeInstallValue() {
            return homeInstallValue;
        }

        public String getIdCardName() {
            return idCardName;
        }

        public String getIdCardNum() {
            return idCardNum;
        }

        public String getInnerTransactionId() {
            return innerTransactionId;
        }

        public Integer getInvoiceStatus() {
            return invoiceStatus;
        }

        public Integer getIsLuckyFlag() {
            return isLuckyFlag;
        }

        public Integer getIsPreSale() {
            return isPreSale;
        }

        public Integer getIsStockOut() {
            return isStockOut;
        }

        public List<OrderInfoGetResponseOrderInfoItemListItem> getItemList() {
            return itemList;
        }

        public String getLastShipTime() {
            return lastShipTime;
        }

        public Long getLogisticsId() {
            return logisticsId;
        }

        public Integer getOnlySupportReplace() {
            return onlySupportReplace;
        }

        public Double getOrderChangeAmount() {
            return orderChangeAmount;
        }

        public OrderInfoGetResponseOrderInfoOrderDepotInfo getOrderDepotInfo() {
            return orderDepotInfo;
        }

        public String getOrderSn() {
            return orderSn;
        }

        public Integer getOrderStatus() {
            return orderStatus;
        }

        public Double getPayAmount() {
            return payAmount;
        }

        public String getPayNo() {
            return payNo;
        }

        public String getPayTime() {
            return payTime;
        }

        public String getPayType() {
            return payType;
        }

        public String getPhoneNumberChosenByUser() {
            return phoneNumberChosenByUser;
        }

        public Double getPlatformDiscount() {
            return platformDiscount;
        }

        public Double getPostage() {
            return postage;
        }

        public String getPreSaleTime() {
            return preSaleTime;
        }

        public String getPromiseDeliveryTime() {
            return promiseDeliveryTime;
        }

        public String getProvince() {
            return province;
        }

        public Integer getProvinceId() {
            return provinceId;
        }

        public String getReceiveTime() {
            return receiveTime;
        }

        public String getReceiverAddress() {
            return receiverAddress;
        }

        public String getReceiverAddressMask() {
            return receiverAddressMask;
        }

        public String getReceiverName() {
            return receiverName;
        }

        public String getReceiverNameMask() {
            return receiverNameMask;
        }

        public String getReceiverPhone() {
            return receiverPhone;
        }

        public String getReceiverPhoneMask() {
            return receiverPhoneMask;
        }

        public Integer getRefundStatus() {
            return refundStatus;
        }

        public String getRemark() {
            return remark;
        }

        public List<OrderInfoGetResponseOrderInfoResendDeliveryListItem> getResendDeliveryList() {
            return resendDeliveryList;
        }

        public Integer getReturnFreightPayer() {
            return returnFreightPayer;
        }

        public Integer getRiskControlStatus() {
            return riskControlStatus;
        }

        public Integer getSelfContained() {
            return selfContained;
        }

        public Double getSellerDiscount() {
            return sellerDiscount;
        }

        public String getShippingTime() {
            return shippingTime;
        }

        public OrderInfoGetResponseOrderInfoStepOrderInfo getStepOrderInfo() {
            return stepOrderInfo;
        }

        public Integer getStockOutHandleStatus() {
            return stockOutHandleStatus;
        }

        public OrderInfoGetResponseOrderInfoStoreInfo getStoreInfo() {
            return storeInfo;
        }

        public Integer getSupportNationwideWarranty() {
            return supportNationwideWarranty;
        }

        public String getTown() {
            return town;
        }

        public Integer getTownId() {
            return townId;
        }

        public String getTrackingNumber() {
            return trackingNumber;
        }

        public Integer getTradeType() {
            return tradeType;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public String getOpenAddressId() {
            return openAddressId;
        }
    }

    public static class OrderInfoGetResponseOrderInfoCardInfoListItem {

        /**
         * 卡号
         */
        @JsonProperty("card_no")
        private String cardNo;

        /**
         * 卡密
         */
        @JsonProperty("mask_password")
        private String maskPassword;

        public String getCardNo() {
            return cardNo;
        }

        public String getMaskPassword() {
            return maskPassword;
        }
    }

    public static class OrderInfoGetResponseOrderInfoConsolidateInfo {

        /**
         * 集运类型 0 - 港澳台集运 、1- 新疆集运
         */
        @JsonProperty("consolidate_type")
        private Integer consolidateType;

        public Integer getConsolidateType() {
            return consolidateType;
        }
    }

    public static class OrderInfoGetResponseOrderInfoExtraDeliveryListItem {

        /**
         * 快递ID
         */
        @JsonProperty("logistics_id")
        private Long logisticsId;

        /**
         * 运单号
         */
        @JsonProperty("tracking_number")
        private String trackingNumber;

        public Long getLogisticsId() {
            return logisticsId;
        }

        public String getTrackingNumber() {
            return trackingNumber;
        }
    }

    public static class OrderInfoGetResponseOrderInfoGiftDeliveryListItem {

        /**
         * 快递ID
         */
        @JsonProperty("logistics_id")
        private Long logisticsId;

        /**
         * 运单号
         */
        @JsonProperty("tracking_number")
        private String trackingNumber;

        public Long getLogisticsId() {
            return logisticsId;
        }

        public String getTrackingNumber() {
            return trackingNumber;
        }
    }

    public static class OrderInfoGetResponseOrderInfoGiftListItem {

        /**
         * 赠品数量
         */
        @JsonProperty("goods_count")
        private Integer goodsCount;

        /**
         * 赠品id
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 赠品图片
         */
        @JsonProperty("goods_img")
        private String goodsImg;

        /**
         * 赠品名称
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * 赠品销售价格
         */
        @JsonProperty("goods_price")
        private Double goodsPrice;

        /**
         * 赠品规格
         */
        @JsonProperty("goods_spec")
        private String goodsSpec;

        /**
         * 商家外部商品编码
         */
        @JsonProperty("outer_goods_id")
        private String outerGoodsId;

        /**
         * 商家外部sku编码
         */
        @JsonProperty("outer_id")
        private String outerId;

        /**
         * 赠品规格编码
         */
        @JsonProperty("sku_id")
        private Long skuId;

        public Integer getGoodsCount() {
            return goodsCount;
        }

        public Long getGoodsId() {
            return goodsId;
        }

        public String getGoodsImg() {
            return goodsImg;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public Double getGoodsPrice() {
            return goodsPrice;
        }

        public String getGoodsSpec() {
            return goodsSpec;
        }

        public String getOuterGoodsId() {
            return outerGoodsId;
        }

        public String getOuterId() {
            return outerId;
        }

        public Long getSkuId() {
            return skuId;
        }
    }

    public static class OrderInfoGetResponseOrderInfoItemListItem {

        /**
         * 商品数量
         */
        @JsonProperty("goods_count")
        private Integer goodsCount;

        /**
         * 商品编号
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 商品图片
         */
        @JsonProperty("goods_img")
        private String goodsImg;

        /**
         * 商品名称
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * 商品销售价格
         */
        @JsonProperty("goods_price")
        private Double goodsPrice;

        /**
         * 商品规格，使用（规格值1,规格值2）组合作为sku的表示，中间以英文逗号隔开
         */
        @JsonProperty("goods_spec")
        private String goodsSpec;

        /**
         * 商家外部编码（商品），注意：编辑商品后必须等待商品审核通过后方可生效，订单中商品信息为交易快照的商品信息。
         */
        @JsonProperty("outer_goods_id")
        private String outerGoodsId;

        /**
         * 商家外部编码（sku），注意：编辑商品后必须等待商品审核通过后方可生效，订单中商品信息为交易快照的商品信息。
         */
        @JsonProperty("outer_id")
        private String outerId;

        /**
         * 商品规格编码
         */
        @JsonProperty("sku_id")
        private Long skuId;

        public Integer getGoodsCount() {
            return goodsCount;
        }

        public Long getGoodsId() {
            return goodsId;
        }

        public String getGoodsImg() {
            return goodsImg;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public Double getGoodsPrice() {
            return goodsPrice;
        }

        public String getGoodsSpec() {
            return goodsSpec;
        }

        public String getOuterGoodsId() {
            return outerGoodsId;
        }

        public String getOuterId() {
            return outerId;
        }

        public Long getSkuId() {
            return skuId;
        }
    }

    public static class OrderInfoGetResponseOrderInfoOrderDepotInfo {

        /**
         * 仓库编码
         */
        @JsonProperty("depot_code")
        private String depotCode;

        /**
         * 仓库id
         */
        @JsonProperty("depot_id")
        private String depotId;

        /**
         * 仓库名称
         */
        @JsonProperty("depot_name")
        private String depotName;

        /**
         * 货品id
         */
        @JsonProperty("ware_id")
        private String wareId;

        /**
         * 货品名称
         */
        @JsonProperty("ware_name")
        private String wareName;

        /**
         * 货品编码
         */
        @JsonProperty("ware_sn")
        private String wareSn;

        /**
         * 子货品列表（组合货品才会有子货品信息）
         */
        @JsonProperty("ware_sub_info_list")
        private List<OrderInfoGetResponseOrderInfoOrderDepotInfoWareSubInfoListItem> wareSubInfoList;

        /**
         * 货品类型（0：普通货品，1：组合货品）
         */
        @JsonProperty("ware_type")
        private Integer wareType;

        public String getDepotCode() {
            return depotCode;
        }

        public String getDepotId() {
            return depotId;
        }

        public String getDepotName() {
            return depotName;
        }

        public String getWareId() {
            return wareId;
        }

        public String getWareName() {
            return wareName;
        }

        public String getWareSn() {
            return wareSn;
        }

        public List<OrderInfoGetResponseOrderInfoOrderDepotInfoWareSubInfoListItem> getWareSubInfoList() {
            return wareSubInfoList;
        }

        public Integer getWareType() {
            return wareType;
        }
    }

    public static class OrderInfoGetResponseOrderInfoOrderDepotInfoWareSubInfoListItem {

        /**
         * 子货品id
         */
        @JsonProperty("ware_id")
        private Long wareId;

        /**
         * 子货品1编码
         */
        @JsonProperty("ware_name")
        private String wareName;

        /**
         * 子货品数量
         */
        @JsonProperty("ware_quantity")
        private Long wareQuantity;

        /**
         * 子货品编码
         */
        @JsonProperty("ware_sn")
        private String wareSn;

        public Long getWareId() {
            return wareId;
        }

        public String getWareName() {
            return wareName;
        }

        public Long getWareQuantity() {
            return wareQuantity;
        }

        public String getWareSn() {
            return wareSn;
        }
    }

    public static class OrderInfoGetResponseOrderInfoResendDeliveryListItem {

        /**
         * 快递ID
         */
        @JsonProperty("logistics_id")
        private Long logisticsId;

        /**
         * 运单号
         */
        @JsonProperty("tracking_number")
        private String trackingNumber;

        public Long getLogisticsId() {
            return logisticsId;
        }

        public String getTrackingNumber() {
            return trackingNumber;
        }
    }

    public static class OrderInfoGetResponseOrderInfoStepOrderInfo {

        /**
         * 已付定金 单位：元
         */
        @JsonProperty("advanced_paid_fee")
        private Double advancedPaidFee;

        /**
         * 膨胀金额 （包含券减） 单位：元
         */
        @JsonProperty("step_discount_amount")
        private Double stepDiscountAmount;

        /**
         * 分阶段已付金额（定金+尾款） 单位：元
         */
        @JsonProperty("step_paid_fee")
        private Double stepPaidFee;

        /**
         * 定金订单状态：step_trade_status 枚举：0-定金未付尾款未付、1-定金已付尾款未付、2-定金已付尾款已付
         */
        @JsonProperty("step_trade_status")
        private Integer stepTradeStatus;

        public Double getAdvancedPaidFee() {
            return advancedPaidFee;
        }

        public Double getStepDiscountAmount() {
            return stepDiscountAmount;
        }

        public Double getStepPaidFee() {
            return stepPaidFee;
        }

        public Integer getStepTradeStatus() {
            return stepTradeStatus;
        }
    }

    public static class OrderInfoGetResponseOrderInfoStoreInfo {

        /**
         * 门店id
         */
        @JsonProperty("store_id")
        private Long storeId;

        /**
         * 门店名称
         */
        @JsonProperty("store_name")
        private String storeName;

        /**
         * 门店自定义编码
         */
        @JsonProperty("store_number")
        private String storeNumber;

        public Long getStoreId() {
            return storeId;
        }

        public String getStoreName() {
            return storeName;
        }

        public String getStoreNumber() {
            return storeNumber;
        }
    }

    public static class ServiceFeeDetailItem {

        /**
         * 
         */
        @JsonProperty("service_fee")
        private Double serviceFee;

        /**
         * 
         */
        @JsonProperty("service_name")
        private String serviceName;

        public Double getServiceFee() {
            return serviceFee;
        }

        public String getServiceName() {
            return serviceName;
        }
    }
}