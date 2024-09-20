package com.pdd.pop.sdk.http.api.ark.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.ark.response.PddFlightOrderQuerysnResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddFlightOrderQuerysnRequest extends PopBaseHttpRequest<PddFlightOrderQuerysnResponse> {

    /**
     * 用于搜索到下单的请求日志关联
     */
    @JsonProperty("trace_id")
    private String traceId;

    /**
     * 单号
     */
    @JsonProperty("travel_sn")
    private String travelSn;

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
        return 1;
    }

    @Override
    public String getType() {
        return "pdd.flight.order.querysn";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddFlightOrderQuerysnResponse> getResponseClass() {
        return PddFlightOrderQuerysnResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "trace_id", traceId);
        setUserParam(params, "travel_sn", travelSn);
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public void setTravelSn(String travelSn) {
        this.travelSn = travelSn;
    }
}