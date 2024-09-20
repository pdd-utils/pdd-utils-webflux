package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddSmsDetailbillPushResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddSmsDetailbillPushRequest extends PopBaseHttpRequest<PddSmsDetailbillPushResponse> {

    /**
     * cmpp账号名
     */
    @JsonProperty("account")
    private String account;

    /**
     * 批次版本，每天数据必须属于同一个批次，如果重传可以批次号增加，平台以最大批次号为准。一般情况下，批次号固定数字，只有当某天上传数据错误需要弃用时，使用增加后的新批次号。
     */
    @JsonProperty("batch_version")
    private Long batchVersion;

    /**
     * 数据日期(格式yyyy-MM-dd)
     */
    @JsonProperty("date")
    private String date;

    /**
     * 短信明细，detail的列表，list最大100
     */
    @JsonProperty("details")
    private List<DetailsItem> details;

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
        return "pdd.sms.detailbill.push";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddSmsDetailbillPushResponse> getResponseClass() {
        return PddSmsDetailbillPushResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "account", account);
        setUserParam(params, "batch_version", batchVersion);
        setUserParam(params, "date", date);
        setUserParam(params, "details", details);
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setBatchVersion(Long batchVersion) {
        this.batchVersion = batchVersion;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDetails(List<DetailsItem> details) {
        this.details = details;
    }

    public static class DetailsItem {

        /**
         * 短信下发时间(yyyy-MM-dd HH:mm:ss)
         */
        @JsonProperty("deliver_time")
        private String deliverTime;

        /**
         * 回执状态码，发送成功传DELIVRD
         */
        @JsonProperty("error_code")
        private String errorCode;

        /**
         * 短信id,即SubmitResp.msgId,十进制表示
         */
        @JsonProperty("msg_id")
        private Long msgId;

        /**
         * 短信提交时间(yyyy-MM-dd HH:mm:ss)
         */
        @JsonProperty("submit_time")
        private String submitTime;

        public void setDeliverTime(String deliverTime) {
            this.deliverTime = deliverTime;
        }

        public void setErrorCode(String errorCode) {
            this.errorCode = errorCode;
        }

        public void setMsgId(Long msgId) {
            this.msgId = msgId;
        }

        public void setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}