package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddCloudprintStdtemplatesGetResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("pdd_cloudprint_stdtemplates_get_response")
    private InnerPddCloudprintStdtemplatesGetResponse pddCloudprintStdtemplatesGetResponse;

    public InnerPddCloudprintStdtemplatesGetResponse getPddCloudprintStdtemplatesGetResponse() {
        return pddCloudprintStdtemplatesGetResponse;
    }

    public static class InnerPddCloudprintStdtemplatesGetResponse {

        /**
         * 结果集
         */
        @JsonProperty("result")
        private InnerPddCloudprintStdtemplatesGetResponseResult result;

        public InnerPddCloudprintStdtemplatesGetResponseResult getResult() {
            return result;
        }
    }

    public static class InnerPddCloudprintStdtemplatesGetResponseResult {

        /**
         * 所有wp的标准模板
         */
        @JsonProperty("datas")
        private List<InnerPddCloudprintStdtemplatesGetResponseResultDatasItem> datas;

        public List<InnerPddCloudprintStdtemplatesGetResponseResultDatasItem> getDatas() {
            return datas;
        }
    }

    public static class InnerPddCloudprintStdtemplatesGetResponseResultDatasItem {

        /**
         * 该wp的所有标准模板
         */
        @JsonProperty("standard_templates")
        private List<InnerPddCloudprintStdtemplatesGetResponseResultDatasItemStandardTemplatesItem> standardTemplates;

        /**
         * wp编码
         */
        @JsonProperty("wp_code")
        private String wpCode;

        public List<InnerPddCloudprintStdtemplatesGetResponseResultDatasItemStandardTemplatesItem> getStandardTemplates() {
            return standardTemplates;
        }

        public String getWpCode() {
            return wpCode;
        }
    }

    public static class InnerPddCloudprintStdtemplatesGetResponseResultDatasItemStandardTemplatesItem {

        /**
         * 模板id
         */
        @JsonProperty("standard_template_id")
        private Long standardTemplateId;

        /**
         * 模板名称
         */
        @JsonProperty("standard_template_name")
        private String standardTemplateName;

        /**
         * 模板url
         */
        @JsonProperty("standard_template_url")
        private String standardTemplateUrl;

        /**
         * 模版类型
         */
        @JsonProperty("standard_waybill_type")
        private Integer standardWaybillType;

        public Long getStandardTemplateId() {
            return standardTemplateId;
        }

        public String getStandardTemplateName() {
            return standardTemplateName;
        }

        public String getStandardTemplateUrl() {
            return standardTemplateUrl;
        }

        public Integer getStandardWaybillType() {
            return standardWaybillType;
        }
    }
}