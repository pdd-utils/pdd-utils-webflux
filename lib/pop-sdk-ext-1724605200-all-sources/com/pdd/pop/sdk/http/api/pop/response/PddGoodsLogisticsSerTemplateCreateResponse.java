package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddGoodsLogisticsSerTemplateCreateResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("goods_logistics_ser_template_create_response")
    private GoodsLogisticsSerTemplateCreateResponse goodsLogisticsSerTemplateCreateResponse;

    public GoodsLogisticsSerTemplateCreateResponse getGoodsLogisticsSerTemplateCreateResponse() {
        return goodsLogisticsSerTemplateCreateResponse;
    }

    public static class GoodsLogisticsSerTemplateCreateResponse {

        /**
         * 模版id
         */
        @JsonProperty("template_id")
        private String templateId;

        public String getTemplateId() {
            return templateId;
        }
    }
}