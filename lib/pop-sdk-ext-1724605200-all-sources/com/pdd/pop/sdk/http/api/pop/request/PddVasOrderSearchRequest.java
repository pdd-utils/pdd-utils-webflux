package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddVasOrderSearchResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddVasOrderSearchRequest extends PopBaseHttpRequest<PddVasOrderSearchResponse> {

    /**
     * 创建时间结束，UNIX时间戳（ms 级别），默认为当前时间，支持最大范围为7天。
     */
    @JsonProperty("create_time_end")
    private Long createTimeEnd;

    /**
     * 创建时间开始，UNIX时间戳（ms级别），默认为当前时间往前推7天，支持最大范围为7天。
     */
    @JsonProperty("create_time_start")
    private Long createTimeStart;

    /**
     * 买家店铺id
     */
    @JsonProperty("mall_id")
    private Long mallId;

    /**
     * 服务订单号
     */
    @JsonProperty("order_sn")
    private String orderSn;

    /**
     * 订单状态，枚举值，0-未完成，1-已完成，2-已取消，空-全部
     */
    @JsonProperty("order_status")
    private Integer orderStatus;

    /**
     * 分页页码
     */
    @JsonProperty("page")
    private Integer page;

    /**
     * 分页大小，最大支持100
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 支付时间开始，UNIX时间戳（ms 级别）
     */
    @JsonProperty("pay_time_end")
    private Long payTimeEnd;

    /**
     * 支付时间开始，UNIX时间戳（ms 级别）
     */
    @JsonProperty("pay_time_start")
    private Long payTimeStart;

    /**
     * 服务sku_id，可在服务详情页中获取
     */
    @JsonProperty("sku_id")
    private Long skuId;

    /**
     * 售后状态，0-未售后，1-已售后
     */
    @JsonProperty("refund_status")
    private Integer refundStatus;

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
        return "pdd.vas.order.search";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddVasOrderSearchResponse> getResponseClass() {
        return PddVasOrderSearchResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "create_time_end", createTimeEnd);
        setUserParam(params, "create_time_start", createTimeStart);
        setUserParam(params, "mall_id", mallId);
        setUserParam(params, "order_sn", orderSn);
        setUserParam(params, "order_status", orderStatus);
        setUserParam(params, "page", page);
        setUserParam(params, "page_size", pageSize);
        setUserParam(params, "pay_time_end", payTimeEnd);
        setUserParam(params, "pay_time_start", payTimeStart);
        setUserParam(params, "sku_id", skuId);
        setUserParam(params, "refund_status", refundStatus);
    }

    public void setCreateTimeEnd(Long createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
    }

    public void setCreateTimeStart(Long createTimeStart) {
        this.createTimeStart = createTimeStart;
    }

    public void setMallId(Long mallId) {
        this.mallId = mallId;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
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

    public void setPayTimeEnd(Long payTimeEnd) {
        this.payTimeEnd = payTimeEnd;
    }

    public void setPayTimeStart(Long payTimeStart) {
        this.payTimeStart = payTimeStart;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
    }
}