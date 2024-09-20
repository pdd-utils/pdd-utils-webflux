package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddFdsOrderGetResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("pdd_fds_order_get_response")
    private InnerPddFdsOrderGetResponse pddFdsOrderGetResponse;

    public InnerPddFdsOrderGetResponse getPddFdsOrderGetResponse() {
        return pddFdsOrderGetResponse;
    }

    public static class InnerPddFdsOrderGetResponse {

        /**
         * 分配时间,毫秒
         */
        @JsonProperty("allow_time")
        private Long allowTime;

        /**
         * 市
         */
        @JsonProperty("city")
        private String city;

        /**
         * 区
         */
        @JsonProperty("district")
        private String district;

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
         * 规格
         */
        @JsonProperty("goods_spec")
        private String goodsSpec;

        /**
         * 代打店铺id
         */
        @JsonProperty("mall_mask_id")
        private String mallMaskId;

        /**
         * 代打店铺自定义名称
         */
        @JsonProperty("mall_mask_name")
        private String mallMaskName;

        /**
         * 代打订单号
         */
        @JsonProperty("order_mask_sn")
        private String orderMaskSn;

        /**
         * 商家设置的sku编码
         */
        @JsonProperty("out_sku_sn")
        private String outSkuSn;

        /**
         * 结算价格，单位：分
         */
        @JsonProperty("product_price")
        private Integer productPrice;

        /**
         * 货号
         */
        @JsonProperty("product_sn")
        private String productSn;

        /**
         * 省
         */
        @JsonProperty("province")
        private String province;

        /**
         * 收件人姓名+电话+地址相同,receiver_id字段相同，该功能上线前字段为""
         */
        @JsonProperty("receiver_id")
        private String receiverId;

        /**
         * 卖家备注
         */
        @JsonProperty("remark")
        private String remark;

        /**
         * 运单回传状态 0：未回传 1：已回传
         */
        @JsonProperty("return_status")
        private Integer returnStatus;

        /**
         * 加价发顺丰0：不是 1：是
         */
        @JsonProperty("sf_only")
        private Integer sfOnly;

        /**
         * 分配状态 0：取消分配 1：已分配
         */
        @JsonProperty("status")
        private Integer status;

        /**
         * 售后状态 0:初始化;1:待商家处理;2:待分配;3:待客服处理;4:退款中;5:退款成功;6:已撤销;7:客服驳回;9:商家拒绝，待用户处理;10:已同意退货退款;11:待商家处理;12:售后单失败;14:换货补寄待商家处理;15:换货补寄待用户处理;16:换货补寄成功;17:换货补寄失败;18:换货补寄待用户确认完成;21:待商家同意维修;22:待用户确认发货;24:维修关闭;25:维修成功;27:待用户确认收货;31:已同意拒收退款，待用户拒收;32:补寄待商家发货;
         */
        @JsonProperty("after_sales_status")
        private Integer afterSalesStatus;

        public Long getAllowTime() {
            return allowTime;
        }

        public String getCity() {
            return city;
        }

        public String getDistrict() {
            return district;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public Integer getGoodsNumber() {
            return goodsNumber;
        }

        public String getGoodsSpec() {
            return goodsSpec;
        }

        public String getMallMaskId() {
            return mallMaskId;
        }

        public String getMallMaskName() {
            return mallMaskName;
        }

        public String getOrderMaskSn() {
            return orderMaskSn;
        }

        public String getOutSkuSn() {
            return outSkuSn;
        }

        public Integer getProductPrice() {
            return productPrice;
        }

        public String getProductSn() {
            return productSn;
        }

        public String getProvince() {
            return province;
        }

        public String getReceiverId() {
            return receiverId;
        }

        public String getRemark() {
            return remark;
        }

        public Integer getReturnStatus() {
            return returnStatus;
        }

        public Integer getSfOnly() {
            return sfOnly;
        }

        public Integer getStatus() {
            return status;
        }

        public Integer getAfterSalesStatus() {
            return afterSalesStatus;
        }
    }
}