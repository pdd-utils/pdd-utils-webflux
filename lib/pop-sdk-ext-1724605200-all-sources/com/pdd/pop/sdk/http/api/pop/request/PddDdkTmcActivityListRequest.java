package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddDdkTmcActivityListResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddDdkTmcActivityListRequest extends PopBaseHttpRequest<PddDdkTmcActivityListResponse> {

    /**
     * 页码 从1开始
     */
    @JsonProperty("page_num")
    private Integer pageNum;

    /**
     * 每页结果数，默认值: 20 最大50
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 活动开始时间最小时间 格式: "yyyy-MM-dd HH:mm:ss"
     */
    @JsonProperty("start_time_lower")
    private String startTimeLower;

    /**
     * 活动开始时间最大时间 格式: "yyyy-MM-dd HH:mm:ss"
     */
    @JsonProperty("start_time_upper")
    private String startTimeUpper;

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
        return "pdd.ddk.tmc.activity.list";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkTmcActivityListResponse> getResponseClass() {
        return PddDdkTmcActivityListResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "page_num", pageNum);
        setUserParam(params, "page_size", pageSize);
        setUserParam(params, "start_time_lower", startTimeLower);
        setUserParam(params, "start_time_upper", startTimeUpper);
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setStartTimeLower(String startTimeLower) {
        this.startTimeLower = startTimeLower;
    }

    public void setStartTimeUpper(String startTimeUpper) {
        this.startTimeUpper = startTimeUpper;
    }
}