package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKnockSupplierSendGroupRobotMessageResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddKnockSupplierSendGroupRobotMessageRequest extends PopBaseHttpRequest<PddKnockSupplierSendGroupRobotMessageResponse> {

    /**
     * 发送群聊机器人消息请求体
     */
    @JsonProperty("group_robot_send_msg_req")
    private GroupRobotSendMsgReq groupRobotSendMsgReq;

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
        return "pdd.knock.supplier.send.group.robot.message";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKnockSupplierSendGroupRobotMessageResponse> getResponseClass() {
        return PddKnockSupplierSendGroupRobotMessageResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "group_robot_send_msg_req", groupRobotSendMsgReq);
    }

    public void setGroupRobotSendMsgReq(GroupRobotSendMsgReq groupRobotSendMsgReq) {
        this.groupRobotSendMsgReq = groupRobotSendMsgReq;
    }

    public static class GroupRobotSendMsgReq {

        /**
         * 是否@所有人
         */
        @JsonProperty("at_all")
        private String atAll;

        /**
         * 文本内容，2k字符以内
         */
        @JsonProperty("content")
        private String content;

        /**
         * 群聊机器人token
         */
        @JsonProperty("group_robot_token")
        private String groupRobotToken;

        /**
         * 消息类型TEXT为文本
         */
        @JsonProperty("msg_type")
        private String msgType;

        /**
         * knockId列表，可以根据knockId@群里的人
         */
        @JsonProperty("knock_ids")
        private List<String> knockIds;

        public void setAtAll(String atAll) {
            this.atAll = atAll;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setGroupRobotToken(String groupRobotToken) {
            this.groupRobotToken = groupRobotToken;
        }

        public void setMsgType(String msgType) {
            this.msgType = msgType;
        }

        public void setKnockIds(List<String> knockIds) {
            this.knockIds = knockIds;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}