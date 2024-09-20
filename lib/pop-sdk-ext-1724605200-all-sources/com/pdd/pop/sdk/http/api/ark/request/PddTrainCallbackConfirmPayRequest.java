package com.pdd.pop.sdk.http.api.ark.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.ark.response.PddTrainCallbackConfirmPayResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddTrainCallbackConfirmPayRequest extends PopBaseHttpRequest<PddTrainCallbackConfirmPayResponse> {

    /**
     * 错误码
     */
    @JsonProperty("code")
    private Integer code;

    /**
     * 12306 单号
     */
    @JsonProperty("crh_order_id")
    private String crhOrderId;

    /**
     * 检票口
     */
    @JsonProperty("gate_no")
    private String gateNo;

    /**
     * 信息
     */
    @JsonProperty("msg")
    private String msg;

    /**
     * 商家订单号
     */
    @JsonProperty("order_id")
    private String orderId;

    /**
     * 拼多多订单号
     */
    @JsonProperty("pdd_order_id")
    private String pddOrderId;

    /**
     * 请求流水号
     */
    @JsonProperty("request_id")
    private String requestId;

    /**
     * 商家订单时间
     */
    @JsonProperty("vendor_time")
    private String vendorTime;

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
        return "pdd.train.callback.confirm.pay";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddTrainCallbackConfirmPayResponse> getResponseClass() {
        return PddTrainCallbackConfirmPayResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "code", code);
        setUserParam(params, "crh_order_id", crhOrderId);
        setUserParam(params, "gate_no", gateNo);
        setUserParam(params, "msg", msg);
        setUserParam(params, "order_id", orderId);
        setUserParam(params, "pdd_order_id", pddOrderId);
        setUserParam(params, "request_id", requestId);
        setUserParam(params, "vendor_time", vendorTime);
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setCrhOrderId(String crhOrderId) {
        this.crhOrderId = crhOrderId;
    }

    public void setGateNo(String gateNo) {
        this.gateNo = gateNo;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setPddOrderId(String pddOrderId) {
        this.pddOrderId = pddOrderId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public void setVendorTime(String vendorTime) {
        this.vendorTime = vendorTime;
    }
}