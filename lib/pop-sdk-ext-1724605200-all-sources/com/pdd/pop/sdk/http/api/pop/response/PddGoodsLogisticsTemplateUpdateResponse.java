package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddGoodsLogisticsTemplateUpdateResponse extends PopBaseHttpResponse {

    /**
     * 返回resposne
     */
    @JsonProperty("goods_logistics_template_update_response")
    private GoodsLogisticsTemplateUpdateResponse goodsLogisticsTemplateUpdateResponse;

    public GoodsLogisticsTemplateUpdateResponse getGoodsLogisticsTemplateUpdateResponse() {
        return goodsLogisticsTemplateUpdateResponse;
    }

    public static class GoodsLogisticsTemplateUpdateResponse {

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