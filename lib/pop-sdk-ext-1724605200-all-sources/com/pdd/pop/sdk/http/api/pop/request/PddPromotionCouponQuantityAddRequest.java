package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddPromotionCouponQuantityAddResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddPromotionCouponQuantityAddRequest extends PopBaseHttpRequest<PddPromotionCouponQuantityAddResponse> {

    /**
     * 券批次ID
     */
    @JsonProperty("batch_id")
    private Long batchId;

    /**
     * 要增加的数量
     */
    @JsonProperty("add_quantity")
    private Long addQuantity;

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
        return "pdd.promotion.coupon.quantity.add";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddPromotionCouponQuantityAddResponse> getResponseClass() {
        return PddPromotionCouponQuantityAddResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "batch_id", batchId);
        setUserParam(params, "add_quantity", addQuantity);
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    public void setAddQuantity(Long addQuantity) {
        this.addQuantity = addQuantity;
    }
}