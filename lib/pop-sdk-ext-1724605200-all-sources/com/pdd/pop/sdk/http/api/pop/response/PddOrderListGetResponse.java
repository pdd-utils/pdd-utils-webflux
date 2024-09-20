package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddOrderListGetResponse extends PopBaseHttpResponse {

    /**
     * 请求response
     */
    @JsonProperty("order_list_get_response")
    private OrderListGetResponse orderListGetResponse;

    public OrderListGetResponse getOrderListGetResponse() {
        return orderListGetResponse;
    }

    public static class OrderListGetResponse {

        /**
         * 是否存在下一页
         */
        @JsonProperty("has_next")
        private Boolean hasNext;

        /**
         * 订单信息列表
         */
        @JsonProperty("order_list")
        private List<OrderListGetResponseOrderListItem> orderList;

        /**
         * 订单总数
         */
        @JsonProperty("total_count")
        private Integer totalCount;

        public Boolean getHasNext() {
            return hasNext;
        }

        public List<OrderListGetResponseOrderListItem> getOrderList() {
            return orderList;
        }

        public Integer getTotalCount() {
            return totalCount;
        }
    }

    public static class OrderListGetResponseOrderListItem {

        /**
         * 详细地址
         */
        @JsonProperty("address")
        private String address;

        /**
         * 详细地址（打码）
         */
        @JsonProperty("address_mask")
        private String addressMask;

        /**
         * 售后状态 0：无售后 2：买家申请退款，待商家处理 3：退货退款，待商家处理 4：商家同意退款，退款中 5：平台同意退款，退款中 6：驳回退款，待买家处理 7：已同意退货退款,待用户发货 8：平台处理中 9：平台拒绝退款，退款关闭 10：退款成功 11：买家撤销 12：买家逾期未处理，退款失败 13：买家逾期，超过有效期 14：换货补寄待商家处理 15：换货补寄待用户处理 16：换货补寄成功 17：换货补寄失败 18：换货补寄待用户确认完成 21：待商家同意维修 22：待用户确认发货 24：维修关闭 25：维修成功 27：待用户确认收货 31：已同意拒收退款，待用户拒收 32：补寄待商家发货 33：同意召回后退款，待商家召回
         */
        @JsonProperty("after_sales_status")
        private Integer afterSalesStatus;

        /**
         * 保税仓名称
         */
        @JsonProperty("bonded_warehouse")
        private String bondedWarehouse;

        /**
         * 买家留言信息
         */
        @JsonProperty("buyer_memo")
        private String buyerMemo;

        /**
         * 团长免单金额，单位：元
         */
        @JsonProperty("capital_free_discount")
        private Double capitalFreeDiscount;

        /**
         * 卡号信息列表
         */
        @JsonProperty("card_info_list")
        private List<OrderListGetResponseOrderListItemCardInfoListItem> cardInfoList;

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
         * 城市
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
        private OrderListGetResponseOrderListItemConsolidateInfo consolidateInfo;

        /**
         * 国家或地区
         */
        @JsonProperty("country")
        private String country;

        /**
         * 国家或地区编码
         */
        @JsonProperty("country_id")
        private Integer countryId;

        /**
         * 订单创建时间
         */
        @JsonProperty("created_time")
        private String createdTime;

        /**
         * 送货入户费用 单位：元
         */
        @JsonProperty("delivery_home_value")
        private Double deliveryHomeValue;

        /**
         * 送货入户并安装费用 单位：元
         */
        @JsonProperty("delivery_install_value")
        private Double deliveryInstallValue;

        /**
         * 是否当日发货，1-是，0-否
         */
        @JsonProperty("delivery_one_day")
        private Integer deliveryOneDay;

        /**
         * 折扣金额，单位：元，折扣金额=平台优惠+商家优惠+团长免单优惠金额
         */
        @JsonProperty("discount_amount")
        private Double discountAmount;

        /**
         * 多多支付立减金额，单位：元
         */
        @JsonProperty("duo_duo_pay_reduction")
        private Double duoDuoPayReduction;

        /**
         * 是否多多批发，1-是，0-否
         */
        @JsonProperty("duoduo_wholesale")
        private Integer duoduoWholesale;

        /**
         * 订单多包裹发货时使用的其他发货快递信息
         */
        @JsonProperty("extra_delivery_list")
        private List<OrderListGetResponseOrderListItemExtraDeliveryListItem> extraDeliveryList;

        /**
         * 是否顺丰包邮，1-是 0-否
         */
        @JsonProperty("free_sf")
        private Integer freeSf;

        /**
         * 赠品额外运单列表
         */
        @JsonProperty("gift_delivery_list")
        private List<OrderListGetResponseOrderListItemGiftDeliveryListItem> giftDeliveryList;

        /**
         * 赠品列表
         */
        @JsonProperty("gift_list")
        private List<OrderListGetResponseOrderListItemGiftListItem> giftList;

        /**
         * 商品金额，单位：元，商品金额=商品销售价格商品数量-订单改价折扣金额
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
         * 支付申报订单号（多多国际清关请使用此字段，单号以XP开头）
         */
        @JsonProperty("inner_transaction_id")
        private String innerTransactionId;

        /**
         * 发票申请,1代表有 0代表无
         */
        @JsonProperty("invoice_status")
        private Integer invoiceStatus;

        /**
         * 是否是抽奖订单，1-非抽奖订单，2-抽奖订单
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
         * 订单商品列表
         */
        @JsonProperty("item_list")
        private List<OrderListGetResponseOrderListItemItemListItem> itemList;

        /**
         * 订单承诺发货时间
         */
        @JsonProperty("last_ship_time")
        private String lastShipTime;

        /**
         * 快递公司在拼多多的代码
         */
        @JsonProperty("logistics_id")
        private Long logisticsId;

        /**
         * 市场业务类型，0-普通订单，1-拼内购订单
         */
        @JsonProperty("mkt_biz_type")
        private Integer mktBizType;

        /**
         * 只换不修，1:是，0:否
         */
        @JsonProperty("only_support_replace")
        private Integer onlySupportReplace;

        /**
         * 合单ID
         */
        @JsonProperty("open_address_id")
        private String openAddressId;

        /**
         * 订单改价折扣金额，单位元
         */
        @JsonProperty("order_change_amount")
        private Double orderChangeAmount;

        /**
         * 仓库信息
         */
        @JsonProperty("order_depot_info")
        private OrderListGetResponseOrderListItemOrderDepotInfo orderDepotInfo;

        /**
         * 订单编号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * 订单状态
         */
        @JsonProperty("order_status")
        private Integer orderStatus;

        /**
         * 订单标签列表，no_trace_delivery=无痕发货，only_support_replace=只换不修，duoduo_wholesale=多多批发，return_freight_payer=退货包运费，free_sf=顺丰包邮，support_nationwide_warranty=全国联保，self_contained=门店自提，delivery_one_day=当日发货，oversea_tracing=全球购溯源，distributional_sale=分销订单，open_in_festival=不打烊，region_black_delay_shipping=发货时间可延迟，same_city_distribution=同城配送，has_subsidy_postage=补贴运费红包，has_sf_express_service=顺丰加价，community_group=小区团购，has_ship_additional=加运费发顺丰，ship_additional_order=加运费补差价订单，conso_order=集运订单，allergy_refund=过敏包退，professional_appraisal=专业鉴定，ship_hold=暂停发货，home_delivery_door=送货上门，direct_mail_activity=直邮活动，local_depot=本地仓订单
         */
        @JsonProperty("order_tag_list")
        private List<OrderListGetResponseOrderListItemOrderTagListItem> orderTagList;

        /**
         * 支付金额，单位：元，支付金额=商品金额-折扣金额+邮费+服务费
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
         * 平台优惠金额，单位：元
         */
        @JsonProperty("platform_discount")
        private Double platformDiscount;

        /**
         * 邮费，单位：元
         */
        @JsonProperty("postage")
        private Double postage;

        /**
         * 预售时间
         */
        @JsonProperty("pre_sale_time")
        private String preSaleTime;

        /**
         * 承诺送达时间
         */
        @JsonProperty("promise_delivery_time")
        private String promiseDeliveryTime;

        /**
         * 优惠券信息
         */
        @JsonProperty("promotion_detail_list")
        private List<OrderListGetResponseOrderListItemPromotionDetailListItem> promotionDetailList;

        /**
         * 省份
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
         * 收件人地址，不拼接省市区。订单状态为待发货状态，且订单未被风控打标的情况下返回密文数据；其余情况返回空字符串。
         */
        @JsonProperty("receiver_address")
        private String receiverAddress;

        /**
         * 收件人地址（打码）
         */
        @JsonProperty("receiver_address_mask")
        private String receiverAddressMask;

        /**
         * 收件人姓名。订单状态为待发货状态，且订单未被风控打标的情况下返回密文数据；其余情况返回空字符串。
         */
        @JsonProperty("receiver_name")
        private String receiverName;

        /**
         * 收件人姓名（打码）
         */
        @JsonProperty("receiver_name_mask")
        private String receiverNameMask;

        /**
         * 收件人电话。订单状态为待发货状态，且订单未被风控打标的情况下返回密文数据；其余情况返回空字符串。
         */
        @JsonProperty("receiver_phone")
        private String receiverPhone;

        /**
         * 收件人手机号（打码）
         */
        @JsonProperty("receiver_phone_mask")
        private String receiverPhoneMask;

        /**
         * 售后状态
         */
        @JsonProperty("refund_status")
        private Integer refundStatus;

        /**
         * 订单备注
         */
        @JsonProperty("remark")
        private String remark;

        /**
         * 订单备注标记，1-红色，2-黄色，3-绿色，4-蓝色，5-紫色
         */
        @JsonProperty("remark_tag")
        private Integer remarkTag;

        /**
         * 订单备注标记名称
         */
        @JsonProperty("remark_tag_name")
        private String remarkTagName;

        /**
         * 补寄额外运单列表
         */
        @JsonProperty("resend_delivery_list")
        private List<OrderListGetResponseOrderListItemResendDeliveryListItem> resendDeliveryList;

        /**
         * 退货包运费，1:是，0:否
         */
        @JsonProperty("return_freight_payer")
        private Integer returnFreightPayer;

        /**
         * 订单审核状态（0-正常订单， 1-审核中订单）
         */
        @JsonProperty("risk_control_status")
        private Integer riskControlStatus;

        /**
         * 是否门店自提，1-是，0-否
         */
        @JsonProperty("self_contained")
        private Integer selfContained;

        /**
         * 商家优惠金额，单位：元
         */
        @JsonProperty("seller_discount")
        private Double sellerDiscount;

        /**
         * 服务费明细列表，sf_express_fee=顺丰加价服务，install_fee=上门安装服务，store_install_fee=到店安装服务，take_to_store_install_fee=携货到店安装，dismantle_and_home_install_fee=拆旧+上门安装
         */
        @JsonProperty("service_fee_detail")
        private List<OrderListGetResponseOrderListItemServiceFeeDetailItem> serviceFeeDetail;

        /**
         * 关联的加运费发顺丰的补差价订单
         */
        @JsonProperty("ship_additional_link_order")
        private String shipAdditionalLinkOrder;

        /**
         * 加运费补差价订单的原单
         */
        @JsonProperty("ship_additional_origin_order")
        private String shipAdditionalOriginOrder;

        /**
         * 发货时间
         */
        @JsonProperty("shipping_time")
        private String shippingTime;

        /**
         * 创建交易时的物流方式(1-预约配送，2-1小时达，3-消费者预约送达)
         */
        @JsonProperty("shipping_type")
        private Integer shippingType;

        /**
         * { "step_discount_amount":4, "advanced_paid_fee":1, "step_paid_fee":1.1, "step_trade_status":2 }
         */
        @JsonProperty("step_order_info")
        private OrderListGetResponseOrderListItemStepOrderInfo stepOrderInfo;

        /**
         * 缺货处理状态 -1:无缺货处理 0: 缺货待处理 1缺货已处理
         */
        @JsonProperty("stock_out_handle_status")
        private Integer stockOutHandleStatus;

        /**
         * 全国联保，1:是，0:否
         */
        @JsonProperty("support_nationwide_warranty")
        private Integer supportNationwideWarranty;

        /**
         * 区，乡镇
         */
        @JsonProperty("town")
        private String town;

        /**
         * 区县编码
         */
        @JsonProperty("town_id")
        private Integer townId;

        /**
         * 快递单号
         */
        @JsonProperty("tracking_number")
        private String trackingNumber;

        /**
         * 订单类型 0-普通订单 ，1- 定金订单
         */
        @JsonProperty("trade_type")
        private Integer tradeType;

        /**
         * 订单的更新时间
         */
        @JsonProperty("updated_at")
        private String updatedAt;

        /**
         * 催发货时间
         */
        @JsonProperty("urge_shipping_time")
        private String urgeShippingTime;

        /**
         * 预约配送日期
         */
        @JsonProperty("yyps_date")
        private String yypsDate;

        /**
         * 预约配送时段
         */
        @JsonProperty("yyps_time")
        private String yypsTime;

        public String getAddress() {
            return address;
        }

        public String getAddressMask() {
            return addressMask;
        }

        public Integer getAfterSalesStatus() {
            return afterSalesStatus;
        }

        public String getBondedWarehouse() {
            return bondedWarehouse;
        }

        public String getBuyerMemo() {
            return buyerMemo;
        }

        public Double getCapitalFreeDiscount() {
            return capitalFreeDiscount;
        }

        public List<OrderListGetResponseOrderListItemCardInfoListItem> getCardInfoList() {
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

        public OrderListGetResponseOrderListItemConsolidateInfo getConsolidateInfo() {
            return consolidateInfo;
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

        public Integer getDeliveryOneDay() {
            return deliveryOneDay;
        }

        public Double getDiscountAmount() {
            return discountAmount;
        }

        public Double getDuoDuoPayReduction() {
            return duoDuoPayReduction;
        }

        public Integer getDuoduoWholesale() {
            return duoduoWholesale;
        }

        public List<OrderListGetResponseOrderListItemExtraDeliveryListItem> getExtraDeliveryList() {
            return extraDeliveryList;
        }

        public Integer getFreeSf() {
            return freeSf;
        }

        public List<OrderListGetResponseOrderListItemGiftDeliveryListItem> getGiftDeliveryList() {
            return giftDeliveryList;
        }

        public List<OrderListGetResponseOrderListItemGiftListItem> getGiftList() {
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

        public List<OrderListGetResponseOrderListItemItemListItem> getItemList() {
            return itemList;
        }

        public String getLastShipTime() {
            return lastShipTime;
        }

        public Long getLogisticsId() {
            return logisticsId;
        }

        public Integer getMktBizType() {
            return mktBizType;
        }

        public Integer getOnlySupportReplace() {
            return onlySupportReplace;
        }

        public String getOpenAddressId() {
            return openAddressId;
        }

        public Double getOrderChangeAmount() {
            return orderChangeAmount;
        }

        public OrderListGetResponseOrderListItemOrderDepotInfo getOrderDepotInfo() {
            return orderDepotInfo;
        }

        public String getOrderSn() {
            return orderSn;
        }

        public Integer getOrderStatus() {
            return orderStatus;
        }

        public List<OrderListGetResponseOrderListItemOrderTagListItem> getOrderTagList() {
            return orderTagList;
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

        public List<OrderListGetResponseOrderListItemPromotionDetailListItem> getPromotionDetailList() {
            return promotionDetailList;
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

        public Integer getRemarkTag() {
            return remarkTag;
        }

        public String getRemarkTagName() {
            return remarkTagName;
        }

        public List<OrderListGetResponseOrderListItemResendDeliveryListItem> getResendDeliveryList() {
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

        public List<OrderListGetResponseOrderListItemServiceFeeDetailItem> getServiceFeeDetail() {
            return serviceFeeDetail;
        }

        public String getShipAdditionalLinkOrder() {
            return shipAdditionalLinkOrder;
        }

        public String getShipAdditionalOriginOrder() {
            return shipAdditionalOriginOrder;
        }

        public String getShippingTime() {
            return shippingTime;
        }

        public Integer getShippingType() {
            return shippingType;
        }

        public OrderListGetResponseOrderListItemStepOrderInfo getStepOrderInfo() {
            return stepOrderInfo;
        }

        public Integer getStockOutHandleStatus() {
            return stockOutHandleStatus;
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

        public String getUrgeShippingTime() {
            return urgeShippingTime;
        }

        public String getYypsDate() {
            return yypsDate;
        }

        public String getYypsTime() {
            return yypsTime;
        }
    }

    public static class OrderListGetResponseOrderListItemCardInfoListItem {

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

    public static class OrderListGetResponseOrderListItemConsolidateInfo {

        /**
         * 集运类型 0-中国香港集运、1-中国新疆中转、2-哈萨克斯坦集运、3-中国西藏中转、5-日本集运、6-中国台湾集运、7-韩国集运、8-新加坡集运、9-马来西亚集运、10-泰国集运、11-越南集运、12-吉尔吉斯斯坦集运、13-乌兹别克斯坦集运、14-中国甘肃中转、15-中国内蒙古中转、16-中国宁夏中转、17-中国青海中转、18-中国澳门集运、19-柬埔寨集运、20-老挝集运、21-塔吉克斯坦集运、22-亚美尼亚集运、23-格鲁吉亚集运
         */
        @JsonProperty("consolidate_type")
        private Integer consolidateType;

        public Integer getConsolidateType() {
            return consolidateType;
        }
    }

    public static class OrderListGetResponseOrderListItemExtraDeliveryListItem {

        /**
         * 快递公司编号
         */
        @JsonProperty("logistics_id")
        private Integer logisticsId;

        /**
         * 快递运单号
         */
        @JsonProperty("tracking_number")
        private String trackingNumber;

        public Integer getLogisticsId() {
            return logisticsId;
        }

        public String getTrackingNumber() {
            return trackingNumber;
        }
    }

    public static class OrderListGetResponseOrderListItemGiftDeliveryListItem {

        /**
         * 快递ID
         */
        @JsonProperty("logistics_id")
        private Integer logisticsId;

        /**
         * 运单号
         */
        @JsonProperty("tracking_number")
        private String trackingNumber;

        public Integer getLogisticsId() {
            return logisticsId;
        }

        public String getTrackingNumber() {
            return trackingNumber;
        }
    }

    public static class OrderListGetResponseOrderListItemGiftListItem {

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

    public static class OrderListGetResponseOrderListItemItemListItem {

        /**
         * 商品数量
         */
        @JsonProperty("goods_count")
        private Integer goodsCount;

        /**
         * 商品编码
         */
        @JsonProperty("goods_id")
        private String goodsId;

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
         * 商品单件 单价：元
         */
        @JsonProperty("goods_price")
        private Double goodsPrice;

        /**
         * 商品规格
         */
        @JsonProperty("goods_spec")
        private String goodsSpec;

        /**
         * 商品维度外部编码，注意：编辑商品后必须等待商品审核通过后方可生效，订单中商品信息为交易快照的商品信息。
         */
        @JsonProperty("outer_goods_id")
        private String outerGoodsId;

        /**
         * sku维度商家外部编码，注意：编辑商品后必须等待商品审核通过后方可生效，订单中商品信息为交易快照的商品信息。
         */
        @JsonProperty("outer_id")
        private String outerId;

        /**
         * 商品sku编码
         */
        @JsonProperty("sku_id")
        private String skuId;

        public Integer getGoodsCount() {
            return goodsCount;
        }

        public String getGoodsId() {
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

        public String getSkuId() {
            return skuId;
        }
    }

    public static class OrderListGetResponseOrderListItemOrderDepotInfo {

        /**
         * 仓库编码
         */
        @JsonProperty("depot_code")
        private String depotCode;

        /**
         * 仓库id
         */
        @JsonProperty("depot_id")
        private Long depotId;

        /**
         * 仓库名称
         */
        @JsonProperty("depot_name")
        private String depotName;

        /**
         * 仓库类型，1：自有仓 2：订阅仓 两者都不是则传空
         */
        @JsonProperty("depot_type")
        private Integer depotType;

        /**
         * 货品id
         */
        @JsonProperty("ware_id")
        private Long wareId;

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
        private List<OrderListGetResponseOrderListItemOrderDepotInfoWareSubInfoListItem> wareSubInfoList;

        /**
         * 货品类型（0：普通货品:1：组合货品）
         */
        @JsonProperty("ware_type")
        private Integer wareType;

        public String getDepotCode() {
            return depotCode;
        }

        public Long getDepotId() {
            return depotId;
        }

        public String getDepotName() {
            return depotName;
        }

        public Integer getDepotType() {
            return depotType;
        }

        public Long getWareId() {
            return wareId;
        }

        public String getWareName() {
            return wareName;
        }

        public String getWareSn() {
            return wareSn;
        }

        public List<OrderListGetResponseOrderListItemOrderDepotInfoWareSubInfoListItem> getWareSubInfoList() {
            return wareSubInfoList;
        }

        public Integer getWareType() {
            return wareType;
        }
    }

    public static class OrderListGetResponseOrderListItemOrderDepotInfoWareSubInfoListItem {

        /**
         * 子货品id
         */
        @JsonProperty("ware_id")
        private Long wareId;

        /**
         * 子货品名称
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

    public static class OrderListGetResponseOrderListItemOrderTagListItem {

        /**
         * 标签名称
         */
        @JsonProperty("name")
        private String name;

        /**
         * 是否有标签：0=无标签，1=有标签
         */
        @JsonProperty("value")
        private Integer value;

        public String getName() {
            return name;
        }

        public Integer getValue() {
            return value;
        }
    }

    public static class OrderListGetResponseOrderListItemPromotionDetailListItem {

        /**
         * 优惠金额（元）
         */
        @JsonProperty("discount_amount")
        private Double discountAmount;

        /**
         * 优惠券类型。30-以旧换新优惠（优惠金额已包含平台优惠金额里）
         */
        @JsonProperty("promotion_type")
        private Integer promotionType;

        public Double getDiscountAmount() {
            return discountAmount;
        }

        public Integer getPromotionType() {
            return promotionType;
        }
    }

    public static class OrderListGetResponseOrderListItemResendDeliveryListItem {

        /**
         * 快递ID
         */
        @JsonProperty("logistics_id")
        private Integer logisticsId;

        /**
         * 运单号
         */
        @JsonProperty("tracking_number")
        private String trackingNumber;

        public Integer getLogisticsId() {
            return logisticsId;
        }

        public String getTrackingNumber() {
            return trackingNumber;
        }
    }

    public static class OrderListGetResponseOrderListItemServiceFeeDetailItem {

        /**
         * 服务费金额，单位：元
         */
        @JsonProperty("service_fee")
        private Double serviceFee;

        /**
         * 服务费类型
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

    public static class OrderListGetResponseOrderListItemStepOrderInfo {

        /**
         * 已付定金 单位：元
         */
        @JsonProperty("advanced_paid_fee")
        private Double advancedPaidFee;

        /**
         * 膨胀金额 单位：元
         */
        @JsonProperty("step_discount_amount")
        private Double stepDiscountAmount;

        /**
         * 分阶段已付金额 单位：元
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
}