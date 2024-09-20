package com.pdd.pop.sdk.http.api.ark.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.ark.response.PddFlightCallbackConfirmOrderResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddFlightCallbackConfirmOrderRequest extends PopBaseHttpRequest<PddFlightCallbackConfirmOrderResponse> {

    /**
     * 错误码，成功传0
     */
    @JsonProperty("error_code")
    private Integer errorCode;

    /**
     * 错误码=-1时，必传
     */
    @JsonProperty("error_msg")
    private String errorMsg;

    /**
     * 航班信息列表
     */
    @JsonProperty("flight_info_list")
    private List<FlightInfoListItem> flightInfoList;

    /**
     * 外部供应商主订单号
     */
    @JsonProperty("out_order_no")
    private String outOrderNo;

    /**
     * 平台机票订单号
     */
    @JsonProperty("parent_travel_sn")
    private String parentTravelSn;

    /**
     * 乘客信息列表
     */
    @JsonProperty("passenger_info_list")
    private List<PassengerInfoListItem> passengerInfoList;

    /**
     * 出票状态
     */
    @JsonProperty("ticket_status")
    private Integer ticketStatus;

    /**
     * 出票完成时间(yyyy-MM-dd HH:mm:ss) (出票成功返回出票完成时间; 出票失败返回回调时间)
     */
    @JsonProperty("ticket_time")
    private String ticketTime;

    /**
     * 总机建费
     */
    @JsonProperty("total_airport_tax")
    private Long totalAirportTax;

    /**
     * 总燃油费
     */
    @JsonProperty("total_fuel_tax")
    private Long totalFuelTax;

    /**
     * 总支付价格 (出票成功会返回)
     */
    @JsonProperty("total_pay")
    private Long totalPay;

    /**
     * 总结算价
     */
    @JsonProperty("total_settle_price")
    private Long totalSettlePrice;

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
        return "pdd.flight.callback.confirm.order";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddFlightCallbackConfirmOrderResponse> getResponseClass() {
        return PddFlightCallbackConfirmOrderResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "error_code", errorCode);
        setUserParam(params, "error_msg", errorMsg);
        setUserParam(params, "flight_info_list", flightInfoList);
        setUserParam(params, "out_order_no", outOrderNo);
        setUserParam(params, "parent_travel_sn", parentTravelSn);
        setUserParam(params, "passenger_info_list", passengerInfoList);
        setUserParam(params, "ticket_status", ticketStatus);
        setUserParam(params, "ticket_time", ticketTime);
        setUserParam(params, "total_airport_tax", totalAirportTax);
        setUserParam(params, "total_fuel_tax", totalFuelTax);
        setUserParam(params, "total_pay", totalPay);
        setUserParam(params, "total_settle_price", totalSettlePrice);
        setUserParam(params, "trace_id", traceId);
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public void setFlightInfoList(List<FlightInfoListItem> flightInfoList) {
        this.flightInfoList = flightInfoList;
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

    public void setTicketStatus(Integer ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public void setTicketTime(String ticketTime) {
        this.ticketTime = ticketTime;
    }

    public void setTotalAirportTax(Long totalAirportTax) {
        this.totalAirportTax = totalAirportTax;
    }

    public void setTotalFuelTax(Long totalFuelTax) {
        this.totalFuelTax = totalFuelTax;
    }

    public void setTotalPay(Long totalPay) {
        this.totalPay = totalPay;
    }

    public void setTotalSettlePrice(Long totalSettlePrice) {
        this.totalSettlePrice = totalSettlePrice;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public static class FlightInfoListItem {

        /**
         * 到达机场三字码
         */
        @JsonProperty("arrival_airport_code")
        private String arrivalAirportCode;

        /**
         * 到达时间(yyyy-MM-dd HH:mm)
         */
        @JsonProperty("arrival_date_time")
        private String arrivalDateTime;

        /**
         * 到达航站楼
         */
        @JsonProperty("arrival_terminal")
        private String arrivalTerminal;

        /**
         * 舱位信息列表
         */
        @JsonProperty("cabin_info_list")
        private List<FlightInfoListItemCabinInfoListItem> cabinInfoList;

        /**
         * 出票航司二字码
         */
        @JsonProperty("carrier_code")
        private String carrierCode;

        /**
         * 起飞机场三字码
         */
        @JsonProperty("departure_airport_code")
        private String departureAirportCode;

        /**
         * 起飞时间(yyyy-MM-dd HH:mm)
         */
        @JsonProperty("departure_date_time")
        private String departureDateTime;

        /**
         * 起飞航站楼
         */
        @JsonProperty("departure_terminal")
        private String departureTerminal;

        /**
         * 航班号
         */
        @JsonProperty("flight_no")
        private String flightNo;

        /**
         * 共享航司二字码，shared为true时必传，否则非必传
         */
        @JsonProperty("operate_carrier_code")
        private String operateCarrierCode;

        /**
         * 共享航班号，shared为true时必传，否则非必传
         */
        @JsonProperty("operate_flight_no")
        private String operateFlightNo;

        /**
         * 航程编号
         */
        @JsonProperty("segment_no")
        private Integer segmentNo;

        /**
         * 航段编号
         */
        @JsonProperty("sequence_no")
        private Integer sequenceNo;

        /**
         * 是否共享航班
         */
        @JsonProperty("shared")
        private Boolean shared;

        public void setArrivalAirportCode(String arrivalAirportCode) {
            this.arrivalAirportCode = arrivalAirportCode;
        }

        public void setArrivalDateTime(String arrivalDateTime) {
            this.arrivalDateTime = arrivalDateTime;
        }

        public void setArrivalTerminal(String arrivalTerminal) {
            this.arrivalTerminal = arrivalTerminal;
        }

        public void setCabinInfoList(List<FlightInfoListItemCabinInfoListItem> cabinInfoList) {
            this.cabinInfoList = cabinInfoList;
        }

        public void setCarrierCode(String carrierCode) {
            this.carrierCode = carrierCode;
        }

        public void setDepartureAirportCode(String departureAirportCode) {
            this.departureAirportCode = departureAirportCode;
        }

        public void setDepartureDateTime(String departureDateTime) {
            this.departureDateTime = departureDateTime;
        }

        public void setDepartureTerminal(String departureTerminal) {
            this.departureTerminal = departureTerminal;
        }

        public void setFlightNo(String flightNo) {
            this.flightNo = flightNo;
        }

        public void setOperateCarrierCode(String operateCarrierCode) {
            this.operateCarrierCode = operateCarrierCode;
        }

        public void setOperateFlightNo(String operateFlightNo) {
            this.operateFlightNo = operateFlightNo;
        }

        public void setSegmentNo(Integer segmentNo) {
            this.segmentNo = segmentNo;
        }

        public void setSequenceNo(Integer sequenceNo) {
            this.sequenceNo = sequenceNo;
        }

        public void setShared(Boolean shared) {
            this.shared = shared;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class FlightInfoListItemCabinInfoListItem {

        /**
         * 乘客类型
         */
        @JsonProperty("passenger_type")
        private String passengerType;

        /**
         * 舱位，不同的航司舱位定义不同
         */
        @JsonProperty("sub_class")
        private String subClass;

        public void setPassengerType(String passengerType) {
            this.passengerType = passengerType;
        }

        public void setSubClass(String subClass) {
            this.subClass = subClass;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class PassengerInfoListItem {

        /**
         * 单乘客机建费
         */
        @JsonProperty("airport_tax")
        private Long airportTax;

        /**
         * 单乘客燃油费
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
         * 外部子订单号
         */
        @JsonProperty("out_sub_order_no")
        private String outSubOrderNo;

        /**
         * 单乘客支付价格
         */
        @JsonProperty("pay")
        private Long pay;

        /**
         * pnr编码
         */
        @JsonProperty("pnr")
        private String pnr;

        /**
         * 单乘客结算价
         */
        @JsonProperty("settle_price")
        private Long settlePrice;

        /**
         * 票号
         */
        @JsonProperty("ticket_no")
        private String ticketNo;

        /**
         * 平台机票子订单号
         */
        @JsonProperty("travel_sn")
        private String travelSn;

        public void setAirportTax(Long airportTax) {
            this.airportTax = airportTax;
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

        public void setOutSubOrderNo(String outSubOrderNo) {
            this.outSubOrderNo = outSubOrderNo;
        }

        public void setPay(Long pay) {
            this.pay = pay;
        }

        public void setPnr(String pnr) {
            this.pnr = pnr;
        }

        public void setSettlePrice(Long settlePrice) {
            this.settlePrice = settlePrice;
        }

        public void setTicketNo(String ticketNo) {
            this.ticketNo = ticketNo;
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