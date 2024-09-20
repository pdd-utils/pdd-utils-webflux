package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddPromotionCouponCloseResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddPromotionCouponCloseRequest extends PopBaseHttpRequest<PddPromotionCouponCloseResponse> {

    /**
     * 券批次ID
     */
    @JsonProperty("batch_id")
    private Long batchId;

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
        return "pdd.promotion.coupon.close";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddPromotionCouponCloseResponse> getResponseClass() {
        return PddPromotionCouponCloseResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "batch_id", batchId);
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }
}