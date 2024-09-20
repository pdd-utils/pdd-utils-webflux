package com.pdd.pop.sdk.http.api.ark.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.ark.response.PddFlightCallbackNotifyChangeapplyreplyResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddFlightCallbackNotifyChangeapplyreplyRequest extends PopBaseHttpRequest<PddFlightCallbackNotifyChangeapplyreplyResponse> {

    /**
     * 错误码，成功传0
     */
    @JsonProperty("error_code")
    private Integer errorCode;

    /**
     * 错误码=-1，必传，否则非必传
     */
    @JsonProperty("error_msg")
    private String errorMsg;

    /**
     * 外部改签单号，由供应商生成
     */
    @JsonProperty("out_change_no")
    private String outChangeNo;

    /**
     * 外部主订单号
     */
    @JsonProperty("out_order_no")
    private String outOrderNo;

    /**
     * 平台机票订单号
     */
    @JsonProperty("parent_travel_sn")
    private String parentTravelSn;

    /**
     * 变更乘客信息列表，当婴儿改签时，必须将关联的成人信息带回
     */
    @JsonProperty("passenger_info_list")
    private List<PassengerInfoListItem> passengerInfoList;

    /**
     * 审核改签类型
     */
    @JsonProperty("review_change_type")
    private Integer reviewChangeType;

    /**
     * 唯一关联当前请求日志追踪id
     */
    @JsonProperty("sub_trace_id")
    private String subTraceId;

    /**
     * 日志追踪id (用于日志关联)
     */
    @JsonProperty("trace_id")
    private String traceId;

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
        return 1;
    }

    @Override
    public String getType() {
        return "pdd.flight.callback.notify.changeapplyreply";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddFlightCallbackNotifyChangeapplyreplyResponse> getResponseClass() {
        return PddFlightCallbackNotifyChangeapplyreplyResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "error_code", errorCode);
        setUserParam(params, "error_msg", errorMsg);
        setUserParam(params, "out_change_no", outChangeNo);
        setUserParam(params, "out_order_no", outOrderNo);
        setUserParam(params, "parent_travel_sn", parentTravelSn);
        setUserParam(params, "passenger_info_list", passengerInfoList);
        setUserParam(params, "review_change_type", reviewChangeType);
        setUserParam(params, "sub_trace_id", subTraceId);
        setUserParam(params, "trace_id", traceId);
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public void setOutChangeNo(String outChangeNo) {
        this.outChangeNo = outChangeNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
    }

    public void setParentTravelSn(String parentTravelSn) {
        this.parentTravelSn = parentTravelSn;
    }

    public void setPassengerInfoList(List<PassengerInfoListItem> passengerInfoList) {
        this.passengerInfoList = passengerInfoList;
    }

    public void setReviewChangeType(Integer reviewChangeType) {
        this.reviewChangeType = reviewChangeType;
    }

    public void setSubTraceId(String subTraceId) {
        this.subTraceId = subTraceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public static class PassengerInfoListItem {

        /**
         * 新航班机建费
         */
        @JsonProperty("airport_tax")
        private Long airportTax;

        /**
         * 实际机建费价差, 精确到分
         */
        @JsonProperty("airport_tax_diff")
        private Long airportTaxDiff;

        /**
         * 新航班票面价
         */
        @JsonProperty("base_price")
        private Long basePrice;

        /**
         * 实际票面价价差, 精确到分
         */
        @JsonProperty("base_price_diff")
        private Long basePriceDiff;

        /**
         * 新航班燃油费
         */
        @JsonProperty("fuel_tax")
        private String fuelTax;

        /**
         * 实际燃油费价差, 精确到分
         */
        @JsonProperty("fuel_tax_diff")
        private Long fuelTaxDiff;

        /**
         * 原机票票号
         */
        @JsonProperty("origin_ticket_no")
        private String originTicketNo;

        /**
         * 单人改签需支付总金额，精确到分
         */
        @JsonProperty("pay")
        private Long pay;

        /**
         * 实际改签手续费
         */
        @JsonProperty("pay_fee")
        private Long payFee;

        /**
         * 外部变更子单号
         */
        @JsonProperty("sub_out_change_no")
        private String subOutChangeNo;

        /**
         * 平台机票子订单号
         */
        @JsonProperty("travel_sn")
        private String travelSn;

        public void setAirportTax(Long airportTax) {
            this.airportTax = airportTax;
        }

        public void setAirportTaxDiff(Long airportTaxDiff) {
            this.airportTaxDiff = airportTaxDiff;
        }

        public void setBasePrice(Long basePrice) {
            this.basePrice = basePrice;
        }

        public void setBasePriceDiff(Long basePriceDiff) {
            this.basePriceDiff = basePriceDiff;
        }

        public void setFuelTax(String fuelTax) {
            this.fuelTax = fuelTax;
        }

        public void setFuelTaxDiff(Long fuelTaxDiff) {
            this.fuelTaxDiff = fuelTaxDiff;
        }

        public void setOriginTicketNo(String originTicketNo) {
            this.originTicketNo = originTicketNo;
        }

        public void setPay(Long pay) {
            this.pay = pay;
        }

        public void setPayFee(Long payFee) {
            this.payFee = payFee;
        }

        public void setSubOutChangeNo(String subOutChangeNo) {
            this.subOutChangeNo = subOutChangeNo;
        }

        public void setTravelSn(String travelSn) {
            this.travelSn = travelSn;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}