package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddPngPermissionsMallStaffPushConfirmResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("staff_push_confirm_response")
    private StaffPushConfirmResponse staffPushConfirmResponse;

    public StaffPushConfirmResponse getStaffPushConfirmResponse() {
        return staffPushConfirmResponse;
    }

    public static class StaffPushConfirmResponse {

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