package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddDeleteGoodsCommitResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddDeleteGoodsCommitRequest extends PopBaseHttpRequest<PddDeleteGoodsCommitResponse> {

    /**
     * 商品id 列表(List<Long>) json string，例：[1,2]，一次操作数量请小于50
     */
    @JsonProperty("goods_ids")
    private List<Long> goodsIds;

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
        return "pdd.delete.goods.commit";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDeleteGoodsCommitResponse> getResponseClass() {
        return PddDeleteGoodsCommitResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "goods_ids", goodsIds);
    }

    public void setGoodsIds(List<Long> goodsIds) {
        this.goodsIds = goodsIds;
    }
}