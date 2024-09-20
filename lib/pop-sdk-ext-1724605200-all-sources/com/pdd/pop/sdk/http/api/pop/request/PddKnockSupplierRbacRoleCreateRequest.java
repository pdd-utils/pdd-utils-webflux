package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKnockSupplierRbacRoleCreateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddKnockSupplierRbacRoleCreateRequest extends PopBaseHttpRequest<PddKnockSupplierRbacRoleCreateResponse> {

    /**
     * 创建角色请求
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
        return "pdd.knock.supplier.rbac.role.create";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKnockSupplierRbacRoleCreateResponse> getResponseClass() {
        return PddKnockSupplierRbacRoleCreateResponse.class;
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
         * 角色所属公司编号
         */
        @JsonProperty("org_number")
        private String orgNumber;

        public void setOrgNumber(String orgNumber) {
            this.orgNumber = orgNumber;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}