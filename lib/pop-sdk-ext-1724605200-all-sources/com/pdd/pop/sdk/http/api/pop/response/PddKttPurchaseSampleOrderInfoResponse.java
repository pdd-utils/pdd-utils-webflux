package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddKttPurchaseSampleOrderInfoResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("response")
    private Response response;

    public Response getResponse() {
        return response;
    }

    public static class Response {

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
        private ResponseResult result;

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

        public ResponseResult getResult() {
            return result;
        }

        public Boolean getSuccess() {
            return success;
        }
    }

    public static class ResponseResult {

        /**
         * 下单团长信息
         */
        @JsonProperty("activity_user_info")
        private ResponseResultActivityUserInfo activityUserInfo;

        /**
         * 收货信息
         */
        @JsonProperty("address_info")
        private ResponseResultAddressInfo addressInfo;

        /**
         * 售后信息
         */
        @JsonProperty("after_sale_info")
        private ResponseResultAfterSaleInfo afterSaleInfo;

        /**
         * 是否可以申请退款
         */
        @JsonProperty("can_apply_refund")
        private Boolean canApplyRefund;

        /**
         * 是否有售后
         */
        @JsonProperty("has_after_sales")
        private Boolean hasAfterSales;

        /**
         * 子项列表
         */
        @JsonProperty("order_item_list")
        private List<ResponseResultOrderItemListItem> orderItemList;

        /**
         * 订单号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * 订单状态 0-待支付 1-支付中 2-已支付 3-已发货 4-已取消
         */
        @JsonProperty("order_status")
        private Integer orderStatus;

        /**
         * 支付时间
         */
        @JsonProperty("pay_at")
        private String payAt;

        /**
         * 备注
         */
        @JsonProperty("remark")
        private String remark;

        /**
         * 发货状态 0-未发货 1-已发货
         */
        @JsonProperty("shipping_status")
        private Integer shippingStatus;

        /**
         * 总商品金额
         */
        @JsonProperty("total_goods_amount")
        private Long totalGoodsAmount;

        /**
         * 总商品数量
         */
        @JsonProperty("total_goods_number")
        private Integer totalGoodsNumber;

        /**
         * 总订单金额
         */
        @JsonProperty("total_order_amount")
        private Long totalOrderAmount;

        /**
         * 物流信息
         */
        @JsonProperty("trace_info_list")
        private List<ResponseResultTraceInfoListItem> traceInfoList;

        /**
         * 创建时间
         */
        @JsonProperty("created_at")
        private Long createdAt;

        /**
         * 更新时间
         */
        @JsonProperty("updated_at")
        private Long updatedAt;

        public ResponseResultActivityUserInfo getActivityUserInfo() {
            return activityUserInfo;
        }

        public ResponseResultAddressInfo getAddressInfo() {
            return addressInfo;
        }

        public ResponseResultAfterSaleInfo getAfterSaleInfo() {
            return afterSaleInfo;
        }

        public Boolean getCanApplyRefund() {
            return canApplyRefund;
        }

        public Boolean getHasAfterSales() {
            return hasAfterSales;
        }

        public List<ResponseResultOrderItemListItem> getOrderItemList() {
            return orderItemList;
        }

        public String getOrderSn() {
            return orderSn;
        }

        public Integer getOrderStatus() {
            return orderStatus;
        }

        public String getPayAt() {
            return payAt;
        }

        public String getRemark() {
            return remark;
        }

        public Integer getShippingStatus() {
            return shippingStatus;
        }

        public Long getTotalGoodsAmount() {
            return totalGoodsAmount;
        }

        public Integer getTotalGoodsNumber() {
            return totalGoodsNumber;
        }

        public Long getTotalOrderAmount() {
            return totalOrderAmount;
        }

        public List<ResponseResultTraceInfoListItem> getTraceInfoList() {
            return traceInfoList;
        }

        public Long getCreatedAt() {
            return createdAt;
        }

        public Long getUpdatedAt() {
            return updatedAt;
        }
    }

    public static class ResponseResultActivityUserInfo {

        /**
         * 下单团长头像
         */
        @JsonProperty("avatar")
        private String avatar;

        /**
         * 下单团长昵称
         */
        @JsonProperty("nick_name")
        private String nickName;

        /**
         * 下单团长备注
         */
        @JsonProperty("remark")
        private String remark;

        public String getAvatar() {
            return avatar;
        }

        public String getNickName() {
            return nickName;
        }

        public String getRemark() {
            return remark;
        }
    }

    public static class ResponseResultAddressInfo {

        /**
         * 收货地址（市）
         */
        @JsonProperty("city_name")
        private String cityName;

        /**
         * 收货地址（区）
         */
        @JsonProperty("district_name")
        private String districtName;

        /**
         * 收件人电话
         */
        @JsonProperty("mobile")
        private String mobile;

        /**
         * 收货地址（省）
         */
        @JsonProperty("province_name")
        private String provinceName;

        /**
         * 收货人姓名
         */
        @JsonProperty("receive_name")
        private String receiveName;

        /**
         * 收件人地址
         */
        @JsonProperty("shipping_address")
        private String shippingAddress;

        public String getCityName() {
            return cityName;
        }

        public String getDistrictName() {
            return districtName;
        }

        public String getMobile() {
            return mobile;
        }

        public String getProvinceName() {
            return provinceName;
        }

        public String getReceiveName() {
            return receiveName;
        }

        public String getShippingAddress() {
            return shippingAddress;
        }
    }

    public static class ResponseResultAfterSaleInfo {

        /**
         * 是否已全部取消
         */
        @JsonProperty("is_all_canceled")
        private Boolean isAllCanceled;

        /**
         * 是否已全额退款
         */
        @JsonProperty("is_all_refund")
        private Boolean isAllRefund;

        /**
         * 最新的退款成功时间
         */
        @JsonProperty("latest_refund_success_at")
        private String latestRefundSuccessAt;

        /**
         * 最新的售后状态
         */
        @JsonProperty("latest_status")
        private Integer latestStatus;

        /**
         * 拍样订单号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * 退款金额汇总（已退款+退款中）
         */
        @JsonProperty("refund_amount")
        private Long refundAmount;

        /**
         * 商品退款金额汇总
         */
        @JsonProperty("refund_goods_amount")
        private Long refundGoodsAmount;

        /**
         * 运费退款金额汇总
         */
        @JsonProperty("refund_shipping_amount")
        private Long refundShippingAmount;

        /**
         * 退款中金额汇总
         */
        @JsonProperty("refunding_amount")
        private Long refundingAmount;

        /**
         * 取消件数汇总
         */
        @JsonProperty("supplier_cancel_number")
        private Integer supplierCancelNumber;

        public Boolean getIsAllCanceled() {
            return isAllCanceled;
        }

        public Boolean getIsAllRefund() {
            return isAllRefund;
        }

        public String getLatestRefundSuccessAt() {
            return latestRefundSuccessAt;
        }

        public Integer getLatestStatus() {
            return latestStatus;
        }

        public String getOrderSn() {
            return orderSn;
        }

        public Long getRefundAmount() {
            return refundAmount;
        }

        public Long getRefundGoodsAmount() {
            return refundGoodsAmount;
        }

        public Long getRefundShippingAmount() {
            return refundShippingAmount;
        }

        public Long getRefundingAmount() {
            return refundingAmount;
        }

        public Integer getSupplierCancelNumber() {
            return supplierCancelNumber;
        }
    }

    public static class ResponseResultOrderItemListItem {

        /**
         * 商品金额
         */
        @JsonProperty("goods_amount")
        private Long goodsAmount;

        /**
         * 商品ID
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 商品名
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * 购买数量
         */
        @JsonProperty("goods_number")
        private Integer goodsNumber;

        /**
         * 商品下单单价
         */
        @JsonProperty("goods_price")
        private Long goodsPrice;

        /**
         * 商品主图
         */
        @JsonProperty("goods_thumb_url")
        private String goodsThumbUrl;

        /**
         * skuId
         */
        @JsonProperty("sku_id")
        private Long skuId;

        /**
         * 规格列表
         */
        @JsonProperty("spec_list")
        private List<ResponseResultOrderItemListItemSpecListItem> specList;

        public Long getGoodsAmount() {
            return goodsAmount;
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

        public String getGoodsThumbUrl() {
            return goodsThumbUrl;
        }

        public Long getSkuId() {
            return skuId;
        }

        public List<ResponseResultOrderItemListItemSpecListItem> getSpecList() {
            return specList;
        }
    }

    public static class ResponseResultOrderItemListItemSpecListItem {

        /**
         * 规格名，如红色
         */
        @JsonProperty("name")
        private String name;

        /**
         * 父规格名，如颜色
         */
        @JsonProperty("parent_name")
        private String parentName;

        public String getName() {
            return name;
        }

        public String getParentName() {
            return parentName;
        }
    }

    public static class ResponseResultTraceInfoListItem {

        /**
         * 物流公司名称
         */
        @JsonProperty("shipping_company")
        private String shippingCompany;

        /**
         * 物流单号
         */
        @JsonProperty("track_no")
        private String trackNo;

        public String getShippingCompany() {
            return shippingCompany;
        }

        public String getTrackNo() {
            return trackNo;
        }
    }
}