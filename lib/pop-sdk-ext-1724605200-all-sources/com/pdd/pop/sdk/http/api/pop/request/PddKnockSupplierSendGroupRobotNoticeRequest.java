package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKnockSupplierSendGroupRobotNoticeResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddKnockSupplierSendGroupRobotNoticeRequest extends PopBaseHttpRequest<PddKnockSupplierSendGroupRobotNoticeResponse> {

    /**
     * 发送群公告机器人请求体
     */
    @JsonProperty("group_robot_send_notice_req")
    private GroupRobotSendNoticeReq groupRobotSendNoticeReq;

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
        return "pdd.knock.supplier.send.group.robot.notice";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKnockSupplierSendGroupRobotNoticeResponse> getResponseClass() {
        return PddKnockSupplierSendGroupRobotNoticeResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "group_robot_send_notice_req", groupRobotSendNoticeReq);
    }

    public void setGroupRobotSendNoticeReq(GroupRobotSendNoticeReq groupRobotSendNoticeReq) {
        this.groupRobotSendNoticeReq = groupRobotSendNoticeReq;
    }

    public static class GroupRobotSendNoticeReq {

        /**
         * 是否@所有人
         */
        @JsonProperty("at_all")
        private Boolean atAll;

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

        public void setAtAll(Boolean atAll) {
            this.atAll = atAll;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setGroupRobotToken(String groupRobotToken) {
            this.groupRobotToken = groupRobotToken;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}