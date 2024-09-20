package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKnockSupplierRbacRoleMembersSyncResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddKnockSupplierRbacRoleMembersSyncRequest extends PopBaseHttpRequest<PddKnockSupplierRbacRoleMembersSyncResponse> {

    /**
     * 同步角色成员请求体
     */
    @JsonProperty("request")
    private Request request;

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
        return "pdd.knock.supplier.rbac.role.members.sync";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKnockSupplierRbacRoleMembersSyncResponse> getResponseClass() {
        return PddKnockSupplierRbacRoleMembersSyncResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "request", request);
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public static class Request {

        /**
         * ADD_ACTION_ENUM 或者 DEL_ACTION_ENUM
         */
        @JsonProperty("modify_action_enum")
        private String modifyActionEnum;

        /**
         * 角色key
         */
        @JsonProperty("role_key")
        private String roleKey;

        /**
         * userNumber列表
         */
        @JsonProperty("user_numbers")
        private List<String> userNumbers;

        public void setModifyActionEnum(String modifyActionEnum) {
            this.modifyActionEnum = modifyActionEnum;
        }

        public void setRoleKey(String roleKey) {
            this.roleKey = roleKey;
        }

        public void setUserNumbers(List<String> userNumbers) {
            this.userNumbers = userNumbers;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}