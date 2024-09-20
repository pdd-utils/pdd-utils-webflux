package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddTicketOrderRefundNotifycationResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddTicketOrderRefundNotifycationRequest extends PopBaseHttpRequest<PddTicketOrderRefundNotifycationResponse> {

    /**
     * 拼多多制票号
     */
    @JsonProperty("order_no")
    private String orderNo;

    /**
     * 退款金额（分） status=2时必传
     */
    @JsonProperty("refund_amount")
    private Long refundAmount;

    /**
     * 驳回原因 status=3时必传
     */
    @JsonProperty("reject_reason")
    private String rejectReason;

    /**
     * 退款流水号
     */
    @JsonProperty("serial_no")
    private String serialNo;

    /**
     * 受理状态。2.已通过 3.已驳回
     */
    @JsonProperty("status")
    private Integer status;

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
        return "pdd.ticket.order.refund.notifycation";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddTicketOrderRefundNotifycationResponse> getResponseClass() {
        return PddTicketOrderRefundNotifycationResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "order_no", orderNo);
        setUserParam(params, "refund_amount", refundAmount);
        setUserParam(params, "reject_reason", rejectReason);
        setUserParam(params, "serial_no", serialNo);
        setUserParam(params, "status", status);
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public void setRefundAmount(Long refundAmount) {
        this.refundAmount = refundAmount;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}