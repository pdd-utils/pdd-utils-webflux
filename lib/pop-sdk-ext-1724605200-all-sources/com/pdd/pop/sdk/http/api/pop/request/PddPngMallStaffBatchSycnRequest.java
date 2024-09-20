package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddPngMallStaffBatchSycnResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddPngMallStaffBatchSycnRequest extends PopBaseHttpRequest<PddPngMallStaffBatchSycnResponse> {

    /**
     * 长度最小为1，最大为100
     */
    @JsonProperty("staff_ids")
    private List<Long> staffIds;

    /**
     * 目标店铺Id
     */
    @JsonProperty("to_mall_id")
    private Long toMallId;

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
        return "pdd.png.mall.staff.batch.sycn";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddPngMallStaffBatchSycnResponse> getResponseClass() {
        return PddPngMallStaffBatchSycnResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "staff_ids", staffIds);
        setUserParam(params, "to_mall_id", toMallId);
    }

    public void setStaffIds(List<Long> staffIds) {
        this.staffIds = staffIds;
    }

    public void setToMallId(Long toMallId) {
        this.toMallId = toMallId;
    }
}