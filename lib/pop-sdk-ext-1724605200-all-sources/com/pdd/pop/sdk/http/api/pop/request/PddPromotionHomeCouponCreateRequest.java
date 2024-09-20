package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddPromotionHomeCouponCreateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddPromotionHomeCouponCreateRequest extends PopBaseHttpRequest<PddPromotionHomeCouponCreateResponse> {

    /**
     * 描述
     */
    @JsonProperty("batch_desc")
    private String batchDesc;

    /**
     * 开始时间，指到格林威治时间 1970 年 01 月 01 日 00 时 00 分 00 秒(北京时间 1970 年 01 月 01 日 08 时 00 分 00 秒)的总毫秒数
     */
    @JsonProperty("batch_start_time")
    private Long batchStartTime;

    /**
     * 结束时间，指到格林威治时间 1970 年 01 月 01 日 00 时 00 分 00 秒(北京时间 1970 年 01 月 01 日 08 时 00 分 00 秒)的总毫秒数
     */
    @JsonProperty("batch_end_time")
    private Long batchEndTime;

    /**
     * 优惠金额	单位: 分
     */
    @JsonProperty("discount")
    private Long discount;

    /**
     * 使用优惠的订单最小金额	单位: 分
     */
    @JsonProperty("min_order_amount")
    private Long minOrderAmount;

    /**
     * 可领取数量
     */
    @JsonProperty("init_quantity")
    private Long initQuantity;

    /**
     * 每个用户限领张数
     */
    @JsonProperty("user_limit")
    private Long userLimit;

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
        return "pdd.promotion.home.coupon.create";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddPromotionHomeCouponCreateResponse> getResponseClass() {
        return PddPromotionHomeCouponCreateResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "batch_desc", batchDesc);
        setUserParam(params, "batch_start_time", batchStartTime);
        setUserParam(params, "batch_end_time", batchEndTime);
        setUserParam(params, "discount", discount);
        setUserParam(params, "min_order_amount", minOrderAmount);
        setUserParam(params, "init_quantity", initQuantity);
        setUserParam(params, "user_limit", userLimit);
    }

    public void setBatchDesc(String batchDesc) {
        this.batchDesc = batchDesc;
    }

    public void setBatchStartTime(Long batchStartTime) {
        this.batchStartTime = batchStartTime;
    }

    public void setBatchEndTime(Long batchEndTime) {
        this.batchEndTime = batchEndTime;
    }

    public void setDiscount(Long discount) {
        this.discount = discount;
    }

    public void setMinOrderAmount(Long minOrderAmount) {
        this.minOrderAmount = minOrderAmount;
    }

    public void setInitQuantity(Long initQuantity) {
        this.initQuantity = initQuantity;
    }

    public void setUserLimit(Long userLimit) {
        this.userLimit = userLimit;
    }
}