package com.pdd.pop.sdk.http.api.ark.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.ark.response.PddFlightCallbackConfirmRefundResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddFlightCallbackConfirmRefundRequest extends PopBaseHttpRequest<PddFlightCallbackConfirmRefundResponse> {

    /**
     * 错误码
     */
    @JsonProperty("error_code")
    private Integer errorCode;

    /**
     * 错误码=-1，必传，否则非必传
     */
    @JsonProperty("error_msg")
    private String errorMsg;

    /**
     * 外部主订单号
     */
    @JsonProperty("out_order_no")
    private String outOrderNo;

    /**
     * 外部退款单号
     */
    @JsonProperty("out_refund_no")
    private String outRefundNo;

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
     * 结果类型
     */
    @JsonProperty("refund_callback_type")
    private Integer refundCallbackType;

    /**
     * 退款/退票状态
     */
    @JsonProperty("refund_status")
    private Integer refundStatus;

    /**
     * 完成时间 (yyyy-MM-dd HH:mm:ss)
     */
    @JsonProperty("refund_time")
    private String refundTime;

    /**
     * 分批退款流水信息
     */
    @JsonProperty("sub_refund_info_list")
    private List<SubRefundInfoListItem> subRefundInfoList;

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
        return "pdd.flight.callback.confirm.refund";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddFlightCallbackConfirmRefundResponse> getResponseClass() {
        return PddFlightCallbackConfirmRefundResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "error_code", errorCode);
        setUserParam(params, "error_msg", errorMsg);
        setUserParam(params, "out_order_no", outOrderNo);
        setUserParam(params, "out_refund_no", outRefundNo);
        setUserParam(params, "parent_travel_sn", parentTravelSn);
        setUserParam(params, "passenger_info_list", passengerInfoList);
        setUserParam(params, "refund_callback_type", refundCallbackType);
        setUserParam(params, "refund_status", refundStatus);
        setUserParam(params, "refund_time", refundTime);
        setUserParam(params, "sub_refund_info_list", subRefundInfoList);
        setUserParam(params, "trace_id", traceId);
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
    }

    public void setOutRefundNo(String outRefundNo) {
        this.outRefundNo = outRefundNo;
    }

    public void setParentTravelSn(String parentTravelSn) {
        this.parentTravelSn = parentTravelSn;
    }

    public void setPassengerInfoList(List<PassengerInfoListItem> passengerInfoList) {
        this.passengerInfoList = passengerInfoList;
    }

    public void setRefundCallbackType(Integer refundCallbackType) {
        this.refundCallbackType = refundCallbackType;
    }

    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
    }

    public void setRefundTime(String refundTime) {
        this.refundTime = refundTime;
    }

    public void setSubRefundInfoList(List<SubRefundInfoListItem> subRefundInfoList) {
        this.subRefundInfoList = subRefundInfoList;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public static class PassengerInfoListItem {

        /**
         * 姓名
         */
        @JsonProperty("name")
        private String name;

        /**
         * 单乘客可退机建费，价 精确到分，退款通知必传
         */
        @JsonProperty("refund_airport_tax")
        private Long refundAirportTax;

        /**
         * 单乘客退票手续费, 精确到分
         */
        @JsonProperty("refund_fee")
        private Long refundFee;

        /**
         * 单乘客可退燃油费，价 精确到分，退款通知必传
         */
        @JsonProperty("refund_fuel_tax")
        private Long refundFuelTax;

        /**
         * 单乘客可退结算价 精确到分，退款通知必传
         */
        @JsonProperty("refund_settle_price")
        private Long refundSettlePrice;

        /**
         * 外部退票子订单号,由供应商生成
         */
        @JsonProperty("sub_out_refund_no")
        private String subOutRefundNo;

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

        public void setName(String name) {
            this.name = name;
        }

        public void setRefundAirportTax(Long refundAirportTax) {
            this.refundAirportTax = refundAirportTax;
        }

        public void setRefundFee(Long refundFee) {
            this.refundFee = refundFee;
        }

        public void setRefundFuelTax(Long refundFuelTax) {
            this.refundFuelTax = refundFuelTax;
        }

        public void setRefundSettlePrice(Long refundSettlePrice) {
            this.refundSettlePrice = refundSettlePrice;
        }

        public void setSubOutRefundNo(String subOutRefundNo) {
            this.subOutRefundNo = subOutRefundNo;
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

    public static class SubRefundInfoListItem {

        /**
         * 分批退款流水单号
         */
        @JsonProperty("no")
        private String no;

        /**
         * 乘客信息列表
         */
        @JsonProperty("passenger_info_list")
        private List<SubRefundInfoListItemPassengerInfoListItem> passengerInfoList;

        public void setNo(String no) {
            this.no = no;
        }

        public void setPassengerInfoList(List<SubRefundInfoListItemPassengerInfoListItem> passengerInfoList) {
            this.passengerInfoList = passengerInfoList;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class SubRefundInfoListItemPassengerInfoListItem {

        /**
         * 姓名
         */
        @JsonProperty("name")
        private String name;

        /**
         * 单乘客可退机建费，价 精确到分，如果可退，必传
         */
        @JsonProperty("refund_airport_tax")
        private Long refundAirportTax;

        /**
         * 单乘客退票手续费, 精确到分
         */
        @JsonProperty("refund_fee")
        private Long refundFee;

        /**
         * 单乘客可退燃油费，价 精确到分，如果可退，必传
         */
        @JsonProperty("refund_fuel_tax")
        private Long refundFuelTax;

        /**
         * 单乘客可退结算价 精确到分，如果可退，必传
         */
        @JsonProperty("refund_settle_price")
        private Long refundSettlePrice;

        /**
         * 外部退票子订单号,由供应商生成
         */
        @JsonProperty("sub_out_refund_no")
        private String subOutRefundNo;

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

        public void setName(String name) {
            this.name = name;
        }

        public void setRefundAirportTax(Long refundAirportTax) {
            this.refundAirportTax = refundAirportTax;
        }

        public void setRefundFee(Long refundFee) {
            this.refundFee = refundFee;
        }

        public void setRefundFuelTax(Long refundFuelTax) {
            this.refundFuelTax = refundFuelTax;
        }

        public void setRefundSettlePrice(Long refundSettlePrice) {
            this.refundSettlePrice = refundSettlePrice;
        }

        public void setSubOutRefundNo(String subOutRefundNo) {
            this.subOutRefundNo = subOutRefundNo;
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