package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsCpsUnitChangeResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddGoodsCpsUnitChangeRequest extends PopBaseHttpRequest<PddGoodsCpsUnitChangeResponse> {

    /**
     * 优惠券结束时间
     */
    @JsonProperty("coupon_end_time")
    private String couponEndTime;

    /**
     * 优惠券id
     */
    @JsonProperty("coupon_id")
    private Long couponId;

    /**
     * 优惠券号
     */
    @JsonProperty("coupon_sn")
    private String couponSn;

    /**
     * 优惠券开始时间
     */
    @JsonProperty("coupon_start_time")
    private String couponStartTime;

    /**
     * 优惠券面额（单位为分）
     */
    @JsonProperty("discount")
    private Integer discount;

    /**
     * 商品id
     */
    @JsonProperty("goods_id")
    private Long goodsId;

    /**
     * 设置的优惠券张数
     */
    @JsonProperty("init_quantity")
    private Long initQuantity;

    /**
     * 佣金比例（千分比）
     */
    @JsonProperty("rate")
    private Integer rate;

    /**
     * 优惠券剩余数量
     */
    @JsonProperty("remain_quantity")
    private Long remainQuantity;

    /**
     * 优惠券领取后的有效使用时间天数
     */
    @JsonProperty("duration")
    private Integer duration;

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
        return "pdd.goods.cps.unit.change";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsCpsUnitChangeResponse> getResponseClass() {
        return PddGoodsCpsUnitChangeResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "coupon_end_time", couponEndTime);
        setUserParam(params, "coupon_id", couponId);
        setUserParam(params, "coupon_sn", couponSn);
        setUserParam(params, "coupon_start_time", couponStartTime);
        setUserParam(params, "discount", discount);
        setUserParam(params, "goods_id", goodsId);
        setUserParam(params, "init_quantity", initQuantity);
        setUserParam(params, "rate", rate);
        setUserParam(params, "remain_quantity", remainQuantity);
        setUserParam(params, "duration", duration);
    }

    public void setCouponEndTime(String couponEndTime) {
        this.couponEndTime = couponEndTime;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public void setCouponSn(String couponSn) {
        this.couponSn = couponSn;
    }

    public void setCouponStartTime(String couponStartTime) {
        this.couponStartTime = couponStartTime;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public void setInitQuantity(Long initQuantity) {
        this.initQuantity = initQuantity;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public void setRemainQuantity(Long remainQuantity) {
        this.remainQuantity = remainQuantity;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}