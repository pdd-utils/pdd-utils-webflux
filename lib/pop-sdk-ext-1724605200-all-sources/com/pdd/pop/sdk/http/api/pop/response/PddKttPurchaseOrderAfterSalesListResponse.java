package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddKttPurchaseOrderAfterSalesListResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("ktt_purchase_order_after_sales_list_response")
    private KttPurchaseOrderAfterSalesListResponse kttPurchaseOrderAfterSalesListResponse;

    public KttPurchaseOrderAfterSalesListResponse getKttPurchaseOrderAfterSalesListResponse() {
        return kttPurchaseOrderAfterSalesListResponse;
    }

    public static class KttPurchaseOrderAfterSalesListResponse {

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
        private KttPurchaseOrderAfterSalesListResponseResult result;

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

        public KttPurchaseOrderAfterSalesListResponseResult getResult() {
            return result;
        }

        public Boolean getSuccess() {
            return success;
        }
    }

    public static class KttPurchaseOrderAfterSalesListResponseResult {

        /**
         * 
         */
        @JsonProperty("after_sales_list")
        private List<KttPurchaseOrderAfterSalesListResponseResultAfterSalesListItem> afterSalesList;

        /**
         * 总数
         */
        @JsonProperty("total_count")
        private Integer totalCount;

        public List<KttPurchaseOrderAfterSalesListResponseResultAfterSalesListItem> getAfterSalesList() {
            return afterSalesList;
        }

        public Integer getTotalCount() {
            return totalCount;
        }
    }

    public static class KttPurchaseOrderAfterSalesListResponseResultAfterSalesListItem {

        /**
         * 售后id
         */
        @JsonProperty("after_sales_biz_sn")
        private String afterSalesBizSn;

        /**
         * 售后状态：1-待供货商处理，2-已退款，3-已同意退款，待入账，4-待团长处理，5-已同意退货，待团长退货，6-团长已退货，待供货商确认收货，7-已撤销，8-已驳回，9-退款失败
         */
        @JsonProperty("after_sales_status")
        private Integer afterSalesStatus;

        /**
         * 售后类型：0-供货商退款，1-团长申请仅退款，2-团长申请退货退款
         */
        @JsonProperty("apply_type")
        private Integer applyType;

        /**
         * 创建时间（毫秒）
         */
        @JsonProperty("created_at")
        private Long createdAt;

        /**
         * 团长提供的凭证图
         */
        @JsonProperty("image_list")
        private List<String> imageList;

        /**
         * 退货物流。若为“退货退款”且团长已经上传退货单号后不为空； 允许存在多对物流公司和单号
         */
        @JsonProperty("logistics_list")
        private List<KttPurchaseOrderAfterSalesListResponseResultAfterSalesListItemLogisticsListItem> logisticsList;

        /**
         * 父单号
         */
        @JsonProperty("parent_order_sn")
        private String parentOrderSn;

        /**
         * 售后原因
         */
        @JsonProperty("reason")
        private String reason;

        /**
         * 总退款金额。若售后单状态为2、3时，为退款金额 否则：为申请金额
         */
        @JsonProperty("refund_amount")
        private Long refundAmount;

        /**
         * 退商品金额。若售后单状态为2、3时，为退款金额 否则：为申请金额
         */
        @JsonProperty("refund_goods_amount")
        private Long refundGoodsAmount;

        /**
         * 退运费金额。若售后单状态为2、3时，为退款金额 否则：为申请金额
         */
        @JsonProperty("refund_shipping_amount")
        private Long refundShippingAmount;

        /**
         * 子单售后明细
         */
        @JsonProperty("sub_item_list")
        private List<KttPurchaseOrderAfterSalesListResponseResultAfterSalesListItemSubItemListItem> subItemList;

        /**
         * 供货商说明
         */
        @JsonProperty("supplier_description")
        private String supplierDescription;

        /**
         * 团长描述
         */
        @JsonProperty("supply_description")
        private String supplyDescription;

        /**
         * 更新时间（毫秒）
         */
        @JsonProperty("updated_at")
        private Long updatedAt;

        public String getAfterSalesBizSn() {
            return afterSalesBizSn;
        }

        public Integer getAfterSalesStatus() {
            return afterSalesStatus;
        }

        public Integer getApplyType() {
            return applyType;
        }

        public Long getCreatedAt() {
            return createdAt;
        }

        public List<String> getImageList() {
            return imageList;
        }

        public List<KttPurchaseOrderAfterSalesListResponseResultAfterSalesListItemLogisticsListItem> getLogisticsList() {
            return logisticsList;
        }

        public String getParentOrderSn() {
            return parentOrderSn;
        }

        public String getReason() {
            return reason;
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

        public List<KttPurchaseOrderAfterSalesListResponseResultAfterSalesListItemSubItemListItem> getSubItemList() {
            return subItemList;
        }

        public String getSupplierDescription() {
            return supplierDescription;
        }

        public String getSupplyDescription() {
            return supplyDescription;
        }

        public Long getUpdatedAt() {
            return updatedAt;
        }
    }

    public static class KttPurchaseOrderAfterSalesListResponseResultAfterSalesListItemLogisticsListItem {

        /**
         * 物流公司名
         */
        @JsonProperty("ship_name")
        private String shipName;

        /**
         * 物流单号
         */
        @JsonProperty("track_no")
        private String trackNo;

        public String getShipName() {
            return shipName;
        }

        public String getTrackNo() {
            return trackNo;
        }
    }

    public static class KttPurchaseOrderAfterSalesListResponseResultAfterSalesListItemSubItemListItem {

        /**
         * 子单取消件数
         */
        @JsonProperty("cancel_number")
        private Integer cancelNumber;

        /**
         * 子单单号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * 子单退款金额。若售后单状态为2、3时，为退款金额 否则：为申请金额
         */
        @JsonProperty("refund_goods_amount")
        private Long refundGoodsAmount;

        public Integer getCancelNumber() {
            return cancelNumber;
        }

        public String getOrderSn() {
            return orderSn;
        }

        public Long getRefundGoodsAmount() {
            return refundGoodsAmount;
        }
    }
}