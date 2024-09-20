package com.pdd.pop.sdk.http.api.ark.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.ark.response.PddCloudGoodsDetailGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddCloudGoodsDetailGetRequest extends PopBaseHttpRequest<PddCloudGoodsDetailGetResponse> {

    /**
     * 扩展字段
     */
    @JsonProperty("extend_props")
    private String extendProps;

    /**
     * 1213414
     */
    @JsonProperty("goods_id")
    private Long goodsId;

    /**
     * 店铺ID
     */
    @JsonProperty("mall_id")
    private Long mallId;

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
        return 1;
    }

    @Override
    public String getType() {
        return "pdd.cloud.goods.detail.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddCloudGoodsDetailGetResponse> getResponseClass() {
        return PddCloudGoodsDetailGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "extend_props", extendProps);
        setUserParam(params, "goods_id", goodsId);
        setUserParam(params, "mall_id", mallId);
    }

    public void setExtendProps(String extendProps) {
        this.extendProps = extendProps;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public void setMallId(Long mallId) {
        this.mallId = mallId;
    }
}