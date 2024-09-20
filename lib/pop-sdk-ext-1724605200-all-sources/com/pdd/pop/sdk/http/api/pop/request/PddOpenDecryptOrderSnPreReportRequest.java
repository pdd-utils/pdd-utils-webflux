package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddOpenDecryptOrderSnPreReportResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddOpenDecryptOrderSnPreReportRequest extends PopBaseHttpRequest<PddOpenDecryptOrderSnPreReportResponse> {

    /**
     * 订单号列表
     */
    @JsonProperty("order_sn_list")
    private List<String> orderSnList;

    /**
     * 授权成功返回的owner_id，授权用户的唯一id
     */
    @JsonProperty("owner_id")
    private String ownerId;

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
        return "pdd.open.decrypt.order.sn.pre.report";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddOpenDecryptOrderSnPreReportResponse> getResponseClass() {
        return PddOpenDecryptOrderSnPreReportResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "order_sn_list", orderSnList);
        setUserParam(params, "owner_id", ownerId);
    }

    public void setOrderSnList(List<String> orderSnList) {
        this.orderSnList = orderSnList;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
}