package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsCommitDetailGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddGoodsCommitDetailGetRequest extends PopBaseHttpRequest<PddGoodsCommitDetailGetResponse> {

    /**
     * 提交申请的序列id
     */
    @JsonProperty("goods_commit_id")
    private Long goodsCommitId;

    /**
     * 商品id
     */
    @JsonProperty("goods_id")
    private Long goodsId;

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
        return "pdd.goods.commit.detail.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsCommitDetailGetResponse> getResponseClass() {
        return PddGoodsCommitDetailGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "goods_commit_id", goodsCommitId);
        setUserParam(params, "goods_id", goodsId);
    }

    public void setGoodsCommitId(Long goodsCommitId) {
        this.goodsCommitId = goodsCommitId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }
}