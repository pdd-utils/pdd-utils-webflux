package com.pdd.pop.sdk.http.api.ark.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddCloudGoodsListGetResponse extends PopBaseHttpResponse {

    /**
     * 商品列表响应对象
     */
    @JsonProperty("goods_list_get_response")
    private GoodsListGetResponse goodsListGetResponse;

    public GoodsListGetResponse getGoodsListGetResponse() {
        return goodsListGetResponse;
    }

    public static class GoodsListGetResponse {

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
         * 商品列表对象
         */
        @JsonProperty("goods_list")
        private List<GoodsListGetResponseGoodsListItem> goodsList;

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
         * 返回商品总数
         */
        @JsonProperty("total_count")
        private Integer totalCount;

        public Integer getErrorCode() {
            return errorCode;
        }

        public String getErrorMsg() {
            return errorMsg;
        }

        public List<GoodsListGetResponseGoodsListItem> getGoodsList() {
            return goodsList;
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

    public static class GoodsListGetResponseGoodsListItem {

        /**
         * 商品创建时间的时间戳，指格林威治时间 1970 年01 月 01 日 00 时 00 分 00 秒(北京时间 1970 年 01 月 01 日 08 时 00 分 00 秒)起至商品创建时间的总秒数
         */
        @JsonProperty("created_at")
        private Long createdAt;

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
         * 商品总数量
         */
        @JsonProperty("goods_quantity")
        private Long goodsQuantity;

        /**
         * 商品预扣库存
         */
        @JsonProperty("goods_reserve_quantity")
        private Long goodsReserveQuantity;

        /**
         * 商品图片
         */
        @JsonProperty("image_url")
        private String imageUrl;

        /**
         * 是否多sku，0-单sku，1-多sku
         */
        @JsonProperty("is_more_sku")
        private Integer isMoreSku;

        /**
         * 是否在架上，0-下架中，1-架上
         */
        @JsonProperty("is_onsale")
        private Integer isOnsale;

        /**
         * sku列表对象
         */
        @JsonProperty("sku_list")
        private List<GoodsListGetResponseGoodsListItemSkuListItem> skuList;

        /**
         * 商品缩略图
         */
        @JsonProperty("thumb_url")
        private String thumbUrl;

        public Long getCreatedAt() {
            return createdAt;
        }

        public Long getGoodsId() {
            return goodsId;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public Long getGoodsQuantity() {
            return goodsQuantity;
        }

        public Long getGoodsReserveQuantity() {
            return goodsReserveQuantity;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public Integer getIsMoreSku() {
            return isMoreSku;
        }

        public Integer getIsOnsale() {
            return isOnsale;
        }

        public List<GoodsListGetResponseGoodsListItemSkuListItem> getSkuList() {
            return skuList;
        }

        public String getThumbUrl() {
            return thumbUrl;
        }
    }

    public static class GoodsListGetResponseGoodsListItemSkuListItem {

        /**
         * sku是否在架上，0-下架中，1-架上
         */
        @JsonProperty("is_sku_onsale")
        private Integer isSkuOnsale;

        /**
         * 商家外部编码（商品），同其他接口中的outer_goods_id 、out_goods_id、out_goods_sn、outer_goods_sn 都为商家编码（goods维度）。
         */
        @JsonProperty("outer_goods_id")
        private String outerGoodsId;

        /**
         * 商家外部编码（sku），同其他接口中的outer_id 、out_id、out_sku_sn、outer_sku_sn、out_sku_id、outer_sku_id 都为商家编码（sku维度）。
         */
        @JsonProperty("outer_id")
        private String outerId;

        /**
         * sku预扣库存
         */
        @JsonProperty("reserve_quantity")
        private Long reserveQuantity;

        /**
         * sku编码
         */
        @JsonProperty("sku_id")
        private Long skuId;

        /**
         * sku库存
         */
        @JsonProperty("sku_quantity")
        private Long skuQuantity;

        /**
         * 规格名称
         */
        @JsonProperty("spec")
        private String spec;

        public Integer getIsSkuOnsale() {
            return isSkuOnsale;
        }

        public String getOuterGoodsId() {
            return outerGoodsId;
        }

        public String getOuterId() {
            return outerId;
        }

        public Long getReserveQuantity() {
            return reserveQuantity;
        }

        public Long getSkuId() {
            return skuId;
        }

        public Long getSkuQuantity() {
            return skuQuantity;
        }

        public String getSpec() {
            return spec;
        }
    }
}