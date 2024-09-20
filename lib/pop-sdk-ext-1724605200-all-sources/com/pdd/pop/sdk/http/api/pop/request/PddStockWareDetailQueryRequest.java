package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddStockWareDetailQueryResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddStockWareDetailQueryRequest extends PopBaseHttpRequest<PddStockWareDetailQueryResponse> {

    /**
     * 货品id
     */
    @JsonProperty("ware_id")
    private Long wareId;

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
        return "pdd.stock.ware.detail.query";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddStockWareDetailQueryResponse> getResponseClass() {
        return PddStockWareDetailQueryResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "ware_id", wareId);
    }

    public void setWareId(Long wareId) {
        this.wareId = wareId;
    }
}