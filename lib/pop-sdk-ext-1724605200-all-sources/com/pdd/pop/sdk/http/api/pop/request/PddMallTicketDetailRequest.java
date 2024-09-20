package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddMallTicketDetailResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddMallTicketDetailRequest extends PopBaseHttpRequest<PddMallTicketDetailResponse> {

    /**
     * 工单编号
     */
    @JsonProperty("ticket_id")
    private String ticketId;

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
        return "pdd.mall.ticket.detail";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddMallTicketDetailResponse> getResponseClass() {
        return PddMallTicketDetailResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "ticket_id", ticketId);
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }
}