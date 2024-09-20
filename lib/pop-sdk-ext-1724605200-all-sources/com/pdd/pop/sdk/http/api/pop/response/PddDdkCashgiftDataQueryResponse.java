package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddDdkCashgiftDataQueryResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("cashgift_data_response")
    private CashgiftDataResponse cashgiftDataResponse;

    public CashgiftDataResponse getCashgiftDataResponse() {
        return cashgiftDataResponse;
    }

    public static class CashgiftDataResponse {

        /**
         * 礼金账户余额，单位为分
         */
        @JsonProperty("available_balance")
        private Long availableBalance;

        /**
         * 多多礼金数据列表
         */
        @JsonProperty("list")
        private List<CashgiftDataResponseListItem> list;

        /**
         * 请求到的结果数
         */
        @JsonProperty("total")
        private Integer total;

        public Long getAvailableBalance() {
            return availableBalance;
        }

        public List<CashgiftDataResponseListItem> getList() {
            return list;
        }

        public Integer getTotal() {
            return total;
        }
    }

    public static class CashgiftDataResponseListItem {

        /**
         * 礼金券创建总金额，单位为分
         */
        @JsonProperty("amount")
        private Long amount;

        /**
         * 礼金ID
         */
        @JsonProperty("cash_gift_id")
        private Long cashGiftId;

        /**
         * 礼金名称
         */
        @JsonProperty("cash_gift_name")
        private String cashGiftName;

        /**
         * 礼金券面额
         */
        @JsonProperty("couponAmount")
        private Integer couponAmount;

        /**
         * 已领取礼金券总金额，单位为分（实时数据）
         */
        @JsonProperty("fetch_amount")
        private Long fetchAmount;

        /**
         * 已领取礼金券数量（实时数据）
         */
        @JsonProperty("fetch_quantity")
        private Integer fetchQuantity;

        /**
         * 商品列表信息
         */
        @JsonProperty("goods_info_list")
        private List<CashgiftDataResponseListItemGoodsInfoListItem> goodsInfoList;

        /**
         * 礼金订单使用的券总金额，单位为分（实时数据）
         */
        @JsonProperty("order_coupon_amount")
        private Long orderCouponAmount;

        /**
         * 礼金订单产生的总GMV，单位为分（实时数据）
         */
        @JsonProperty("order_gmv")
        private Long orderGmv;

        /**
         * 礼金订单数量（实时数据）
         */
        @JsonProperty("order_quantity")
        private Integer orderQuantity;

        /**
         * 礼金订单预估佣金，单位为分（实时数据）
         */
        @JsonProperty("pre_promotion_amount")
        private Long prePromotionAmount;

        /**
         * 礼金券创建总数量
         */
        @JsonProperty("quantity")
        private Integer quantity;

        /**
         * 退回礼金券总金额，单位为分
         */
        @JsonProperty("refund_amount")
        private Long refundAmount;

        /**
         * 退回礼金券数量
         */
        @JsonProperty("refund_quantity")
        private Integer refundQuantity;

        /**
         * 礼金状态：1-未生效；2-生效中；3-已过期；4-活动中止（用户主动停止）；5-活动中止（佣金降低）；6-活动中止（推广活动异常）
         */
        @JsonProperty("status")
        private Integer status;

        public Long getAmount() {
            return amount;
        }

        public Long getCashGiftId() {
            return cashGiftId;
        }

        public String getCashGiftName() {
            return cashGiftName;
        }

        public Integer getCouponAmount() {
            return couponAmount;
        }

        public Long getFetchAmount() {
            return fetchAmount;
        }

        public Integer getFetchQuantity() {
            return fetchQuantity;
        }

        public List<CashgiftDataResponseListItemGoodsInfoListItem> getGoodsInfoList() {
            return goodsInfoList;
        }

        public Long getOrderCouponAmount() {
            return orderCouponAmount;
        }

        public Long getOrderGmv() {
            return orderGmv;
        }

        public Integer getOrderQuantity() {
            return orderQuantity;
        }

        public Long getPrePromotionAmount() {
            return prePromotionAmount;
        }

        public Integer getQuantity() {
            return quantity;
        }

        public Long getRefundAmount() {
            return refundAmount;
        }

        public Integer getRefundQuantity() {
            return refundQuantity;
        }

        public Integer getStatus() {
            return status;
        }
    }

    public static class CashgiftDataResponseListItemGoodsInfoListItem {

        /**
         * 商品优惠券面额，单位为分
         */
        @JsonProperty("coupon_discount")
        private Long couponDiscount;

        /**
         * 商品名称
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * 商品原价，单位为分
         */
        @JsonProperty("goods_price")
        private Long goodsPrice;

        /**
         * 商品goodsSign，支持通过goodsSign查询商品。goodsSign是加密后的goodsId, goodsId已下线，请使用goodsSign来替代。使用说明：https: jinbao.pinduoduo.com/qa-system?questionId=252
         */
        @JsonProperty("goods_sign")
        private String goodsSign;

        /**
         * 商品佣金比例，千分比
         */
        @JsonProperty("rate")
        private Integer rate;

        public Long getCouponDiscount() {
            return couponDiscount;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public Long getGoodsPrice() {
            return goodsPrice;
        }

        public String getGoodsSign() {
            return goodsSign;
        }

        public Integer getRate() {
            return rate;
        }
    }
}