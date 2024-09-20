package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddLogisticsIsvTraceNotifySubResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddLogisticsIsvTraceNotifySubRequest extends PopBaseHttpRequest<PddLogisticsIsvTraceNotifySubResponse> {

    /**
     * 快递公司编码
     */
    @JsonProperty("ship_code")
    private String shipCode;

    /**
     * 收件人手机
     */
    @JsonProperty("tel")
    private String tel;

    /**
     * 快递单号
     */
    @JsonProperty("track_no")
    private String trackNo;

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
        return "pdd.logistics.isv.trace.notify.sub";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddLogisticsIsvTraceNotifySubResponse> getResponseClass() {
        return PddLogisticsIsvTraceNotifySubResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "ship_code", shipCode);
        setUserParam(params, "tel", tel);
        setUserParam(params, "track_no", trackNo);
    }

    public void setShipCode(String shipCode) {
        this.shipCode = shipCode;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setTrackNo(String trackNo) {
        this.trackNo = trackNo;
    }
}