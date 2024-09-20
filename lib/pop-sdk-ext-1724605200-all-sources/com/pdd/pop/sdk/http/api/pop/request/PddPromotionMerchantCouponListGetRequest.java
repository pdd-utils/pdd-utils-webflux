package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddPromotionMerchantCouponListGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddPromotionMerchantCouponListGetRequest extends PopBaseHttpRequest<PddPromotionMerchantCouponListGetResponse> {

    /**
     * 页码，默认1
     */
    @JsonProperty("page")
    private Integer page;

    /**
     * 每页数量，默认100
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 批次开始时间（范围开始）
     */
    @JsonProperty("batch_start_time_from")
    private Long batchStartTimeFrom;

    /**
     * 批次开始时间（范围结束）
     */
    @JsonProperty("batch_start_time_to")
    private Long batchStartTimeTo;

    /**
     * 批次状态	1 领取中，2 已领完，3 已结束
     */
    @JsonProperty("batch_status")
    private Integer batchStatus;

    /**
     * 排序	1 创建时间正序，2 创建时间倒序，3 开始时间正序，4 开始时间倒序，5 初始数量正序， 6 初始数量倒序，7 领取数量正序，8 领取数量倒序；默认2
     */
    @JsonProperty("sort_by")
    private Integer sortBy;

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
        return "pdd.promotion.merchant.coupon.list.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddPromotionMerchantCouponListGetResponse> getResponseClass() {
        return PddPromotionMerchantCouponListGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "page", page);
        setUserParam(params, "page_size", pageSize);
        setUserParam(params, "batch_start_time_from", batchStartTimeFrom);
        setUserParam(params, "batch_start_time_to", batchStartTimeTo);
        setUserParam(params, "batch_status", batchStatus);
        setUserParam(params, "sort_by", sortBy);
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setBatchStartTimeFrom(Long batchStartTimeFrom) {
        this.batchStartTimeFrom = batchStartTimeFrom;
    }

    public void setBatchStartTimeTo(Long batchStartTimeTo) {
        this.batchStartTimeTo = batchStartTimeTo;
    }

    public void setBatchStatus(Integer batchStatus) {
        this.batchStatus = batchStatus;
    }

    public void setSortBy(Integer sortBy) {
        this.sortBy = sortBy;
    }
}