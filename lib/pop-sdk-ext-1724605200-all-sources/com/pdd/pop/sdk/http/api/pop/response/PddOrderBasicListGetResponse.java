package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddOrderBasicListGetResponse extends PopBaseHttpResponse {

    /**
     * 请求response
     */
    @JsonProperty("order_basic_list_get_response")
    private OrderBasicListGetResponse orderBasicListGetResponse;

    public OrderBasicListGetResponse getOrderBasicListGetResponse() {
        return orderBasicListGetResponse;
    }

    public static class OrderBasicListGetResponse {

        /**
         * 是否存在下一页
         */
        @JsonProperty("has_next")
        private Boolean hasNext;

        /**
         * 订单信息列表
         */
        @JsonProperty("order_list")
        private List<OrderBasicListGetResponseOrderListItem> orderList;

        /**
         * 订单总数
         */
        @JsonProperty("total_count")
        private Integer totalCount;

        public Boolean getHasNext() {
            return hasNext;
        }

        public List<OrderBasicListGetResponseOrderListItem> getOrderList() {
            return orderList;
        }

        public Integer getTotalCount() {
            return totalCount;
        }
    }

    public static class OrderBasicListGetResponseOrderListItem {

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
         * 成交时间
         */
        @JsonProperty("confirm_time")
        private String confirmTime;

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
         * 折扣金额，单位：元，折扣金额=平台优惠+商家优惠+团长免单优惠金额
         */
        @JsonProperty("discount_amount")
        private Double discountAmount;

        /**
         * 商品金额，单位：元，商品金额=商品销售价格商品数量-改价金额（接口暂无该字段）
         */
        @JsonProperty("goods_amount")
        private Double goodsAmount;

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
         * 是否是抽奖订单，1-非抽奖订单，2-抽奖订单
         */
        @JsonProperty("is_lucky_flag")
        private Integer isLuckyFlag;

        /**
         * 订单商品列表
         */
        @JsonProperty("item_list")
        private List<OrderBasicListGetResponseOrderListItemItemListItem> itemList;

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
         * 支付金额，单位：元，支付金额=商品金额-折扣金额+邮费
         */
        @JsonProperty("pay_amount")
        private Double payAmount;

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
         * 售后状态
         */
        @JsonProperty("refund_status")
        private Integer refundStatus;

        /**
         * 订单审核状态（0-正常订单， 1-审核中订单）
         */
        @JsonProperty("risk_control_status")
        private Integer riskControlStatus;

        /**
         * 商家优惠金额，单位：元
         */
        @JsonProperty("seller_discount")
        private Double sellerDiscount;

        /**
         * { "step_discount_amount":4, "advanced_paid_fee":1, "step_paid_fee":1.1, "step_trade_status":2 }
         */
        @JsonProperty("step_order_info")
        private OrderBasicListGetResponseOrderListItemStepOrderInfo stepOrderInfo;

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

        public String getConfirmTime() {
            return confirmTime;
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

        public Double getGoodsAmount() {
            return goodsAmount;
        }

        public Integer getHomeDeliveryType() {
            return homeDeliveryType;
        }

        public Double getHomeInstallValue() {
            return homeInstallValue;
        }

        public Integer getIsLuckyFlag() {
            return isLuckyFlag;
        }

        public List<OrderBasicListGetResponseOrderListItemItemListItem> getItemList() {
            return itemList;
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

        public Double getPlatformDiscount() {
            return platformDiscount;
        }

        public Double getPostage() {
            return postage;
        }

        public Integer getRefundStatus() {
            return refundStatus;
        }

        public Integer getRiskControlStatus() {
            return riskControlStatus;
        }

        public Double getSellerDiscount() {
            return sellerDiscount;
        }

        public OrderBasicListGetResponseOrderListItemStepOrderInfo getStepOrderInfo() {
            return stepOrderInfo;
        }

        public Integer getTradeType() {
            return tradeType;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }
    }

    public static class OrderBasicListGetResponseOrderListItemItemListItem {

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

    public static class OrderBasicListGetResponseOrderListItemStepOrderInfo {

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