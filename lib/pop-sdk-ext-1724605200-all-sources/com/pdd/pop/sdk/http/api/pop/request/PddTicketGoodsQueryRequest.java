package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddTicketGoodsQueryResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddTicketGoodsQueryRequest extends PopBaseHttpRequest<PddTicketGoodsQueryResponse> {

    /**
     * 草稿id，入参草稿id时，表示查询该草稿的信息
     */
    @JsonProperty("goods_commit_id")
    private Long goodsCommitId;

    /**
     * 商品id入参商品id时，表示查询该商品的线上商品信息。。
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
        return "pdd.ticket.goods.query";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddTicketGoodsQueryResponse> getResponseClass() {
        return PddTicketGoodsQueryResponse.class;
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