package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddMedicineConsultReceiveResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddMedicineConsultReceiveRequest extends PopBaseHttpRequest<PddMedicineConsultReceiveResponse> {

    /**
     * 问诊单号
     */
    @JsonProperty("consult_no")
    private String consultNo;

    /**
     * 消息内容（加密string串，具体结构和加密方式请咨询极速问诊相关产品或技术）
     */
    @JsonProperty("content")
    private String content;

    /**
     * 医生ID(PDD商家后台维护的帐号映射)
     */
    @JsonProperty("doctor_id")
    private Long doctorId;

    /**
     * 消息ID(需唯一，医院生成，幂等控制)
     */
    @JsonProperty("msg_id")
    private String msgId;

    /**
     * 0-正常回复、1-小结
     */
    @JsonProperty("receive_type")
    private Integer receiveType;

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
        return "pdd.medicine.consult.receive";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddMedicineConsultReceiveResponse> getResponseClass() {
        return PddMedicineConsultReceiveResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "consult_no", consultNo);
        setUserParam(params, "content", content);
        setUserParam(params, "doctor_id", doctorId);
        setUserParam(params, "msg_id", msgId);
        setUserParam(params, "receive_type", receiveType);
    }

    public void setConsultNo(String consultNo) {
        this.consultNo = consultNo;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public void setReceiveType(Integer receiveType) {
        this.receiveType = receiveType;
    }
}