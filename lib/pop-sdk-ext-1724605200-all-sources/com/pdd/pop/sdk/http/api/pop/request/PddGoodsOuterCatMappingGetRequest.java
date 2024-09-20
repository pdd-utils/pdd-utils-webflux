package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsOuterCatMappingGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddGoodsOuterCatMappingGetRequest extends PopBaseHttpRequest<PddGoodsOuterCatMappingGetResponse> {

    /**
     * 外部叶子类目id
     */
    @JsonProperty("outer_cat_id")
    private Long outerCatId;

    /**
     * 外部叶子类目名称
     */
    @JsonProperty("outer_cat_name")
    private String outerCatName;

    /**
     * 外部商品名称
     */
    @JsonProperty("outer_goods_name")
    private String outerGoodsName;

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
        return "pdd.goods.outer.cat.mapping.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsOuterCatMappingGetResponse> getResponseClass() {
        return PddGoodsOuterCatMappingGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "outer_cat_id", outerCatId);
        setUserParam(params, "outer_cat_name", outerCatName);
        setUserParam(params, "outer_goods_name", outerGoodsName);
    }

    public void setOuterCatId(Long outerCatId) {
        this.outerCatId = outerCatId;
    }

    public void setOuterCatName(String outerCatName) {
        this.outerCatName = outerCatName;
    }

    public void setOuterGoodsName(String outerGoodsName) {
        this.outerGoodsName = outerGoodsName;
    }
}