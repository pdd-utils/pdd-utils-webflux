package com.pdd.pop.sdk.http.api.ark.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.ark.response.PddTrainBillRecordResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddTrainBillRecordRequest extends PopBaseHttpRequest<PddTrainBillRecordResponse> {

    /**
     * 订单类型 0-普通订单 1-抢票订单
     */
    @JsonProperty("book_type")
    private Integer bookType;

    /**
     * 改签日期（yyyy-MM-dd HH:mm:ss）
     */
    @JsonProperty("changed_time")
    private String changedTime;

    /**
     * 改签类型 0-非改签票 1-改签票
     */
    @JsonProperty("change_type")
    private Integer changeType;

    /**
     * 出票日期（yyyy-MM-dd HH:mm:ss）
     */
    @JsonProperty("confirmed_time")
    private String confirmedTime;

    /**
     * 是否有12306账号 0-没有账号 1-有账号
     */
    @JsonProperty("crh_account")
    private Integer crhAccount;

    /**
     * 12306订单号
     */
    @JsonProperty("crh_order")
    private String crhOrder;

    /**
     * 12306取票号
     */
    @JsonProperty("sub_crh_order")
    private String subCrhOrder;

    /**
     * 数据日期（yyyy-MM）
     */
    @JsonProperty("date")
    private String date;

    /**
     * 商家订单号
     */
    @JsonProperty("order_id")
    private String orderId;

    /**
     * 商家子订单号
     */
    @JsonProperty("sub_order_id")
    private String subOrderId;

    /**
     * 拼多多父单号
     */
    @JsonProperty("pdd_order_id")
    private String pddOrderId;

    /**
     * 拼多多子单号
     */
    @JsonProperty("sub_pdd_order_id")
    private String subPddOrderId;

    /**
     * 退票日期（yyyy-MM-dd HH:mm:ss）
     */
    @JsonProperty("returned_time")
    private String returnedTime;

    /**
     * 服务费金额（单位：分）
     */
    @JsonProperty("service_amount")
    private Long serviceAmount;

    /**
     * 服务费单价（单位：分）
     */
    @JsonProperty("service_price")
    private Long servicePrice;

    /**
     * 车票状态 0-出票成功 1-改签 2-退票
     */
    @JsonProperty("ticket_status")
    private Integer ticketStatus;

    /**
     * 版本号，一个月数据属于同一版本，如果重传可以版本号增加，平台以最大版本号为准。一般版本号为固定数字，如果有上传错误需要弃用，使用增加后的新版本号
     */
    @JsonProperty("version")
    private Long version;

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
        return "pdd.train.bill.record";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddTrainBillRecordResponse> getResponseClass() {
        return PddTrainBillRecordResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "book_type", bookType);
        setUserParam(params, "changed_time", changedTime);
        setUserParam(params, "change_type", changeType);
        setUserParam(params, "confirmed_time", confirmedTime);
        setUserParam(params, "crh_account", crhAccount);
        setUserParam(params, "crh_order", crhOrder);
        setUserParam(params, "sub_crh_order", subCrhOrder);
        setUserParam(params, "date", date);
        setUserParam(params, "order_id", orderId);
        setUserParam(params, "sub_order_id", subOrderId);
        setUserParam(params, "pdd_order_id", pddOrderId);
        setUserParam(params, "sub_pdd_order_id", subPddOrderId);
        setUserParam(params, "returned_time", returnedTime);
        setUserParam(params, "service_amount", serviceAmount);
        setUserParam(params, "service_price", servicePrice);
        setUserParam(params, "ticket_status", ticketStatus);
        setUserParam(params, "version", version);
    }

    public void setBookType(Integer bookType) {
        this.bookType = bookType;
    }

    public void setChangedTime(String changedTime) {
        this.changedTime = changedTime;
    }

    public void setChangeType(Integer changeType) {
        this.changeType = changeType;
    }

    public void setConfirmedTime(String confirmedTime) {
        this.confirmedTime = confirmedTime;
    }

    public void setCrhAccount(Integer crhAccount) {
        this.crhAccount = crhAccount;
    }

    public void setCrhOrder(String crhOrder) {
        this.crhOrder = crhOrder;
    }

    public void setSubCrhOrder(String subCrhOrder) {
        this.subCrhOrder = subCrhOrder;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setSubOrderId(String subOrderId) {
        this.subOrderId = subOrderId;
    }

    public void setPddOrderId(String pddOrderId) {
        this.pddOrderId = pddOrderId;
    }

    public void setSubPddOrderId(String subPddOrderId) {
        this.subPddOrderId = subPddOrderId;
    }

    public void setReturnedTime(String returnedTime) {
        this.returnedTime = returnedTime;
    }

    public void setServiceAmount(Long serviceAmount) {
        this.serviceAmount = serviceAmount;
    }

    public void setServicePrice(Long servicePrice) {
        this.servicePrice = servicePrice;
    }

    public void setTicketStatus(Integer ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}