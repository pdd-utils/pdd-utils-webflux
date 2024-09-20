package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsCommitListGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddGoodsCommitListGetRequest extends PopBaseHttpRequest<PddGoodsCommitListGetResponse> {

    /**
     * 草稿状态（0:编辑中,1:审核中,2:审核通过,3:审核驳回）
     */
    @JsonProperty("check_status")
    private Integer checkStatus;

    /**
     * 商品id
     */
    @JsonProperty("goods_id")
    private Long goodsId;

    /**
     * 页码，最多不超过100
     */
    @JsonProperty("page")
    private Integer page;

    /**
     * 每页数量，最多不超过100
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
        return "pdd.goods.commit.list.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsCommitListGetResponse> getResponseClass() {
        return PddGoodsCommitListGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "check_status", checkStatus);
        setUserParam(params, "goods_id", goodsId);
        setUserParam(params, "page", page);
        setUserParam(params, "page_size", pageSize);
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}