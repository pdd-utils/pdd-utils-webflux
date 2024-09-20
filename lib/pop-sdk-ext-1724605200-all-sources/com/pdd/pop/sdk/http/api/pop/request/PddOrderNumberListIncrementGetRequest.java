package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddOrderNumberListIncrementGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddOrderNumberListIncrementGetRequest extends PopBaseHttpRequest<PddOrderNumberListIncrementGetResponse> {

    /**
     * 必填，最后更新时间结束时间的时间戳，指格林威治时间 1970 年 01 月 01 日 00 时 00 分 00 秒(北京时间 1970 年 01 月 01 日 08 时
     * 00 分 00 秒)起至现在的总秒数
     * PS：开始时间结束时间间距不超过 30 分钟
     */
    @JsonProperty("end_updated_at")
    private Long endUpdatedAt;

    /**
     * 订单类型（是否抽奖订单），0-全部，1-非抽奖订单，2-抽奖订单
     */
    @JsonProperty("is_lucky_flag")
    private Integer isLuckyFlag;

    /**
     * 发货状态，1-待发货，2-已发货待签收，3-已签收，5-全部
     */
    @JsonProperty("order_status")
    private Integer orderStatus;

    /**
     * 返回页码，默认 1，页码从 1 开始 PS：当前采用分页返回，数量和页数会一起传，如果不传，则采用 默认值；注：必须采用倒序的分页方式（从最后一页往回取）才能避免漏单问题。
     */
    @JsonProperty("page")
    private Integer page;

    /**
     * 返回数量，默认 100。最大 100
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 售后状态，1-无售后或售后关闭，2-售后处理中，3-退款中，4-退款成功 5-全部
     */
    @JsonProperty("refund_status")
    private Integer refundStatus;

    /**
     * 必填，最后更新时间开始时间的时间戳，指格林威治时间 1970 年01 月 01 日 00 时 00 分 00 秒(北京时间 1970 年 01 月 01 日 08 时 00 分 00 秒)起至现在的总秒数
     */
    @JsonProperty("start_updated_at")
    private Long startUpdatedAt;

    /**
     * 订单类型： 0-普通订单、1-定金订单 不传为全部
     */
    @JsonProperty("trade_type")
    private Integer tradeType;

    /**
     * 是否启用has_next的分页方式，如果指定true,则返回的结果中不包含总记录数，但是会新增一个是否存在下一页的的字段，通过此种方式获取增量交易，效率在原有的基础上有80%的提升。
     */
    @JsonProperty("use_has_next")
    private Boolean useHasNext;

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
        return "pdd.order.number.list.increment.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddOrderNumberListIncrementGetResponse> getResponseClass() {
        return PddOrderNumberListIncrementGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "end_updated_at", endUpdatedAt);
        setUserParam(params, "is_lucky_flag", isLuckyFlag);
        setUserParam(params, "order_status", orderStatus);
        setUserParam(params, "page", page);
        setUserParam(params, "page_size", pageSize);
        setUserParam(params, "refund_status", refundStatus);
        setUserParam(params, "start_updated_at", startUpdatedAt);
        setUserParam(params, "trade_type", tradeType);
        setUserParam(params, "use_has_next", useHasNext);
    }

    public void setEndUpdatedAt(Long endUpdatedAt) {
        this.endUpdatedAt = endUpdatedAt;
    }

    public void setIsLuckyFlag(Integer isLuckyFlag) {
        this.isLuckyFlag = isLuckyFlag;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
    }

    public void setStartUpdatedAt(Long startUpdatedAt) {
        this.startUpdatedAt = startUpdatedAt;
    }

    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
    }

    public void setUseHasNext(Boolean useHasNext) {
        this.useHasNext = useHasNext;
    }
}