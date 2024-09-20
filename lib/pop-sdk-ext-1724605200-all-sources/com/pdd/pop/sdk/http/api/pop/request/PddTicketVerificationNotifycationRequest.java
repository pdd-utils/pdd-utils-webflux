package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddTicketVerificationNotifycationResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddTicketVerificationNotifycationRequest extends PopBaseHttpRequest<PddTicketVerificationNotifycationResponse> {

    /**
     * 拼多多制票号
     */
    @JsonProperty("order_no")
    private String orderNo;

    /**
     * 核销时间（13位毫秒数）
     */
    @JsonProperty("verify_time")
    private Long verifyTime;

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
        return "pdd.ticket.verification.notifycation";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddTicketVerificationNotifycationResponse> getResponseClass() {
        return PddTicketVerificationNotifycationResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "order_no", orderNo);
        setUserParam(params, "verify_time", verifyTime);
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public void setVerifyTime(Long verifyTime) {
        this.verifyTime = verifyTime;
    }
}