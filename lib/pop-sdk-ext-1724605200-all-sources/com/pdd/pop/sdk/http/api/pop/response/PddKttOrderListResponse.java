package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddKttOrderListResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("ktt_order_list_response")
    private KttOrderListResponse kttOrderListResponse;

    public KttOrderListResponse getKttOrderListResponse() {
        return kttOrderListResponse;
    }

    public static class KttOrderListResponse {

        /**
         * 订单列表
         */
        @JsonProperty("order_list")
        private List<KttOrderListResponseOrderListItem> orderList;

        /**
         * 总数
         */
        @JsonProperty("total_count")
        private Long totalCount;

        public List<KttOrderListResponseOrderListItem> getOrderList() {
            return orderList;
        }

        public Long getTotalCount() {
            return totalCount;
        }
    }

    public static class KttOrderListResponseOrderListItem {

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
         * 售后状态, 可选 0-未发起售后 1-退款中 2-退款成功 3-待处理 4-拒绝退款 6-待(顾客)退货 7-待(团长)确认退货 8-(顾客)撤销 9-(系统)关闭
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
         * 取消状态 0-未取消 1-已取消
         */
        @JsonProperty("cancel_status")
        private Integer cancelStatus;

        /**
         * 成交时间，毫秒时间戳
         */
        @JsonProperty("confirm_at")
        private Long confirmAt;

        /**
         * 自定义项列表
         */
        @JsonProperty("custom_item_list")
        private List<KttOrderListResponseOrderListItemCustomItemListItem> customItemList;

        /**
         * 优惠金额(分)
         */
        @JsonProperty("discount_amount")
        private Long discountAmount;

        /**
         * 外部活动编号
         */
        @JsonProperty("external_event_sn")
        private String externalEventSn;

        /**
         * 赠品列表
         */
        @JsonProperty("gift_order_list")
        private List<KttOrderListResponseOrderListItemGiftOrderListItem> giftOrderList;

        /**
         * 帮卖团长昵称
         */
        @JsonProperty("help_sell_nickname")
        private String helpSellNickname;

        /**
         * 帮卖团长openId
         */
        @JsonProperty("help_sell_open_id")
        private String helpSellOpenId;

        /**
         * 内部支付流水号（Xp单号）
         */
        @JsonProperty("inner_transaction_id")
        private String innerTransactionId;

        /**
         * 当前用户是否供货团长
         */
        @JsonProperty("is_supplier")
        private Boolean isSupplier;

        /**
         * 物流列表
         */
        @JsonProperty("logistics_list")
        private List<KttOrderListResponseOrderListItemLogisticsListItem> logisticsList;

        /**
         * 物流方式 0-无需物流 10-普通快递 20-自提 30-同城配送
         */
        @JsonProperty("logistics_type")
        private Integer logisticsType;

        /**
         * 订单来源 0-普通团 1-店铺 2-积分商城
         */
        @JsonProperty("mall_activity_type")
        private Integer mallActivityType;

        /**
         * 团员昵称
         */
        @JsonProperty("nick_name")
        private String nickName;

        /**
         * 团员openId
         */
        @JsonProperty("open_id")
        private String openId;

        /**
         * 订单金额（分）
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
         * 平台优惠金额(分)
         */
        @JsonProperty("platform_discount_amount")
        private Long platformDiscountAmount;

        /**
         * 收货人地址（市）
         */
        @JsonProperty("receiver_address_city")
        private String receiverAddressCity;

        /**
         * 收货人详细地址
         */
        @JsonProperty("receiver_address_detail")
        private String receiverAddressDetail;

        /**
         * 收货人地址（区）
         */
        @JsonProperty("receiver_address_district")
        private String receiverAddressDistrict;

        /**
         * 收货人地址（省）
         */
        @JsonProperty("receiver_address_province")
        private String receiverAddressProvince;

        /**
         * 收货人电话
         */
        @JsonProperty("receiver_mobile")
        private String receiverMobile;

        /**
         * 收货人姓名
         */
        @JsonProperty("receiver_name")
        private String receiverName;

        /**
         * 已退运费/配送费总额
         */
        @JsonProperty("refund_shipping_amount")
        private Long refundShippingAmount;

        /**
         * 剩余可退运费/配送费总额（分）
         */
        @JsonProperty("refundable_shipping_amount")
        private Long refundableShippingAmount;

        /**
         * 私密备注
         */
        @JsonProperty("secret_remark")
        private String secretRemark;

        /**
         * 自提点编号
         */
        @JsonProperty("self_pick_site_no")
        private String selfPickSiteNo;

        /**
         * 自提点地址
         */
        @JsonProperty("self_pick_up_address")
        private String selfPickUpAddress;

        /**
         * 自提点联系电话
         */
        @JsonProperty("self_pick_up_contact_mobile")
        private String selfPickUpContactMobile;

        /**
         * 自提点联系人
         */
        @JsonProperty("self_pick_up_contact_name")
        private String selfPickUpContactName;

        /**
         * 自提点名称
         */
        @JsonProperty("self_pick_up_site_name")
        private String selfPickUpSiteName;

        /**
         * 同城配送费
         */
        @JsonProperty("service_amount")
        private Long serviceAmount;

        /**
         * 运费金额(分)
         */
        @JsonProperty("shipping_amount")
        private Long shippingAmount;

        /**
         * 发货状态 0-未发货 1-已发货 2-部分发货 3-已收货
         */
        @JsonProperty("shipping_status")
        private Integer shippingStatus;

        /**
         * 团购子类型 6-本地生活团
         */
        @JsonProperty("sub_activity_type")
        private Integer subActivityType;

        /**
         * 购买商品列表
         */
        @JsonProperty("sub_order_list")
        private List<KttOrderListResponseOrderListItemSubOrderListItem> subOrderList;

        /**
         * 供货团号，当isSupplier为true且复制帮卖团时给出
         */
        @JsonProperty("supply_activity_no")
        private String supplyActivityNo;

        /**
         * 帮卖接龙号
         */
        @JsonProperty("supply_participate_no")
        private Integer supplyParticipateNo;

        /**
         * 退款金额(商家同意退款的金额, 分)
         */
        @JsonProperty("theoretical_refund_amount")
        private Long theoreticalRefundAmount;

        /**
         * 支付流水号
         */
        @JsonProperty("transaction_id")
        private String transactionId;

        /**
         * 更新时间，毫秒时间戳
         */
        @JsonProperty("updated_at")
        private Long updatedAt;

        /**
         * 核销状态 0-未核销 1-已核销 2-部分核销
         */
        @JsonProperty("verification_status")
        private Integer verificationStatus;

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

        public Long getConfirmAt() {
            return confirmAt;
        }

        public List<KttOrderListResponseOrderListItemCustomItemListItem> getCustomItemList() {
            return customItemList;
        }

        public Long getDiscountAmount() {
            return discountAmount;
        }

        public String getExternalEventSn() {
            return externalEventSn;
        }

        public List<KttOrderListResponseOrderListItemGiftOrderListItem> getGiftOrderList() {
            return giftOrderList;
        }

        public String getHelpSellNickname() {
            return helpSellNickname;
        }

        public String getHelpSellOpenId() {
            return helpSellOpenId;
        }

        public String getInnerTransactionId() {
            return innerTransactionId;
        }

        public Boolean getIsSupplier() {
            return isSupplier;
        }

        public List<KttOrderListResponseOrderListItemLogisticsListItem> getLogisticsList() {
            return logisticsList;
        }

        public Integer getLogisticsType() {
            return logisticsType;
        }

        public Integer getMallActivityType() {
            return mallActivityType;
        }

        public String getNickName() {
            return nickName;
        }

        public String getOpenId() {
            return openId;
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

        public Long getPlatformDiscountAmount() {
            return platformDiscountAmount;
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

        public Long getRefundShippingAmount() {
            return refundShippingAmount;
        }

        public Long getRefundableShippingAmount() {
            return refundableShippingAmount;
        }

        public String getSecretRemark() {
            return secretRemark;
        }

        public String getSelfPickSiteNo() {
            return selfPickSiteNo;
        }

        public String getSelfPickUpAddress() {
            return selfPickUpAddress;
        }

        public String getSelfPickUpContactMobile() {
            return selfPickUpContactMobile;
        }

        public String getSelfPickUpContactName() {
            return selfPickUpContactName;
        }

        public String getSelfPickUpSiteName() {
            return selfPickUpSiteName;
        }

        public Long getServiceAmount() {
            return serviceAmount;
        }

        public Long getShippingAmount() {
            return shippingAmount;
        }

        public Integer getShippingStatus() {
            return shippingStatus;
        }

        public Integer getSubActivityType() {
            return subActivityType;
        }

        public List<KttOrderListResponseOrderListItemSubOrderListItem> getSubOrderList() {
            return subOrderList;
        }

        public String getSupplyActivityNo() {
            return supplyActivityNo;
        }

        public Integer getSupplyParticipateNo() {
            return supplyParticipateNo;
        }

        public Long getTheoreticalRefundAmount() {
            return theoreticalRefundAmount;
        }

        public String getTransactionId() {
            return transactionId;
        }

        public Long getUpdatedAt() {
            return updatedAt;
        }

        public Integer getVerificationStatus() {
            return verificationStatus;
        }
    }

    public static class KttOrderListResponseOrderListItemCustomItemListItem {

        /**
         * 自定义项名称
         */
        @JsonProperty("name")
        private String name;

        /**
         * 自定义项值
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

    public static class KttOrderListResponseOrderListItemGiftOrderListItem {

        /**
         * 外部编码
         */
        @JsonProperty("external_sku_id")
        private String externalSkuId;

        /**
         * goodsId
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 赠品名
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * 购买数量
         */
        @JsonProperty("goods_number")
        private Integer goodsNumber;

        /**
         * 宿主子订单号
         */
        @JsonProperty("host_sub_order_sn")
        private String hostSubOrderSn;

        /**
         * skuId
         */
        @JsonProperty("sku_id")
        private Long skuId;

        /**
         * 缩略图
         */
        @JsonProperty("thumb_url")
        private String thumbUrl;

        public String getExternalSkuId() {
            return externalSkuId;
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

        public String getHostSubOrderSn() {
            return hostSubOrderSn;
        }

        public Long getSkuId() {
            return skuId;
        }

        public String getThumbUrl() {
            return thumbUrl;
        }
    }

    public static class KttOrderListResponseOrderListItemLogisticsListItem {

        /**
         * 快递公司
         */
        @JsonProperty("shipping_company")
        private String shippingCompany;

        /**
         * 运单号
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

    public static class KttOrderListResponseOrderListItemSubOrderListItem {

        /**
         * 取消件数
         */
        @JsonProperty("already_cancel_number")
        private Integer alreadyCancelNumber;

        /**
         * 取消状态
         */
        @JsonProperty("cancel_status")
        private Integer cancelStatus;

        /**
         * 商品分类
         */
        @JsonProperty("category_name")
        private String categoryName;

        /**
         * 外部编码
         */
        @JsonProperty("external_sku_id")
        private String externalSkuId;

        /**
         * 商品金额
         */
        @JsonProperty("goods_amount")
        private Long goodsAmount;

        /**
         * 商品佣金(分)
         */
        @JsonProperty("goods_commission_amount")
        private Long goodsCommissionAmount;

        /**
         * 商品供货价(分)
         */
        @JsonProperty("goods_cost_price")
        private Long goodsCostPrice;

        /**
         * 商品id
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 商品名称
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * 商品数量
         */
        @JsonProperty("goods_number")
        private Integer goodsNumber;

        /**
         * 商品单价(分)
         */
        @JsonProperty("goods_price")
        private Long goodsPrice;

        /**
         * 商品成本价(分) 未设置成本价时没有该字段
         */
        @JsonProperty("goods_purchase_price")
        private Long goodsPurchasePrice;

        /**
         * 商品规格
         */
        @JsonProperty("goods_specification")
        private String goodsSpecification;

        /**
         * 分佣金额(分)
         */
        @JsonProperty("help_sell_amount")
        private Long helpSellAmount;

        /**
         * 当前用户是否供货团长
         */
        @JsonProperty("is_supplier")
        private Boolean isSupplier;

        /**
         * 商品分摊的商家优惠金额（分）
         */
        @JsonProperty("merchant_discount_amount")
        private Long merchantDiscountAmount;

        /**
         * 待核销件数
         */
        @JsonProperty("need_verification_number")
        private Integer needVerificationNumber;

        /**
         * 实收商品金额（分）
         */
        @JsonProperty("real_goods_amount")
        private Long realGoodsAmount;

        /**
         * 已退商品金额
         */
        @JsonProperty("refund_goods_amount")
        private Long refundGoodsAmount;

        /**
         * 剩余可退款的商品金额
         */
        @JsonProperty("refundable_goods_amount")
        private Long refundableGoodsAmount;

        /**
         * 子单发货状态，0-未发货 1-已发货
         */
        @JsonProperty("shipping_status")
        private Integer shippingStatus;

        /**
         * sku_id
         */
        @JsonProperty("sku_id")
        private Long skuId;

        /**
         * 子单号
         */
        @JsonProperty("sub_order_sn")
        private String subOrderSn;

        /**
         * 理论退款金额（分）= 退款成功 + 退款中
         */
        @JsonProperty("theoretically_refund_amount")
        private Long theoreticallyRefundAmount;

        /**
         * 缩略图
         */
        @JsonProperty("thumb_url")
        private String thumbUrl;

        /**
         * 核销件数
         */
        @JsonProperty("verification_number")
        private Integer verificationNumber;

        /**
         * 订单券码
         */
        @JsonProperty("voucher_list")
        private List<KttOrderListResponseOrderListItemSubOrderListItemVoucherListItem> voucherList;

        public Integer getAlreadyCancelNumber() {
            return alreadyCancelNumber;
        }

        public Integer getCancelStatus() {
            return cancelStatus;
        }

        public String getCategoryName() {
            return categoryName;
        }

        public String getExternalSkuId() {
            return externalSkuId;
        }

        public Long getGoodsAmount() {
            return goodsAmount;
        }

        public Long getGoodsCommissionAmount() {
            return goodsCommissionAmount;
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

        public Long getGoodsPurchasePrice() {
            return goodsPurchasePrice;
        }

        public String getGoodsSpecification() {
            return goodsSpecification;
        }

        public Long getHelpSellAmount() {
            return helpSellAmount;
        }

        public Boolean getIsSupplier() {
            return isSupplier;
        }

        public Long getMerchantDiscountAmount() {
            return merchantDiscountAmount;
        }

        public Integer getNeedVerificationNumber() {
            return needVerificationNumber;
        }

        public Long getRealGoodsAmount() {
            return realGoodsAmount;
        }

        public Long getRefundGoodsAmount() {
            return refundGoodsAmount;
        }

        public Long getRefundableGoodsAmount() {
            return refundableGoodsAmount;
        }

        public Integer getShippingStatus() {
            return shippingStatus;
        }

        public Long getSkuId() {
            return skuId;
        }

        public String getSubOrderSn() {
            return subOrderSn;
        }

        public Long getTheoreticallyRefundAmount() {
            return theoreticallyRefundAmount;
        }

        public String getThumbUrl() {
            return thumbUrl;
        }

        public Integer getVerificationNumber() {
            return verificationNumber;
        }

        public List<KttOrderListResponseOrderListItemSubOrderListItemVoucherListItem> getVoucherList() {
            return voucherList;
        }
    }

    public static class KttOrderListResponseOrderListItemSubOrderListItemVoucherListItem {

        /**
         * 过期时间
         */
        @JsonProperty("expire_date")
        private String expireDate;

        /**
         * 已退款次数
         */
        @JsonProperty("refund_times")
        private Integer refundTimes;

        /**
         * 总可核销次数
         */
        @JsonProperty("valid_verification_times")
        private Integer validVerificationTimes;

        /**
         * 已核销次数
         */
        @JsonProperty("verified_times")
        private Integer verifiedTimes;

        /**
         * 券码id
         */
        @JsonProperty("voucher_id")
        private String voucherId;

        /**
         * 券码编号
         */
        @JsonProperty("voucher_sn")
        private String voucherSn;

        public String getExpireDate() {
            return expireDate;
        }

        public Integer getRefundTimes() {
            return refundTimes;
        }

        public Integer getValidVerificationTimes() {
            return validVerificationTimes;
        }

        public Integer getVerifiedTimes() {
            return verifiedTimes;
        }

        public String getVoucherId() {
            return voucherId;
        }

        public String getVoucherSn() {
            return voucherSn;
        }
    }
}