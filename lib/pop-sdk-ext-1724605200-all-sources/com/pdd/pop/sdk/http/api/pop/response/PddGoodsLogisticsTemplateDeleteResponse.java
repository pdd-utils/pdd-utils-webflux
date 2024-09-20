package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddGoodsLogisticsTemplateDeleteResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("goods_logistics_template_delete_response")
    private GoodsLogisticsTemplateDeleteResponse goodsLogisticsTemplateDeleteResponse;

    public GoodsLogisticsTemplateDeleteResponse getGoodsLogisticsTemplateDeleteResponse() {
        return goodsLogisticsTemplateDeleteResponse;
    }

    public static class GoodsLogisticsTemplateDeleteResponse {

        /**
         * 是否成功
         */
        @JsonProperty("is_success")
        private Boolean isSuccess;

        public Boolean getIsSuccess() {
            return isSuccess;
        }
    }
}