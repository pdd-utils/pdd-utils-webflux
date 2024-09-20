package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddGoodsPropOutConvertResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("goods_prop_out_convert_response")
    private GoodsPropOutConvertResponse goodsPropOutConvertResponse;

    public GoodsPropOutConvertResponse getGoodsPropOutConvertResponse() {
        return goodsPropOutConvertResponse;
    }

    public static class GoodsPropOutConvertResponse {

        /**
         * list
         */
        @JsonProperty("list")
        private List<GoodsPropOutConvertResponseListItem> list;

        public List<GoodsPropOutConvertResponseListItem> getList() {
            return list;
        }
    }

    public static class GoodsPropOutConvertResponseListItem {

        /**
         * 模板属性id
         */
        @JsonProperty("template_pid")
        private Long templatePid;

        /**
         * 属性值
         */
        @JsonProperty("value")
        private String value;

        /**
         * 属性值单位
         */
        @JsonProperty("value_unit")
        private String valueUnit;

        /**
         * 基础属性值id
         */
        @JsonProperty("vid")
        private Long vid;

        public Long getTemplatePid() {
            return templatePid;
        }

        public String getValue() {
            return value;
        }

        public String getValueUnit() {
            return valueUnit;
        }

        public Long getVid() {
            return vid;
        }
    }
}