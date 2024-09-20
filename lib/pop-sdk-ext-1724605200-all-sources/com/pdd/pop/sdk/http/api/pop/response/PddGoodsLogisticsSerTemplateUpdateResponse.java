package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddGoodsLogisticsSerTemplateUpdateResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("goods_logistics_ser_template_update_response")
    private GoodsLogisticsSerTemplateUpdateResponse goodsLogisticsSerTemplateUpdateResponse;

    public GoodsLogisticsSerTemplateUpdateResponse getGoodsLogisticsSerTemplateUpdateResponse() {
        return goodsLogisticsSerTemplateUpdateResponse;
    }

    public static class GoodsLogisticsSerTemplateUpdateResponse {

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