package com.pdd.pop.sdk.http.api.ark.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.ark.response.PddTailExpressTraceSyncResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddTailExpressTraceSyncRequest extends PopBaseHttpRequest<PddTailExpressTraceSyncResponse> {

    /**
     * 轨迹信息
     */
    @JsonProperty("request")
    private Request request;

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
        return 1;
    }

    @Override
    public String getType() {
        return "pdd.tail.express.trace.sync";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddTailExpressTraceSyncResponse> getResponseClass() {
        return PddTailExpressTraceSyncResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "request", request);
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public static class Request {

        /**
         * 地址
         */
        @JsonProperty("address")
        private String address;

        /**
         * 扫描城市名称
         */
        @JsonProperty("city")
        private String city;

        /**
         * 轨迹详情描述
         */
        @JsonProperty("description")
        private String description;

        /**
         * 三级地址，区/县
         */
        @JsonProperty("district")
        private String district;

        /**
         * 问题件原因code
         */
        @JsonProperty("failReason")
        private String failReason;

        /**
         * 数据id java.util.UUID生成
         */
        @JsonProperty("id")
        private String id;

        /**
         * 操作时间 格式：yyyy-MM-dd hh:mm:ss
         */
        @JsonProperty("operationTime")
        private String operationTime;

        /**
         * 省份
         */
        @JsonProperty("province")
        private String province;

        /**
         * 快递公司id
         */
        @JsonProperty("shippingId")
        private Long shippingId;

        /**
         * 扫描站点名称
         */
        @JsonProperty("siteName")
        private String siteName;

        /**
         * 扫描站点编码 站点编号(各快递公司用于区分站点的唯一id)
         */
        @JsonProperty("siteNo")
        private String siteNo;

        /**
         * 扫描站点类型 1:网点；2:中转中心；3:代收点
         */
        @JsonProperty("siteType")
        private Integer siteType;

        /**
         * 轨迹状态 如：GOT、SEND
         */
        @JsonProperty("status")
        private String status;

        /**
         * 运单号
         */
        @JsonProperty("trackingNumber")
        private String trackingNumber;

        /**
         * 物流号 物流订单号
         */
        @JsonProperty("trackingOrderNo")
        private String trackingOrderNo;

        public void setAddress(String address) {
            this.address = address;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setDistrict(String district) {
            this.district = district;
        }

        public void setFailReason(String failReason) {
            this.failReason = failReason;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setOperationTime(String operationTime) {
            this.operationTime = operationTime;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public void setShippingId(Long shippingId) {
            this.shippingId = shippingId;
        }

        public void setSiteName(String siteName) {
            this.siteName = siteName;
        }

        public void setSiteNo(String siteNo) {
            this.siteNo = siteNo;
        }

        public void setSiteType(Integer siteType) {
            this.siteType = siteType;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public void setTrackingNumber(String trackingNumber) {
            this.trackingNumber = trackingNumber;
        }

        public void setTrackingOrderNo(String trackingOrderNo) {
            this.trackingOrderNo = trackingOrderNo;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}