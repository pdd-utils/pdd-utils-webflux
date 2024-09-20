package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddServicemarketSettlementbillGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddServicemarketSettlementbillGetRequest extends PopBaseHttpRequest<PddServicemarketSettlementbillGetResponse> {

    /**
     * 分页页码，最大不能超过1000
     */
    @JsonProperty("page")
    private Integer page;

    /**
     * 分页大小，最大不能超过100
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 服务订单号
     */
    @JsonProperty("service_order_sn")
    private String serviceOrderSn;

    /**
     * 结算月份
     */
    @JsonProperty("settle_month")
    private String settleMonth;

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
        return "pdd.servicemarket.settlementbill.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddServicemarketSettlementbillGetResponse> getResponseClass() {
        return PddServicemarketSettlementbillGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "page", page);
        setUserParam(params, "page_size", pageSize);
        setUserParam(params, "service_order_sn", serviceOrderSn);
        setUserParam(params, "settle_month", settleMonth);
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setServiceOrderSn(String serviceOrderSn) {
        this.serviceOrderSn = serviceOrderSn;
    }

    public void setSettleMonth(String settleMonth) {
        this.settleMonth = settleMonth;
    }
}