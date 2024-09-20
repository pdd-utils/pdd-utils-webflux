package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddWaybillCancelResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddWaybillCancelRequest extends PopBaseHttpRequest<PddWaybillCancelResponse> {

    /**
     * 电子面单号
     */
    @JsonProperty("waybill_code")
    private String waybillCode;

    /**
     * 快递公司code
     */
    @JsonProperty("wp_code")
    private String wpCode;

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
        return "pdd.waybill.cancel";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddWaybillCancelResponse> getResponseClass() {
        return PddWaybillCancelResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "waybill_code", waybillCode);
        setUserParam(params, "wp_code", wpCode);
    }

    public void setWaybillCode(String waybillCode) {
        this.waybillCode = waybillCode;
    }

    public void setWpCode(String wpCode) {
        this.wpCode = wpCode;
    }
}