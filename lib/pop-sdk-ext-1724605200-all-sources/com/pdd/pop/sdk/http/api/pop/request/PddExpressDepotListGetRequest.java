package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddExpressDepotListGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddExpressDepotListGetRequest extends PopBaseHttpRequest<PddExpressDepotListGetResponse> {

    /**
     * 分页数据size
     */
    @JsonProperty("length")
    private Long length;

    /**
     * 分页数据起始位置
     */
    @JsonProperty("start")
    private Long start;

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
        return "pdd.express.depot.list.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddExpressDepotListGetResponse> getResponseClass() {
        return PddExpressDepotListGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "length", length);
        setUserParam(params, "start", start);
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public void setStart(Long start) {
        this.start = start;
    }
}