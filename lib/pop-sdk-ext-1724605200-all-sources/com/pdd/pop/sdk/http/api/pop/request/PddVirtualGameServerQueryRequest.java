package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddVirtualGameServerQueryResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddVirtualGameServerQueryRequest extends PopBaseHttpRequest<PddVirtualGameServerQueryResponse> {

    /**
     * 游戏CODE
     */
    @JsonProperty("goods_config_code")
    private String goodsConfigCode;

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
        return "pdd.virtual.game.server.query";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddVirtualGameServerQueryResponse> getResponseClass() {
        return PddVirtualGameServerQueryResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "goods_config_code", goodsConfigCode);
    }

    public void setGoodsConfigCode(String goodsConfigCode) {
        this.goodsConfigCode = goodsConfigCode;
    }
}