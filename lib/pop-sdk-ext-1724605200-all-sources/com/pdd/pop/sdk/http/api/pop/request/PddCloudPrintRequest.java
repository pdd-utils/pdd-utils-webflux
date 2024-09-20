package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddCloudPrintResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddCloudPrintRequest extends PopBaseHttpRequest<PddCloudPrintResponse> {

    /**
     * 云打印请求
     */
    @JsonProperty("cloud_print_request")
    private CloudPrintRequest cloudPrintRequest;

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
        return "pdd.cloud.print";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddCloudPrintResponse> getResponseClass() {
        return PddCloudPrintResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "cloud_print_request", cloudPrintRequest);
    }

    public void setCloudPrintRequest(CloudPrintRequest cloudPrintRequest) {
        this.cloudPrintRequest = cloudPrintRequest;
    }

    public static class CloudPrintRequest {

        /**
         * 打印数据列表
         */
        @JsonProperty("print_data_list")
        private List<CloudPrintRequestPrintDataListItem> printDataList;

        /**
         * 打印机id
         */
        @JsonProperty("printer_id")
        private String printerId;

        /**
         * 打印机设置
         */
        @JsonProperty("printer_setting")
        private CloudPrintRequestPrinterSetting printerSetting;

        /**
         * 共享码
         */
        @JsonProperty("share_code")
        private String shareCode;

        public void setPrintDataList(List<CloudPrintRequestPrintDataListItem> printDataList) {
            this.printDataList = printDataList;
        }

        public void setPrinterId(String printerId) {
            this.printerId = printerId;
        }

        public void setPrinterSetting(CloudPrintRequestPrinterSetting printerSetting) {
            this.printerSetting = printerSetting;
        }

        public void setShareCode(String shareCode) {
            this.shareCode = shareCode;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class CloudPrintRequestPrintDataListItem {

        /**
         * 自定区打印数据
         */
        @JsonProperty("custom_area_print_data")
        private CloudPrintRequestPrintDataListItemCustomAreaPrintData customAreaPrintData;

        /**
         * 面单打印数据
         */
        @JsonProperty("waybill_printer_data")
        private CloudPrintRequestPrintDataListItemWaybillPrinterData waybillPrinterData;

        public void setCustomAreaPrintData(CloudPrintRequestPrintDataListItemCustomAreaPrintData customAreaPrintData) {
            this.customAreaPrintData = customAreaPrintData;
        }

        public void setWaybillPrinterData(CloudPrintRequestPrintDataListItemWaybillPrinterData waybillPrinterData) {
            this.waybillPrinterData = waybillPrinterData;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class CloudPrintRequestPrintDataListItemCustomAreaPrintData {

        /**
         * 打印数据
         */
        @JsonProperty("data")
        private String data;

        /**
         * 模板url
         */
        @JsonProperty("template_url")
        private String templateUrl;

        public void setData(String data) {
            this.data = data;
        }

        public void setTemplateUrl(String templateUrl) {
            this.templateUrl = templateUrl;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class CloudPrintRequestPrintDataListItemWaybillPrinterData {

        /**
         * 追加数据,例如：{\"sender\":{\"address\":{\"province\":\"辽宁\",\"city\":\"沈阳市\",\"district\":\"铁西区\",\"detail\":\"xxx\"},\"name\":\"xxx\",\"mobile\":\"139xxxx032\"}}
         */
        @JsonProperty("add_data")
        private String addData;

        /**
         * 打印数据
         */
        @JsonProperty("data")
        private String data;

        /**
         * 是否加密
         */
        @JsonProperty("encrypted")
        private Boolean encrypted;

        /**
         * 签名
         */
        @JsonProperty("signature")
        private String signature;

        /**
         * 模板url
         */
        @JsonProperty("template_url")
        private String templateUrl;

        /**
         * 版本
         */
        @JsonProperty("ver")
        private String ver;

        public void setAddData(String addData) {
            this.addData = addData;
        }

        public void setData(String data) {
            this.data = data;
        }

        public void setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
        }

        public void setSignature(String signature) {
            this.signature = signature;
        }

        public void setTemplateUrl(String templateUrl) {
            this.templateUrl = templateUrl;
        }

        public void setVer(String ver) {
            this.ver = ver;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class CloudPrintRequestPrinterSetting {

        /**
         * 是否打印下联logo
         */
        @JsonProperty("need_bottom_logo")
        private Boolean needBottomLogo;

        /**
         * 是否打印中联logo
         */
        @JsonProperty("need_middle_logo")
        private Boolean needMiddleLogo;

        /**
         * 是否打印上联logo
         */
        @JsonProperty("need_top_logo")
        private Boolean needTopLogo;

        /**
         * 打印方向 normal-正常 reverse-翻转
         */
        @JsonProperty("orientation")
        private String orientation;

        public void setNeedBottomLogo(Boolean needBottomLogo) {
            this.needBottomLogo = needBottomLogo;
        }

        public void setNeedMiddleLogo(Boolean needMiddleLogo) {
            this.needMiddleLogo = needMiddleLogo;
        }

        public void setNeedTopLogo(Boolean needTopLogo) {
            this.needTopLogo = needTopLogo;
        }

        public void setOrientation(String orientation) {
            this.orientation = orientation;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}