package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddLogisticsTicketNotifyResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddLogisticsTicketNotifyRequest extends PopBaseHttpRequest<PddLogisticsTicketNotifyResponse> {

    /**
     * 附件url,示例：["http: testimg.yangkeduo.com/pdd_oms/2018-01-16/411068e948835ae053a86c13f8ebb5ee.jpg"]
     */
    @JsonProperty("attach_path_list")
    private List<String> attachPathList;

    /**
     * 赔付金额(单位:分)
     */
    @JsonProperty("compensate_amount")
    private Long compensateAmount;

    /**
     * 是否赔付，0:默认,1:未赔付,2:已赔付
     */
    @JsonProperty("compensate_state")
    private Integer compensateState;

    /**
     * 责任方，0:默认, 1:消费者,2:商家,3:快递公司,4:其他
     */
    @JsonProperty("duty")
    private Integer duty;

    /**
     * 处理人
     */
    @JsonProperty("express_dealer")
    private String expressDealer;

    /**
     * 处理人联系方式
     */
    @JsonProperty("express_dealer_contact")
    private String expressDealerContact;

    /**
     * 处理结果
     */
    @JsonProperty("handle_result")
    private String handleResult;

    /**
     * 电联结果，当reply_type=2时，为必填项，同时该字段的值为一个json格式的字符串，格式参考示例 示例：{"call_result":1,"call_timestamp":"1688283125000","caller_name":"小张","caller_contract":"15067188888"} call_result:电联结果（int,必填） 取值如下：1：停机/空号、2：电话占线、3：无人接听、4：接通后非本人、5：接通但反馈没投诉过 call_timestamp:电联时间戳（long ,必填） caller_name:回拨人姓名（String,必填） caller_contract:回拨联系方式（String,必填）
     */
    @JsonProperty("reply_call_result")
    private String replyCallResult;

    /**
     * 回复类型，1:回复工单处理结果，2:回复电联结果，当为空时，默认赋值1
     */
    @JsonProperty("reply_type")
    private Integer replyType;

    /**
     * 签收状态，0:默认,1:未签收,2:已签收
     */
    @JsonProperty("sign_state")
    private Integer signState;

    /**
     * 工单id
     */
    @JsonProperty("ticket_id")
    private Long ticketId;

    /**
     * 运单号(可为空字符串)
     */
    @JsonProperty("waybill_no")
    private String waybillNo;

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
        return 0;
    }

    @Override
    public String getType() {
        return "pdd.logistics.ticket.notify";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddLogisticsTicketNotifyResponse> getResponseClass() {
        return PddLogisticsTicketNotifyResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "attach_path_list", attachPathList);
        setUserParam(params, "compensate_amount", compensateAmount);
        setUserParam(params, "compensate_state", compensateState);
        setUserParam(params, "duty", duty);
        setUserParam(params, "express_dealer", expressDealer);
        setUserParam(params, "express_dealer_contact", expressDealerContact);
        setUserParam(params, "handle_result", handleResult);
        setUserParam(params, "reply_call_result", replyCallResult);
        setUserParam(params, "reply_type", replyType);
        setUserParam(params, "sign_state", signState);
        setUserParam(params, "ticket_id", ticketId);
        setUserParam(params, "waybill_no", waybillNo);
    }

    public void setAttachPathList(List<String> attachPathList) {
        this.attachPathList = attachPathList;
    }

    public void setCompensateAmount(Long compensateAmount) {
        this.compensateAmount = compensateAmount;
    }

    public void setCompensateState(Integer compensateState) {
        this.compensateState = compensateState;
    }

    public void setDuty(Integer duty) {
        this.duty = duty;
    }

    public void setExpressDealer(String expressDealer) {
        this.expressDealer = expressDealer;
    }

    public void setExpressDealerContact(String expressDealerContact) {
        this.expressDealerContact = expressDealerContact;
    }

    public void setHandleResult(String handleResult) {
        this.handleResult = handleResult;
    }

    public void setReplyCallResult(String replyCallResult) {
        this.replyCallResult = replyCallResult;
    }

    public void setReplyType(Integer replyType) {
        this.replyType = replyType;
    }

    public void setSignState(Integer signState) {
        this.signState = signState;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public void setWaybillNo(String waybillNo) {
        this.waybillNo = waybillNo;
    }
}