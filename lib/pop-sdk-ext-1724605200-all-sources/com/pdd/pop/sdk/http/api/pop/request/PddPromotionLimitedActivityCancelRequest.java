package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddPromotionLimitedActivityCancelResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddPromotionLimitedActivityCancelRequest extends PopBaseHttpRequest<PddPromotionLimitedActivityCancelResponse> {

    /**
     * 活动id
     */
    @JsonProperty("detail_id")
    private Long detailId;

    /**
     * 商品id
     */
    @JsonProperty("goods_id")
    private Long goodsId;

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
        return "pdd.promotion.limited.activity.cancel";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddPromotionLimitedActivityCancelResponse> getResponseClass() {
        return PddPromotionLimitedActivityCancelResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "detail_id", detailId);
        setUserParam(params, "goods_id", goodsId);
    }

    public void setDetailId(Long detailId) {
        this.detailId = detailId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }
}