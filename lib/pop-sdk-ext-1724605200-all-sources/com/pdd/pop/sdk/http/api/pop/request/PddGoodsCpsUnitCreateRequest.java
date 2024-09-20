package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsCpsUnitCreateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddGoodsCpsUnitCreateRequest extends PopBaseHttpRequest<PddGoodsCpsUnitCreateResponse> {

    /**
     * 批量设置商品字符串，按照此格式来填写，具体参数见下。注意：创建优惠券时，必须优惠券几个参数都填，否则商品能创建成功,但是默认没有优惠券：[{"goods_id":10000,"rate":2,"coupon_id":123456,"coupon_start_time":1572345,"coupon_end_time":1576482,"discount":300,"init_quantity":600,"remain_quantity":560,"duration":30},{...}........]
     */
    @JsonProperty("units")
    private List<UnitsItem> units;

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
        return "pdd.goods.cps.unit.create";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsCpsUnitCreateResponse> getResponseClass() {
        return PddGoodsCpsUnitCreateResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "units", units);
    }

    public void setUnits(List<UnitsItem> units) {
        this.units = units;
    }

    public static class UnitsItem {

        /**
         * 商品id
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 佣金比例（千分比）
         */
        @JsonProperty("rate")
        private Long rate;

        /**
         * 优惠券id
         */
        @JsonProperty("coupon_id")
        private Long couponId;

        /**
         * 优惠券开始时间，商品售价>=10元必传
         */
        @JsonProperty("coupon_start_time")
        private String couponStartTime;

        /**
         * 优惠券结束时间，商品售价>=10元必传
         */
        @JsonProperty("coupon_end_time")
        private String couponEndTime;

        /**
         * 优惠券面额（单位为分），商品售价>=10元必传
         */
        @JsonProperty("discount")
        private Long discount;

        /**
         * 设置的优惠券张数，商品售价>=10元必传
         */
        @JsonProperty("init_quantity")
        private Long initQuantity;

        /**
         * 剩余的优惠券张数，商品售价>=10元必传
         */
        @JsonProperty("remain_quantity")
        private Long remainQuantity;

        /**
         * 优惠券领取后的有效使用时间天数
         */
        @JsonProperty("duration")
        private Integer duration;

        public void setGoodsId(Long goodsId) {
            this.goodsId = goodsId;
        }

        public void setRate(Long rate) {
            this.rate = rate;
        }

        public void setCouponId(Long couponId) {
            this.couponId = couponId;
        }

        public void setCouponStartTime(String couponStartTime) {
            this.couponStartTime = couponStartTime;
        }

        public void setCouponEndTime(String couponEndTime) {
            this.couponEndTime = couponEndTime;
        }

        public void setDiscount(Long discount) {
            this.discount = discount;
        }

        public void setInitQuantity(Long initQuantity) {
            this.initQuantity = initQuantity;
        }

        public void setRemainQuantity(Long remainQuantity) {
            this.remainQuantity = remainQuantity;
        }

        public void setDuration(Integer duration) {
            this.duration = duration;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}