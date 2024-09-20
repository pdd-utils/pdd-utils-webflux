package com.pdd.pop.sdk.http.api.ark.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddCloudRefundListIncrementGetResponse extends PopBaseHttpResponse {

    /**
     * 售后增量订单列表对象
     */
    @JsonProperty("refund_increment_get_response")
    private RefundIncrementGetResponse refundIncrementGetResponse;

    public RefundIncrementGetResponse getRefundIncrementGetResponse() {
        return refundIncrementGetResponse;
    }

    public static class RefundIncrementGetResponse {

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
         * 售后列表对象
         */
        @JsonProperty("refund_list")
        private List<RefundIncrementGetResponseRefundListItem> refundList;

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
         * 返回的售后订单列表总数
         */
        @JsonProperty("total_count")
        private Integer totalCount;

        public Integer getErrorCode() {
            return errorCode;
        }

        public String getErrorMsg() {
            return errorMsg;
        }

        public List<RefundIncrementGetResponseRefundListItem> getRefundList() {
            return refundList;
        }

        public Integer getSubCode() {
            return subCode;
        }

        public String getSubMsg() {
            return subMsg;
        }

        public Integer getTotalCount() {
            return totalCount;
        }
    }

    public static class RefundIncrementGetResponseRefundListItem {

        /**
         * 售后原因
         */
        @JsonProperty("after_sale_reason")
        private String afterSaleReason;

        /**
         * 售后状态 0：无售后 2：买家申请退款，待商家处理 3：退货退款，待商家处理 4：商家同意退款，退款中 5：平台同意退款，退款中 6：驳回退款，待买家处理 7：已同意退货退款,待用户发货 8：平台处理中 9：平台拒绝退款，退款关闭 10：退款成功 11：买家撤销 12：买家逾期未处理，退款失败 13：买家逾期，超过有效期 14：换货补寄待商家处理 15：换货补寄待用户处理 16：换货补寄成功 17：换货补寄失败 18：换货补寄待用户确认完成 21：待商家同意维修 22：待用户确认发货 24：维修关闭 25：维修成功 27：待用户确认收货 31：已同意拒收退款，待用户拒收 32：补寄待商家发货
         */
        @JsonProperty("after_sales_status")
        private Integer afterSalesStatus;

        /**
         * 售后类型
         */
        @JsonProperty("after_sales_type")
        private Integer afterSalesType;

        /**
         * 成团时间
         */
        @JsonProperty("confirm_time")
        private String confirmTime;

        /**
         * 创建时间
         */
        @JsonProperty("created_time")
        private String createdTime;

        /**
         * 订单折扣金额（元）
         */
        @JsonProperty("discount_amount")
        private String discountAmount;

        /**
         * 1纠纷退款 0非纠纷退款
         */
        @JsonProperty("dispute_refund_status")
        private Integer disputeRefundStatus;

        /**
         * 商品图片
         */
        @JsonProperty("good_image")
        private String goodImage;

        /**
         * 商品编码
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
        private String goodsNumber;

        /**
         * 商品单价
         */
        @JsonProperty("goods_price")
        private String goodsPrice;

        /**
         * 售后编号
         */
        @JsonProperty("id")
        private Long id;

        /**
         * 订单金额（元）
         */
        @JsonProperty("order_amount")
        private String orderAmount;

        /**
         * 订单编号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * 商家外部编码（商品）
         */
        @JsonProperty("outer_goods_id")
        private String outerGoodsId;

        /**
         * 商家外部编码（sku）
         */
        @JsonProperty("outer_id")
        private String outerId;

        /**
         * 退款金额（元）
         */
        @JsonProperty("refund_amount")
        private String refundAmount;

        /**
         * 退货物流公司名称
         */
        @JsonProperty("shipping_name")
        private String shippingName;

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
         * 极速退款状态，"1"：有极速退款资格，"2"：极速退款失败, "3" 表示极速退款成功，其他表示非极速退款
         */
        @JsonProperty("speed_refund_status")
        private String speedRefundStatus;

        /**
         * 快递运单号
         */
        @JsonProperty("tracking_number")
        private String trackingNumber;

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

        public String getAfterSaleReason() {
            return afterSaleReason;
        }

        public Integer getAfterSalesStatus() {
            return afterSalesStatus;
        }

        public Integer getAfterSalesType() {
            return afterSalesType;
        }

        public String getConfirmTime() {
            return confirmTime;
        }

        public String getCreatedTime() {
            return createdTime;
        }

        public String getDiscountAmount() {
            return discountAmount;
        }

        public Integer getDisputeRefundStatus() {
            return disputeRefundStatus;
        }

        public String getGoodImage() {
            return goodImage;
        }

        public Long getGoodsId() {
            return goodsId;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public String getGoodsNumber() {
            return goodsNumber;
        }

        public String getGoodsPrice() {
            return goodsPrice;
        }

        public Long getId() {
            return id;
        }

        public String getOrderAmount() {
            return orderAmount;
        }

        public String getOrderSn() {
            return orderSn;
        }

        public String getOuterGoodsId() {
            return outerGoodsId;
        }

        public String getOuterId() {
            return outerId;
        }

        public String getRefundAmount() {
            return refundAmount;
        }

        public String getShippingName() {
            return shippingName;
        }

        public String getSkuId() {
            return skuId;
        }

        public Integer getSpeedRefundFlag() {
            return speedRefundFlag;
        }

        public String getSpeedRefundStatus() {
            return speedRefundStatus;
        }

        public String getTrackingNumber() {
            return trackingNumber;
        }

        public String getUpdatedTime() {
            return updatedTime;
        }

        public String getUserShippingStatus() {
            return userShippingStatus;
        }
    }
}