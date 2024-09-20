package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddPngMallStaffBatchSycnResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("mall_staff_batch_sync_response")
    private MallStaffBatchSyncResponse mallStaffBatchSyncResponse;

    public MallStaffBatchSyncResponse getMallStaffBatchSyncResponse() {
        return mallStaffBatchSyncResponse;
    }

    public static class MallStaffBatchSyncResponse {

        /**
         * 
         */
        @JsonProperty("push_result")
        private List<MallStaffBatchSyncResponsePushResultItem> pushResult;

        public List<MallStaffBatchSyncResponsePushResultItem> getPushResult() {
            return pushResult;
        }
    }

    public static class MallStaffBatchSyncResponsePushResultItem {

        /**
         * 推送状态
         */
        @JsonProperty("push_status")
        private Integer pushStatus;

        /**
         * 员工id
         */
        @JsonProperty("staff_id")
        private Long staffId;

        public Integer getPushStatus() {
            return pushStatus;
        }

        public Long getStaffId() {
            return staffId;
        }
    }
}