package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsSkuPriceUpdateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddGoodsSkuPriceUpdateRequest extends PopBaseHttpRequest<PddGoodsSkuPriceUpdateResponse> {

    /**
     * 商品id
     */
    @JsonProperty("goods_id")
    private Long goodsId;

    /**
     * 是否获取商品发布警告信息，默认为忽略
     */
    @JsonProperty("ignore_edit_warn")
    private Boolean ignoreEditWarn;

    /**
     * 参考价 （单位分）
     */
    @JsonProperty("market_price")
    private Long marketPrice;

    /**
     * 参考价 （单位元）
     */
    @JsonProperty("market_price_in_yuan")
    private String marketPriceInYuan;

    /**
     * 待修改的sku价格
     */
    @JsonProperty("sku_price_list")
    private List<SkuPriceListItem> skuPriceList;

    /**
     * 提交后上架状态，0:上架,1:保持原样
     */
    @JsonProperty("sync_goods_operate")
    private Integer syncGoodsOperate;

    /**
     * 满2件折扣，可选范围0-100, 0表示取消，95表示95折，设置需先查询规则接口获取实际可填范围
     */
    @JsonProperty("two_pieces_discount")
    private Integer twoPiecesDiscount;

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
        return "pdd.goods.sku.price.update";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsSkuPriceUpdateResponse> getResponseClass() {
        return PddGoodsSkuPriceUpdateResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "goods_id", goodsId);
        setUserParam(params, "ignore_edit_warn", ignoreEditWarn);
        setUserParam(params, "market_price", marketPrice);
        setUserParam(params, "market_price_in_yuan", marketPriceInYuan);
        setUserParam(params, "sku_price_list", skuPriceList);
        setUserParam(params, "sync_goods_operate", syncGoodsOperate);
        setUserParam(params, "two_pieces_discount", twoPiecesDiscount);
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public void setIgnoreEditWarn(Boolean ignoreEditWarn) {
        this.ignoreEditWarn = ignoreEditWarn;
    }

    public void setMarketPrice(Long marketPrice) {
        this.marketPrice = marketPrice;
    }

    public void setMarketPriceInYuan(String marketPriceInYuan) {
        this.marketPriceInYuan = marketPriceInYuan;
    }

    public void setSkuPriceList(List<SkuPriceListItem> skuPriceList) {
        this.skuPriceList = skuPriceList;
    }

    public void setSyncGoodsOperate(Integer syncGoodsOperate) {
        this.syncGoodsOperate = syncGoodsOperate;
    }

    public void setTwoPiecesDiscount(Integer twoPiecesDiscount) {
        this.twoPiecesDiscount = twoPiecesDiscount;
    }

    public static class SkuPriceListItem {

        /**
         * 拼团购买价格（单位分）
         */
        @JsonProperty("group_price")
        private Long groupPrice;

        /**
         * sku上架状态，0-已下架，1-上架中
         */
        @JsonProperty("is_onsale")
        private Integer isOnsale;

        /**
         * 单独购买价格（单位分）
         */
        @JsonProperty("single_price")
        private Long singlePrice;

        /**
         * sku标识
         */
        @JsonProperty("sku_id")
        private Long skuId;

        public void setGroupPrice(Long groupPrice) {
            this.groupPrice = groupPrice;
        }

        public void setIsOnsale(Integer isOnsale) {
            this.isOnsale = isOnsale;
        }

        public void setSinglePrice(Long singlePrice) {
            this.singlePrice = singlePrice;
        }

        public void setSkuId(Long skuId) {
            this.skuId = skuId;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}