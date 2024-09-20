package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKnockSupplierSyncWorkPanelUnreadResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddKnockSupplierSyncWorkPanelUnreadRequest extends PopBaseHttpRequest<PddKnockSupplierSyncWorkPanelUnreadResponse> {

    /**
     * 外部工作台未读数请求
     */
    @JsonProperty("sync_work_panel_req")
    private SyncWorkPanelReq syncWorkPanelReq;

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
        return "pdd.knock.supplier.sync.work.panel.unread";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKnockSupplierSyncWorkPanelUnreadResponse> getResponseClass() {
        return PddKnockSupplierSyncWorkPanelUnreadResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "sync_work_panel_req", syncWorkPanelReq);
    }

    public void setSyncWorkPanelReq(SyncWorkPanelReq syncWorkPanelReq) {
        this.syncWorkPanelReq = syncWorkPanelReq;
    }

    public static class SyncWorkPanelReq {

        /**
         * 人员的knock_id
         */
        @JsonProperty("knock_id")
        private String knockId;

        /**
         * 未读数
         */
        @JsonProperty("unread_num")
        private Integer unreadNum;

        public void setKnockId(String knockId) {
            this.knockId = knockId;
        }

        public void setUnreadNum(Integer unreadNum) {
            this.unreadNum = unreadNum;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}