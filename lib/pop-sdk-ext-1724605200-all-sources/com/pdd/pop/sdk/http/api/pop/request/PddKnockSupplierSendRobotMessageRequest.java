package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKnockSupplierSendRobotMessageResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddKnockSupplierSendRobotMessageRequest extends PopBaseHttpRequest<PddKnockSupplierSendRobotMessageResponse> {

    /**
     * 供应商发送消息请求
     */
    @JsonProperty("supplier_send_robot_msg_req")
    private SupplierSendRobotMsgReq supplierSendRobotMsgReq;

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
        return "pdd.knock.supplier.send.robot.message";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKnockSupplierSendRobotMessageResponse> getResponseClass() {
        return PddKnockSupplierSendRobotMessageResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "supplier_send_robot_msg_req", supplierSendRobotMsgReq);
    }

    public void setSupplierSendRobotMsgReq(SupplierSendRobotMsgReq supplierSendRobotMsgReq) {
        this.supplierSendRobotMsgReq = supplierSendRobotMsgReq;
    }

    public static class SupplierSendRobotMsgReq {

        /**
         * 消息内容json，文本类型，直接发送文本内容 图片类型为pdd.knock.get.supplier.img.body获取的结果
         */
        @JsonProperty("content_json_body")
        private String contentJsonBody;

        /**
         * 加密的uuid列表
         */
        @JsonProperty("encrypt_uuid_list")
        private List<String> encryptUuidList;

        /**
         * 消息类型TEXT为文本,IMG为图片
         */
        @JsonProperty("msg_type")
        private String msgType;

        /**
         * 机器人名称
         */
        @JsonProperty("robot_name")
        private String robotName;

        /**
         * 发送方的msgid，如果没有特别高的并发，可以用毫秒时间戳
         */
        @JsonProperty("send_msg_id")
        private String sendMsgId;

        public void setContentJsonBody(String contentJsonBody) {
            this.contentJsonBody = contentJsonBody;
        }

        public void setEncryptUuidList(List<String> encryptUuidList) {
            this.encryptUuidList = encryptUuidList;
        }

        public void setMsgType(String msgType) {
            this.msgType = msgType;
        }

        public void setRobotName(String robotName) {
            this.robotName = robotName;
        }

        public void setSendMsgId(String sendMsgId) {
            this.sendMsgId = sendMsgId;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}