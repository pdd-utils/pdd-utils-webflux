package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddKttOrderRefundGetResponse extends PopBaseHttpResponse {

    /**
     * 返回值
     */
    @JsonProperty("ktt_refund_get_response")
    private KttRefundGetResponse kttRefundGetResponse;

    public KttRefundGetResponse getKttRefundGetResponse() {
        return kttRefundGetResponse;
    }

    public static class KttRefundGetResponse {

        /**
         * 是否有下一页
         */
        @JsonProperty("has_next")
        private Boolean hasNext;

        /**
         * 售后单列表
         */
        @JsonProperty("list")
        private List<KttRefundGetResponseListItem> list;

        public Boolean getHasNext() {
            return hasNext;
        }

        public List<KttRefundGetResponseListItem> getList() {
            return list;
        }
    }

    public static class KttRefundGetResponseListItem {

        /**
         * 售后单编号
         */
        @JsonProperty("after_sales_biz_sn")
        private String afterSalesBizSn;

        /**
         * 售后单状态 0-未发起售后 1-退款中 2-退款成功 3-待处理 4-拒绝退款 6-待(顾客)退货 7-待(团长)确认退货 8-(顾客)撤销 9-(系统)关闭
         */
        @JsonProperty("after_sales_status")
        private Integer afterSalesStatus;

        /**
         * 售后单用户申请信息
         */
        @JsonProperty("apply_extension")
        private KttRefundGetResponseListItemApplyExtension applyExtension;

        /**
         * 售后单类型 0-仅退款 1-退货退款
         */
        @JsonProperty("apply_type")
        private Integer applyType;

        /**
         * 售后单创建时间
         */
        @JsonProperty("created_at")
        private String createdAt;

        /**
         * 父单号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * 售后单退货信息
         */
        @JsonProperty("return_goods_extension")
        private KttRefundGetResponseListItemReturnGoodsExtension returnGoodsExtension;

        /**
         * 售后单更新时间
         */
        @JsonProperty("updated_at")
        private String updatedAt;

        public String getAfterSalesBizSn() {
            return afterSalesBizSn;
        }

        public Integer getAfterSalesStatus() {
            return afterSalesStatus;
        }

        public KttRefundGetResponseListItemApplyExtension getApplyExtension() {
            return applyExtension;
        }

        public Integer getApplyType() {
            return applyType;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public String getOrderSn() {
            return orderSn;
        }

        public KttRefundGetResponseListItemReturnGoodsExtension getReturnGoodsExtension() {
            return returnGoodsExtension;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }
    }

    public static class KttRefundGetResponseListItemApplyExtension {

        /**
         * 用户申请说明
         */
        @JsonProperty("description")
        private String description;

        /**
         * 用户申请的凭证图片
         */
        @JsonProperty("image_list")
        private List<String> imageList;

        /**
         * 用户申请原因
         */
        @JsonProperty("reason")
        private String reason;

        /**
         * 用户申请退款总金额
         */
        @JsonProperty("refund_amount")
        private Integer refundAmount;

        /**
         * 用户申请退运费金额
         */
        @JsonProperty("refund_shipping_amount")
        private Integer refundShippingAmount;

        /**
         * 申请售后的子单信息列表
         */
        @JsonProperty("sub_extensions")
        private List<KttRefundGetResponseListItemApplyExtensionSubExtensionsItem> subExtensions;

        public String getDescription() {
            return description;
        }

        public List<String> getImageList() {
            return imageList;
        }

        public String getReason() {
            return reason;
        }

        public Integer getRefundAmount() {
            return refundAmount;
        }

        public Integer getRefundShippingAmount() {
            return refundShippingAmount;
        }

        public List<KttRefundGetResponseListItemApplyExtensionSubExtensionsItem> getSubExtensions() {
            return subExtensions;
        }
    }

    public static class KttRefundGetResponseListItemApplyExtensionSubExtensionsItem {

        /**
         * 申请售后的子单商品金额
         */
        @JsonProperty("refund_amount")
        private Integer refundAmount;

        /**
         * 申请售后的子单号
         */
        @JsonProperty("sub_order_sn")
        private String subOrderSn;

        public Integer getRefundAmount() {
            return refundAmount;
        }

        public String getSubOrderSn() {
            return subOrderSn;
        }
    }

    public static class KttRefundGetResponseListItemReturnGoodsExtension {

        /**
         * 退货物流列表
         */
        @JsonProperty("logistics_list")
        private List<KttRefundGetResponseListItemReturnGoodsExtensionLogisticsListItem> logisticsList;

        public List<KttRefundGetResponseListItemReturnGoodsExtensionLogisticsListItem> getLogisticsList() {
            return logisticsList;
        }
    }

    public static class KttRefundGetResponseListItemReturnGoodsExtensionLogisticsListItem {

        /**
         * 物流公司
         */
        @JsonProperty("company")
        private String company;

        /**
         * 退货物流单号
         */
        @JsonProperty("track_no")
        private String trackNo;

        public String getCompany() {
            return company;
        }

        public String getTrackNo() {
            return trackNo;
        }
    }
}