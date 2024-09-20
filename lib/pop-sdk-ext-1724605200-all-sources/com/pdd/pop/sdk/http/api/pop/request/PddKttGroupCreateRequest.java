package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKttGroupCreateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddKttGroupCreateRequest extends PopBaseHttpRequest<PddKttGroupCreateResponse> {

    /**
     * 结束时间戳，毫秒级，不能比开始时间早，不能比当前时间早
     */
    @JsonProperty("end_time")
    private Long endTime;

    /**
     * 开团商品列表，不能为空
     */
    @JsonProperty("goods_list")
    private List<GoodsListItem> goodsList;

    /**
     * 是否保存为预览团 0-不为预览团 1-预览团
     */
    @JsonProperty("is_save_preview")
    private Integer isSavePreview;

    /**
     * 分配给isv的编号，用于绑新
     */
    @JsonProperty("isv_no")
    private String isvNo;

    /**
     * 开始时间戳，毫秒级
     */
    @JsonProperty("start_time")
    private Long startTime;

    /**
     * 团购标题，不能为空
     */
    @JsonProperty("title")
    private String title;

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
        return "pdd.ktt.group.create";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKttGroupCreateResponse> getResponseClass() {
        return PddKttGroupCreateResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "end_time", endTime);
        setUserParam(params, "goods_list", goodsList);
        setUserParam(params, "is_save_preview", isSavePreview);
        setUserParam(params, "isv_no", isvNo);
        setUserParam(params, "start_time", startTime);
        setUserParam(params, "title", title);
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public void setGoodsList(List<GoodsListItem> goodsList) {
        this.goodsList = goodsList;
    }

    public void setIsSavePreview(Integer isSavePreview) {
        this.isSavePreview = isSavePreview;
    }

    public void setIsvNo(String isvNo) {
        this.isvNo = isvNo;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static class GoodsListItem {

        /**
         * 分类名
         */
        @JsonProperty("category_name")
        private String categoryName;

        /**
         * 商品描述
         */
        @JsonProperty("goods_desc")
        private String goodsDesc;

        /**
         * 商品名
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * 商品限购数量，不填或填0代表不限购
         */
        @JsonProperty("limit_buy")
        private Integer limitBuy;

        /**
         * 划线价，不填或填0代表无划线价，单位分
         */
        @JsonProperty("market_price")
        private Long marketPrice;

        /**
         * 商品图列表，注意数量不可超过20
         */
        @JsonProperty("pic_url_list")
        private List<String> picUrlList;

        /**
         * sku列表
         */
        @JsonProperty("sku_list")
        private List<GoodsListItemSkuListItem> skuList;

        public void setCategoryName(String categoryName) {
            this.categoryName = categoryName;
        }

        public void setGoodsDesc(String goodsDesc) {
            this.goodsDesc = goodsDesc;
        }

        public void setGoodsName(String goodsName) {
            this.goodsName = goodsName;
        }

        public void setLimitBuy(Integer limitBuy) {
            this.limitBuy = limitBuy;
        }

        public void setMarketPrice(Long marketPrice) {
            this.marketPrice = marketPrice;
        }

        public void setPicUrlList(List<String> picUrlList) {
            this.picUrlList = picUrlList;
        }

        public void setSkuList(List<GoodsListItemSkuListItem> skuList) {
            this.skuList = skuList;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class GoodsListItemSkuListItem {

        /**
         * 外部商品编码，不超过32位
         */
        @JsonProperty("external_sku_id")
        private String externalSkuId;

        /**
         * sku价格，单位分
         */
        @JsonProperty("price_in_fen")
        private Long priceInFen;

        /**
         * 库存类型，0-普通 1-无限，无限库存时会无视total_quantity字段
         */
        @JsonProperty("quantity_type")
        private Integer quantityType;

        /**
         * 规格id列表，无规格为空list，如果想规格为红色,M，调用生成规格的id，红色为1，M为3，则应传入[1,3]
         */
        @JsonProperty("spec_id_list")
        private List<Long> specIdList;

        /**
         * sku图url，注意sku图格式必须是jpg、jpeg、png中的一个，且尺寸不得大于12001200，大小不大于1MB，可以不填
         */
        @JsonProperty("thumb_url")
        private String thumbUrl;

        /**
         * 总库存，最大100w
         */
        @JsonProperty("total_quantity")
        private Long totalQuantity;

        public void setExternalSkuId(String externalSkuId) {
            this.externalSkuId = externalSkuId;
        }

        public void setPriceInFen(Long priceInFen) {
            this.priceInFen = priceInFen;
        }

        public void setQuantityType(Integer quantityType) {
            this.quantityType = quantityType;
        }

        public void setSpecIdList(List<Long> specIdList) {
            this.specIdList = specIdList;
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
}