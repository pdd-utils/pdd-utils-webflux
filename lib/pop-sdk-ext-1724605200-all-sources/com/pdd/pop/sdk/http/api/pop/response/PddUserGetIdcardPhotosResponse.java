package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddUserGetIdcardPhotosResponse extends PopBaseHttpResponse {

    /**
     * _response
     */
    @JsonProperty("user_get_id_card_photos_response")
    private UserGetIdCardPhotosResponse userGetIdCardPhotosResponse;

    public UserGetIdCardPhotosResponse getUserGetIdCardPhotosResponse() {
        return userGetIdCardPhotosResponse;
    }

    public static class UserGetIdCardPhotosResponse {

        /**
         * error_code
         */
        @JsonProperty("error_code")
        private Integer errorCode;

        /**
         * error_msg
         */
        @JsonProperty("error_msg")
        private String errorMsg;

        /**
         * result
         */
        @JsonProperty("result")
        private UserGetIdCardPhotosResponseResult result;

        /**
         * success
         */
        @JsonProperty("success")
        private Boolean success;

        public Integer getErrorCode() {
            return errorCode;
        }

        public String getErrorMsg() {
            return errorMsg;
        }

        public UserGetIdCardPhotosResponseResult getResult() {
            return result;
        }

        public Boolean getSuccess() {
            return success;
        }
    }

    public static class UserGetIdCardPhotosResponseResult {

        /**
         * 身份证彩照反面url
         */
        @JsonProperty("back_url")
        private String backUrl;

        /**
         * 身份证彩照正面url
         */
        @JsonProperty("front_url")
        private String frontUrl;

        public String getBackUrl() {
            return backUrl;
        }

        public String getFrontUrl() {
            return frontUrl;
        }
    }
}