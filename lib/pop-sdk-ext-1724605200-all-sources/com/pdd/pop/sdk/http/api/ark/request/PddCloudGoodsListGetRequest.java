package com.pdd.pop.sdk.http.api.ark.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.ark.response.PddCloudGoodsListGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddCloudGoodsListGetRequest extends PopBaseHttpRequest<PddCloudGoodsListGetResponse> {

    /**
     * 模版id
     */
    @JsonProperty("cost_template_id")
    private Long costTemplateId;

    /**
     * 非必填，扩展字段
     */
    @JsonProperty("ext_param")
    private Long extParam;

    /**
     * 扩展字段
     */
    @JsonProperty("extend_props")
    private String extendProps;

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
     * 非必填，店铺id
     */
    @JsonProperty("mall_id")
    private Long mallId;

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

    /**
     * 非必填 ， 查询结束时间(实现方自己定义类型)
     */
    @JsonProperty("query_time_end")
    private Long queryTimeEnd;

    /**
     * 非必填 ，查询开始时间(实现方自己定义类型)
     */
    @JsonProperty("query_time_from")
    private Long queryTimeFrom;

    /**
     * 非必填，查询时间类型，0：创建时间   1：更新时间
     */
    @JsonProperty("query_time_type")
    private Integer queryTimeType;

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
        return 1;
    }

    @Override
    public String getType() {
        return "pdd.cloud.goods.list.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddCloudGoodsListGetResponse> getResponseClass() {
        return PddCloudGoodsListGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "cost_template_id", costTemplateId);
        setUserParam(params, "ext_param", extParam);
        setUserParam(params, "extend_props", extendProps);
        setUserParam(params, "goods_name", goodsName);
        setUserParam(params, "is_onsale", isOnsale);
        setUserParam(params, "mall_id", mallId);
        setUserParam(params, "outer_goods_id", outerGoodsId);
        setUserParam(params, "outer_id", outerId);
        setUserParam(params, "page", page);
        setUserParam(params, "page_size", pageSize);
        setUserParam(params, "query_time_end", queryTimeEnd);
        setUserParam(params, "query_time_from", queryTimeFrom);
        setUserParam(params, "query_time_type", queryTimeType);
    }

    public void setCostTemplateId(Long costTemplateId) {
        this.costTemplateId = costTemplateId;
    }

    public void setExtParam(Long extParam) {
        this.extParam = extParam;
    }

    public void setExtendProps(String extendProps) {
        this.extendProps = extendProps;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public void setIsOnsale(Integer isOnsale) {
        this.isOnsale = isOnsale;
    }

    public void setMallId(Long mallId) {
        this.mallId = mallId;
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

    public void setQueryTimeEnd(Long queryTimeEnd) {
        this.queryTimeEnd = queryTimeEnd;
    }

    public void setQueryTimeFrom(Long queryTimeFrom) {
        this.queryTimeFrom = queryTimeFrom;
    }

    public void setQueryTimeType(Integer queryTimeType) {
        this.queryTimeType = queryTimeType;
    }
}