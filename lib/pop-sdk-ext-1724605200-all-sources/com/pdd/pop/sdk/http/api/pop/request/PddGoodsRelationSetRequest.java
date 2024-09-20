package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsRelationSetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddGoodsRelationSetRequest extends PopBaseHttpRequest<PddGoodsRelationSetResponse> {

    /**
     * 拼多多商品id
     */
    @JsonProperty("goods_id")
    private Long goodsId;

    /**
     * 月销量
     */
    @JsonProperty("month_sales")
    private Long monthSales;

    /**
     * 外部平台商品url
     */
    @JsonProperty("out_detail_url")
    private String outDetailUrl;

    /**
     * 外部平台商品id
     */
    @JsonProperty("out_goods_id")
    private String outGoodsId;

    /**
     * 外部平台商品最高价，单位：分
     */
    @JsonProperty("out_high_goods_price")
    private Long outHighGoodsPrice;

    /**
     * 外部平台商品最低价，单位：分
     */
    @JsonProperty("out_low_goods_price")
    private Long outLowGoodsPrice;

    /**
     * 外部平台店铺id
     */
    @JsonProperty("out_mall_id")
    private Long outMallId;

    /**
     * 邮费
     */
    @JsonProperty("postage")
    private Long postage;

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
        return "pdd.goods.relation.set";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsRelationSetResponse> getResponseClass() {
        return PddGoodsRelationSetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "goods_id", goodsId);
        setUserParam(params, "month_sales", monthSales);
        setUserParam(params, "out_detail_url", outDetailUrl);
        setUserParam(params, "out_goods_id", outGoodsId);
        setUserParam(params, "out_high_goods_price", outHighGoodsPrice);
        setUserParam(params, "out_low_goods_price", outLowGoodsPrice);
        setUserParam(params, "out_mall_id", outMallId);
        setUserParam(params, "postage", postage);
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public void setMonthSales(Long monthSales) {
        this.monthSales = monthSales;
    }

    public void setOutDetailUrl(String outDetailUrl) {
        this.outDetailUrl = outDetailUrl;
    }

    public void setOutGoodsId(String outGoodsId) {
        this.outGoodsId = outGoodsId;
    }

    public void setOutHighGoodsPrice(Long outHighGoodsPrice) {
        this.outHighGoodsPrice = outHighGoodsPrice;
    }

    public void setOutLowGoodsPrice(Long outLowGoodsPrice) {
        this.outLowGoodsPrice = outLowGoodsPrice;
    }

    public void setOutMallId(Long outMallId) {
        this.outMallId = outMallId;
    }

    public void setPostage(Long postage) {
        this.postage = postage;
    }
}