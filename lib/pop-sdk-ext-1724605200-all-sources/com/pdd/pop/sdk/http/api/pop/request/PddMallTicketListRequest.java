package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddMallTicketListResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddMallTicketListRequest extends PopBaseHttpRequest<PddMallTicketListResponse> {

    /**
     * 结束时间戳(格式:秒)
     */
    @JsonProperty("create_end_time")
    private Integer createEndTime;

    /**
     * 开始时间戳(格式:秒)
     */
    @JsonProperty("create_start_time")
    private Integer createStartTime;

    /**
     * 页数(从0开始)
     */
    @JsonProperty("page_num")
    private Integer pageNum;

    /**
     * 每页条数(默认100，最大100)
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 0:待处理 1:已解决 2:超时
     */
    @JsonProperty("progress")
    private Integer progress;

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
        return "pdd.mall.ticket.list";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddMallTicketListResponse> getResponseClass() {
        return PddMallTicketListResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "create_end_time", createEndTime);
        setUserParam(params, "create_start_time", createStartTime);
        setUserParam(params, "page_num", pageNum);
        setUserParam(params, "page_size", pageSize);
        setUserParam(params, "progress", progress);
    }

    public void setCreateEndTime(Integer createEndTime) {
        this.createEndTime = createEndTime;
    }

    public void setCreateStartTime(Integer createStartTime) {
        this.createStartTime = createStartTime;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }
}