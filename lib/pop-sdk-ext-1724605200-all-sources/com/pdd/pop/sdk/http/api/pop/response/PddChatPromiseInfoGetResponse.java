package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;


import java.util.Map;


public class PddChatPromiseInfoGetResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("promise_info_get_response")
    private PromiseInfoGetResponse promiseInfoGetResponse;

    public PromiseInfoGetResponse getPromiseInfoGetResponse() {
        return promiseInfoGetResponse;
    }

    public static class PromiseInfoGetResponse {

        /**
         * 
         */
        @JsonProperty("promise_info")
        private PromiseInfoGetResponsePromiseInfo promiseInfo;

        public PromiseInfoGetResponsePromiseInfo getPromiseInfo() {
            return promiseInfo;
        }
    }

    public static class PromiseInfoGetResponsePromiseInfo {

        /**
         * 承诺详情
         */
        @JsonProperty("detail_info")
        private Map<String, String> detailInfo;

        /**
         * 额外信息
         */
        @JsonProperty("extra_info")
        private Map<String, String> extraInfo;

        /**
         * 是否已删除
         */
        @JsonProperty("is_deleted")
        private Boolean isDeleted;

        /**
         * 订单号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * 服务承诺描述
         */
        @JsonProperty("promise_desc")
        private String promiseDesc;

        /**
         * 服务承诺单性质，1-平台协议，2-客服承 诺，3-平台建议
         */
        @JsonProperty("promise_level")
        private Integer promiseLevel;

        /**
         * 服务承诺状态，0-已创建，1-履约中，2-履 约未达成，3-履约成功
         */
        @JsonProperty("promise_status")
        private Integer promiseStatus;

        /**
         * 服务承诺类型，1-指定快递/物流，2-优先发 货
         */
        @JsonProperty("promise_type")
        private Integer promiseType;

        /**
         * 承诺信息id
         */
        @JsonProperty("promise_id")
        private Long promiseId;

        /**
         * 业务场景，1-发货场景
         */
        @JsonProperty("scene_type")
        private Integer sceneType;

        /**
         * 最后更新时间
         */
        @JsonProperty("updated_at")
        private String updatedAt;

        public Map<String, String> getDetailInfo() {
            return detailInfo;
        }

        public Map<String, String> getExtraInfo() {
            return extraInfo;
        }

        public Boolean getIsDeleted() {
            return isDeleted;
        }

        public String getOrderSn() {
            return orderSn;
        }

        public String getPromiseDesc() {
            return promiseDesc;
        }

        public Integer getPromiseLevel() {
            return promiseLevel;
        }

        public Integer getPromiseStatus() {
            return promiseStatus;
        }

        public Integer getPromiseType() {
            return promiseType;
        }

        public Long getPromiseId() {
            return promiseId;
        }

        public Integer getSceneType() {
            return sceneType;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }
    }
}