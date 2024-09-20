package com.pdd.pop.sdk.http.api.ark.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.ark.response.PddFlightCallbackFlightchangeResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddFlightCallbackFlightchangeRequest extends PopBaseHttpRequest<PddFlightCallbackFlightchangeResponse> {

    /**
     * 航变生效时间，未填默认即时生效yyyy-MM-dd HH:mm
     */
    @JsonProperty("change_effect_time")
    private String changeEffectTime;

    /**
     * 航变类型
     */
    @JsonProperty("change_type")
    private Integer changeType;

    /**
     * 航变后航班详情
     */
    @JsonProperty("flight_info")
    private FlightInfo flightInfo;

    /**
     * 平台机票订单号
     */
    @JsonProperty("parent_travel_sn")
    private String parentTravelSn;

    /**
     * 日志追踪id (用于日志关联)
     */
    @JsonProperty("trace_id")
    private String traceId;

    /**
     * 平台机票订单号
     */
    @JsonProperty("travel_sn")
    private List<String> travelSn;

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
        return "pdd.flight.callback.flightchange";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddFlightCallbackFlightchangeResponse> getResponseClass() {
        return PddFlightCallbackFlightchangeResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "change_effect_time", changeEffectTime);
        setUserParam(params, "change_type", changeType);
        setUserParam(params, "flight_info", flightInfo);
        setUserParam(params, "parent_travel_sn", parentTravelSn);
        setUserParam(params, "trace_id", traceId);
        setUserParam(params, "travel_sn", travelSn);
    }

    public void setChangeEffectTime(String changeEffectTime) {
        this.changeEffectTime = changeEffectTime;
    }

    public void setChangeType(Integer changeType) {
        this.changeType = changeType;
    }

    public void setFlightInfo(FlightInfo flightInfo) {
        this.flightInfo = flightInfo;
    }

    public void setParentTravelSn(String parentTravelSn) {
        this.parentTravelSn = parentTravelSn;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public void setTravelSn(List<String> travelSn) {
        this.travelSn = travelSn;
    }

    public static class FlightInfo {

        /**
         * 到达机场三字码，航变时必传
         */
        @JsonProperty("arrival_airport_code")
        private String arrivalAirportCode;

        /**
         * 更新的到达时间(yyyy-MM-dd HH:mm), 航变时是必传
         */
        @JsonProperty("arrival_date_time")
        private String arrivalDateTime;

        /**
         * 起飞机场三字码，航变时必传
         */
        @JsonProperty("departure_airport_code")
        private String departureAirportCode;

        /**
         * 更新的起飞时间(yyyy-MM-dd HH:mm), 航变时必传
         */
        @JsonProperty("departure_date_time")
        private String departureDateTime;

        /**
         * 航班号
         */
        @JsonProperty("flight_no")
        private String flightNo;

        /**
         * 原到达时间(yyyy-MM-dd HH:mm)
         */
        @JsonProperty("origin_arrival_date_time")
        private String originArrivalDateTime;

        /**
         * 原起飞时间(yyyy-MM-dd HH:mm)
         */
        @JsonProperty("origin_departure_date_time")
        private String originDepartureDateTime;

        /**
         * 原机票订单的航班号（多次航变也应一致）
         */
        @JsonProperty("origin_flight_no")
        private String originFlightNo;

        public void setArrivalAirportCode(String arrivalAirportCode) {
            this.arrivalAirportCode = arrivalAirportCode;
        }

        public void setArrivalDateTime(String arrivalDateTime) {
            this.arrivalDateTime = arrivalDateTime;
        }

        public void setDepartureAirportCode(String departureAirportCode) {
            this.departureAirportCode = departureAirportCode;
        }

        public void setDepartureDateTime(String departureDateTime) {
            this.departureDateTime = departureDateTime;
        }

        public void setFlightNo(String flightNo) {
            this.flightNo = flightNo;
        }

        public void setOriginArrivalDateTime(String originArrivalDateTime) {
            this.originArrivalDateTime = originArrivalDateTime;
        }

        public void setOriginDepartureDateTime(String originDepartureDateTime) {
            this.originDepartureDateTime = originDepartureDateTime;
        }

        public void setOriginFlightNo(String originFlightNo) {
            this.originFlightNo = originFlightNo;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}