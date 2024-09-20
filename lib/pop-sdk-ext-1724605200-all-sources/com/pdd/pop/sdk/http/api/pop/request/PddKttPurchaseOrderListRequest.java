package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKttPurchaseOrderListResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddKttPurchaseOrderListRequest extends PopBaseHttpRequest<PddKttPurchaseOrderListResponse> {

    /**
     * 售后状态：0-未发起售后，1-待供货商处理，2-已退款，3-已同意退款，待入账，4-待团长处理，5-已同意退货，待团长退货，6-团长已退货，待供货商确认收货，7-已撤销，8-已驳回，9-退款失败
     */
    @JsonProperty("after_sales_status")
    private Integer afterSalesStatus;

    /**
     * 取消状态（0：未取消，1：已取消）
     */
    @JsonProperty("cancel_status")
    private Integer cancelStatus;

    /**
     * 截止更新时间（含）（毫秒）
     */
    @JsonProperty("end_updated_time")
    private Long endUpdatedTime;

    /**
     * 页码
     */
    @JsonProperty("page_no")
    private Integer pageNo;

    /**
     * 分页size（1-20）
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 发货状态（0：未发货+部分发货 1：已发货 2：未发货 3：部分发货）
     */
    @JsonProperty("shipping_status")
    private Integer shippingStatus;

    /**
     * 起始更新时间（含）（毫秒）
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
        return "pdd.ktt.purchase.order.list";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKttPurchaseOrderListResponse> getResponseClass() {
        return PddKttPurchaseOrderListResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "after_sales_status", afterSalesStatus);
        setUserParam(params, "cancel_status", cancelStatus);
        setUserParam(params, "end_updated_time", endUpdatedTime);
        setUserParam(params, "page_no", pageNo);
        setUserParam(params, "page_size", pageSize);
        setUserParam(params, "shipping_status", shippingStatus);
        setUserParam(params, "start_update_time", startUpdateTime);
    }

    public void setAfterSalesStatus(Integer afterSalesStatus) {
        this.afterSalesStatus = afterSalesStatus;
    }

    public void setCancelStatus(Integer cancelStatus) {
        this.cancelStatus = cancelStatus;
    }

    public void setEndUpdatedTime(Long endUpdatedTime) {
        this.endUpdatedTime = endUpdatedTime;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setShippingStatus(Integer shippingStatus) {
        this.shippingStatus = shippingStatus;
    }

    public void setStartUpdateTime(Long startUpdateTime) {
        this.startUpdateTime = startUpdateTime;
    }
}