package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsMaterialQueryResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddGoodsMaterialQueryRequest extends PopBaseHttpRequest<PddGoodsMaterialQueryResponse> {

    /**
     * 商品id列表
     */
    @JsonProperty("goods_id_list")
    private List<Long> goodsIdList;

    /**
     * 素材类型列表
     */
    @JsonProperty("type_list")
    private List<Long> typeList;

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
        return "pdd.goods.material.query";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsMaterialQueryResponse> getResponseClass() {
        return PddGoodsMaterialQueryResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "goods_id_list", goodsIdList);
        setUserParam(params, "type_list", typeList);
    }

    public void setGoodsIdList(List<Long> goodsIdList) {
        this.goodsIdList = goodsIdList;
    }

    public void setTypeList(List<Long> typeList) {
        this.typeList = typeList;
    }
}