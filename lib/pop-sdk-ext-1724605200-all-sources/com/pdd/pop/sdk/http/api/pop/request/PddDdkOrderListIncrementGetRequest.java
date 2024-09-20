package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddDdkOrderListIncrementGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddDdkOrderListIncrementGetRequest extends PopBaseHttpRequest<PddDdkOrderListIncrementGetResponse> {

    /**
     * 是否为礼金订单，查询礼金订单时，订单类型不填（默认推广订单）。
     */
    @JsonProperty("cash_gift_order")
    private Boolean cashGiftOrder;

    /**
     * 查询结束时间，和开始时间相差不能超过24小时。note：此时间为时间戳，指格林威治时间 1970 年01 月 01 日 00 时 00 分 00 秒(北京时间 1970 年 01 月 01 日 08 时 00 分 00 秒)起至现在的总秒数
     */
    @JsonProperty("end_update_time")
    private Long endUpdateTime;

    /**
     * 第几页，从1到10000，默认1，注：使用最后更新时间范围增量同步时，必须采用倒序的分页方式（从最后一页往回取）才能避免漏单问题。
     */
    @JsonProperty("page")
    private Integer page;

    /**
     * 返回的每页结果订单数，默认为100，范围为10到100，建议使用40~50，可以提高成功率，减少超时数量。
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 订单类型：1-推广订单；2-直播间订单
     */
    @JsonProperty("query_order_type")
    private Integer queryOrderType;

    /**
     * 是否返回总数，默认为true，如果指定false, 则返回的结果中不包含总记录数，通过此种方式获取增量数据，效率在原有的基础上有80%的提升。
     */
    @JsonProperty("return_count")
    private Boolean returnCount;

    /**
     * 最近90天内多多进宝商品订单更新时间--查询时间开始。note：此时间为时间戳，指格林威治时间 1970 年01 月 01 日 00 时 00 分 00 秒(北京时间 1970 年 01 月 01 日 08 时 00 分 00 秒)起至现在的总秒数
     */
    @JsonProperty("start_update_time")
    private Long startUpdateTime;

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
        return "pdd.ddk.order.list.increment.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkOrderListIncrementGetResponse> getResponseClass() {
        return PddDdkOrderListIncrementGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "cash_gift_order", cashGiftOrder);
        setUserParam(params, "end_update_time", endUpdateTime);
        setUserParam(params, "page", page);
        setUserParam(params, "page_size", pageSize);
        setUserParam(params, "query_order_type", queryOrderType);
        setUserParam(params, "return_count", returnCount);
        setUserParam(params, "start_update_time", startUpdateTime);
    }

    public void setCashGiftOrder(Boolean cashGiftOrder) {
        this.cashGiftOrder = cashGiftOrder;
    }

    public void setEndUpdateTime(Long endUpdateTime) {
        this.endUpdateTime = endUpdateTime;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setQueryOrderType(Integer queryOrderType) {
        this.queryOrderType = queryOrderType;
    }

    public void setReturnCount(Boolean returnCount) {
        this.returnCount = returnCount;
    }

    public void setStartUpdateTime(Long startUpdateTime) {
        this.startUpdateTime = startUpdateTime;
    }
}