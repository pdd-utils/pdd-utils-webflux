package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddOpenOrderChannelReportResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddOpenOrderChannelReportRequest extends PopBaseHttpRequest<PddOpenOrderChannelReportResponse> {

    /**
     * 订单渠道，0-非代发订单，1-平台内部代发，2-平台外部代发
     */
    @JsonProperty("order_channel")
    private Integer orderChannel;

    /**
     * 订单号列表, 大小不能超过100
     */
    @JsonProperty("order_sn_list")
    private List<String> orderSnList;

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
        return "pdd.open.order.channel.report";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddOpenOrderChannelReportResponse> getResponseClass() {
        return PddOpenOrderChannelReportResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "order_channel", orderChannel);
        setUserParam(params, "order_sn_list", orderSnList);
    }

    public void setOrderChannel(Integer orderChannel) {
        this.orderChannel = orderChannel;
    }

    public void setOrderSnList(List<String> orderSnList) {
        this.orderSnList = orderSnList;
    }
}