package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddFulfillmentInformationGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddFulfillmentInformationGetRequest extends PopBaseHttpRequest<PddFulfillmentInformationGetResponse> {

    /**
     * 跨境全托管发货单号
     */
    @JsonProperty("fulfillment_sn")
    private String fulfillmentSn;

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
        return "pdd.fulfillment.information.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddFulfillmentInformationGetResponse> getResponseClass() {
        return PddFulfillmentInformationGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "fulfillment_sn", fulfillmentSn);
    }

    public void setFulfillmentSn(String fulfillmentSn) {
        this.fulfillmentSn = fulfillmentSn;
    }
}