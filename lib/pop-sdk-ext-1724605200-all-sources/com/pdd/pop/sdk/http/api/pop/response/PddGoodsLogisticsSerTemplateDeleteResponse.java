package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddGoodsLogisticsSerTemplateDeleteResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("goods_logistics_ser_template_delete_response")
    private GoodsLogisticsSerTemplateDeleteResponse goodsLogisticsSerTemplateDeleteResponse;

    public GoodsLogisticsSerTemplateDeleteResponse getGoodsLogisticsSerTemplateDeleteResponse() {
        return goodsLogisticsSerTemplateDeleteResponse;
    }

    public static class GoodsLogisticsSerTemplateDeleteResponse {

        /**
         * is_success
         */
        @JsonProperty("is_success")
        private Boolean isSuccess;

        public Boolean getIsSuccess() {
            return isSuccess;
        }
    }
}