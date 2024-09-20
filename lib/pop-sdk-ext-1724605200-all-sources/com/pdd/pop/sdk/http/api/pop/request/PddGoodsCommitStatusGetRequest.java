package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsCommitStatusGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddGoodsCommitStatusGetRequest extends PopBaseHttpRequest<PddGoodsCommitStatusGetResponse> {

    /**
     * goods_commit_id列表
     */
    @JsonProperty("goods_commit_id_list")
    private List<Long> goodsCommitIdList;

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
        return "pdd.goods.commit.status.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsCommitStatusGetResponse> getResponseClass() {
        return PddGoodsCommitStatusGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "goods_commit_id_list", goodsCommitIdList);
    }

    public void setGoodsCommitIdList(List<Long> goodsCommitIdList) {
        this.goodsCommitIdList = goodsCommitIdList;
    }
}