package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddSmsVendorComplaintCreateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddSmsVendorComplaintCreateRequest extends PopBaseHttpRequest<PddSmsVendorComplaintCreateResponse> {

    /**
     * cmpp账号名
     */
    @JsonProperty("account")
    private String account;

    /**
     * 投诉时间(格式yyyy-MM-dd HH:mm:ss)
     */
    @JsonProperty("complaint_time")
    private String complaintTime;

    /**
     * 投诉次数
     */
    @JsonProperty("count")
    private Integer count;

    /**
     * 短信下发时间(格式yyyy-MM-dd HH:mm:ss)
     */
    @JsonProperty("deliver_time")
    private String deliverTime;

    /**
     * 手机号码
     */
    @JsonProperty("mobile")
    private String mobile;

    /**
     * 归属运营商
     */
    @JsonProperty("operator")
    private String operator;

    /**
     * 归属地省份
     */
    @JsonProperty("province")
    private String province;

    /**
     * 短信投诉内容(不超过500个字)
     */
    @JsonProperty("sms_content")
    private String smsContent;

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
        return "pdd.sms.vendor.complaint.create";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddSmsVendorComplaintCreateResponse> getResponseClass() {
        return PddSmsVendorComplaintCreateResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "account", account);
        setUserParam(params, "complaint_time", complaintTime);
        setUserParam(params, "count", count);
        setUserParam(params, "deliver_time", deliverTime);
        setUserParam(params, "mobile", mobile);
        setUserParam(params, "operator", operator);
        setUserParam(params, "province", province);
        setUserParam(params, "sms_content", smsContent);
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setComplaintTime(String complaintTime) {
        this.complaintTime = complaintTime;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setDeliverTime(String deliverTime) {
        this.deliverTime = deliverTime;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setSmsContent(String smsContent) {
        this.smsContent = smsContent;
    }
}