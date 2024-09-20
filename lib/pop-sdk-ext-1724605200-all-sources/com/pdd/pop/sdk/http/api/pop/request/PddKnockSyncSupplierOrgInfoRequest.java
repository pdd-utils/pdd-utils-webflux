package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKnockSyncSupplierOrgInfoResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddKnockSyncSupplierOrgInfoRequest extends PopBaseHttpRequest<PddKnockSyncSupplierOrgInfoResponse> {

    /**
     * 同步请求
     */
    @JsonProperty("sync_request")
    private SyncRequest syncRequest;

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
        return "pdd.knock.sync.supplier.org.info";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKnockSyncSupplierOrgInfoResponse> getResponseClass() {
        return PddKnockSyncSupplierOrgInfoResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "sync_request", syncRequest);
    }

    public void setSyncRequest(SyncRequest syncRequest) {
        this.syncRequest = syncRequest;
    }

    public static class SyncRequest {

        /**
         * 同步组织列表
         */
        @JsonProperty("supplier_org_sync_infos")
        private List<SyncRequestSupplierOrgSyncInfosItem> supplierOrgSyncInfos;

        public void setSupplierOrgSyncInfos(List<SyncRequestSupplierOrgSyncInfosItem> supplierOrgSyncInfos) {
            this.supplierOrgSyncInfos = supplierOrgSyncInfos;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class SyncRequestSupplierOrgSyncInfosItem {

        /**
         * 组织名称
         */
        @JsonProperty("org_name")
        private String orgName;

        /**
         * 组织编号
         */
        @JsonProperty("org_number")
        private String orgNumber;

        /**
         * 组织简称
         */
        @JsonProperty("org_short_name")
        private String orgShortName;

        /**
         * 组织同步动作:CREATE,UPDATE,DELETE
         */
        @JsonProperty("supplier_org_sync_action")
        private String supplierOrgSyncAction;

        public void setOrgName(String orgName) {
            this.orgName = orgName;
        }

        public void setOrgNumber(String orgNumber) {
            this.orgNumber = orgNumber;
        }

        public void setOrgShortName(String orgShortName) {
            this.orgShortName = orgShortName;
        }

        public void setSupplierOrgSyncAction(String supplierOrgSyncAction) {
            this.supplierOrgSyncAction = supplierOrgSyncAction;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}