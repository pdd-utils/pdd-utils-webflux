package com.pdd.pop.sdk.http.api.ark.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddCloudRefundInformationGetResponse extends PopBaseHttpResponse {

    /**
     * 售后原因
     */
    @JsonProperty("after_sales_reason")
    private String afterSalesReason;

    /**
     * 售后状态 0：无售后 2：买家申请退款，待商家处理 3：退货退款，待商家处理 4：商家同意退款，退款中 5：平台同意退款，退款中 6：驳回退款，待买家处理 7：已同意退货退款,待用户发货 8：平台处理中 9：平台拒绝退款，退款关闭 10：退款成功 11：买家撤销 12：买家逾期未处理，退款失败 13：买家逾期，超过有效期 14：换货补寄待商家处理 15：换货补寄待用户处理 16：换货补寄成功 17：换货补寄失败 18：换货补寄待用户确认完成 21：待商家同意维修 22：待用户确认发货 24：维修关闭 25：维修成功 27：待用户确认收货 31：已同意拒收退款，待用户拒收 32：补寄待商家发货
     */
    @JsonProperty("after_sales_status")
    private Integer afterSalesStatus;

    /**
     * 售后类型 1-仅退款，2-退货退款，3-换货，4-补寄，5-维修
     */
    @JsonProperty("after_sales_type")
    private Integer afterSalesType;

    /**
     * 订单成团时间
     */
    @JsonProperty("confirm_time")
    private Long confirmTime;

    /**
     * 订单折扣金额
     */
    @JsonProperty("discount_amount")
    private Integer discountAmount;

    /**
     * 1纠纷退款 0非纠纷退款
     */
    @JsonProperty("dispute_refund_status")
    private Integer disputeRefundStatus;

    /**
     * 错误码
     */
    @JsonProperty("error_code")
    private Integer errorCode;

    /**
     * 错误信息
     */
    @JsonProperty("error_msg")
    private String errorMsg;

    /**
     * 换货详情,售后类型是换货才有值
     */
    @JsonProperty("exchange_shipping_detail")
    private ExchangeShippingDetail exchangeShippingDetail;

    /**
     * 售后逾期时间（只提供待商家处理状态下的，其余的状态为null）
     */
    @JsonProperty("expire_time")
    private Long expireTime;

    /**
     * 退货物流单号
     */
    @JsonProperty("express_no")
    private String expressNo;

    /**
     * 商品数量
     */
    @JsonProperty("goods_number")
    private Integer goodsNumber;

    /**
     * 商品单价
     */
    @JsonProperty("goods_price")
    private Integer goodsPrice;

    /**
     * 售后单id
     */
    @JsonProperty("id")
    private Long id;

    /**
     * 用户申请售后上传的图片列表
     */
    @JsonProperty("images")
    private List<String> images;

    /**
     * 是否介入 1介入 0未介入
     */
    @JsonProperty("join_or_not")
    private String joinOrNot;

    /**
     * 交易金额
     */
    @JsonProperty("order_amount")
    private Long orderAmount;

    /**
     * 订单号
     */
    @JsonProperty("order_sn")
    private String orderSn;

    /**
     * 售后单创建时间（重新申请时间）
     */
    @JsonProperty("recreated_at")
    private Long recreatedAt;

    /**
     * 退款金额
     */
    @JsonProperty("refund_amount")
    private Integer refundAmount;

    /**
     * 用户申请输入的描述信息
     */
    @JsonProperty("remark")
    private String remark;

    /**
     * 退货物流名称
     */
    @JsonProperty("shipping_name")
    private String shippingName;

    /**
     * 订单发货状态 0:未发货， 1:已发货（包含：已发货，已揽收）
     */
    @JsonProperty("shipping_status")
    private Integer shippingStatus;

    /**
     * 商品规格ID
     */
    @JsonProperty("sku_id")
    private String skuId;

    /**
     * 极速退款标志位 1：极速退款，0：非极速退款
     */
    @JsonProperty("speed_refund_flag")
    private Integer speedRefundFlag;

    /**
     * 子错误码
     */
    @JsonProperty("sub_code")
    private Integer subCode;

    /**
     * 子错误信息
     */
    @JsonProperty("sub_msg")
    private String subMsg;

    /**
     * 更新时间
     */
    @JsonProperty("updated_time")
    private String updatedTime;

    /**
     * 0-未勾选 1-消费者选择的收货状态为未收到货 2-消费者选择的收货状态为已收到货
     */
    @JsonProperty("user_shipping_status")
    private String userShippingStatus;

    /**
     * 部分售后类型：0：无意义、1：件数/件、2：比例/%；注意只有退货退款类型才有意义
     */
    @JsonProperty("part_after_sales_type")
    private Integer partAfterSalesType;

    /**
     * 部分售后件数/比例；注意只有退货退款类型才有意义
     */
    @JsonProperty("part_after_sales_value")
    private Integer partAfterSalesValue;

    public String getAfterSalesReason() {
        return afterSalesReason;
    }

    public Integer getAfterSalesStatus() {
        return afterSalesStatus;
    }

    public Integer getAfterSalesType() {
        return afterSalesType;
    }

    public Long getConfirmTime() {
        return confirmTime;
    }

    public Integer getDiscountAmount() {
        return discountAmount;
    }

    public Integer getDisputeRefundStatus() {
        return disputeRefundStatus;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public ExchangeShippingDetail getExchangeShippingDetail() {
        return exchangeShippingDetail;
    }

    public Long getExpireTime() {
        return expireTime;
    }

    public String getExpressNo() {
        return expressNo;
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public Integer getGoodsPrice() {
        return goodsPrice;
    }

    public Long getId() {
        return id;
    }

    public List<String> getImages() {
        return images;
    }

    public String getJoinOrNot() {
        return joinOrNot;
    }

    public Long getOrderAmount() {
        return orderAmount;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public Long getRecreatedAt() {
        return recreatedAt;
    }

    public Integer getRefundAmount() {
        return refundAmount;
    }

    public String getRemark() {
        return remark;
    }

    public String getShippingName() {
        return shippingName;
    }

    public Integer getShippingStatus() {
        return shippingStatus;
    }

    public String getSkuId() {
        return skuId;
    }

    public Integer getSpeedRefundFlag() {
        return speedRefundFlag;
    }

    public Integer getSubCode() {
        return subCode;
    }

    public String getSubMsg() {
        return subMsg;
    }

    public String getUpdatedTime() {
        return updatedTime;
    }

    public String getUserShippingStatus() {
        return userShippingStatus;
    }

    public Integer getPartAfterSalesType() {
        return partAfterSalesType;
    }

    public Integer getPartAfterSalesValue() {
        return partAfterSalesValue;
    }

    public static class ExchangeShippingDetail {

        /**
         * 消费者回寄的物流id
         */
        @JsonProperty("customer_send_back_ship_id")
        private Integer customerSendBackShipId;

        /**
         * 消费者回寄的物流单号
         */
        @JsonProperty("customer_send_back_trunk_number")
        private String customerSendBackTrunkNumber;

        /**
         * 换货发货的物品名称
         */
        @JsonProperty("exchange_goods_name")
        private String exchangeGoodsName;

        /**
         * 换货发货的物品数量
         */
        @JsonProperty("exchange_goods_number")
        private Integer exchangeGoodsNumber;

        /**
         * 换货的物品价格(单位分)
         */
        @JsonProperty("exchange_goods_price")
        private Long exchangeGoodsPrice;

        /**
         * 商家换货发货的城市（消费者地址）
         */
        @JsonProperty("exchange_receiver_city")
        private String exchangeReceiverCity;

        /**
         * 商家换货发货的城市编码（消费者地址）
         */
        @JsonProperty("exchange_receiver_city_id")
        private Long exchangeReceiverCityId;

        /**
         * 商家换货发货的省份（消费者地址）
         */
        @JsonProperty("exchange_receiver_province")
        private String exchangeReceiverProvince;

        /**
         * 商家换货发货的省份编码（消费者地址）
         */
        @JsonProperty("exchange_receiver_province_id")
        private Long exchangeReceiverProvinceId;

        /**
         * 商家换货发货的区县（消费者地址）
         */
        @JsonProperty("exchange_receiver_town")
        private String exchangeReceiverTown;

        /**
         * 商家换货发货的区县编码（消费者地址）
         */
        @JsonProperty("exchange_receiver_town_id")
        private Long exchangeReceiverTownId;

        /**
         * 商家换货发货的详细地址
         */
        @JsonProperty("merchant_exchange_detail_address")
        private String merchantExchangeDetailAddress;

        /**
         * 商家换货发货的详细地址（打码）
         */
        @JsonProperty("merchant_exchange_detail_address_mask")
        private String merchantExchangeDetailAddressMask;

        /**
         * 商家换货发货的收货人手机号
         */
        @JsonProperty("merchant_exchange_detail_phone")
        private String merchantExchangeDetailPhone;

        /**
         * 商家换货发货的收货人手机号（打码）
         */
        @JsonProperty("merchant_exchange_detail_phone_mask")
        private String merchantExchangeDetailPhoneMask;

        /**
         * 商家换货发货的收货人名字
         */
        @JsonProperty("merchant_exchange_detail_receiver")
        private String merchantExchangeDetailReceiver;

        /**
         * 商家换货发货的收货人名字（打码）
         */
        @JsonProperty("merchant_exchange_detail_receiver_mask")
        private String merchantExchangeDetailReceiverMask;

        /**
         * 商家换货发货的物流id
         */
        @JsonProperty("merchant_exchange_ship_id")
        private Integer merchantExchangeShipId;

        /**
         * 商家换货发货的物流单号
         */
        @JsonProperty("merchant_exchange_trunk_number")
        private String merchantExchangeTrunkNumber;

        /**
         * 换货商品规格ID
         */
        @JsonProperty("sku_id_exchange")
        private String skuIdExchange;

        public Integer getCustomerSendBackShipId() {
            return customerSendBackShipId;
        }

        public String getCustomerSendBackTrunkNumber() {
            return customerSendBackTrunkNumber;
        }

        public String getExchangeGoodsName() {
            return exchangeGoodsName;
        }

        public Integer getExchangeGoodsNumber() {
            return exchangeGoodsNumber;
        }

        public Long getExchangeGoodsPrice() {
            return exchangeGoodsPrice;
        }

        public String getExchangeReceiverCity() {
            return exchangeReceiverCity;
        }

        public Long getExchangeReceiverCityId() {
            return exchangeReceiverCityId;
        }

        public String getExchangeReceiverProvince() {
            return exchangeReceiverProvince;
        }

        public Long getExchangeReceiverProvinceId() {
            return exchangeReceiverProvinceId;
        }

        public String getExchangeReceiverTown() {
            return exchangeReceiverTown;
        }

        public Long getExchangeReceiverTownId() {
            return exchangeReceiverTownId;
        }

        public String getMerchantExchangeDetailAddress() {
            return merchantExchangeDetailAddress;
        }

        public String getMerchantExchangeDetailAddressMask() {
            return merchantExchangeDetailAddressMask;
        }

        public String getMerchantExchangeDetailPhone() {
            return merchantExchangeDetailPhone;
        }

        public String getMerchantExchangeDetailPhoneMask() {
            return merchantExchangeDetailPhoneMask;
        }

        public String getMerchantExchangeDetailReceiver() {
            return merchantExchangeDetailReceiver;
        }

        public String getMerchantExchangeDetailReceiverMask() {
            return merchantExchangeDetailReceiverMask;
        }

        public Integer getMerchantExchangeShipId() {
            return merchantExchangeShipId;
        }

        public String getMerchantExchangeTrunkNumber() {
            return merchantExchangeTrunkNumber;
        }

        public String getSkuIdExchange() {
            return skuIdExchange;
        }
    }
}