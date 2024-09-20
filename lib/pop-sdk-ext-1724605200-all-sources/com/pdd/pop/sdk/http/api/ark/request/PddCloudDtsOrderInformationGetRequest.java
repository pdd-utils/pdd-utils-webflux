package com.pdd.pop.sdk.http.api.ark.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.ark.response.PddCloudDtsOrderInformationGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddCloudDtsOrderInformationGetRequest extends PopBaseHttpRequest<PddCloudDtsOrderInformationGetResponse> {

    /**
     * 扩展字段
     */
    @JsonProperty("ext_id")
    private Long extId;

    /**
     * 扩展字段
     */
    @JsonProperty("extend_props")
    private String extendProps;

    /**
     * 店铺ID
     */
    @JsonProperty("mall_id")
    private Long mallId;

    /**
     * 订单号
     */
    @JsonProperty("order_sn")
    private String orderSn;

    /**
     * token
     */
    @JsonProperty("token")
    private String token;

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
        return 1;
    }

    @Override
    public String getType() {
        return "pdd.cloud.dts.order.information.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddCloudDtsOrderInformationGetResponse> getResponseClass() {
        return PddCloudDtsOrderInformationGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "ext_id", extId);
        setUserParam(params, "extend_props", extendProps);
        setUserParam(params, "mall_id", mallId);
        setUserParam(params, "order_sn", orderSn);
        setUserParam(params, "token", token);
    }

    public void setExtId(Long extId) {
        this.extId = extId;
    }

    public void setExtendProps(String extendProps) {
        this.extendProps = extendProps;
    }

    public void setMallId(Long mallId) {
        this.mallId = mallId;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public void setToken(String token) {
        this.token = token;
    }
}