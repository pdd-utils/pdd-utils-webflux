package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddOpenMsgServiceQueryExpressMsgRecordResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddOpenMsgServiceQueryExpressMsgRecordRequest extends PopBaseHttpRequest<PddOpenMsgServiceQueryExpressMsgRecordResponse> {

    /**
     * 短信发送流水
     */
    @JsonProperty("biz_id")
    private String bizId;

    /**
     * 分页参数，每页数量。最大值50
     */
    @JsonProperty("page_number")
    private Integer pageNumber;

    /**
     * 分页参数,页码
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 短信发送日期，支持近30天记录查询，格式yyyyMMdd
     */
    @JsonProperty("send_date")
    private String sendDate;

    /**
     * 查询的物流编号
     */
    @JsonProperty("waybill_code")
    private String waybillCode;

    /**
     * 物流公司编号
     */
    @JsonProperty("wp_code")
    private String wpCode;

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
        return "pdd.open.msg.service.query.express.msg.record";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddOpenMsgServiceQueryExpressMsgRecordResponse> getResponseClass() {
        return PddOpenMsgServiceQueryExpressMsgRecordResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "biz_id", bizId);
        setUserParam(params, "page_number", pageNumber);
        setUserParam(params, "page_size", pageSize);
        setUserParam(params, "send_date", sendDate);
        setUserParam(params, "waybill_code", waybillCode);
        setUserParam(params, "wp_code", wpCode);
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }

    public void setWaybillCode(String waybillCode) {
        this.waybillCode = waybillCode;
    }

    public void setWpCode(String wpCode) {
        this.wpCode = wpCode;
    }
}