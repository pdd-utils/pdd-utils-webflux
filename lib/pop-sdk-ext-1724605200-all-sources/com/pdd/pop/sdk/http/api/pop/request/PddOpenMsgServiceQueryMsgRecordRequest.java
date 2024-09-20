package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddOpenMsgServiceQueryMsgRecordResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddOpenMsgServiceQueryMsgRecordRequest extends PopBaseHttpRequest<PddOpenMsgServiceQueryMsgRecordResponse> {

    /**
     * 短信发送流水
     */
    @JsonProperty("biz_id")
    private String bizId;

    /**
     * 分页参数,页码
     */
    @JsonProperty("page_number")
    private Integer pageNumber;

    /**
     * 分页参数，每页数量。最大值50
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 查询手机号码
     */
    @JsonProperty("phone_number")
    private String phoneNumber;

    /**
     * 短信发送日期，支持近30天记录查询，格式yyyyMMdd
     */
    @JsonProperty("send_date")
    private String sendDate;

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
        return "pdd.open.msg.service.query.msg.record";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddOpenMsgServiceQueryMsgRecordResponse> getResponseClass() {
        return PddOpenMsgServiceQueryMsgRecordResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "biz_id", bizId);
        setUserParam(params, "page_number", pageNumber);
        setUserParam(params, "page_size", pageSize);
        setUserParam(params, "phone_number", phoneNumber);
        setUserParam(params, "send_date", sendDate);
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

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }
}