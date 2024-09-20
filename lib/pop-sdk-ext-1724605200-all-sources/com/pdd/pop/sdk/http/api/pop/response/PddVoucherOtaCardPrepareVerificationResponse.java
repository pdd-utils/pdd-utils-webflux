package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddVoucherOtaCardPrepareVerificationResponse extends PopBaseHttpResponse {

    /**
     * 响应体
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
        @JsonProperty("errorCode")
        private Integer errorCode;

        /**
         * 
         */
        @JsonProperty("errorMsg")
        private String errorMsg;

        /**
         * 卡密和订单信息
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
         * 卡券信息
         */
        @JsonProperty("card_vo")
        private ResponseResultCardVo cardVo;

        /**
         * 商品信息
         */
        @JsonProperty("order_goods_vo")
        private ResponseResultOrderGoodsVo orderGoodsVo;

        /**
         * 订单信息
         */
        @JsonProperty("order_vo")
        private ResponseResultOrderVo orderVo;

        public ResponseResultCardVo getCardVo() {
            return cardVo;
        }

        public ResponseResultOrderGoodsVo getOrderGoodsVo() {
            return orderGoodsVo;
        }

        public ResponseResultOrderVo getOrderVo() {
            return orderVo;
        }
    }

    public static class ResponseResultCardVo {

        /**
         * 卡券有效期结束时间，单位秒
         */
        @JsonProperty("available_end_time")
        private Long availableEndTime;

        /**
         * 卡券有效期开始时间，单位秒
         */
        @JsonProperty("available_start_time")
        private Long availableStartTime;

        /**
         * 打码卡密
         */
        @JsonProperty("mask_card_no")
        private String maskCardNo;

        /**
         * 剩余可用次数
         */
        @JsonProperty("remain_times")
        private Integer remainTimes;

        /**
         * 券状态码。1-未核销，2-已核销， 3-已过期，4-已销毁
         */
        @JsonProperty("status")
        private Integer status;

        /**
         * 状态文案
         */
        @JsonProperty("status_tips")
        private String statusTips;

        /**
         * 总次数
         */
        @JsonProperty("total_times")
        private Integer totalTimes;

        public Long getAvailableEndTime() {
            return availableEndTime;
        }

        public Long getAvailableStartTime() {
            return availableStartTime;
        }

        public String getMaskCardNo() {
            return maskCardNo;
        }

        public Integer getRemainTimes() {
            return remainTimes;
        }

        public Integer getStatus() {
            return status;
        }

        public String getStatusTips() {
            return statusTips;
        }

        public Integer getTotalTimes() {
            return totalTimes;
        }
    }

    public static class ResponseResultOrderGoodsVo {

        /**
         * 商品标题
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * 购买商品数
         */
        @JsonProperty("goods_number")
        private Integer goodsNumber;

        /**
         * 外部商品编码
         */
        @JsonProperty("out_goods_sn")
        private String outGoodsSn;

        /**
         * 外部sku编码
         */
        @JsonProperty("out_sku_sn")
        private String outSkuSn;

        /**
         * 规格
         */
        @JsonProperty("spec")
        private String spec;

        public String getGoodsName() {
            return goodsName;
        }

        public Integer getGoodsNumber() {
            return goodsNumber;
        }

        public String getOutGoodsSn() {
            return outGoodsSn;
        }

        public String getOutSkuSn() {
            return outSkuSn;
        }

        public String getSpec() {
            return spec;
        }
    }

    public static class ResponseResultOrderVo {

        /**
         * 用户实付金额
         */
        @JsonProperty("order_amount_fen")
        private Long orderAmountFen;

        /**
         * 订单编号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        public Long getOrderAmountFen() {
            return orderAmountFen;
        }

        public String getOrderSn() {
            return orderSn;
        }
    }
}