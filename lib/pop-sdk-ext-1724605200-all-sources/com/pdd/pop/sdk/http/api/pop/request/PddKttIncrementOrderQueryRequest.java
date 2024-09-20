package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKttIncrementOrderQueryResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddKttIncrementOrderQueryRequest extends PopBaseHttpRequest<PddKttIncrementOrderQueryResponse> {

    /**
     * 团号
     */
    @JsonProperty("activity_no")
    private String activityNo;

    /**
     * 售后状态, 可选 0-未发起售后 1-退款中 2-退款成功 3-待处理 4-拒绝退款 6-待(顾客)退货 7-待(团长)确认退货 8-(顾客)撤销 9-(系统)关闭
     */
    @JsonProperty("after_sales_status")
    private Integer afterSalesStatus;

    /**
     * 取消状态, 可选 0-未取消 1-已取消
     */
    @JsonProperty("cancel_status")
    private Integer cancelStatus;

    /**
     * 更新结束时间
     */
    @JsonProperty("end_updated_at")
    private Long endUpdatedAt;

    /**
     * 页码
     */
    @JsonProperty("page_number")
    private Integer pageNumber;

    /**
     * 数量
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 发货状态, 可选 0-未发货 1-已发货 2-部分发货 3-已收货
     */
    @JsonProperty("shipping_status")
    private Integer shippingStatus;

    /**
     * 更新起始时间
     */
    @JsonProperty("start_updated_at")
    private Long startUpdatedAt;

    /**
     * 核销状态, 可选 0-未核销 1-已核销 2-部分核销
     */
    @JsonProperty("verification_status")
    private Integer verificationStatus;

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
        return "pdd.ktt.increment.order.query";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKttIncrementOrderQueryResponse> getResponseClass() {
        return PddKttIncrementOrderQueryResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "activity_no", activityNo);
        setUserParam(params, "after_sales_status", afterSalesStatus);
        setUserParam(params, "cancel_status", cancelStatus);
        setUserParam(params, "end_updated_at", endUpdatedAt);
        setUserParam(params, "page_number", pageNumber);
        setUserParam(params, "page_size", pageSize);
        setUserParam(params, "shipping_status", shippingStatus);
        setUserParam(params, "start_updated_at", startUpdatedAt);
        setUserParam(params, "verification_status", verificationStatus);
    }

    public void setActivityNo(String activityNo) {
        this.activityNo = activityNo;
    }

    public void setAfterSalesStatus(Integer afterSalesStatus) {
        this.afterSalesStatus = afterSalesStatus;
    }

    public void setCancelStatus(Integer cancelStatus) {
        this.cancelStatus = cancelStatus;
    }

    public void setEndUpdatedAt(Long endUpdatedAt) {
        this.endUpdatedAt = endUpdatedAt;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setShippingStatus(Integer shippingStatus) {
        this.shippingStatus = shippingStatus;
    }

    public void setStartUpdatedAt(Long startUpdatedAt) {
        this.startUpdatedAt = startUpdatedAt;
    }

    public void setVerificationStatus(Integer verificationStatus) {
        this.verificationStatus = verificationStatus;
    }
}