package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddDdkCashgiftDataQueryResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddDdkCashgiftDataQueryRequest extends PopBaseHttpRequest<PddDdkCashgiftDataQueryResponse> {

    /**
     * 礼金ID，支持根据礼金ID查询
     */
    @JsonProperty("cash_gift_id")
    private Long cashGiftId;

    /**
     * 礼金创建结束时间，查询该时间段内创建的所有礼金效果数据（礼金维度）。note：此时间为时间戳，指格林威治时间 1970 年01 月 01 日 00 时 00 分 00 秒(北京时间 1970 年 01 月 01 日 08 时 00 分 00 秒)起至现在的总秒数
     */
    @JsonProperty("end_time")
    private Long endTime;

    /**
     * 分页数
     */
    @JsonProperty("page")
    private Integer page;

    /**
     * 每页结果数
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 礼金创建起始时间，查询该时间段内创建的所有礼金效果数据（礼金维度）。note：此时间为时间戳，指格林威治时间 1970 年01 月 01 日 00 时 00 分 00 秒(北京时间 1970 年 01 月 01 日 08 时 00 分 00 秒)起至现在的总秒数
     */
    @JsonProperty("start_time")
    private Long startTime;

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
        return "pdd.ddk.cashgift.data.query";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkCashgiftDataQueryResponse> getResponseClass() {
        return PddDdkCashgiftDataQueryResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "cash_gift_id", cashGiftId);
        setUserParam(params, "end_time", endTime);
        setUserParam(params, "page", page);
        setUserParam(params, "page_size", pageSize);
        setUserParam(params, "start_time", startTime);
    }

    public void setCashGiftId(Long cashGiftId) {
        this.cashGiftId = cashGiftId;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }
}