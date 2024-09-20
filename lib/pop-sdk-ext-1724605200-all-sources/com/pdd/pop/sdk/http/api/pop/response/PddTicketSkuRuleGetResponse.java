package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddTicketSkuRuleGetResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("response")
    private Response response;

    public Response getResponse() {
        return response;
    }

    public static class Response {

        /**
         * 下单人信息设置
         */
        @JsonProperty("booker_info_limitation")
        private ResponseBookerInfoLimitation bookerInfoLimitation;

        /**
         * 预定须知
         */
        @JsonProperty("booking_notice")
        private ResponseBookingNotice bookingNotice;

        /**
         * 下单限制
         */
        @JsonProperty("order_limitation")
        private ResponseOrderLimitation orderLimitation;

        /**
         * 商户rule ID
         */
        @JsonProperty("out_rule_id")
        private String outRuleId;

        /**
         * 服务商联系方式
         */
        @JsonProperty("provider_contact_info")
        private ResponseProviderContactInfo providerContactInfo;

        /**
         * 退款规则
         */
        @JsonProperty("refund_limitations")
        private ResponseRefundLimitations refundLimitations;

        /**
         * 拼多多 rule ID
         */
        @JsonProperty("rule_id")
        private String ruleId;

        /**
         * 商户rule 名称
         */
        @JsonProperty("rule_name")
        private String ruleName;

        /**
         * 规则版本
         */
        @JsonProperty("rule_version")
        private String ruleVersion;

        /**
         * 游玩人信息
         */
        @JsonProperty("traveler_info_limitation")
        private ResponseTravelerInfoLimitation travelerInfoLimitation;

        /**
         * 卡券有效期设置
         */
        @JsonProperty("valid_limitation")
        private ResponseValidLimitation validLimitation;

        public ResponseBookerInfoLimitation getBookerInfoLimitation() {
            return bookerInfoLimitation;
        }

        public ResponseBookingNotice getBookingNotice() {
            return bookingNotice;
        }

        public ResponseOrderLimitation getOrderLimitation() {
            return orderLimitation;
        }

        public String getOutRuleId() {
            return outRuleId;
        }

        public ResponseProviderContactInfo getProviderContactInfo() {
            return providerContactInfo;
        }

        public ResponseRefundLimitations getRefundLimitations() {
            return refundLimitations;
        }

        public String getRuleId() {
            return ruleId;
        }

        public String getRuleName() {
            return ruleName;
        }

        public String getRuleVersion() {
            return ruleVersion;
        }

        public ResponseTravelerInfoLimitation getTravelerInfoLimitation() {
            return travelerInfoLimitation;
        }

        public ResponseValidLimitation getValidLimitation() {
            return validLimitation;
        }
    }

    public static class ResponseBookerInfoLimitation {

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

        public Integer getBookerRequired() {
            return bookerRequired;
        }

        public Integer getMobile() {
            return mobile;
        }
    }

    public static class ResponseBookingNotice {

        /**
         * 入园地址
         */
        @JsonProperty("enter_address")
        private String enterAddress;

        /**
         * 入园时间
         */
        @JsonProperty("enter_time")
        private List<ResponseBookingNoticeEnterTimeItem> enterTime;

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
        private List<ResponseBookingNoticeTicketTimeItem> ticketTime;

        public String getEnterAddress() {
            return enterAddress;
        }

        public List<ResponseBookingNoticeEnterTimeItem> getEnterTime() {
            return enterTime;
        }

        public String getEnterWays() {
            return enterWays;
        }

        public String getExtraDesc() {
            return extraDesc;
        }

        public String getFeeInclude() {
            return feeInclude;
        }

        public String getFeeNotInclude() {
            return feeNotInclude;
        }

        public String getImportantNotice() {
            return importantNotice;
        }

        public Integer getPassTimeLimit() {
            return passTimeLimit;
        }

        public String getTicketPlace() {
            return ticketPlace;
        }

        public List<ResponseBookingNoticeTicketTimeItem> getTicketTime() {
            return ticketTime;
        }
    }

    public static class ResponseBookingNoticeEnterTimeItem {

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

        public String getComment() {
            return comment;
        }

        public String getEndAt() {
            return endAt;
        }

        public String getStartAt() {
            return startAt;
        }
    }

    public static class ResponseBookingNoticeTicketTimeItem {

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

        public String getComment() {
            return comment;
        }

        public String getEndAt() {
            return endAt;
        }

        public String getStartAt() {
            return startAt;
        }
    }

    public static class ResponseOrderLimitation {

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

        public Integer getCycleLength() {
            return cycleLength;
        }

        public Integer getLimitationType() {
            return limitationType;
        }

        public Integer getLimitCycle() {
            return limitCycle;
        }

        public Integer getLimitNum() {
            return limitNum;
        }
    }

    public static class ResponseProviderContactInfo {

        /**
         * 服务时间
         */
        @JsonProperty("provider_business_hour")
        private List<ResponseProviderContactInfoProviderBusinessHourItem> providerBusinessHour;

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

        public List<ResponseProviderContactInfoProviderBusinessHourItem> getProviderBusinessHour() {
            return providerBusinessHour;
        }

        public String getProviderName() {
            return providerName;
        }

        public String getProviderTelephone() {
            return providerTelephone;
        }
    }

    public static class ResponseProviderContactInfoProviderBusinessHourItem {

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

        public String getCloseAt() {
            return closeAt;
        }

        public String getOpenAt() {
            return openAt;
        }

        public String getTimeInfo() {
            return timeInfo;
        }
    }

    public static class ResponseRefundLimitations {

        /**
         * 是否可退
         */
        @JsonProperty("is_refundable")
        private Integer isRefundable;

        /**
         * 退款规则
         */
        @JsonProperty("refund_rules")
        private List<ResponseRefundLimitationsRefundRulesItem> refundRules;

        public Integer getIsRefundable() {
            return isRefundable;
        }

        public List<ResponseRefundLimitationsRefundRulesItem> getRefundRules() {
            return refundRules;
        }
    }

    public static class ResponseRefundLimitationsRefundRulesItem {

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

        public Integer getAheadTime() {
            return aheadTime;
        }

        public Integer getDeductionFee() {
            return deductionFee;
        }

        public Integer getDeductionUnit() {
            return deductionUnit;
        }

        public Integer getType() {
            return type;
        }
    }

    public static class ResponseTravelerInfoLimitation {

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

        public Integer getCredential() {
            return credential;
        }

        public Integer getName() {
            return name;
        }

        public Integer getTravelerRequired() {
            return travelerRequired;
        }
    }

    public static class ResponseValidLimitation {

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

        public Integer getDaysTime() {
            return daysTime;
        }

        public Long getEndTime() {
            return endTime;
        }

        public Long getStartTime() {
            return startTime;
        }

        public Integer getTimeType() {
            return timeType;
        }
    }
}