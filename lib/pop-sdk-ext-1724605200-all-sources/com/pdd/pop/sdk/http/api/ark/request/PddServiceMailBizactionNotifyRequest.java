package com.pdd.pop.sdk.http.api.ark.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.ark.response.PddServiceMailBizactionNotifyResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddServiceMailBizactionNotifyRequest extends PopBaseHttpRequest<PddServiceMailBizactionNotifyResponse> {

    /**
     * 请求参数
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
        return "pdd.service.mail.bizaction.notify";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddServiceMailBizactionNotifyResponse> getResponseClass() {
        return PddServiceMailBizactionNotifyResponse.class;
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
         * 扩展信息，json格式
         */
        @JsonProperty("attributes")
        private String attributes;

        /**
         * accept-接单， reject-拒单， dispatch-派单（需要小件员信息）， takePackage-已取件（需要有核重核价信息）， payed-支付完成 postmanCancel-小件员取消， expressCancel-快递公司取消 postMailNo-回传运单
         */
        @JsonProperty("bizAction")
        private String bizAction;

        /**
         * 服务明细描述信息
         */
        @JsonProperty("bizActionDesc")
        private String bizActionDesc;

        /**
         * 取消原因
         */
        @JsonProperty("cancelOrRejectReason")
        private String cancelOrRejectReason;

        /**
         * 核价金额，单位分
         */
        @JsonProperty("checkPrice")
        private Integer checkPrice;

        /**
         * 核价方式（当前实操为checkWeightPrice时必填）： weight:按照重量核价； volume：按照体积核价
         */
        @JsonProperty("checkPriceType")
        private String checkPriceType;

        /**
         * 核重重量，单位克
         */
        @JsonProperty("checkWeight")
        private Integer checkWeight;

        /**
         * 最终服务商确认的收件人信息
         */
        @JsonProperty("confirmReceiverInfo")
        private RequestConfirmReceiverInfo confirmReceiverInfo;

        /**
         * 最终服务商确认的寄件人信息
         */
        @JsonProperty("confirmSenderInfo")
        private RequestConfirmSenderInfo confirmSenderInfo;

        /**
         * 改约结束时间- changeAppoint必填
         */
        @JsonProperty("endTime")
        private String endTime;

        /**
         * 业务实操时间
         */
        @JsonProperty("executeTime")
        private String executeTime;

        /**
         * 柜子编号
         */
        @JsonProperty("expressBoxCode")
        private String expressBoxCode;

        /**
         * 物流公司编码
         */
        @JsonProperty("expressCode")
        private String expressCode;

        /**
         * 运费金额
         */
        @JsonProperty("freightPrice")
        private Integer freightPrice;

        /**
         * 高度（当前核价方式为volume时必填），单位是厘米
         */
        @JsonProperty("height")
        private Integer height;

        /**
         * 保费，单位分
         */
        @JsonProperty("insurancePrice")
        private Integer insurancePrice;

        /**
         * 报价金额，单位分
         */
        @JsonProperty("insuranceValue")
        private Integer insuranceValue;

        /**
         * 长度（当前核价方式为volume时必填），单位是厘米
         */
        @JsonProperty("length")
        private Integer length;

        /**
         * 运单号
         */
        @JsonProperty("mailNo")
        private String mailNo;

        /**
         * 寄件订单单号
         */
        @JsonProperty("mailOrderSn")
        private String mailOrderSn;

        /**
         * 小件员修改后的收件人信息
         */
        @JsonProperty("modifyReceiverInfo")
        private RequestModifyReceiverInfo modifyReceiverInfo;

        /**
         * 其他费用，单位分
         */
        @JsonProperty("otherPrice")
        private Integer otherPrice;

        /**
         * 包装费用，单位分
         */
        @JsonProperty("packagePrice")
        private Integer packagePrice;

        /**
         * 支付金额，单位分
         */
        @JsonProperty("payPrice")
        private Integer payPrice;

        /**
         * 取件码
         */
        @JsonProperty("pickCode")
        private String pickCode;

        /**
         * 寄件类型，HOME_DELIVERY-上门取件
         */
        @JsonProperty("postType")
        private String postType;

        /**
         * 小件员code
         */
        @JsonProperty("postmanCode")
        private String postmanCode;

        /**
         * 小件员姓名
         */
        @JsonProperty("postmanName")
        private String postmanName;

        /**
         * 小件员电话
         */
        @JsonProperty("postmanPhone")
        private String postmanPhone;

        /**
         * 取消原因code
         */
        @JsonProperty("reasonCode")
        private String reasonCode;

        /**
         * 滞留原因
         */
        @JsonProperty("retentionReason")
        private String retentionReason;

        /**
         * 改约开始时间- changeAppoint节点必填
         */
        @JsonProperty("startTime")
        private String startTime;

        /**
         * 宽度（当前核价方式为volume时必填），单位是厘米
         */
        @JsonProperty("width")
        private Integer width;

        public void setAttributes(String attributes) {
            this.attributes = attributes;
        }

        public void setBizAction(String bizAction) {
            this.bizAction = bizAction;
        }

        public void setBizActionDesc(String bizActionDesc) {
            this.bizActionDesc = bizActionDesc;
        }

        public void setCancelOrRejectReason(String cancelOrRejectReason) {
            this.cancelOrRejectReason = cancelOrRejectReason;
        }

        public void setCheckPrice(Integer checkPrice) {
            this.checkPrice = checkPrice;
        }

        public void setCheckPriceType(String checkPriceType) {
            this.checkPriceType = checkPriceType;
        }

        public void setCheckWeight(Integer checkWeight) {
            this.checkWeight = checkWeight;
        }

        public void setConfirmReceiverInfo(RequestConfirmReceiverInfo confirmReceiverInfo) {
            this.confirmReceiverInfo = confirmReceiverInfo;
        }

        public void setConfirmSenderInfo(RequestConfirmSenderInfo confirmSenderInfo) {
            this.confirmSenderInfo = confirmSenderInfo;
        }

        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }

        public void setExecuteTime(String executeTime) {
            this.executeTime = executeTime;
        }

        public void setExpressBoxCode(String expressBoxCode) {
            this.expressBoxCode = expressBoxCode;
        }

        public void setExpressCode(String expressCode) {
            this.expressCode = expressCode;
        }

        public void setFreightPrice(Integer freightPrice) {
            this.freightPrice = freightPrice;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public void setInsurancePrice(Integer insurancePrice) {
            this.insurancePrice = insurancePrice;
        }

        public void setInsuranceValue(Integer insuranceValue) {
            this.insuranceValue = insuranceValue;
        }

        public void setLength(Integer length) {
            this.length = length;
        }

        public void setMailNo(String mailNo) {
            this.mailNo = mailNo;
        }

        public void setMailOrderSn(String mailOrderSn) {
            this.mailOrderSn = mailOrderSn;
        }

        public void setModifyReceiverInfo(RequestModifyReceiverInfo modifyReceiverInfo) {
            this.modifyReceiverInfo = modifyReceiverInfo;
        }

        public void setOtherPrice(Integer otherPrice) {
            this.otherPrice = otherPrice;
        }

        public void setPackagePrice(Integer packagePrice) {
            this.packagePrice = packagePrice;
        }

        public void setPayPrice(Integer payPrice) {
            this.payPrice = payPrice;
        }

        public void setPickCode(String pickCode) {
            this.pickCode = pickCode;
        }

        public void setPostType(String postType) {
            this.postType = postType;
        }

        public void setPostmanCode(String postmanCode) {
            this.postmanCode = postmanCode;
        }

        public void setPostmanName(String postmanName) {
            this.postmanName = postmanName;
        }

        public void setPostmanPhone(String postmanPhone) {
            this.postmanPhone = postmanPhone;
        }

        public void setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
        }

        public void setRetentionReason(String retentionReason) {
            this.retentionReason = retentionReason;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class RequestConfirmReceiverInfo {

        /**
         * 详细地址
         */
        @JsonProperty("addrDetail")
        private String addrDetail;

        /**
         * 区名称
         */
        @JsonProperty("areaName")
        private String areaName;

        /**
         * 市名称
         */
        @JsonProperty("cityName")
        private String cityName;

        /**
         * 联系人姓名
         */
        @JsonProperty("contactName")
        private String contactName;

        /**
         * 联系人手机号
         */
        @JsonProperty("mobile")
        private String mobile;

        /**
         * 省名称
         */
        @JsonProperty("provName")
        private String provName;

        /**
         * 街道名称
         */
        @JsonProperty("streetName")
        private String streetName;

        /**
         * 联系人电话号码
         */
        @JsonProperty("telephone")
        private String telephone;

        public void setAddrDetail(String addrDetail) {
            this.addrDetail = addrDetail;
        }

        public void setAreaName(String areaName) {
            this.areaName = areaName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public void setContactName(String contactName) {
            this.contactName = contactName;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public void setProvName(String provName) {
            this.provName = provName;
        }

        public void setStreetName(String streetName) {
            this.streetName = streetName;
        }

        public void setTelephone(String telephone) {
            this.telephone = telephone;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class RequestConfirmSenderInfo {

        /**
         * 详细地址
         */
        @JsonProperty("addrDetail")
        private String addrDetail;

        /**
         * 区名称
         */
        @JsonProperty("areaName")
        private String areaName;

        /**
         * 市名称
         */
        @JsonProperty("cityName")
        private String cityName;

        /**
         * 联系人姓名
         */
        @JsonProperty("contactName")
        private String contactName;

        /**
         * 联系人手机号
         */
        @JsonProperty("mobile")
        private String mobile;

        /**
         * 省名称
         */
        @JsonProperty("provName")
        private String provName;

        /**
         * 街道名称
         */
        @JsonProperty("streetName")
        private String streetName;

        /**
         * 联系人电话号码
         */
        @JsonProperty("telephone")
        private String telephone;

        public void setAddrDetail(String addrDetail) {
            this.addrDetail = addrDetail;
        }

        public void setAreaName(String areaName) {
            this.areaName = areaName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public void setContactName(String contactName) {
            this.contactName = contactName;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public void setProvName(String provName) {
            this.provName = provName;
        }

        public void setStreetName(String streetName) {
            this.streetName = streetName;
        }

        public void setTelephone(String telephone) {
            this.telephone = telephone;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class RequestModifyReceiverInfo {

        /**
         * 详细地址
         */
        @JsonProperty("addrDetail")
        private String addrDetail;

        /**
         * 区名称
         */
        @JsonProperty("areaName")
        private String areaName;

        /**
         * 市名称
         */
        @JsonProperty("cityName")
        private String cityName;

        /**
         * 联系人姓名
         */
        @JsonProperty("contactName")
        private String contactName;

        /**
         * 联系人手机号
         */
        @JsonProperty("mobile")
        private String mobile;

        /**
         * 省名称
         */
        @JsonProperty("provName")
        private String provName;

        /**
         * 街道名称
         */
        @JsonProperty("streetName")
        private String streetName;

        /**
         * 联系人电话号码
         */
        @JsonProperty("telephone")
        private String telephone;

        public void setAddrDetail(String addrDetail) {
            this.addrDetail = addrDetail;
        }

        public void setAreaName(String areaName) {
            this.areaName = areaName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public void setContactName(String contactName) {
            this.contactName = contactName;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public void setProvName(String provName) {
            this.provName = provName;
        }

        public void setStreetName(String streetName) {
            this.streetName = streetName;
        }

        public void setTelephone(String telephone) {
            this.telephone = telephone;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}