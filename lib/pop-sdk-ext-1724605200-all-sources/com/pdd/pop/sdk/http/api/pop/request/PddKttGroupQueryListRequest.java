package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKttGroupQueryListResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddKttGroupQueryListRequest extends PopBaseHttpRequest<PddKttGroupQueryListResponse> {

    /**
     * 查询终止更新时间（毫秒时间戳，起止时间差不能超过7天）
     */
    @JsonProperty("end_update_time")
    private Long endUpdateTime;

    /**
     * 分页页码
     */
    @JsonProperty("page")
    private Integer page;

    /**
     * 分页大小
     */
    @JsonProperty("size")
    private Integer size;

    /**
     * 查询起始更新时间（毫秒时间戳）
     */
    @JsonProperty("start_update_time")
    private Long startUpdateTime;

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
        return "pdd.ktt.group.query.list";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKttGroupQueryListResponse> getResponseClass() {
        return PddKttGroupQueryListResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "end_update_time", endUpdateTime);
        setUserParam(params, "page", page);
        setUserParam(params, "size", size);
        setUserParam(params, "start_update_time", startUpdateTime);
    }

    public void setEndUpdateTime(Long endUpdateTime) {
        this.endUpdateTime = endUpdateTime;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public void setStartUpdateTime(Long startUpdateTime) {
        this.startUpdateTime = startUpdateTime;
    }
}