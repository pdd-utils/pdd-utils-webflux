package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddStockWareInfoListResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddStockWareInfoListRequest extends PopBaseHttpRequest<PddStockWareInfoListResponse> {

    /**
     * 货品编码集合
     */
    @JsonProperty("ware_sn_list")
    private List<String> wareSnList;

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
        return "pdd.stock.ware.info.list";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddStockWareInfoListResponse> getResponseClass() {
        return PddStockWareInfoListResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "ware_sn_list", wareSnList);
    }

    public void setWareSnList(List<String> wareSnList) {
        this.wareSnList = wareSnList;
    }
}