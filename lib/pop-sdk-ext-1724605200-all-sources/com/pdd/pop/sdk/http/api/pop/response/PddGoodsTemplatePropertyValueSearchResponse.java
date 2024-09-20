package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddGoodsTemplatePropertyValueSearchResponse extends PopBaseHttpResponse {

    /**
     * resposne
     */
    @JsonProperty("goods_template_prop_val_search_response")
    private GoodsTemplatePropValSearchResponse goodsTemplatePropValSearchResponse;

    public GoodsTemplatePropValSearchResponse getGoodsTemplatePropValSearchResponse() {
        return goodsTemplatePropValSearchResponse;
    }

    public static class GoodsTemplatePropValSearchResponse {

        /**
         * list
         */
        @JsonProperty("list")
        private List<GoodsTemplatePropValSearchResponseListItem> list;

        public List<GoodsTemplatePropValSearchResponseListItem> getList() {
            return list;
        }
    }

    public static class GoodsTemplatePropValSearchResponseListItem {

        /**
         * 属性值
         */
        @JsonProperty("value")
        private String value;

        /**
         * 属性值id
         */
        @JsonProperty("vid")
        private Long vid;

        public String getValue() {
            return value;
        }

        public Long getVid() {
            return vid;
        }
    }
}