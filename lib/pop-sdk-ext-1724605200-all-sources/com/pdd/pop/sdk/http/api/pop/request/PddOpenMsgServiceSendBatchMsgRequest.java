package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddOpenMsgServiceSendBatchMsgResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddOpenMsgServiceSendBatchMsgRequest extends PopBaseHttpRequest<PddOpenMsgServiceSendBatchMsgResponse> {

    /**
     * 业务请求唯一标识
     */
    @JsonProperty("out_id")
    private String outId;

    /**
     * 接收短信的手机号码列表（仅允许密文）,["密文1", "密文2"]
     */
    @JsonProperty("phone_numbers")
    private List<String> phoneNumbers;

    /**
     * 短信签名名称
     */
    @JsonProperty("sign_name")
    private String signName;

    /**
     * 上行短信扩展码
     */
    @JsonProperty("sms_up_extend_code")
    private String smsUpExtendCode;

    /**
     * 短信模板CODE
     */
    @JsonProperty("template_code")
    private Long templateCode;

    /**
     * 短信模板变量JSON集合(与手机号对应),示例："${param}","aaa"，注意${}符号勿遗漏
     */
    @JsonProperty("template_param_json")
    private List<Map<String, String>> templateParamJson;

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
        return "pdd.open.msg.service.send.batch.msg";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddOpenMsgServiceSendBatchMsgResponse> getResponseClass() {
        return PddOpenMsgServiceSendBatchMsgResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "out_id", outId);
        setUserParam(params, "phone_numbers", phoneNumbers);
        setUserParam(params, "sign_name", signName);
        setUserParam(params, "sms_up_extend_code", smsUpExtendCode);
        setUserParam(params, "template_code", templateCode);
        setUserParam(params, "template_param_json", templateParamJson);
    }

    public void setOutId(String outId) {
        this.outId = outId;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public void setSignName(String signName) {
        this.signName = signName;
    }

    public void setSmsUpExtendCode(String smsUpExtendCode) {
        this.smsUpExtendCode = smsUpExtendCode;
    }

    public void setTemplateCode(Long templateCode) {
        this.templateCode = templateCode;
    }

    public void setTemplateParamJson(List<Map<String, String>> templateParamJson) {
        this.templateParamJson = templateParamJson;
    }
}