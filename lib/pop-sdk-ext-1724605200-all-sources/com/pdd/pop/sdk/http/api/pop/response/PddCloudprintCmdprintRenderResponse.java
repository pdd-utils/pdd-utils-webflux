package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddCloudprintCmdprintRenderResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("cloudprint_cmdprint_render_response")
    private CloudprintCmdprintRenderResponse cloudprintCmdprintRenderResponse;

    public CloudprintCmdprintRenderResponse getCloudprintCmdprintRenderResponse() {
        return cloudprintCmdprintRenderResponse;
    }

    public static class CloudprintCmdprintRenderResponse {

        /**
         * 指令集内容串
         */
        @JsonProperty("cmd_content")
        private String cmdContent;

        /**
         * 指令集编码方式枚举。origin: 原串；gzip: 打印指令string(utf-8编码)采用gzip压缩后再使用base64编码；gzip_type: 打印指令字节数组采用gzip压缩后再使用base64编码。
         */
        @JsonProperty("cmd_encoding")
        private String cmdEncoding;

        /**
         * 是否成功
         */
        @JsonProperty("success")
        private Boolean success;

        public String getCmdContent() {
            return cmdContent;
        }

        public String getCmdEncoding() {
            return cmdEncoding;
        }

        public Boolean getSuccess() {
            return success;
        }
    }
}