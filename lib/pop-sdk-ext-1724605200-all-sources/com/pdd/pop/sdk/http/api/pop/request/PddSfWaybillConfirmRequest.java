package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddSfWaybillConfirmResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddSfWaybillConfirmRequest extends PopBaseHttpRequest<PddSfWaybillConfirmResponse> {

    /**
     * 体积，单位厘米，精确到小数点后2位，示例 1.23,23.4,3.45   使用半角逗号分割
     */
    @JsonProperty("volume")
    private String volume;

    /**
     * 电子面单号
     */
    @JsonProperty("waybill_code")
    private String waybillCode;

    /**
     * 重量，单位克，精度为10g
     */
    @JsonProperty("weight")
    private Integer weight;

    /**
     * 快递公司code,顺丰快递为SF
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
        return "pdd.sf.waybill.confirm";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddSfWaybillConfirmResponse> getResponseClass() {
        return PddSfWaybillConfirmResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "volume", volume);
        setUserParam(params, "waybill_code", waybillCode);
        setUserParam(params, "weight", weight);
        setUserParam(params, "wp_code", wpCode);
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public void setWaybillCode(String waybillCode) {
        this.waybillCode = waybillCode;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void setWpCode(String wpCode) {
        this.wpCode = wpCode;
    }
}