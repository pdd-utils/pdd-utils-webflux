package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddCloudSecurityEventTrackingBatchOrderResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddCloudSecurityEventTrackingBatchOrderRequest extends PopBaseHttpRequest<PddCloudSecurityEventTrackingBatchOrderResponse> {

    /**
     * 订单事件类型 2:订单访问事件, 3:订单流出事件.
     */
    @JsonProperty("eventType")
    private Integer eventType;

    /**
     * 订单事件列表
     */
    @JsonProperty("orderEvents")
    private List<OrderEventsItem> orderEvents;

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
        return "pdd.cloud.security.event.tracking.batch.order";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddCloudSecurityEventTrackingBatchOrderResponse> getResponseClass() {
        return PddCloudSecurityEventTrackingBatchOrderResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "eventType", eventType);
        setUserParam(params, "orderEvents", orderEvents);
    }

    public void setEventType(Integer eventType) {
        this.eventType = eventType;
    }

    public void setOrderEvents(List<OrderEventsItem> orderEvents) {
        this.orderEvents = orderEvents;
    }

    public static class OrderEventsItem {

        /**
         * 店铺ID列表
         */
        @JsonProperty("mallIdList")
        private List<Long> mallIdList;

        /**
         * 针对订单进行的操作(可选)
         */
        @JsonProperty("operation")
        private String operation;

        /**
         * 订单ID列表
         */
        @JsonProperty("orderList")
        private List<String> orderList;

        /**
         * cookie中的_pati值
         */
        @JsonProperty("pati")
        private String pati;

        /**
         * 订单流出地址(订单事件类型为3:订单流出事件 则此项必填)
         */
        @JsonProperty("sendTo")
        private String sendTo;

        /**
         * 事件时间戳
         */
        @JsonProperty("timestamp")
        private Long timestamp;

        /**
         * ISV用户为了获取订单而请求的ISV系统里的URL
         */
        @JsonProperty("url")
        private String url;

        /**
         * 用户唯一标识
         */
        @JsonProperty("userId")
        private String userId;

        /**
         * 用户IP
         */
        @JsonProperty("userIp")
        private String userIp;

        /**
         * 涉及到的敏感字段列表。 1->虚拟卡密, 2->虚拟卡号,3->支付商品ID 4->支付单号 5->收件人, 6->收件人手机号，7->收件人完整地址 8->收件人详细地址, 9->快递单号, 10->身份证号, 11->身份证姓名
         */
        @JsonProperty("sensitiveFieldEnumList")
        private List<Integer> sensitiveFieldEnumList;

        /**
         * 是否是加密访问或者加密流出
         */
        @JsonProperty("isEncrypt")
        private Boolean isEncrypt;

        public void setMallIdList(List<Long> mallIdList) {
            this.mallIdList = mallIdList;
        }

        public void setOperation(String operation) {
            this.operation = operation;
        }

        public void setOrderList(List<String> orderList) {
            this.orderList = orderList;
        }

        public void setPati(String pati) {
            this.pati = pati;
        }

        public void setSendTo(String sendTo) {
            this.sendTo = sendTo;
        }

        public void setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public void setUserIp(String userIp) {
            this.userIp = userIp;
        }

        public void setSensitiveFieldEnumList(List<Integer> sensitiveFieldEnumList) {
            this.sensitiveFieldEnumList = sensitiveFieldEnumList;
        }

        public void setIsEncrypt(Boolean isEncrypt) {
            this.isEncrypt = isEncrypt;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}