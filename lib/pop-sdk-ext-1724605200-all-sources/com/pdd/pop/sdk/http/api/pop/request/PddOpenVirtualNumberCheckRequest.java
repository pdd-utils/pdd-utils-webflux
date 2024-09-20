package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddOpenVirtualNumberCheckResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddOpenVirtualNumberCheckRequest extends PopBaseHttpRequest<PddOpenVirtualNumberCheckResponse> {

    /**
     * 分机号，非必填，4位数字字符
     */
    @JsonProperty("identify_number")
    private String identifyNumber;

    /**
     * 订单号
     */
    @JsonProperty("order_sn")
    private String orderSn;

    /**
     * 虚拟号，11位数字字符
     */
    @JsonProperty("virtual_number")
    private String virtualNumber;

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
        return "pdd.open.virtual.number.check";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddOpenVirtualNumberCheckResponse> getResponseClass() {
        return PddOpenVirtualNumberCheckResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "identify_number", identifyNumber);
        setUserParam(params, "order_sn", orderSn);
        setUserParam(params, "virtual_number", virtualNumber);
    }

    public void setIdentifyNumber(String identifyNumber) {
        this.identifyNumber = identifyNumber;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public void setVirtualNumber(String virtualNumber) {
        this.virtualNumber = virtualNumber;
    }
}