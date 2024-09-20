package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddTicketOrderCreateNotifycationResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddTicketOrderCreateNotifycationRequest extends PopBaseHttpRequest<PddTicketOrderCreateNotifycationResponse> {

    /**
     * 码类型。status=2时必填。1.无凭证(身份证/手机号) 2. 数字码 3.QR图片 4.外链
     */
    @JsonProperty("code_type")
    private Integer codeType;

    /**
     * 失败错误码。status=3时必填
     */
    @JsonProperty("failed_code")
    private Integer failedCode;

    /**
     * 失败原因。 status=3时必填
     */
    @JsonProperty("failed_reason")
    private String failedReason;

    /**
     * 拼多多制票号
     */
    @JsonProperty("order_no")
    private String orderNo;

    /**
     * isv订单号
     */
    @JsonProperty("out_order_sn")
    private String outOrderSn;

    /**
     * 制码状态。 2.制作成功 3.制作失败
     */
    @JsonProperty("status")
    private Integer status;

    /**
     * 凭证信息列表。status=2 且 code_type!=1 时必填
     */
    @JsonProperty("tickets")
    private List<TicketsItem> tickets;

    /**
     * 凭证类型。status=2时必填。1.一人一码 2.一人多码
     */
    @JsonProperty("ticket_type")
    private Integer ticketType;

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
        return "pdd.ticket.order.create.notifycation";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddTicketOrderCreateNotifycationResponse> getResponseClass() {
        return PddTicketOrderCreateNotifycationResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "code_type", codeType);
        setUserParam(params, "failed_code", failedCode);
        setUserParam(params, "failed_reason", failedReason);
        setUserParam(params, "order_no", orderNo);
        setUserParam(params, "out_order_sn", outOrderSn);
        setUserParam(params, "status", status);
        setUserParam(params, "tickets", tickets);
        setUserParam(params, "ticket_type", ticketType);
    }

    public void setCodeType(Integer codeType) {
        this.codeType = codeType;
    }

    public void setFailedCode(Integer failedCode) {
        this.failedCode = failedCode;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public void setOutOrderSn(String outOrderSn) {
        this.outOrderSn = outOrderSn;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setTickets(List<TicketsItem> tickets) {
        this.tickets = tickets;
    }

    public void setTicketType(Integer ticketType) {
        this.ticketType = ticketType;
    }

    public static class TicketsItem {

        /**
         * 辅助凭证，有辅助凭证时返回
         */
        @JsonProperty("additional")
        private String additional;

        /**
         * 主凭证，code_type=2时返回
         */
        @JsonProperty("code")
        private String code;

        /**
         * 文件base64流，code_type=3时返回，大小小于800KB
         */
        @JsonProperty("file")
        private String file;

        /**
         * 外链，code_type=4时返回
         */
        @JsonProperty("url")
        private String url;

        public void setAdditional(String additional) {
            this.additional = additional;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}