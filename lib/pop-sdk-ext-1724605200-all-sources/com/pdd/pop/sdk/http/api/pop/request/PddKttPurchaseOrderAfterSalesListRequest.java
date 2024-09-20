package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKttPurchaseOrderAfterSalesListResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddKttPurchaseOrderAfterSalesListRequest extends PopBaseHttpRequest<PddKttPurchaseOrderAfterSalesListResponse> {

    /**
     * 售后状态：不传 -全部，1-待供货商处理，2-已退款，3-已同意退款，待入账，4-待团长处理，5-已同意退货，待团长退货，6-团长已退货，待供货商确认收货，7-已撤销，8-已驳回，9-退款失败
     */
    @JsonProperty("open_after_sales_status")
    private Integer openAfterSalesStatus;

    /**
     * 页码
     */
    @JsonProperty("page_no")
    private Integer pageNo;

    /**
     * 分页大小（1-50）
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 父单号
     */
    @JsonProperty("parent_order_sn")
    private String parentOrderSn;

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
        return "pdd.ktt.purchase.order.after.sales.list";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKttPurchaseOrderAfterSalesListResponse> getResponseClass() {
        return PddKttPurchaseOrderAfterSalesListResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "open_after_sales_status", openAfterSalesStatus);
        setUserParam(params, "page_no", pageNo);
        setUserParam(params, "page_size", pageSize);
        setUserParam(params, "parent_order_sn", parentOrderSn);
    }

    public void setOpenAfterSalesStatus(Integer openAfterSalesStatus) {
        this.openAfterSalesStatus = openAfterSalesStatus;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setParentOrderSn(String parentOrderSn) {
        this.parentOrderSn = parentOrderSn;
    }
}