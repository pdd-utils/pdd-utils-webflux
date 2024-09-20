package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddPngPermissionsMallStaffPushApplyResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("staff_push_apply_response")
    private StaffPushApplyResponse staffPushApplyResponse;

    public StaffPushApplyResponse getStaffPushApplyResponse() {
        return staffPushApplyResponse;
    }

    public static class StaffPushApplyResponse {

        /**
         * 0申请完成待确认；1已具备权限；2权限无效
         */
        @JsonProperty("apply_status")
        private Integer applyStatus;

        public Integer getApplyStatus() {
            return applyStatus;
        }
    }
}