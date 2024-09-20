package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKnockSupplierRbacRoleInfoQueryResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddKnockSupplierRbacRoleInfoQueryRequest extends PopBaseHttpRequest<PddKnockSupplierRbacRoleInfoQueryResponse> {

    /**
     * 角色信息查询请求体
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
        return "pdd.knock.supplier.rbac.role.info.query";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKnockSupplierRbacRoleInfoQueryResponse> getResponseClass() {
        return PddKnockSupplierRbacRoleInfoQueryResponse.class;
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
         * QUERY_BY_ORG_NUMBER 或 QUERY_BY_ROLE_KEY
         */
        @JsonProperty("org_number")
        private String orgNumber;

        /**
         * query_role_key_info_enum 为QUERY_BY_ROLE_KEY时必填
         */
        @JsonProperty("role_key")
        private String roleKey;

        /**
         * query_role_key_info_enum 为QUERY_BY_ROLE_KEY时必填
         */
        @JsonProperty("query_role_key_info_enum")
        private String queryRoleKeyInfoEnum;

        public void setOrgNumber(String orgNumber) {
            this.orgNumber = orgNumber;
        }

        public void setRoleKey(String roleKey) {
            this.roleKey = roleKey;
        }

        public void setQueryRoleKeyInfoEnum(String queryRoleKeyInfoEnum) {
            this.queryRoleKeyInfoEnum = queryRoleKeyInfoEnum;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}