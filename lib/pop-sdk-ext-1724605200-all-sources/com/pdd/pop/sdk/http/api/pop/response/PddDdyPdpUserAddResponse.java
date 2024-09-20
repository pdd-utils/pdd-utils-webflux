package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddDdyPdpUserAddResponse extends PopBaseHttpResponse {

    /**
     * 返回结果
     */
    @JsonProperty("ddy_pdp_user_add_response")
    private DdyPdpUserAddResponse ddyPdpUserAddResponse;

    public DdyPdpUserAddResponse getDdyPdpUserAddResponse() {
        return ddyPdpUserAddResponse;
    }

    public static class DdyPdpUserAddResponse {

        /**
         * 是否添加成功
         */
        @JsonProperty("is_success")
        private Boolean isSuccess;

        public Boolean getIsSuccess() {
            return isSuccess;
        }
    }
}