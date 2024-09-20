package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKttPurchaseGoodsCreateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddKttPurchaseGoodsCreateRequest extends PopBaseHttpRequest<PddKttPurchaseGoodsCreateResponse> {

    /**
     * 入参请求
     */
    @JsonProperty("request")
    private Request request;

    @Override
    public String getVersion() {
        return "V1";
    }

    @Override
    public String getDataType() {
        return "JSON";
    }

    @Override
    public Integer getPlatform() {
        return 0;
    }

    @Override
    public String getType() {
        return "pdd.ktt.purchase.goods.create";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKttPurchaseGoodsCreateResponse> getResponseClass() {
        return PddKttPurchaseGoodsCreateResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "request", request);
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public static class Request {

        /**
         * 商品创建信息
         */
        @JsonProperty("goods_create_info")
        private RequestGoodsCreateInfo goodsCreateInfo;

        public void setGoodsCreateInfo(RequestGoodsCreateInfo goodsCreateInfo) {
            this.goodsCreateInfo = goodsCreateInfo;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class RequestGoodsCreateInfo {

        /**
         * 类目ID
         */
        @JsonProperty("cat_id")
        private Integer catId;

        /**
         * 商品图片，最多9张
         */
        @JsonProperty("detail_gallery")
        private List<String> detailGallery;

        /**
         * 商品描述，不能超过2000字
         */
        @JsonProperty("goods_desc")
        private String goodsDesc;

        /**
         * 商品名称，不能超过100字
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * 商品属性列表
         */
        @JsonProperty("goods_property_info")
        private List<RequestGoodsCreateInfoGoodsPropertyInfoItem> goodsPropertyInfo;

        /**
         * 关联品牌Sn
         */
        @JsonProperty("relate_brand_sn")
        private String relateBrandSn;

        /**
         * sku列表
         */
        @JsonProperty("sku_list")
        private List<RequestGoodsCreateInfoSkuListItem> skuList;

        /**
         * 视频列表，最多1个
         */
        @JsonProperty("video_urls")
        private List<String> videoUrls;

        public void setCatId(Integer catId) {
            this.catId = catId;
        }

        public void setDetailGallery(List<String> detailGallery) {
            this.detailGallery = detailGallery;
        }

        public void setGoodsDesc(String goodsDesc) {
            this.goodsDesc = goodsDesc;
        }

        public void setGoodsName(String goodsName) {
            this.goodsName = goodsName;
        }

        public void setGoodsPropertyInfo(List<RequestGoodsCreateInfoGoodsPropertyInfoItem> goodsPropertyInfo) {
            this.goodsPropertyInfo = goodsPropertyInfo;
        }

        public void setRelateBrandSn(String relateBrandSn) {
            this.relateBrandSn = relateBrandSn;
        }

        public void setSkuList(List<RequestGoodsCreateInfoSkuListItem> skuList) {
            this.skuList = skuList;
        }

        public void setVideoUrls(List<String> videoUrls) {
            this.videoUrls = videoUrls;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class RequestGoodsCreateInfoGoodsPropertyInfoItem {

        /**
         * 属性名，不能超过10个字
         */
        @JsonProperty("name")
        private String name;

        /**
         * 属性值列表
         */
        @JsonProperty("values")
        private List<String> values;

        public void setName(String name) {
            this.name = name;
        }

        public void setValues(List<String> values) {
            this.values = values;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class RequestGoodsCreateInfoSkuListItem {

        /**
         * sku货号，不能超过30个字
         */
        @JsonProperty("external_sku_id")
        private String externalSkuId;

        /**
         * 团购价（单位：分），范围 1 - 50000000
         */
        @JsonProperty("group_price")
        private Long groupPrice;

        /**
         * 采购价（单位：分），范围 1 - 50000000
         */
        @JsonProperty("price")
        private Long price;

        /**
         * 库存类型  0：普通库存  1：无限库存
         */
        @JsonProperty("quantity_type")
        private Integer quantityType;

        /**
         * 规格列表
         */
        @JsonProperty("spec_list")
        private List<RequestGoodsCreateInfoSkuListItemSpecListItem> specList;

        /**
         * sku图
         */
        @JsonProperty("thumb_url")
        private String thumbUrl;

        /**
         * 总库存，范围 0 - 99999999
         */
        @JsonProperty("total_quantity")
        private Long totalQuantity;

        public void setExternalSkuId(String externalSkuId) {
            this.externalSkuId = externalSkuId;
        }

        public void setGroupPrice(Long groupPrice) {
            this.groupPrice = groupPrice;
        }

        public void setPrice(Long price) {
            this.price = price;
        }

        public void setQuantityType(Integer quantityType) {
            this.quantityType = quantityType;
        }

        public void setSpecList(List<RequestGoodsCreateInfoSkuListItemSpecListItem> specList) {
            this.specList = specList;
        }

        public void setThumbUrl(String thumbUrl) {
            this.thumbUrl = thumbUrl;
        }

        public void setTotalQuantity(Long totalQuantity) {
            this.totalQuantity = totalQuantity;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class RequestGoodsCreateInfoSkuListItemSpecListItem {

        /**
         * 规格名，如红色，最多30个字
         */
        @JsonProperty("name")
        private String name;

        /**
         * 父规格名，如颜色，最多30个字
         */
        @JsonProperty("parent_name")
        private String parentName;

        /**
         * 规格ID
         */
        @JsonProperty("spec_id")
        private Long specId;

        public void setName(String name) {
            this.name = name;
        }

        public void setParentName(String parentName) {
            this.parentName = parentName;
        }

        public void setSpecId(Long specId) {
            this.specId = specId;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}