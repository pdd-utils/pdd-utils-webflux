package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddOpenMsgServiceSendExpressMsgResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddOpenMsgServiceSendExpressMsgRequest extends PopBaseHttpRequest<PddOpenMsgServiceSendExpressMsgResponse> {

    /**
     * 业务请求唯一标识
     */
    @JsonProperty("out_id")
    private String outId;

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
     * 短信模板变量JSON集合(与手机号对应)与按照手机号发短信一致key变量名 value变量值,示例："${param}","aaa"，注意${}符号勿遗漏
     */
    @JsonProperty("template_param_json")
    private List<Map<String, String>> templateParamJson;

    /**
     * 物流单号集合
     */
    @JsonProperty("waybill_codes")
    private List<String> waybillCodes;

    /**
     * 快递公司编码
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
        return "pdd.open.msg.service.send.express.msg";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddOpenMsgServiceSendExpressMsgResponse> getResponseClass() {
        return PddOpenMsgServiceSendExpressMsgResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "out_id", outId);
        setUserParam(params, "sign_name", signName);
        setUserParam(params, "sms_up_extend_code", smsUpExtendCode);
        setUserParam(params, "template_code", templateCode);
        setUserParam(params, "template_param_json", templateParamJson);
        setUserParam(params, "waybill_codes", waybillCodes);
        setUserParam(params, "wp_code", wpCode);
    }

    public void setOutId(String outId) {
        this.outId = outId;
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

    public void setWaybillCodes(List<String> waybillCodes) {
        this.waybillCodes = waybillCodes;
    }

    public void setWpCode(String wpCode) {
        this.wpCode = wpCode;
    }
}