package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKnockSupplierCreateGroupChatResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddKnockSupplierCreateGroupChatRequest extends PopBaseHttpRequest<PddKnockSupplierCreateGroupChatResponse> {

    /**
     * 创建外部群请求体
     */
    @JsonProperty("group_create_req")
    private GroupCreateReq groupCreateReq;

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
        return "pdd.knock.supplier.create.group.chat";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKnockSupplierCreateGroupChatResponse> getResponseClass() {
        return PddKnockSupplierCreateGroupChatResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "group_create_req", groupCreateReq);
    }

    public void setGroupCreateReq(GroupCreateReq groupCreateReq) {
        this.groupCreateReq = groupCreateReq;
    }

    public static class GroupCreateReq {

        /**
         * 群公告
         */
        @JsonProperty("group_notice")
        private String groupNotice;

        /**
         * 群标题
         */
        @JsonProperty("group_title")
        private String groupTitle;

        /**
         * 群成员userNumber数组
         */
        @JsonProperty("member_user_number_list")
        private List<String> memberUserNumberList;

        /**
         * 所属公司orgNumber,不传则创建普通外部群
         */
        @JsonProperty("org_number")
        private String orgNumber;

        /**
         * 群主userNumber
         */
        @JsonProperty("owner_user_number")
        private String ownerUserNumber;

        /**
         * 群唯一代码，用来操作群成员，也用来去重
         */
        @JsonProperty("unique_id")
        private String uniqueId;

        public void setGroupNotice(String groupNotice) {
            this.groupNotice = groupNotice;
        }

        public void setGroupTitle(String groupTitle) {
            this.groupTitle = groupTitle;
        }

        public void setMemberUserNumberList(List<String> memberUserNumberList) {
            this.memberUserNumberList = memberUserNumberList;
        }

        public void setOrgNumber(String orgNumber) {
            this.orgNumber = orgNumber;
        }

        public void setOwnerUserNumber(String ownerUserNumber) {
            this.ownerUserNumber = ownerUserNumber;
        }

        public void setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}