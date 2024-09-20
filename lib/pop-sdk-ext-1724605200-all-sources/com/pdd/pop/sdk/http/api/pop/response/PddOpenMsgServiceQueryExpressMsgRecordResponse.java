package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddOpenMsgServiceQueryExpressMsgRecordResponse extends PopBaseHttpResponse {

    /**
     * 请求状态码
     */
    @JsonProperty("result_code")
    private String resultCode;

    /**
     * 状态码描述
     */
    @JsonProperty("result_message")
    private String resultMessage;

    /**
     * 短信发送明细列表
     */
    @JsonProperty("sms_send_details")
    private List<SmsSendDetailsItem> smsSendDetails;

    /**
     * 短信发送总条数
     */
    @JsonProperty("total_count")
    private Long totalCount;

    public String getResultCode() {
        return resultCode;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public List<SmsSendDetailsItem> getSmsSendDetails() {
        return smsSendDetails;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public static class SmsSendDetailsItem {

        /**
         * 模板内容
         */
        @JsonProperty("content")
        private String content;

        /**
         * 错误码
         */
        @JsonProperty("error_code")
        private Long errorCode;

        /**
         * 外部id
         */
        @JsonProperty("out_id")
        private String outId;

        /**
         * 手机号码
         */
        @JsonProperty("phone_number")
        private String phoneNumber;

        /**
         * 接收时间
         */
        @JsonProperty("receive_time")
        private String receiveTime;

        /**
         * 发送状态
         */
        @JsonProperty("send_status")
        private Integer sendStatus;

        /**
         * 发送时间
         */
        @JsonProperty("send_time")
        private String sendTime;

        /**
         * 模板ID
         */
        @JsonProperty("template_code")
        private Long templateCode;

        public String getContent() {
            return content;
        }

        public Long getErrorCode() {
            return errorCode;
        }

        public String getOutId() {
            return outId;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public String getReceiveTime() {
            return receiveTime;
        }

        public Integer getSendStatus() {
            return sendStatus;
        }

        public String getSendTime() {
            return sendTime;
        }

        public Long getTemplateCode() {
            return templateCode;
        }
    }
}