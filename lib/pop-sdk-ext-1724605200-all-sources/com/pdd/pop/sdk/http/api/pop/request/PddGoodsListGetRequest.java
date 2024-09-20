package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsListGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddGoodsListGetRequest extends PopBaseHttpRequest<PddGoodsListGetResponse> {

    /**
     * 模版id
     */
    @JsonProperty("cost_template_id")
    private Long costTemplateId;

    /**
     * 商品创建时间结束时间的时间戳，指格林威治时间 1970 年 01 月 01 日 00 时 00 分 00 秒(北京时间 1970 年 01 月 01 日 08 时 00 分 00 秒)起至结束时间的总秒数 PS：开始时间结束时间间距不超过7天
     */
    @JsonProperty("created_at_end")
    private Long createdAtEnd;

    /**
     * 商品创建时间开始时间的时间戳，指格林威治时间 1970 年01 月 01 日 00 时 00 分 00 秒(北京时间 1970 年 01 月 01 日 08 时 00 分 00 秒)起至开始时间的总秒数
     */
    @JsonProperty("created_at_from")
    private Long createdAtFrom;

    /**
     * 商品名称模糊查询,outer_id,is_onsale,goods_name三选一，优先级is_onsale>outer_id>goods_name
     */
    @JsonProperty("goods_name")
    private String goodsName;

    /**
     * 上下架状态，0-下架，1-上架,outer_id,is_onsale,goods_name三选一，优先级is_onsale>outer_id>goods_name
     */
    @JsonProperty("is_onsale")
    private Integer isOnsale;

    /**
     * 商家外部商品编码，支持多个，用逗号隔开，最多10个
     */
    @JsonProperty("outer_goods_id")
    private String outerGoodsId;

    /**
     * 商品外部编码（sku），同其他接口中的outer_id 、out_id、out_sku_sn、outer_sku_sn、out_sku_id、outer_sku_id 都为商家编码（sku维度）。outer_id,is_onsale,goods_name三选一，优先级is_onsale>outer_id>goods_name
     */
    @JsonProperty("outer_id")
    private String outerId;

    /**
     * 返回页码 默认 1，页码从 1 开始PS：当前采用分页返回，数量和页数会一起传，如果不传，则采用 默认值
     */
    @JsonProperty("page")
    private Integer page;

    /**
     * 返回数量，默认 100，最大100。
     */
    @JsonProperty("page_size")
    private Integer pageSize;

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
        return "pdd.goods.list.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsListGetResponse> getResponseClass() {
        return PddGoodsListGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "cost_template_id", costTemplateId);
        setUserParam(params, "created_at_end", createdAtEnd);
        setUserParam(params, "created_at_from", createdAtFrom);
        setUserParam(params, "goods_name", goodsName);
        setUserParam(params, "is_onsale", isOnsale);
        setUserParam(params, "outer_goods_id", outerGoodsId);
        setUserParam(params, "outer_id", outerId);
        setUserParam(params, "page", page);
        setUserParam(params, "page_size", pageSize);
    }

    public void setCostTemplateId(Long costTemplateId) {
        this.costTemplateId = costTemplateId;
    }

    public void setCreatedAtEnd(Long createdAtEnd) {
        this.createdAtEnd = createdAtEnd;
    }

    public void setCreatedAtFrom(Long createdAtFrom) {
        this.createdAtFrom = createdAtFrom;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public void setIsOnsale(Integer isOnsale) {
        this.isOnsale = isOnsale;
    }

    public void setOuterGoodsId(String outerGoodsId) {
        this.outerGoodsId = outerGoodsId;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}