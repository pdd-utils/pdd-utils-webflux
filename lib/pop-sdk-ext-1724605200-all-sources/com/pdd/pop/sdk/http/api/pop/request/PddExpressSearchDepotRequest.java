package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddExpressSearchDepotResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddExpressSearchDepotRequest extends PopBaseHttpRequest<PddExpressSearchDepotResponse> {

    /**
     * 仓库编码
     */
    @JsonProperty("code")
    private String code;

    /**
     * 10 分页数据size
     */
    @JsonProperty("length")
    private Integer length;

    /**
     * 仓库名称
     */
    @JsonProperty("name")
    private String name;

    /**
     * 0 分页数据起始位置
     */
    @JsonProperty("start")
    private Integer start;

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
        return "pdd.express.search.depot";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddExpressSearchDepotResponse> getResponseClass() {
        return PddExpressSearchDepotResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "code", code);
        setUserParam(params, "length", length);
        setUserParam(params, "name", name);
        setUserParam(params, "start", start);
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStart(Integer start) {
        this.start = start;
    }
}