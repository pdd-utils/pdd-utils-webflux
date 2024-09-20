package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKttGoodsCreateSpecResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddKttGoodsCreateSpecRequest extends PopBaseHttpRequest<PddKttGoodsCreateSpecResponse> {

    /**
     * 待创建规格Map 规格乘积不能超过400
     */
    @JsonProperty("spec_map")
    private Map<String, List<String>> specMap;

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
        return "pdd.ktt.goods.create.spec";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKttGoodsCreateSpecResponse> getResponseClass() {
        return PddKttGoodsCreateSpecResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "spec_map", specMap);
    }

    public void setSpecMap(Map<String, List<String>> specMap) {
        this.specMap = specMap;
    }
}