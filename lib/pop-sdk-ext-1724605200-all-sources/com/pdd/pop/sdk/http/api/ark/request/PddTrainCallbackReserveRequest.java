package com.pdd.pop.sdk.http.api.ark.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.ark.response.PddTrainCallbackReserveResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddTrainCallbackReserveRequest extends PopBaseHttpRequest<PddTrainCallbackReserveResponse> {

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
     * 错误码
     */
    @JsonProperty("code")
    private Long code;

    /**
     * 12306 账号
     */
    @JsonProperty("crh_order")
    private String crhOrder;

    /**
     * 出发日期
     */
    @JsonProperty("depart_date")
    private String departDate;

    /**
     * 出发站点
     */
    @JsonProperty("depart_station")
    private String departStation;

    /**
     * 出发时间
     */
    @JsonProperty("depart_time")
    private String departTime;

    /**
     * 信息
     */
    @JsonProperty("msg")
    private String msg;

    /**
     * 商家订单号
     */
    @JsonProperty("order_id")
    private String orderId;

    /**
     * 乘车人信息
     */
    @JsonProperty("passengers")
    private List<PassengersItem> passengers;

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
     * 使用身份证入站
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
        return "pdd.train.callback.reserve";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddTrainCallbackReserveResponse> getResponseClass() {
        return PddTrainCallbackReserveResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "arrive_date", arriveDate);
        setUserParam(params, "arrive_station", arriveStation);
        setUserParam(params, "arrive_time", arriveTime);
        setUserParam(params, "code", code);
        setUserParam(params, "crh_order", crhOrder);
        setUserParam(params, "depart_date", departDate);
        setUserParam(params, "depart_station", departStation);
        setUserParam(params, "depart_time", departTime);
        setUserParam(params, "msg", msg);
        setUserParam(params, "order_id", orderId);
        setUserParam(params, "passengers", passengers);
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

    public void setCode(Long code) {
        this.code = code;
    }

    public void setCrhOrder(String crhOrder) {
        this.crhOrder = crhOrder;
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

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setPassengers(List<PassengersItem> passengers) {
        this.passengers = passengers;
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

    public static class PassengersItem {

        /**
         * 证件号
         */
        @JsonProperty("card_no")
        private String cardNo;

        /**
         * 证件类型
         */
        @JsonProperty("card_type")
        private String cardType;

        /**
         * 车厢名称
         */
        @JsonProperty("coach_name")
        private String coachName;

        /**
         * 姓名
         */
        @JsonProperty("name")
        private String name;

        /**
         * 座位名称
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
        @JsonProperty("sub_crh_order")
        private String subCrhOrder;

        /**
         * 商家子单号
         */
        @JsonProperty("sub_order_id")
        private String subOrderId;

        /**
         * 拼多多子单号
         */
        @JsonProperty("sub_pdd_order_id")
        private String subPddOrderId;

        /**
         * 票价
         */
        @JsonProperty("ticket_price")
        private Long ticketPrice;

        /**
         * 车票类型
         */
        @JsonProperty("ticket_type")
        private Integer ticketType;

        /**
         * 是否按需出票 0-是 1-否
         */
        @JsonProperty("is_choose_seat")
        private Integer isChooseSeat;

        public void setCardNo(String cardNo) {
            this.cardNo = cardNo;
        }

        public void setCardType(String cardType) {
            this.cardType = cardType;
        }

        public void setCoachName(String coachName) {
            this.coachName = coachName;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSeatName(String seatName) {
            this.seatName = seatName;
        }

        public void setSeatType(Integer seatType) {
            this.seatType = seatType;
        }

        public void setSubCrhOrder(String subCrhOrder) {
            this.subCrhOrder = subCrhOrder;
        }

        public void setSubOrderId(String subOrderId) {
            this.subOrderId = subOrderId;
        }

        public void setSubPddOrderId(String subPddOrderId) {
            this.subPddOrderId = subPddOrderId;
        }

        public void setTicketPrice(Long ticketPrice) {
            this.ticketPrice = ticketPrice;
        }

        public void setTicketType(Integer ticketType) {
            this.ticketType = ticketType;
        }

        public void setIsChooseSeat(Integer isChooseSeat) {
            this.isChooseSeat = isChooseSeat;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}