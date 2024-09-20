package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddServicemarketTradelistGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddServicemarketTradelistGetRequest extends PopBaseHttpRequest<PddServicemarketTradelistGetResponse> {

    /**
     * 查询起始时间，精确到秒，起止时间间隔最大31天
     */
    @JsonProperty("begin_time")
    private Integer beginTime;

    /**
     * 查询结束时间，精确到秒，起止时间间隔最大31天
     */
    @JsonProperty("end_time")
    private Integer endTime;

    /**
     * 收支类型，空-全部 1-收入 2-支出
     */
    @JsonProperty("group_type")
    private Integer groupType;

    /**
     * 分页页码，最大1000
     */
    @JsonProperty("page")
    private Integer page;

    /**
     * 分页大小，最大100
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 服务订单号
     */
    @JsonProperty("service_order_sn")
    private String serviceOrderSn;

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
        return "pdd.servicemarket.tradelist.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddServicemarketTradelistGetResponse> getResponseClass() {
        return PddServicemarketTradelistGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "begin_time", beginTime);
        setUserParam(params, "end_time", endTime);
        setUserParam(params, "group_type", groupType);
        setUserParam(params, "page", page);
        setUserParam(params, "page_size", pageSize);
        setUserParam(params, "service_order_sn", serviceOrderSn);
    }

    public void setBeginTime(Integer beginTime) {
        this.beginTime = beginTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public void setGroupType(Integer groupType) {
        this.groupType = groupType;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setServiceOrderSn(String serviceOrderSn) {
        this.serviceOrderSn = serviceOrderSn;
    }
}