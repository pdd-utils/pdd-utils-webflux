package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsLatestCommitStatusGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddGoodsLatestCommitStatusGetRequest extends PopBaseHttpRequest<PddGoodsLatestCommitStatusGetResponse> {

    /**
     * 商品id(不超过100个)
     */
    @JsonProperty("goods_id_list")
    private List<Long> goodsIdList;

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
        return "pdd.goods.latest.commit.status.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsLatestCommitStatusGetResponse> getResponseClass() {
        return PddGoodsLatestCommitStatusGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "goods_id_list", goodsIdList);
    }

    public void setGoodsIdList(List<Long> goodsIdList) {
        this.goodsIdList = goodsIdList;
    }
}