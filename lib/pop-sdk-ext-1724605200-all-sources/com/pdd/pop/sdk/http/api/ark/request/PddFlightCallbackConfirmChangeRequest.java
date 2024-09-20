package com.pdd.pop.sdk.http.api.ark.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.ark.response.PddFlightCallbackConfirmChangeResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddFlightCallbackConfirmChangeRequest extends PopBaseHttpRequest<PddFlightCallbackConfirmChangeResponse> {

    /**
     * 变更完成时间(yyyy-MM-dd HH:mm:ss)
     */
    @JsonProperty("change_time")
    private String changeTime;

    /**
     * 变更类型
     */
    @JsonProperty("change_type")
    private Integer changeType;

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
     * 外部变更单号
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
     * 变更的乘客信息列表
     */
    @JsonProperty("passenger_info_list")
    private List<PassengerInfoListItem> passengerInfoList;

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
        return "pdd.flight.callback.confirm.change";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddFlightCallbackConfirmChangeResponse> getResponseClass() {
        return PddFlightCallbackConfirmChangeResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "change_time", changeTime);
        setUserParam(params, "change_type", changeType);
        setUserParam(params, "error_code", errorCode);
        setUserParam(params, "error_msg", errorMsg);
        setUserParam(params, "out_change_no", outChangeNo);
        setUserParam(params, "out_order_no", outOrderNo);
        setUserParam(params, "parent_travel_sn", parentTravelSn);
        setUserParam(params, "passenger_info_list", passengerInfoList);
        setUserParam(params, "sub_trace_id", subTraceId);
        setUserParam(params, "trace_id", traceId);
    }

    public void setChangeTime(String changeTime) {
        this.changeTime = changeTime;
    }

    public void setChangeType(Integer changeType) {
        this.changeType = changeType;
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

    public void setSubTraceId(String subTraceId) {
        this.subTraceId = subTraceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public static class PassengerInfoListItem {

        /**
         * 单乘客新机建费, 精确到分
         */
        @JsonProperty("airport_tax")
        private Long airportTax;

        /**
         * 变更后的票号
         */
        @JsonProperty("change_ticket_no")
        private String changeTicketNo;

        /**
         * 单乘客新燃油费, 精确到分
         */
        @JsonProperty("fuel_tax")
        private Long fuelTax;

        /**
         * 证件号
         */
        @JsonProperty("identity_no")
        private String identityNo;

        /**
         * 证件类型
         */
        @JsonProperty("identity_type")
        private String identityType;

        /**
         * 姓名
         */
        @JsonProperty("name")
        private String name;

        /**
         * 原pnr
         */
        @JsonProperty("origin_pnr")
        private String originPnr;

        /**
         * 原票号
         */
        @JsonProperty("origin_ticket_no")
        private String originTicketNo;

        /**
         * 单乘客支付总金额, 精确到分
         */
        @JsonProperty("pay")
        private Long pay;

        /**
         * 单乘客机建费差价, 精确到分
         */
        @JsonProperty("pay_airline_tax")
        private Long payAirlineTax;

        /**
         * 单乘客改签手续费, 精确到分
         */
        @JsonProperty("pay_fee")
        private Long payFee;

        /**
         * 单乘客燃油税差价, 精确到分
         */
        @JsonProperty("pay_fuel_tax")
        private Long payFuelTax;

        /**
         * 单乘客票面差价, 精确到分
         */
        @JsonProperty("pay_price")
        private Long payPrice;

        /**
         * 单乘客新票面价, 精确到分
         */
        @JsonProperty("price")
        private Long price;

        /**
         * 外部变更子单号，由供应商生成
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

        public void setChangeTicketNo(String changeTicketNo) {
            this.changeTicketNo = changeTicketNo;
        }

        public void setFuelTax(Long fuelTax) {
            this.fuelTax = fuelTax;
        }

        public void setIdentityNo(String identityNo) {
            this.identityNo = identityNo;
        }

        public void setIdentityType(String identityType) {
            this.identityType = identityType;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setOriginPnr(String originPnr) {
            this.originPnr = originPnr;
        }

        public void setOriginTicketNo(String originTicketNo) {
            this.originTicketNo = originTicketNo;
        }

        public void setPay(Long pay) {
            this.pay = pay;
        }

        public void setPayAirlineTax(Long payAirlineTax) {
            this.payAirlineTax = payAirlineTax;
        }

        public void setPayFee(Long payFee) {
            this.payFee = payFee;
        }

        public void setPayFuelTax(Long payFuelTax) {
            this.payFuelTax = payFuelTax;
        }

        public void setPayPrice(Long payPrice) {
            this.payPrice = payPrice;
        }

        public void setPrice(Long price) {
            this.price = price;
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