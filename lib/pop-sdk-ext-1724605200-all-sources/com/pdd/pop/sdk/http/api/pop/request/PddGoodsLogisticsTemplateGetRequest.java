package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsLogisticsTemplateGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddGoodsLogisticsTemplateGetRequest extends PopBaseHttpRequest<PddGoodsLogisticsTemplateGetResponse> {

    /**
     * 默认返回运费模板的页数为1，最高为100页，注意：page与page_size必须传一个
     */
    @JsonProperty("page")
    private Integer page;

    /**
     * 默认返回20条模板数据，最多100条数据
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 0-新发布商品，1-编辑商品。如传值为空，平台默认为发布商品
     */
    @JsonProperty("goods_status")
    private Integer goodsStatus;

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
        return "pdd.goods.logistics.template.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsLogisticsTemplateGetResponse> getResponseClass() {
        return PddGoodsLogisticsTemplateGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "page", page);
        setUserParam(params, "page_size", pageSize);
        setUserParam(params, "goods_status", goodsStatus);
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
    }
}