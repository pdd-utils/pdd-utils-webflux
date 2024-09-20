package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKttAfterSalesIncrementListResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddKttAfterSalesIncrementListRequest extends PopBaseHttpRequest<PddKttAfterSalesIncrementListResponse> {

    /**
     * 结束的更新时间，毫秒时间戳，结束时间戳-启始时间戳应小于24小时
     */
    @JsonProperty("end_updated_at")
    private Long endUpdatedAt;

    /**
     * 页码，第x页，从1开始
     */
    @JsonProperty("page_number")
    private Integer pageNumber;

    /**
     * 分页大小，1～100之间
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 查询场景：0或不传-所有售后单；1-待团长处理的售后单
     */
    @JsonProperty("query_type")
    private Integer queryType;

    /**
     * 启始的更新时间，毫秒时间戳
     */
    @JsonProperty("start_updated_at")
    private Long startUpdatedAt;

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
        return "pdd.ktt.after.sales.increment.list";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKttAfterSalesIncrementListResponse> getResponseClass() {
        return PddKttAfterSalesIncrementListResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "end_updated_at", endUpdatedAt);
        setUserParam(params, "page_number", pageNumber);
        setUserParam(params, "page_size", pageSize);
        setUserParam(params, "query_type", queryType);
        setUserParam(params, "start_updated_at", startUpdatedAt);
    }

    public void setEndUpdatedAt(Long endUpdatedAt) {
        this.endUpdatedAt = endUpdatedAt;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setQueryType(Integer queryType) {
        this.queryType = queryType;
    }

    public void setStartUpdatedAt(Long startUpdatedAt) {
        this.startUpdatedAt = startUpdatedAt;
    }
}