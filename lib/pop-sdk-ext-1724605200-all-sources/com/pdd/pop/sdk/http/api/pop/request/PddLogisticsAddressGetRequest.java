package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.http.api.pop.response.PddLogisticsAddressGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddLogisticsAddressGetRequest extends PopBaseHttpRequest<PddLogisticsAddressGetResponse> {

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
        return "pdd.logistics.address.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddLogisticsAddressGetResponse> getResponseClass() {
        return PddLogisticsAddressGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
    }
}