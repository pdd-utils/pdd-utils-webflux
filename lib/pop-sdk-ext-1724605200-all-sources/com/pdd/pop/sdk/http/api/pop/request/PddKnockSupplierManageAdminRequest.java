package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKnockSupplierManageAdminResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddKnockSupplierManageAdminRequest extends PopBaseHttpRequest<PddKnockSupplierManageAdminResponse> {

    /**
     * 外部配置公司管理员请求体
     */
    @JsonProperty("supplier_manage_admin_req")
    private SupplierManageAdminReq supplierManageAdminReq;

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
        return "pdd.knock.supplier.manage.admin";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKnockSupplierManageAdminResponse> getResponseClass() {
        return PddKnockSupplierManageAdminResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "supplier_manage_admin_req", supplierManageAdminReq);
    }

    public void setSupplierManageAdminReq(SupplierManageAdminReq supplierManageAdminReq) {
        this.supplierManageAdminReq = supplierManageAdminReq;
    }

    public static class SupplierManageAdminReq {

        /**
         * 配置的用户和公司
         */
        @JsonProperty("admin_manage_uid_org_map")
        private Map<String, List<String>> adminManageUidOrgMap;

        /**
         * 动作  赋予权限:GRANT  移除权限:REMOVE
         */
        @JsonProperty("admin_option")
        private String adminOption;

        public void setAdminManageUidOrgMap(Map<String, List<String>> adminManageUidOrgMap) {
            this.adminManageUidOrgMap = adminManageUidOrgMap;
        }

        public void setAdminOption(String adminOption) {
            this.adminOption = adminOption;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}