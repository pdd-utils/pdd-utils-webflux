package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddDdkOrderListRangeGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddDdkOrderListRangeGetRequest extends PopBaseHttpRequest<PddDdkOrderListRangeGetResponse> {

    /**
     * 是否为礼金订单，查询礼金订单时，订单类型不填（默认推广订单）。
     */
    @JsonProperty("cash_gift_order")
    private Boolean cashGiftOrder;

    /**
     * 支付结束时间，格式: "yyyy-MM-dd HH:mm:ss" ，比如 "2020-12-01 00:00:00"
     */
    @JsonProperty("end_time")
    private String endTime;

    /**
     * 上一次的迭代器id(第一次不填)
     */
    @JsonProperty("last_order_id")
    private String lastOrderId;

    /**
     * 每次请求多少条，建议300
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 订单类型：1-推广订单；2-直播间订单
     */
    @JsonProperty("query_order_type")
    private Integer queryOrderType;

    /**
     * 支付起始时间，格式: "yyyy-MM-dd HH:mm:ss" ，比如 "2020-12-01 00:00:00"
     */
    @JsonProperty("start_time")
    private String startTime;

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
        return "pdd.ddk.order.list.range.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkOrderListRangeGetResponse> getResponseClass() {
        return PddDdkOrderListRangeGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "cash_gift_order", cashGiftOrder);
        setUserParam(params, "end_time", endTime);
        setUserParam(params, "last_order_id", lastOrderId);
        setUserParam(params, "page_size", pageSize);
        setUserParam(params, "query_order_type", queryOrderType);
        setUserParam(params, "start_time", startTime);
    }

    public void setCashGiftOrder(Boolean cashGiftOrder) {
        this.cashGiftOrder = cashGiftOrder;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setLastOrderId(String lastOrderId) {
        this.lastOrderId = lastOrderId;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setQueryOrderType(Integer queryOrderType) {
        this.queryOrderType = queryOrderType;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
}