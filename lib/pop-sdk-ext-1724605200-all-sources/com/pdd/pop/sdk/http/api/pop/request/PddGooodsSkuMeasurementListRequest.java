package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.http.api.pop.response.PddGooodsSkuMeasurementListResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddGooodsSkuMeasurementListRequest extends PopBaseHttpRequest<PddGooodsSkuMeasurementListResponse> {

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
        return "pdd.gooods.sku.measurement.list";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGooodsSkuMeasurementListResponse> getResponseClass() {
        return PddGooodsSkuMeasurementListResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
    }
}