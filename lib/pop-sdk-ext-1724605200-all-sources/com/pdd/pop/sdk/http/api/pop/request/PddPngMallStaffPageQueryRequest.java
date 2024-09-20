package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddPngMallStaffPageQueryResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddPngMallStaffPageQueryRequest extends PopBaseHttpRequest<PddPngMallStaffPageQueryResponse> {

    /**
     * 分页数量，最小1，最大50。
     */
    @JsonProperty("limit")
    private Integer limit;

    /**
     * 起始的推手id。时候调用传入0，非首次调用请使用上个接口的lastId作为传入参数
     */
    @JsonProperty("start_id")
    private Long startId;

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
        return "pdd.png.mall.staff.page.query";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddPngMallStaffPageQueryResponse> getResponseClass() {
        return PddPngMallStaffPageQueryResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "limit", limit);
        setUserParam(params, "start_id", startId);
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public void setStartId(Long startId) {
        this.startId = startId;
    }
}