package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKnockSyncSupplierMemberInfoResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddKnockSyncSupplierMemberInfoRequest extends PopBaseHttpRequest<PddKnockSyncSupplierMemberInfoResponse> {

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
        return "pdd.knock.sync.supplier.member.info";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKnockSyncSupplierMemberInfoResponse> getResponseClass() {
        return PddKnockSyncSupplierMemberInfoResponse.class;
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
         * 同步人员列表
         */
        @JsonProperty("supplier_member_sync_infos")
        private List<SyncRequestSupplierMemberSyncInfosItem> supplierMemberSyncInfos;

        public void setSupplierMemberSyncInfos(List<SyncRequestSupplierMemberSyncInfosItem> supplierMemberSyncInfos) {
            this.supplierMemberSyncInfos = supplierMemberSyncInfos;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class SyncRequestSupplierMemberSyncInfosItem {

        /**
         * 邮箱
         */
        @JsonProperty("email")
        private String email;

        /**
         * 加密职务id
         */
        @JsonProperty("encrypted_job_id")
        private String encryptedJobId;

        /**
         * 手机号
         */
        @JsonProperty("mobile")
        private String mobile;

        /**
         * 名称
         */
        @JsonProperty("name")
        private String name;

        /**
         * 组织编号
         */
        @JsonProperty("org_number")
        private String orgNumber;

        /**
         * 同步动作 HIRE：入职 DISMISS：离职 UPDATE：更新
         */
        @JsonProperty("sync_action")
        private String syncAction;

        /**
         * 是否临时用户
         */
        @JsonProperty("temp_user")
        private Boolean tempUser;

        /**
         * 用户编号
         */
        @JsonProperty("user_number")
        private String userNumber;

        public void setEmail(String email) {
            this.email = email;
        }

        public void setEncryptedJobId(String encryptedJobId) {
            this.encryptedJobId = encryptedJobId;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setOrgNumber(String orgNumber) {
            this.orgNumber = orgNumber;
        }

        public void setSyncAction(String syncAction) {
            this.syncAction = syncAction;
        }

        public void setTempUser(Boolean tempUser) {
            this.tempUser = tempUser;
        }

        public void setUserNumber(String userNumber) {
            this.userNumber = userNumber;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}