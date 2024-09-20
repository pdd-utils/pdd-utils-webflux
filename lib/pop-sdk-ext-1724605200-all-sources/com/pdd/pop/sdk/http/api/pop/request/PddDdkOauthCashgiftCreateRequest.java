package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddDdkOauthCashgiftCreateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddDdkOauthCashgiftCreateRequest extends PopBaseHttpRequest<PddDdkOauthCashgiftCreateResponse> {

    /**
     * 券批次领取结束时间。note：此时间为时间戳，指格林威治时间 1970 年01 月 01 日 00 时 00 分 00 秒(北京时间 1970 年 01 月 01 日 08 时 00 分 00 秒)起至现在的总秒数
     */
    @JsonProperty("acquire_end_time")
    private Long acquireEndTime;

    /**
     * 券批次领取开始时间。note：此时间为时间戳，指格林威治时间 1970 年01 月 01 日 00 时 00 分 00 秒(北京时间 1970 年 01 月 01 日 08 时 00 分 00 秒)起至现在的总秒数
     */
    @JsonProperty("acquire_start_time")
    private Long acquireStartTime;

    /**
     * 是否自动领券，默认false不自动领券
     */
    @JsonProperty("auto_take")
    private Boolean autoTake;

    /**
     * 礼金券面额，单位为分，创建固定面额礼金券必填（创建灵活面额礼金券时，券面额 = 商品券后价 - 期望礼金券后价）
     */
    @JsonProperty("coupon_amount")
    private Integer couponAmount;

    /**
     * 满减门槛，单位为分。满减门槛至少需为礼金券面额的2倍，仅对固定面额礼金券生效。
     */
    @JsonProperty("coupon_threshold_amount")
    private Integer couponThresholdAmount;

    /**
     * 活动持续时间，validity_time_type为 1 时必填。相对时间类型为天级时，最大值为30，即领取后30天内有效；相对时间类型为小时级时，最大值为24，即领取后24小时内有效；相对时间类型为分钟级时，则最大值为60，即领取后60分钟内有效。
     */
    @JsonProperty("duration")
    private Integer duration;

    /**
     * 期望礼金券后价，单位为分，最小值为1。创建灵活券 (generate_flexible_coupon为true) 时必填
     */
    @JsonProperty("except_amount")
    private Integer exceptAmount;

    /**
     * 领券是否过风控，默认true为过风控。
     */
    @JsonProperty("fetch_risk_check")
    private Boolean fetchRiskCheck;

    /**
     * 收益保护开关开启(rate_decrease_monitor = true)时必填。0-监控项发生降低；1-监控项低于礼金面额，默认为0。
     */
    @JsonProperty("freeze_condition")
    private Integer freezeCondition;

    /**
     * 收益保护开关开启(rate_decrease_monitor = true)时必填。0-佣金；1-补贴；2-佣金+补贴，默认为0。
     */
    @JsonProperty("freeze_watch_type")
    private Integer freezeWatchType;

    /**
     * 是否为灵活面额礼金券，默认false为固定面额礼金券
     */
    @JsonProperty("generate_flexible_coupon")
    private Boolean generateFlexibleCoupon;

    /**
     * 是否开启全场景推广，默认false不开启全场景推广，仅支持固定面额且限定商品的礼金活动。
     */
    @JsonProperty("generate_global")
    private Boolean generateGlobal;

    /**
     * 商品goodsSign列表，例如：["c9r2omogKFFAc7WBwvbZU1ikIb16_J3CTa8HNN"]，最多可支持传20个商品；若传空，则为不限商品礼金，不支持创建不限商品灵活礼金。goodsSign使用说明：https: jinbao.pinduoduo.com/qa-system?questionId=252
     */
    @JsonProperty("goods_sign_list")
    private List<String> goodsSignList;

    /**
     * 活动单链接可领券数量，默认无限制，最小值为1。
     */
    @JsonProperty("link_acquire_limit")
    private Long linkAcquireLimit;

    /**
     * 礼金名称
     */
    @JsonProperty("name")
    private String name;

    /**
     * 可使用推广位列表，例如：["60005_612"]。(列表中的PID方可推广该礼金)
     */
    @JsonProperty("p_id_list")
    private List<PIdListItem> pIdList;

    /**
     * 礼金券数量，创建固定面额礼金券必填（创建灵活面额礼金券时，礼金券数量不固定，礼金总预算用完为止）
     */
    @JsonProperty("quantity")
    private Long quantity;

    /**
     * 收益保护开关，默认false表示关闭，仅支持固定面额且限定商品的礼金活动。开启状态下，系统将根据设置内容进行监控，当监控项满足冻结条件时，系统自动冻结礼金暂停推广，防止资金损失。（可通过多多礼金状态更新接口自行恢复推广）
     */
    @JsonProperty("rate_decrease_monitor")
    private Boolean rateDecreaseMonitor;

    /**
     * 相对时间类型：1-天级；2-小时级；3-分钟级，有效期类型validityTimeType = 1时必填，默认为1。 例如: relative_time_type = 2, duration = 15, 表示领取后15小时内有效。
     */
    @JsonProperty("relative_time_type")
    private Integer relativeTimeType;

    /**
     * 礼金总预算，单位为分，创建灵活券 (generate_flexible_coupon为true) 时必填。默认情况，总金额 = 礼金券数量  礼金券面额
     */
    @JsonProperty("total_amount")
    private Long totalAmount;

    /**
     * 单用户可领券数量，可设置范围为1~10张，默认为1张。
     */
    @JsonProperty("user_limit")
    private Integer userLimit;

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
        return "pdd.ddk.oauth.cashgift.create";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkOauthCashgiftCreateResponse> getResponseClass() {
        return PddDdkOauthCashgiftCreateResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "acquire_end_time", acquireEndTime);
        setUserParam(params, "acquire_start_time", acquireStartTime);
        setUserParam(params, "auto_take", autoTake);
        setUserParam(params, "coupon_amount", couponAmount);
        setUserParam(params, "coupon_threshold_amount", couponThresholdAmount);
        setUserParam(params, "duration", duration);
        setUserParam(params, "except_amount", exceptAmount);
        setUserParam(params, "fetch_risk_check", fetchRiskCheck);
        setUserParam(params, "freeze_condition", freezeCondition);
        setUserParam(params, "freeze_watch_type", freezeWatchType);
        setUserParam(params, "generate_flexible_coupon", generateFlexibleCoupon);
        setUserParam(params, "generate_global", generateGlobal);
        setUserParam(params, "goods_sign_list", goodsSignList);
        setUserParam(params, "link_acquire_limit", linkAcquireLimit);
        setUserParam(params, "name", name);
        setUserParam(params, "p_id_list", pIdList);
        setUserParam(params, "quantity", quantity);
        setUserParam(params, "rate_decrease_monitor", rateDecreaseMonitor);
        setUserParam(params, "relative_time_type", relativeTimeType);
        setUserParam(params, "total_amount", totalAmount);
        setUserParam(params, "user_limit", userLimit);
    }

    public void setAcquireEndTime(Long acquireEndTime) {
        this.acquireEndTime = acquireEndTime;
    }

    public void setAcquireStartTime(Long acquireStartTime) {
        this.acquireStartTime = acquireStartTime;
    }

    public void setAutoTake(Boolean autoTake) {
        this.autoTake = autoTake;
    }

    public void setCouponAmount(Integer couponAmount) {
        this.couponAmount = couponAmount;
    }

    public void setCouponThresholdAmount(Integer couponThresholdAmount) {
        this.couponThresholdAmount = couponThresholdAmount;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public void setExceptAmount(Integer exceptAmount) {
        this.exceptAmount = exceptAmount;
    }

    public void setFetchRiskCheck(Boolean fetchRiskCheck) {
        this.fetchRiskCheck = fetchRiskCheck;
    }

    public void setFreezeCondition(Integer freezeCondition) {
        this.freezeCondition = freezeCondition;
    }

    public void setFreezeWatchType(Integer freezeWatchType) {
        this.freezeWatchType = freezeWatchType;
    }

    public void setGenerateFlexibleCoupon(Boolean generateFlexibleCoupon) {
        this.generateFlexibleCoupon = generateFlexibleCoupon;
    }

    public void setGenerateGlobal(Boolean generateGlobal) {
        this.generateGlobal = generateGlobal;
    }

    public void setGoodsSignList(List<String> goodsSignList) {
        this.goodsSignList = goodsSignList;
    }

    public void setLinkAcquireLimit(Long linkAcquireLimit) {
        this.linkAcquireLimit = linkAcquireLimit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPIdList(List<PIdListItem> pIdList) {
        this.pIdList = pIdList;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public void setRateDecreaseMonitor(Boolean rateDecreaseMonitor) {
        this.rateDecreaseMonitor = rateDecreaseMonitor;
    }

    public void setRelativeTimeType(Integer relativeTimeType) {
        this.relativeTimeType = relativeTimeType;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setUserLimit(Integer userLimit) {
        this.userLimit = userLimit;
    }

    public static class PIdListItem {

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}