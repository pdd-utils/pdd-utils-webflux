package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.http.api.pop.response.PddRefundAddressListGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddRefundAddressListGetRequest extends PopBaseHttpRequest<PddRefundAddressListGetResponse> {

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
        return "pdd.refund.address.list.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddRefundAddressListGetResponse> getResponseClass() {
        return PddRefundAddressListGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
    }
}