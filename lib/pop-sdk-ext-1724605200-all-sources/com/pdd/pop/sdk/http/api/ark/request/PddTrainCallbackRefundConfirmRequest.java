package com.pdd.pop.sdk.http.api.ark.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.ark.response.PddTrainCallbackRefundConfirmResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddTrainCallbackRefundConfirmRequest extends PopBaseHttpRequest<PddTrainCallbackRefundConfirmResponse> {

    /**
     * 车厢号
     */
    @JsonProperty("card_no")
    private String cardNo;

    /**
     * 错误码
     */
    @JsonProperty("code")
    private Integer code;

    /**
     * 信息
     */
    @JsonProperty("msg")
    private String msg;

    /**
     * 姓名
     */
    @JsonProperty("name")
    private String name;

    /**
     * 拼多多订单号
     */
    @JsonProperty("pdd_order_id")
    private String pddOrderId;

    /**
     * 退票金额
     */
    @JsonProperty("refund_money")
    private Long refundMoney;

    /**
     * 退票类型
     */
    @JsonProperty("refund_type")
    private Integer refundType;

    /**
     * 流水号
     */
    @JsonProperty("request_id")
    private String requestId;

    /**
     * 商家子单号
     */
    @JsonProperty("sub_order_id")
    private String subOrderId;

    /**
     * 拼多多子订单号
     */
    @JsonProperty("sub_pdd_order_id")
    private String subPddOrderId;

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
        return "pdd.train.callback.refund.confirm";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddTrainCallbackRefundConfirmResponse> getResponseClass() {
        return PddTrainCallbackRefundConfirmResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "card_no", cardNo);
        setUserParam(params, "code", code);
        setUserParam(params, "msg", msg);
        setUserParam(params, "name", name);
        setUserParam(params, "pdd_order_id", pddOrderId);
        setUserParam(params, "refund_money", refundMoney);
        setUserParam(params, "refund_type", refundType);
        setUserParam(params, "request_id", requestId);
        setUserParam(params, "sub_order_id", subOrderId);
        setUserParam(params, "sub_pdd_order_id", subPddOrderId);
        setUserParam(params, "vendor_time", vendorTime);
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPddOrderId(String pddOrderId) {
        this.pddOrderId = pddOrderId;
    }

    public void setRefundMoney(Long refundMoney) {
        this.refundMoney = refundMoney;
    }

    public void setRefundType(Integer refundType) {
        this.refundType = refundType;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public void setSubOrderId(String subOrderId) {
        this.subOrderId = subOrderId;
    }

    public void setSubPddOrderId(String subPddOrderId) {
        this.subPddOrderId = subPddOrderId;
    }

    public void setVendorTime(String vendorTime) {
        this.vendorTime = vendorTime;
    }
}