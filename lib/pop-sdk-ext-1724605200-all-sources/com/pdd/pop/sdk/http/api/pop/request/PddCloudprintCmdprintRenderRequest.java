package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddCloudprintCmdprintRenderResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddCloudprintCmdprintRenderRequest extends PopBaseHttpRequest<PddCloudprintCmdprintRenderResponse> {

    /**
     * request
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
        return 0;
    }

    @Override
    public String getType() {
        return "pdd.cloudprint.cmdprint.render";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddCloudprintCmdprintRenderResponse> getResponseClass() {
        return PddCloudprintCmdprintRenderResponse.class;
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
         * 客户端id
         */
        @JsonProperty("client_side_id")
        private String clientSideId;

        /**
         * 客户端类型
         */
        @JsonProperty("client_type")
        private String clientType;

        /**
         * 返回值编码方式，枚举值：gzip(默认值)、gzip_byte(推荐值)
         */
        @JsonProperty("cmd_encoding")
        private String cmdEncoding;

        /**
         * 打印配置
         */
        @JsonProperty("config")
        private RequestConfig config;

        /**
         * 需要打印的文档，包括模板地址，打印数据
         */
        @JsonProperty("document")
        private RequestDocument document;

        /**
         * 枚举值：CPCL、TSPL
         */
        @JsonProperty("print_command_type")
        private String printCommandType;

        /**
         * 打印机名称
         */
        @JsonProperty("printer_name")
        private String printerName;

        public void setClientSideId(String clientSideId) {
            this.clientSideId = clientSideId;
        }

        public void setClientType(String clientType) {
            this.clientType = clientType;
        }

        public void setCmdEncoding(String cmdEncoding) {
            this.cmdEncoding = cmdEncoding;
        }

        public void setConfig(RequestConfig config) {
            this.config = config;
        }

        public void setDocument(RequestDocument document) {
            this.document = document;
        }

        public void setPrintCommandType(String printCommandType) {
            this.printCommandType = printCommandType;
        }

        public void setPrinterName(String printerName) {
            this.printerName = printerName;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class RequestConfig {

        /**
         * 水平偏移
         */
        @JsonProperty("horizontal_offset")
        private Double horizontalOffset;

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

        /**
         * 垂直偏移
         */
        @JsonProperty("vertical_offset")
        private Double verticalOffset;

        public void setHorizontalOffset(Double horizontalOffset) {
            this.horizontalOffset = horizontalOffset;
        }

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

        public void setVerticalOffset(Double verticalOffset) {
            this.verticalOffset = verticalOffset;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class RequestDocument {

        /**
         * 包含的区域列表。对于有自定义区的文档，content会包含两条，即第一条是标准模板区域内容、第二条是自定义区域内容
         */
        @JsonProperty("contents")
        private List<RequestDocumentContentsItem> contents;

        public void setContents(List<RequestDocumentContentsItem> contents) {
            this.contents = contents;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class RequestDocumentContentsItem {

        /**
         * 附加数据（用于修改数据）例如：{ sender:{ address:{ detail:蒋村街道西溪诚园小区2-1-101 } } }
         */
        @JsonProperty("add_data")
        private String addData;

        /**
         * 是否获取加密数据
         */
        @JsonProperty("encrypted")
        private Boolean encrypted;

        /**
         * 打印数据
         */
        @JsonProperty("print_data")
        private String printData;

        /**
         * 数据签名
         */
        @JsonProperty("signature")
        private String signature;

        /**
         * 模板url
         */
        @JsonProperty("template_url")
        private String templateUrl;

        /**
         * 加密数据使用秘钥版本
         */
        @JsonProperty("ver")
        private String ver;

        public void setAddData(String addData) {
            this.addData = addData;
        }

        public void setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
        }

        public void setPrintData(String printData) {
            this.printData = printData;
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
}