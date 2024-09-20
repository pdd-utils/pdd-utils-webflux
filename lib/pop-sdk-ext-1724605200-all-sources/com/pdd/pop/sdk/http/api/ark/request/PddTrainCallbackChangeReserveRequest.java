package com.pdd.pop.sdk.http.api.ark.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.ark.response.PddTrainCallbackChangeReserveResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddTrainCallbackChangeReserveRequest extends PopBaseHttpRequest<PddTrainCallbackChangeReserveResponse> {

    /**
     * 到达日期
     */
    @JsonProperty("arrive_date")
    private String arriveDate;

    /**
     * 到达站
     */
    @JsonProperty("arrive_station")
    private String arriveStation;

    /**
     * 到达时间
     */
    @JsonProperty("arrive_time")
    private String arriveTime;

    /**
     * 改签差额退票费率 change_fee_rate
     */
    @JsonProperty("change_fee_rate")
    private String changeFeeRate;

    /**
     * 改签差额退票费（高改低差额手续费）
     */
    @JsonProperty("change_fee_total")
    private Long changeFeeTotal;

    /**
     * 改签支付金额
     */
    @JsonProperty("change_pay")
    private Long changePay;

    /**
     * 改签退款金额
     */
    @JsonProperty("change_refund")
    private Long changeRefund;

    /**
     * 错误码
     */
    @JsonProperty("code")
    private Integer code;

    /**
     * 12306 订单号
     */
    @JsonProperty("crh_order_id")
    private String crhOrderId;

    /**
     * 出发日期
     */
    @JsonProperty("depart_date")
    private String departDate;

    /**
     * 出发站
     */
    @JsonProperty("depart_station")
    private String departStation;

    /**
     * 出发时间
     */
    @JsonProperty("depart_time")
    private String departTime;

    /**
     * 12306改签费总额
     */
    @JsonProperty("ext_change_fee_total")
    private Long extChangeFeeTotal;

    /**
     * 12306改签费费率
     */
    @JsonProperty("ext_change_rate")
    private String extChangeRate;

    /**
     * 信息
     */
    @JsonProperty("msg")
    private String msg;

    /**
     * 改签后新乘车人信息
     */
    @JsonProperty("new_passengers")
    private List<NewPassengersItem> newPassengers;

    /**
     * 商家订单号
     */
    @JsonProperty("order_id")
    private String orderId;

    /**
     * 支付超时时间
     */
    @JsonProperty("pay_limit_time")
    private String payLimitTime;

    /**
     * 拼多多订单号
     */
    @JsonProperty("pdd_order_id")
    private String pddOrderId;

    /**
     * 请求流水号
     */
    @JsonProperty("request_id")
    private String requestId;

    /**
     * 车次
     */
    @JsonProperty("train_no")
    private String trainNo;

    /**
     * 身份证入站
     */
    @JsonProperty("use_id_card_in")
    private Integer useIdCardIn;

    /**
     * 商家订单时间
     */
    @JsonProperty("vendor_time")
    private String vendorTime;

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
        return "pdd.train.callback.change.reserve";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddTrainCallbackChangeReserveResponse> getResponseClass() {
        return PddTrainCallbackChangeReserveResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "arrive_date", arriveDate);
        setUserParam(params, "arrive_station", arriveStation);
        setUserParam(params, "arrive_time", arriveTime);
        setUserParam(params, "change_fee_rate", changeFeeRate);
        setUserParam(params, "change_fee_total", changeFeeTotal);
        setUserParam(params, "change_pay", changePay);
        setUserParam(params, "change_refund", changeRefund);
        setUserParam(params, "code", code);
        setUserParam(params, "crh_order_id", crhOrderId);
        setUserParam(params, "depart_date", departDate);
        setUserParam(params, "depart_station", departStation);
        setUserParam(params, "depart_time", departTime);
        setUserParam(params, "ext_change_fee_total", extChangeFeeTotal);
        setUserParam(params, "ext_change_rate", extChangeRate);
        setUserParam(params, "msg", msg);
        setUserParam(params, "new_passengers", newPassengers);
        setUserParam(params, "order_id", orderId);
        setUserParam(params, "pay_limit_time", payLimitTime);
        setUserParam(params, "pdd_order_id", pddOrderId);
        setUserParam(params, "request_id", requestId);
        setUserParam(params, "train_no", trainNo);
        setUserParam(params, "use_id_card_in", useIdCardIn);
        setUserParam(params, "vendor_time", vendorTime);
    }

    public void setArriveDate(String arriveDate) {
        this.arriveDate = arriveDate;
    }

    public void setArriveStation(String arriveStation) {
        this.arriveStation = arriveStation;
    }

    public void setArriveTime(String arriveTime) {
        this.arriveTime = arriveTime;
    }

    public void setChangeFeeRate(String changeFeeRate) {
        this.changeFeeRate = changeFeeRate;
    }

    public void setChangeFeeTotal(Long changeFeeTotal) {
        this.changeFeeTotal = changeFeeTotal;
    }

    public void setChangePay(Long changePay) {
        this.changePay = changePay;
    }

    public void setChangeRefund(Long changeRefund) {
        this.changeRefund = changeRefund;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setCrhOrderId(String crhOrderId) {
        this.crhOrderId = crhOrderId;
    }

    public void setDepartDate(String departDate) {
        this.departDate = departDate;
    }

    public void setDepartStation(String departStation) {
        this.departStation = departStation;
    }

    public void setDepartTime(String departTime) {
        this.departTime = departTime;
    }

    public void setExtChangeFeeTotal(Long extChangeFeeTotal) {
        this.extChangeFeeTotal = extChangeFeeTotal;
    }

    public void setExtChangeRate(String extChangeRate) {
        this.extChangeRate = extChangeRate;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setNewPassengers(List<NewPassengersItem> newPassengers) {
        this.newPassengers = newPassengers;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setPayLimitTime(String payLimitTime) {
        this.payLimitTime = payLimitTime;
    }

    public void setPddOrderId(String pddOrderId) {
        this.pddOrderId = pddOrderId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public void setUseIdCardIn(Integer useIdCardIn) {
        this.useIdCardIn = useIdCardIn;
    }

    public void setVendorTime(String vendorTime) {
        this.vendorTime = vendorTime;
    }

    public static class NewPassengersItem {

        /**
         * 改签差额退票费(高改低差额手续费)
         */
        @JsonProperty("change_fee")
        private Long changeFee;

        /**
         * 改签差额退票费率
         */
        @JsonProperty("change_fee_rate")
        private String changeFeeRate;

        /**
         * 改签支付金额
         */
        @JsonProperty("change_pay")
        private Long changePay;

        /**
         * 改签退款金额
         */
        @JsonProperty("change_refund")
        private Long changeRefund;

        /**
         * 车厢名称
         */
        @JsonProperty("coach_name")
        private String coachName;

        /**
         * 车厢号(例:02 车厢)
         */
        @JsonProperty("coach_no")
        private String coachNo;

        /**
         * 12306 改签费总额
         */
        @JsonProperty("ext_change_fee")
        private Long extChangeFee;

        /**
         * 12306 改签费费率
         */
        @JsonProperty("ext_change_rate")
        private String extChangeRate;

        /**
         * 姓名
         */
        @JsonProperty("name")
        private String name;

        /**
         * 新的商家子单号
         */
        @JsonProperty("new_sub_order_id")
        private String newSubOrderId;

        /**
         * 新的拼多多子单号
         */
        @JsonProperty("new_sub_pdd_order_id")
        private String newSubPddOrderId;

        /**
         * 老的商家子单号
         */
        @JsonProperty("old_sub_order_id")
        private String oldSubOrderId;

        /**
         * 老的拼多多子单号
         */
        @JsonProperty("old_sub_pdd_order_id")
        private String oldSubPddOrderId;

        /**
         * 座位名称(1D)
         */
        @JsonProperty("seat_name")
        private String seatName;

        /**
         * 座位类型
         */
        @JsonProperty("seat_type")
        private Integer seatType;

        /**
         * 12306 子单号
         */
        @JsonProperty("sub_crh_order_id")
        private String subCrhOrderId;

        /**
         * 票价
         */
        @JsonProperty("ticket_price")
        private Long ticketPrice;

        public void setChangeFee(Long changeFee) {
            this.changeFee = changeFee;
        }

        public void setChangeFeeRate(String changeFeeRate) {
            this.changeFeeRate = changeFeeRate;
        }

        public void setChangePay(Long changePay) {
            this.changePay = changePay;
        }

        public void setChangeRefund(Long changeRefund) {
            this.changeRefund = changeRefund;
        }

        public void setCoachName(String coachName) {
            this.coachName = coachName;
        }

        public void setCoachNo(String coachNo) {
            this.coachNo = coachNo;
        }

        public void setExtChangeFee(Long extChangeFee) {
            this.extChangeFee = extChangeFee;
        }

        public void setExtChangeRate(String extChangeRate) {
            this.extChangeRate = extChangeRate;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setNewSubOrderId(String newSubOrderId) {
            this.newSubOrderId = newSubOrderId;
        }

        public void setNewSubPddOrderId(String newSubPddOrderId) {
            this.newSubPddOrderId = newSubPddOrderId;
        }

        public void setOldSubOrderId(String oldSubOrderId) {
            this.oldSubOrderId = oldSubOrderId;
        }

        public void setOldSubPddOrderId(String oldSubPddOrderId) {
            this.oldSubPddOrderId = oldSubPddOrderId;
        }

        public void setSeatName(String seatName) {
            this.seatName = seatName;
        }

        public void setSeatType(Integer seatType) {
            this.seatType = seatType;
        }

        public void setSubCrhOrderId(String subCrhOrderId) {
            this.subCrhOrderId = subCrhOrderId;
        }

        public void setTicketPrice(Long ticketPrice) {
            this.ticketPrice = ticketPrice;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}