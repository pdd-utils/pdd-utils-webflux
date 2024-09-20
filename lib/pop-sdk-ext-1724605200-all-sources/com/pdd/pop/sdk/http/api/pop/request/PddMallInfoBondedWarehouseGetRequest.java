package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.http.api.pop.response.PddMallInfoBondedWarehouseGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddMallInfoBondedWarehouseGetRequest extends PopBaseHttpRequest<PddMallInfoBondedWarehouseGetResponse> {

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
        return "pdd.mall.info.bonded.warehouse.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddMallInfoBondedWarehouseGetResponse> getResponseClass() {
        return PddMallInfoBondedWarehouseGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
    }
}