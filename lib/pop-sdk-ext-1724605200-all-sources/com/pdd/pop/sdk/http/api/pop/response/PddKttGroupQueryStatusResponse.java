package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddKttGroupQueryStatusResponse extends PopBaseHttpResponse {

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
         * 团号
         */
        @JsonProperty("activity_no")
        private String activityNo;

        /**
         * status为2时有，创建团失败原因
         */
        @JsonProperty("error_msg")
        private String errorMsg;

        /**
         * status为1时有，返回goods_id，sku_id和external_sku_id对应关系
         */
        @JsonProperty("goods_list")
        private List<ResponseGoodsListItem> goodsList;

        /**
         * status为1时有，团小程序二维码图片地址
         */
        @JsonProperty("qr_code_url")
        private String qrCodeUrl;

        /**
         * 创建团结果，1-创建成功，2-创建失败 3-创建中
         */
        @JsonProperty("status")
        private Integer status;

        public String getActivityNo() {
            return activityNo;
        }

        public String getErrorMsg() {
            return errorMsg;
        }

        public List<ResponseGoodsListItem> getGoodsList() {
            return goodsList;
        }

        public String getQrCodeUrl() {
            return qrCodeUrl;
        }

        public Integer getStatus() {
            return status;
        }
    }

    public static class ResponseGoodsListItem {

        /**
         * goods id
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 商品名
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * sku列表
         */
        @JsonProperty("sku_list")
        private List<ResponseGoodsListItemSkuListItem> skuList;

        public Long getGoodsId() {
            return goodsId;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public List<ResponseGoodsListItemSkuListItem> getSkuList() {
            return skuList;
        }
    }

    public static class ResponseGoodsListItemSkuListItem {

        /**
         * 外部商品编码
         */
        @JsonProperty("external_sku_id")
        private String externalSkuId;

        /**
         * sku id
         */
        @JsonProperty("sku_id")
        private Long skuId;

        /**
         * 规格id列表，可用于映射sku
         */
        @JsonProperty("spec_id_list")
        private List<Long> specIdList;

        public String getExternalSkuId() {
            return externalSkuId;
        }

        public Long getSkuId() {
            return skuId;
        }

        public List<Long> getSpecIdList() {
            return specIdList;
        }
    }
}