package com.pdd.pop.sdk.http.api.ark.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.ark.response.PddTrainCallbackGrabResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddTrainCallbackGrabRequest extends PopBaseHttpRequest<PddTrainCallbackGrabResponse> {

    /**
     * 到达站点
     */
    @JsonProperty("arrive_station")
    private String arriveStation;

    /**
     * 到达站点三字码
     */
    @JsonProperty("arrive_station_code")
    private String arriveStationCode;

    /**
     * 到达时间
     */
    @JsonProperty("arrive_time")
    private String arriveTime;

    /**
     * 错误码
     */
    @JsonProperty("code")
    private Integer code;

    /**
     * 12306 单号
     */
    @JsonProperty("crh_order_id")
    private String crhOrderId;

    /**
     * 出发站点
     */
    @JsonProperty("depart_station")
    private String departStation;

    /**
     * 出发站三字码
     */
    @JsonProperty("depart_station_code")
    private String departStationCode;

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
     * 订单总票价
     */
    @JsonProperty("order_ticket_price")
    private Long orderTicketPrice;

    /**
     * 下单时间
     */
    @JsonProperty("order_time")
    private String orderTime;

    /**
     * 乘车人信息
     */
    @JsonProperty("passengers")
    private List<PassengersItem> passengers;

    /**
     * 拼多多订单号
     */
    @JsonProperty("pdd_order_id")
    private String pddOrderId;

    /**
     * 票数
     */
    @JsonProperty("ticket_num")
    private Integer ticketNum;

    /**
     * 车次时间
     */
    @JsonProperty("train_date")
    private String trainDate;

    /**
     * 车次号
     */
    @JsonProperty("train_no")
    private String trainNo;

    /**
     * 历时(例如: 3 时 51 分)
     */
    @JsonProperty("travel_time")
    private String travelTime;

    /**
     * 商家订单时间
     */
    @JsonProperty("vendor_time")
    private String vendorTime;

    /**
     * 抢票结束时间
     */
    @JsonProperty("end_time")
    private String endTime;

    /**
     * 抢票方式（未知：-1，抢票：0，候补：1）
     */
    @JsonProperty("channel")
    private Integer channel;

    /**
     * 是否可身份证检票
     */
    @JsonProperty("id_card_check_in")
    private Integer idCardCheckIn;

    /**
     * 检票口
     */
    @JsonProperty("gate_no")
    private String gateNo;

    /**
     * 里程
     */
    @JsonProperty("distance")
    private String distance;

    /**
     * 是否先占座单 0 否 1 是
     */
    @JsonProperty("is_reserve_first")
    private Integer isReserveFirst;

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
        return "pdd.train.callback.grab";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddTrainCallbackGrabResponse> getResponseClass() {
        return PddTrainCallbackGrabResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "arrive_station", arriveStation);
        setUserParam(params, "arrive_station_code", arriveStationCode);
        setUserParam(params, "arrive_time", arriveTime);
        setUserParam(params, "code", code);
        setUserParam(params, "crh_order_id", crhOrderId);
        setUserParam(params, "depart_station", departStation);
        setUserParam(params, "depart_station_code", departStationCode);
        setUserParam(params, "depart_time", departTime);
        setUserParam(params, "msg", msg);
        setUserParam(params, "order_id", orderId);
        setUserParam(params, "order_ticket_price", orderTicketPrice);
        setUserParam(params, "order_time", orderTime);
        setUserParam(params, "passengers", passengers);
        setUserParam(params, "pdd_order_id", pddOrderId);
        setUserParam(params, "ticket_num", ticketNum);
        setUserParam(params, "train_date", trainDate);
        setUserParam(params, "train_no", trainNo);
        setUserParam(params, "travel_time", travelTime);
        setUserParam(params, "vendor_time", vendorTime);
        setUserParam(params, "end_time", endTime);
        setUserParam(params, "channel", channel);
        setUserParam(params, "id_card_check_in", idCardCheckIn);
        setUserParam(params, "gate_no", gateNo);
        setUserParam(params, "distance", distance);
        setUserParam(params, "is_reserve_first", isReserveFirst);
    }

    public void setArriveStation(String arriveStation) {
        this.arriveStation = arriveStation;
    }

    public void setArriveStationCode(String arriveStationCode) {
        this.arriveStationCode = arriveStationCode;
    }

    public void setArriveTime(String arriveTime) {
        this.arriveTime = arriveTime;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setCrhOrderId(String crhOrderId) {
        this.crhOrderId = crhOrderId;
    }

    public void setDepartStation(String departStation) {
        this.departStation = departStation;
    }

    public void setDepartStationCode(String departStationCode) {
        this.departStationCode = departStationCode;
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

    public void setOrderTicketPrice(Long orderTicketPrice) {
        this.orderTicketPrice = orderTicketPrice;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public void setPassengers(List<PassengersItem> passengers) {
        this.passengers = passengers;
    }

    public void setPddOrderId(String pddOrderId) {
        this.pddOrderId = pddOrderId;
    }

    public void setTicketNum(Integer ticketNum) {
        this.ticketNum = ticketNum;
    }

    public void setTrainDate(String trainDate) {
        this.trainDate = trainDate;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public void setTravelTime(String travelTime) {
        this.travelTime = travelTime;
    }

    public void setVendorTime(String vendorTime) {
        this.vendorTime = vendorTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public void setIdCardCheckIn(Integer idCardCheckIn) {
        this.idCardCheckIn = idCardCheckIn;
    }

    public void setGateNo(String gateNo) {
        this.gateNo = gateNo;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public void setIsReserveFirst(Integer isReserveFirst) {
        this.isReserveFirst = isReserveFirst;
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
         * 车厢号(例:10 车厢)
         */
        @JsonProperty("coach_no")
        private String coachNo;

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
         * 座位号
         */
        @JsonProperty("seat_no")
        private String seatNo;

        /**
         * 座位类型
         */
        @JsonProperty("seat_type")
        private Integer seatType;

        /**
         * 座位类型名称
         */
        @JsonProperty("seat_type_name")
        private String seatTypeName;

        /**
         * 状态
         */
        @JsonProperty("status")
        private Integer status;

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

        public void setCardNo(String cardNo) {
            this.cardNo = cardNo;
        }

        public void setCardType(String cardType) {
            this.cardType = cardType;
        }

        public void setCoachNo(String coachNo) {
            this.coachNo = coachNo;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSeatName(String seatName) {
            this.seatName = seatName;
        }

        public void setSeatNo(String seatNo) {
            this.seatNo = seatNo;
        }

        public void setSeatType(Integer seatType) {
            this.seatType = seatType;
        }

        public void setSeatTypeName(String seatTypeName) {
            this.seatTypeName = seatTypeName;
        }

        public void setStatus(Integer status) {
            this.status = status;
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

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}