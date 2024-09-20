package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKttHelpSellQueryCommissionResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddKttHelpSellQueryCommissionRequest extends PopBaseHttpRequest<PddKttHelpSellQueryCommissionResponse> {

    /**
     * 父单号列表
     */
    @JsonProperty("parent_order_sn_list")
    private List<String> parentOrderSnList;

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
        return "pdd.ktt.help.sell.query.commission";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKttHelpSellQueryCommissionResponse> getResponseClass() {
        return PddKttHelpSellQueryCommissionResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "parent_order_sn_list", parentOrderSnList);
    }

    public void setParentOrderSnList(List<String> parentOrderSnList) {
        this.parentOrderSnList = parentOrderSnList;
    }
}