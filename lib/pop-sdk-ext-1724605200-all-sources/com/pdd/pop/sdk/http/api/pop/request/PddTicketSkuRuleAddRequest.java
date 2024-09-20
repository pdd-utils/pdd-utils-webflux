package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddTicketSkuRuleAddResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddTicketSkuRuleAddRequest extends PopBaseHttpRequest<PddTicketSkuRuleAddResponse> {

    /**
     * 下单人信息设置
     */
    @JsonProperty("booker_info_limitation")
    private BookerInfoLimitation bookerInfoLimitation;

    /**
     * 预定须知
     */
    @JsonProperty("booking_notice")
    private BookingNotice bookingNotice;

    /**
     * 下单限制
     */
    @JsonProperty("order_limitation")
    private OrderLimitation orderLimitation;

    /**
     * 商户rule ID
     */
    @JsonProperty("out_rule_id")
    private String outRuleId;

    /**
     * 服务商联系方式
     */
    @JsonProperty("provider_contact_info")
    private ProviderContactInfo providerContactInfo;

    /**
     * 退款规则
     */
    @JsonProperty("refund_limitations")
    private RefundLimitations refundLimitations;

    /**
     * 商户rule 名称
     */
    @JsonProperty("rule_name")
    private String ruleName;

    /**
     * 游玩人信息
     */
    @JsonProperty("traveler_info_limitation")
    private TravelerInfoLimitation travelerInfoLimitation;

    /**
     * 卡券有效期设置
     */
    @JsonProperty("valid_limitation")
    private ValidLimitation validLimitation;

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
        return "pdd.ticket.sku.rule.add";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddTicketSkuRuleAddResponse> getResponseClass() {
        return PddTicketSkuRuleAddResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "booker_info_limitation", bookerInfoLimitation);
        setUserParam(params, "booking_notice", bookingNotice);
        setUserParam(params, "order_limitation", orderLimitation);
        setUserParam(params, "out_rule_id", outRuleId);
        setUserParam(params, "provider_contact_info", providerContactInfo);
        setUserParam(params, "refund_limitations", refundLimitations);
        setUserParam(params, "rule_name", ruleName);
        setUserParam(params, "traveler_info_limitation", travelerInfoLimitation);
        setUserParam(params, "valid_limitation", validLimitation);
    }

    public void setBookerInfoLimitation(BookerInfoLimitation bookerInfoLimitation) {
        this.bookerInfoLimitation = bookerInfoLimitation;
    }

    public void setBookingNotice(BookingNotice bookingNotice) {
        this.bookingNotice = bookingNotice;
    }

    public void setOrderLimitation(OrderLimitation orderLimitation) {
        this.orderLimitation = orderLimitation;
    }

    public void setOutRuleId(String outRuleId) {
        this.outRuleId = outRuleId;
    }

    public void setProviderContactInfo(ProviderContactInfo providerContactInfo) {
        this.providerContactInfo = providerContactInfo;
    }

    public void setRefundLimitations(RefundLimitations refundLimitations) {
        this.refundLimitations = refundLimitations;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public void setTravelerInfoLimitation(TravelerInfoLimitation travelerInfoLimitation) {
        this.travelerInfoLimitation = travelerInfoLimitation;
    }

    public void setValidLimitation(ValidLimitation validLimitation) {
        this.validLimitation = validLimitation;
    }

    public static class BookerInfoLimitation {

        /**
         * 需要下单人信息
         */
        @JsonProperty("booker_required")
        private Integer bookerRequired;

        /**
         * 下单人手机
         */
        @JsonProperty("mobile")
        private Integer mobile;

        public void setBookerRequired(Integer bookerRequired) {
            this.bookerRequired = bookerRequired;
        }

        public void setMobile(Integer mobile) {
            this.mobile = mobile;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class BookingNotice {

        /**
         * 入园地址
         */
        @JsonProperty("enter_address")
        private String enterAddress;

        /**
         * 入园时间
         */
        @JsonProperty("enter_time")
        private List<BookingNoticeEnterTimeItem> enterTime;

        /**
         * 入园方式
         */
        @JsonProperty("enter_ways")
        private String enterWays;

        /**
         * 补充说明
         */
        @JsonProperty("extra_desc")
        private String extraDesc;

        /**
         * 费用包含
         */
        @JsonProperty("fee_include")
        private String feeInclude;

        /**
         * 费用不包含
         */
        @JsonProperty("fee_not_include")
        private String feeNotInclude;

        /**
         * 重要提示
         */
        @JsonProperty("important_notice")
        private String importantNotice;

        /**
         * 通关限制时间
         */
        @JsonProperty("pass_time_limit")
        private Integer passTimeLimit;

        /**
         * 换票地址
         */
        @JsonProperty("ticket_place")
        private String ticketPlace;

        /**
         * 换票时间
         */
        @JsonProperty("ticket_time")
        private List<BookingNoticeTicketTimeItem> ticketTime;

        public void setEnterAddress(String enterAddress) {
            this.enterAddress = enterAddress;
        }

        public void setEnterTime(List<BookingNoticeEnterTimeItem> enterTime) {
            this.enterTime = enterTime;
        }

        public void setEnterWays(String enterWays) {
            this.enterWays = enterWays;
        }

        public void setExtraDesc(String extraDesc) {
            this.extraDesc = extraDesc;
        }

        public void setFeeInclude(String feeInclude) {
            this.feeInclude = feeInclude;
        }

        public void setFeeNotInclude(String feeNotInclude) {
            this.feeNotInclude = feeNotInclude;
        }

        public void setImportantNotice(String importantNotice) {
            this.importantNotice = importantNotice;
        }

        public void setPassTimeLimit(Integer passTimeLimit) {
            this.passTimeLimit = passTimeLimit;
        }

        public void setTicketPlace(String ticketPlace) {
            this.ticketPlace = ticketPlace;
        }

        public void setTicketTime(List<BookingNoticeTicketTimeItem> ticketTime) {
            this.ticketTime = ticketTime;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class BookingNoticeEnterTimeItem {

        /**
         * 备注
         */
        @JsonProperty("comment")
        private String comment;

        /**
         * 入园结束时间
         */
        @JsonProperty("end_at")
        private String endAt;

        /**
         * 入园开始时间
         */
        @JsonProperty("start_at")
        private String startAt;

        public void setComment(String comment) {
            this.comment = comment;
        }

        public void setEndAt(String endAt) {
            this.endAt = endAt;
        }

        public void setStartAt(String startAt) {
            this.startAt = startAt;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class BookingNoticeTicketTimeItem {

        /**
         * 备注
         */
        @JsonProperty("comment")
        private String comment;

        /**
         * 换票结束时间
         */
        @JsonProperty("end_at")
        private String endAt;

        /**
         * 换票开始时间
         */
        @JsonProperty("start_at")
        private String startAt;

        public void setComment(String comment) {
            this.comment = comment;
        }

        public void setEndAt(String endAt) {
            this.endAt = endAt;
        }

        public void setStartAt(String startAt) {
            this.startAt = startAt;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class OrderLimitation {

        /**
         * 周期长度
         */
        @JsonProperty("cycle_length")
        private Integer cycleLength;

        /**
         * 限制类型
         */
        @JsonProperty("limitation_type")
        private Integer limitationType;

        /**
         * 周期类型
         */
        @JsonProperty("limit_cycle")
        private Integer limitCycle;

        /**
         * 限购数量
         */
        @JsonProperty("limit_num")
        private Integer limitNum;

        public void setCycleLength(Integer cycleLength) {
            this.cycleLength = cycleLength;
        }

        public void setLimitationType(Integer limitationType) {
            this.limitationType = limitationType;
        }

        public void setLimitCycle(Integer limitCycle) {
            this.limitCycle = limitCycle;
        }

        public void setLimitNum(Integer limitNum) {
            this.limitNum = limitNum;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class ProviderContactInfo {

        /**
         * 服务时间
         */
        @JsonProperty("provider_business_hour")
        private List<ProviderContactInfoProviderBusinessHourItem> providerBusinessHour;

        /**
         * 服务商名称
         */
        @JsonProperty("provider_name")
        private String providerName;

        /**
         * 服务商联系电话
         */
        @JsonProperty("provider_telephone")
        private String providerTelephone;

        public void setProviderBusinessHour(List<ProviderContactInfoProviderBusinessHourItem> providerBusinessHour) {
            this.providerBusinessHour = providerBusinessHour;
        }

        public void setProviderName(String providerName) {
            this.providerName = providerName;
        }

        public void setProviderTelephone(String providerTelephone) {
            this.providerTelephone = providerTelephone;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class ProviderContactInfoProviderBusinessHourItem {

        /**
         * 结束时间
         */
        @JsonProperty("close_at")
        private String closeAt;

        /**
         * 开始时间
         */
        @JsonProperty("open_at")
        private String openAt;

        /**
         * 描述
         */
        @JsonProperty("time_info")
        private String timeInfo;

        public void setCloseAt(String closeAt) {
            this.closeAt = closeAt;
        }

        public void setOpenAt(String openAt) {
            this.openAt = openAt;
        }

        public void setTimeInfo(String timeInfo) {
            this.timeInfo = timeInfo;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class RefundLimitations {

        /**
         * 是否可退
         */
        @JsonProperty("is_refundable")
        private Integer isRefundable;

        /**
         * 退款规则
         */
        @JsonProperty("refund_rules")
        private List<RefundLimitationsRefundRulesItem> refundRules;

        public void setIsRefundable(Integer isRefundable) {
            this.isRefundable = isRefundable;
        }

        public void setRefundRules(List<RefundLimitationsRefundRulesItem> refundRules) {
            this.refundRules = refundRules;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class RefundLimitationsRefundRulesItem {

        /**
         * 游玩日 0 点提前 或之后分钟数
         */
        @JsonProperty("ahead_time")
        private Integer aheadTime;

        /**
         * 扣费值
         */
        @JsonProperty("deduction_fee")
        private Integer deductionFee;

        /**
         * 费率单位
         */
        @JsonProperty("deduction_unit")
        private Integer deductionUnit;

        /**
         * 规则类型
         */
        @JsonProperty("type")
        private Integer type;

        public void setAheadTime(Integer aheadTime) {
            this.aheadTime = aheadTime;
        }

        public void setDeductionFee(Integer deductionFee) {
            this.deductionFee = deductionFee;
        }

        public void setDeductionUnit(Integer deductionUnit) {
            this.deductionUnit = deductionUnit;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class TravelerInfoLimitation {

        /**
         * 游玩人证件
         */
        @JsonProperty("credential")
        private Integer credential;

        /**
         * 游玩人名字
         */
        @JsonProperty("name")
        private Integer name;

        /**
         * 出游人信息设置
         */
        @JsonProperty("traveler_required")
        private Integer travelerRequired;

        public void setCredential(Integer credential) {
            this.credential = credential;
        }

        public void setName(Integer name) {
            this.name = name;
        }

        public void setTravelerRequired(Integer travelerRequired) {
            this.travelerRequired = travelerRequired;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class ValidLimitation {

        /**
         * 天数内有效
         */
        @JsonProperty("days_time")
        private Integer daysTime;

        /**
         * 结束时间
         */
        @JsonProperty("end_time")
        private Long endTime;

        /**
         * 开始时间
         */
        @JsonProperty("start_time")
        private Long startTime;

        /**
         * 有效期时间类型
         */
        @JsonProperty("time_type")
        private Integer timeType;

        public void setDaysTime(Integer daysTime) {
            this.daysTime = daysTime;
        }

        public void setEndTime(Long endTime) {
            this.endTime = endTime;
        }

        public void setStartTime(Long startTime) {
            this.startTime = startTime;
        }

        public void setTimeType(Integer timeType) {
            this.timeType = timeType;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}