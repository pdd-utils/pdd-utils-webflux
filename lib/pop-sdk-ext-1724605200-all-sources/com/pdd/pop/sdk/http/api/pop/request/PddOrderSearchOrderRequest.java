package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddOrderSearchOrderResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddOrderSearchOrderRequest extends PopBaseHttpRequest<PddOrderSearchOrderResponse> {

    /**
     * 必填，下单时间结束时间的时间戳，指格林威治时间 1970 年 01 月 01 日 00 时 00 分 00 秒(北京时间 1970 年 01 月 01 日 08 时 00 分 00 秒)起至现在的总秒数，开始时间结束时间间距不超过90天
     */
    @JsonProperty("end_created_at")
    private Long endCreatedAt;

    /**
     * 收件人姓名
     */
    @JsonProperty("receiver_name")
    private String receiverName;

    /**
     * 收件人电话号码
     */
    @JsonProperty("receiver_phone")
    private String receiverPhone;

    /**
     * 必填，下单时间开始时间的时间戳，指格林威治时间 1970 年 01 月 01 日 00 时 00 分 00 秒(北京时间 1970 年 01 月 01 日 08 时 00 分 00 秒)起至现在的总秒数
     */
    @JsonProperty("start_created_at")
    private Long startCreatedAt;

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
        return "pdd.order.search.order";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddOrderSearchOrderResponse> getResponseClass() {
        return PddOrderSearchOrderResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "end_created_at", endCreatedAt);
        setUserParam(params, "receiver_name", receiverName);
        setUserParam(params, "receiver_phone", receiverPhone);
        setUserParam(params, "start_created_at", startCreatedAt);
    }

    public void setEndCreatedAt(Long endCreatedAt) {
        this.endCreatedAt = endCreatedAt;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public void setStartCreatedAt(Long startCreatedAt) {
        this.startCreatedAt = startCreatedAt;
    }
}