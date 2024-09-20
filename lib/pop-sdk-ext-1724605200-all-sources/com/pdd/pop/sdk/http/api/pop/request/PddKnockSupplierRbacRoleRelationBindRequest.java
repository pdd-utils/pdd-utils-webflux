package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKnockSupplierRbacRoleRelationBindResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddKnockSupplierRbacRoleRelationBindRequest extends PopBaseHttpRequest<PddKnockSupplierRbacRoleRelationBindResponse> {

    /**
     * 角色key绑定请求体
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
        return "pdd.knock.supplier.rbac.role.relation.bind";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKnockSupplierRbacRoleRelationBindResponse> getResponseClass() {
        return PddKnockSupplierRbacRoleRelationBindResponse.class;
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
         * 角色key
         */
        @JsonProperty("from_role_key")
        private String fromRoleKey;

        /**
         * 被绑定角色key
         */
        @JsonProperty("to_role_key")
        private String toRoleKey;

        public void setFromRoleKey(String fromRoleKey) {
            this.fromRoleKey = fromRoleKey;
        }

        public void setToRoleKey(String toRoleKey) {
            this.toRoleKey = toRoleKey;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}