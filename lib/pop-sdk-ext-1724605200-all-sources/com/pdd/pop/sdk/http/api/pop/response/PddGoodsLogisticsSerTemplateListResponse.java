package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddGoodsLogisticsSerTemplateListResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("goods_logistics_ser_template_list_response")
    private GoodsLogisticsSerTemplateListResponse goodsLogisticsSerTemplateListResponse;

    public GoodsLogisticsSerTemplateListResponse getGoodsLogisticsSerTemplateListResponse() {
        return goodsLogisticsSerTemplateListResponse;
    }

    public static class GoodsLogisticsSerTemplateListResponse {

        /**
         * 列表
         */
        @JsonProperty("list")
        private List<GoodsLogisticsSerTemplateListResponseListItem> list;

        /**
         * 总数
         */
        @JsonProperty("total")
        private Integer total;

        public List<GoodsLogisticsSerTemplateListResponseListItem> getList() {
            return list;
        }

        public Integer getTotal() {
            return total;
        }
    }

    public static class GoodsLogisticsSerTemplateListResponseListItem {

        /**
         * 模版id
         */
        @JsonProperty("template_id")
        private String templateId;

        /**
         * 模版名称
         */
        @JsonProperty("template_name")
        private String templateName;

        /**
         * 更新时间
         */
        @JsonProperty("update_time")
        private Integer updateTime;

        /**
         * 使用情况
         */
        @JsonProperty("using")
        private Integer using;

        public String getTemplateId() {
            return templateId;
        }

        public String getTemplateName() {
            return templateName;
        }

        public Integer getUpdateTime() {
            return updateTime;
        }

        public Integer getUsing() {
            return using;
        }
    }
}