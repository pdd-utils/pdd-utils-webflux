package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddEinvoiceInfoQueryResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddEinvoiceInfoQueryRequest extends PopBaseHttpRequest<PddEinvoiceInfoQueryResponse> {

    /**
     * 最后更新时间结束时间的时间戳，指格林威治时间 1970 年 01 月 01 日 00 时 00 分 00 秒(北京时间 1970 年 01 月 01 日 08 时 00 分 00 秒)起至现在的总秒数。开始时间结束时间间距不超过1小时。不能查询最近5分钟内的数据。开区间，返回数据不包含end_time
     */
    @JsonProperty("end_time")
    private Long endTime;

    /**
     * 发票类型 0-蓝票，1-红票，不传为全部
     */
    @JsonProperty("invoice_type")
    private Integer invoiceType;

    /**
     * 页码。页码从 1开始
     */
    @JsonProperty("page")
    private Integer page;

    /**
     * 返回数量。最小1，最大 50
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 最后更新时间开始时间的时间戳，指格林威治时间 1970 年01 月 01 日 00 时 00 分 00 秒(北京时间 1970 年 01 月 01 日 08 时 00 分 00 秒)起至现在的总秒数。只能查询30天内的数据。闭区间，返回数据包含start_time
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
        return "pdd.einvoice.info.query";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddEinvoiceInfoQueryResponse> getResponseClass() {
        return PddEinvoiceInfoQueryResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "end_time", endTime);
        setUserParam(params, "invoice_type", invoiceType);
        setUserParam(params, "page", page);
        setUserParam(params, "page_size", pageSize);
        setUserParam(params, "start_time", startTime);
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public void setInvoiceType(Integer invoiceType) {
        this.invoiceType = invoiceType;
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