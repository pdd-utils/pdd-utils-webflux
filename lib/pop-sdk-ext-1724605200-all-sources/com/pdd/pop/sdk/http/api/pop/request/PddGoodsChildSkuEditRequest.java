package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsChildSkuEditResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddGoodsChildSkuEditRequest extends PopBaseHttpRequest<PddGoodsChildSkuEditResponse> {

    /**
     * 草稿id（未填写则新建一条商品草稿）
     */
    @JsonProperty("goods_commit_id")
    private Long goodsCommitId;

    /**
     * 商品id
     */
    @JsonProperty("goods_id")
    private Long goodsId;

    /**
     * 日历库存型商品sku信息列表
     */
    @JsonProperty("skus")
    private List<SkusItem> skus;

    /**
     * 提交后上下架状态，0=上架；1=保持原样。表示编辑商品并提交后商品的上下架状态，不传时默认为0，上架。
     */
    @JsonProperty("sync_goods_operate")
    private Integer syncGoodsOperate;

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
        return "pdd.goods.child.sku.edit";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsChildSkuEditResponse> getResponseClass() {
        return PddGoodsChildSkuEditResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "goods_commit_id", goodsCommitId);
        setUserParam(params, "goods_id", goodsId);
        setUserParam(params, "skus", skus);
        setUserParam(params, "sync_goods_operate", syncGoodsOperate);
    }

    public void setGoodsCommitId(Long goodsCommitId) {
        this.goodsCommitId = goodsCommitId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public void setSkus(List<SkusItem> skus) {
        this.skus = skus;
    }

    public void setSyncGoodsOperate(Integer syncGoodsOperate) {
        this.syncGoodsOperate = syncGoodsOperate;
    }

    public static class SkusItem {

        /**
         * 日历库存商品子sku信息列表
         */
        @JsonProperty("child_skus")
        private List<SkusItemChildSkusItem> childSkus;

        /**
         * 上架状态。0=已下架，1=已上架。不传表示不做修改
         */
        @JsonProperty("is_onsale")
        private Integer isOnsale;

        /**
         * 与sku_id必填其一，用于确定编辑的sku，当有多个sku的out_sku_sn一样时会编辑失败。
         */
        @JsonProperty("out_sku_sn")
        private String outSkuSn;

        /**
         * 日历库存商品父skuId
         */
        @JsonProperty("sku_id")
        private Long skuId;

        public void setChildSkus(List<SkusItemChildSkusItem> childSkus) {
            this.childSkus = childSkus;
        }

        public void setIsOnsale(Integer isOnsale) {
            this.isOnsale = isOnsale;
        }

        public void setOutSkuSn(String outSkuSn) {
            this.outSkuSn = outSkuSn;
        }

        public void setSkuId(Long skuId) {
            this.skuId = skuId;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class SkusItemChildSkusItem {

        /**
         * 售卖日期（“yyyy-MM-dd”）
         */
        @JsonProperty("date")
        private String date;

        /**
         * 团购价
         */
        @JsonProperty("group_price")
        private Long groupPrice;

        /**
         * 库存增减
         */
        @JsonProperty("quantity_delta")
        private Long quantityDelta;

        /**
         * 单买价
         */
        @JsonProperty("single_price")
        private Long singlePrice;

        public void setDate(String date) {
            this.date = date;
        }

        public void setGroupPrice(Long groupPrice) {
            this.groupPrice = groupPrice;
        }

        public void setQuantityDelta(Long quantityDelta) {
            this.quantityDelta = quantityDelta;
        }

        public void setSinglePrice(Long singlePrice) {
            this.singlePrice = singlePrice;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}