package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddMallTicketNotifyResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddMallTicketNotifyRequest extends PopBaseHttpRequest<PddMallTicketNotifyResponse> {

    /**
     * 回复内容
     */
    @JsonProperty("content")
    private String content;

    /**
     * 是否同步给消费者(消费者投诉才有效)
     */
    @JsonProperty("syn_to_user")
    private Boolean synToUser;

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
        return "pdd.mall.ticket.notify";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddMallTicketNotifyResponse> getResponseClass() {
        return PddMallTicketNotifyResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "content", content);
        setUserParam(params, "syn_to_user", synToUser);
        setUserParam(params, "ticket_id", ticketId);
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setSynToUser(Boolean synToUser) {
        this.synToUser = synToUser;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }
}