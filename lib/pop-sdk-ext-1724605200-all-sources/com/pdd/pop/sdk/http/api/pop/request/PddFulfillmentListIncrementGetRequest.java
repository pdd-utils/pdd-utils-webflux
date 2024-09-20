package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddFulfillmentListIncrementGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddFulfillmentListIncrementGetRequest extends PopBaseHttpRequest<PddFulfillmentListIncrementGetResponse> {

    /**
     * 更新时间终止（秒）
     */
    @JsonProperty("end_update_at")
    private Integer endUpdateAt;

    /**
     * 跨境全托管发货单状态。0-全部，1-待发货，2-已发货待签收，3-已签收
     */
    @JsonProperty("fulfillment_status")
    private Integer fulfillmentStatus;

    /**
     * 页码
     */
    @JsonProperty("page_number")
    private Integer pageNumber;

    /**
     * 页面大小
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 更新时间起始（秒）
     */
    @JsonProperty("start_update_at")
    private Integer startUpdateAt;

    /**
     * 是否启用has_next的分页方式，默认为true。如果指定true，则返回的结果中不包含总记录数，但是会新增一个是否存在下一页的的字段。
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
        return "pdd.fulfillment.list.increment.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddFulfillmentListIncrementGetResponse> getResponseClass() {
        return PddFulfillmentListIncrementGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "end_update_at", endUpdateAt);
        setUserParam(params, "fulfillment_status", fulfillmentStatus);
        setUserParam(params, "page_number", pageNumber);
        setUserParam(params, "page_size", pageSize);
        setUserParam(params, "start_update_at", startUpdateAt);
        setUserParam(params, "use_has_next", useHasNext);
    }

    public void setEndUpdateAt(Integer endUpdateAt) {
        this.endUpdateAt = endUpdateAt;
    }

    public void setFulfillmentStatus(Integer fulfillmentStatus) {
        this.fulfillmentStatus = fulfillmentStatus;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setStartUpdateAt(Integer startUpdateAt) {
        this.startUpdateAt = startUpdateAt;
    }

    public void setUseHasNext(Boolean useHasNext) {
        this.useHasNext = useHasNext;
    }
}