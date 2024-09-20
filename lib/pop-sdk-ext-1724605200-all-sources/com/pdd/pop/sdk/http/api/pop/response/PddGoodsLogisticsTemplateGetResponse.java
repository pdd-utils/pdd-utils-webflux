package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddGoodsLogisticsTemplateGetResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("goods_logistics_template_get_response")
    private GoodsLogisticsTemplateGetResponse goodsLogisticsTemplateGetResponse;

    public GoodsLogisticsTemplateGetResponse getGoodsLogisticsTemplateGetResponse() {
        return goodsLogisticsTemplateGetResponse;
    }

    public static class GoodsLogisticsTemplateGetResponse {

        /**
         * 商家运费模板对象列表
         */
        @JsonProperty("logistics_template_list")
        private List<GoodsLogisticsTemplateGetResponseLogisticsTemplateListItem> logisticsTemplateList;

        /**
         * 返回的运费模板总数
         */
        @JsonProperty("total_count")
        private Integer totalCount;

        public List<GoodsLogisticsTemplateGetResponseLogisticsTemplateListItem> getLogisticsTemplateList() {
            return logisticsTemplateList;
        }

        public Integer getTotalCount() {
            return totalCount;
        }
    }

    public static class GoodsLogisticsTemplateGetResponseLogisticsTemplateListItem {

        /**
         * 计费方式，0-按件计费，1-按重量计费
         */
        @JsonProperty("cost_type")
        private Integer costType;

        /**
         * 最近更新时间
         */
        @JsonProperty("last_updated_time")
        private Integer lastUpdatedTime;

        /**
         * 模板id
         */
        @JsonProperty("template_id")
        private Long templateId;

        /**
         * 运费模板名称
         */
        @JsonProperty("template_name")
        private String templateName;

        public Integer getCostType() {
            return costType;
        }

        public Integer getLastUpdatedTime() {
            return lastUpdatedTime;
        }

        public Long getTemplateId() {
            return templateId;
        }

        public String getTemplateName() {
            return templateName;
        }
    }
}