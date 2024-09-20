package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddOverseaUploadGoodsIdListResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddOverseaUploadGoodsIdListRequest extends PopBaseHttpRequest<PddOverseaUploadGoodsIdListResponse> {

    /**
     * 商品ID列表
     */
    @JsonProperty("goods_id_list")
    private List<Long> goodsIdList;

    /**
     * 1. 上传
     */
    @JsonProperty("upload_type")
    private Integer uploadType;

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
        return "pdd.oversea.upload.goods.id.list";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddOverseaUploadGoodsIdListResponse> getResponseClass() {
        return PddOverseaUploadGoodsIdListResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "goods_id_list", goodsIdList);
        setUserParam(params, "upload_type", uploadType);
    }

    public void setGoodsIdList(List<Long> goodsIdList) {
        this.goodsIdList = goodsIdList;
    }

    public void setUploadType(Integer uploadType) {
        this.uploadType = uploadType;
    }
}