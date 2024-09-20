package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddGoodsSpuGetResponse extends PopBaseHttpResponse {

    /**
     * 标品详情查询结果
     */
    @JsonProperty("spu_get_response")
    private SpuGetResponse spuGetResponse;

    public SpuGetResponse getSpuGetResponse() {
        return spuGetResponse;
    }

    public static class SpuGetResponse {

        /**
         * 绑定属性，商品属性中对应的引用属性的属性值需要和绑定属性值相同。
         */
        @JsonProperty("bind_prop")
        private List<SpuGetResponseBindPropItem> bindProp;

        /**
         * 商品轮播图
         */
        @JsonProperty("carousel_gallery")
        private List<String> carouselGallery;

        /**
         * 标品所在的类目ID。若非叶子类目，表示该标品可用于该类目下的任何叶子类目。
         */
        @JsonProperty("cat_id")
        private Long catId;

        /**
         * 商品详情图
         */
        @JsonProperty("detail_gallery")
        private List<String> detailGallery;

        /**
         * 商品标题
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * 关键属性
         */
        @JsonProperty("key_prop")
        private List<SpuGetResponseKeyPropItem> keyProp;

        /**
         * 商品前缀标题，若有返回值，则表示发布该标品对应的商品时，商品标题的开头需要包含这部分字符串。
         */
        @JsonProperty("pre_title")
        private String preTitle;

        /**
         * 销售属性，商品属性中对应的引用属性的属性值需要是销售属性值的子集。
         */
        @JsonProperty("sale_prop")
        private List<SpuGetResponseSalePropItem> saleProp;

        /**
         * 标品标题
         */
        @JsonProperty("spu_name")
        private String spuName;

        public List<SpuGetResponseBindPropItem> getBindProp() {
            return bindProp;
        }

        public List<String> getCarouselGallery() {
            return carouselGallery;
        }

        public Long getCatId() {
            return catId;
        }

        public List<String> getDetailGallery() {
            return detailGallery;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public List<SpuGetResponseKeyPropItem> getKeyProp() {
            return keyProp;
        }

        public String getPreTitle() {
            return preTitle;
        }

        public List<SpuGetResponseSalePropItem> getSaleProp() {
            return saleProp;
        }

        public String getSpuName() {
            return spuName;
        }
    }

    public static class SpuGetResponseBindPropItem {

        /**
         * 属性名
         */
        @JsonProperty("pname")
        private String pname;

        /**
         * 引用属性ID
         */
        @JsonProperty("ref_pid")
        private Long refPid;

        /**
         * 属性值单位
         */
        @JsonProperty("value_unit")
        private String valueUnit;

        /**
         * 属性值
         */
        @JsonProperty("value")
        private String value;

        /**
         * 属性值ID
         */
        @JsonProperty("vid")
        private Long vid;

        public String getPname() {
            return pname;
        }

        public Long getRefPid() {
            return refPid;
        }

        public String getValueUnit() {
            return valueUnit;
        }

        public String getValue() {
            return value;
        }

        public Long getVid() {
            return vid;
        }
    }

    public static class SpuGetResponseKeyPropItem {

        /**
         * 属性名
         */
        @JsonProperty("pname")
        private String pname;

        /**
         * 引用属性id
         */
        @JsonProperty("ref_pid")
        private Long refPid;

        /**
         * 属性值单位
         */
        @JsonProperty("value_unit")
        private String valueUnit;

        /**
         * 属性值
         */
        @JsonProperty("value")
        private String value;

        /**
         * 属性值ID
         */
        @JsonProperty("vid")
        private Long vid;

        public String getPname() {
            return pname;
        }

        public Long getRefPid() {
            return refPid;
        }

        public String getValueUnit() {
            return valueUnit;
        }

        public String getValue() {
            return value;
        }

        public Long getVid() {
            return vid;
        }
    }

    public static class SpuGetResponseSalePropItem {

        /**
         * 组ID
         */
        @JsonProperty("group_id")
        private Integer groupId;

        /**
         * 父规格ID
         */
        @JsonProperty("parent_spec_id")
        private Long parentSpecId;

        /**
         * 属性名
         */
        @JsonProperty("pname")
        private String pname;

        /**
         * 引用属性ID
         */
        @JsonProperty("ref_pid")
        private Long refPid;

        /**
         * 规格ID
         */
        @JsonProperty("spec_id")
        private Long specId;

        /**
         * 属性值单位
         */
        @JsonProperty("value_unit")
        private String valueUnit;

        /**
         * 属性值
         */
        @JsonProperty("value")
        private String value;

        /**
         * 属性值ID
         */
        @JsonProperty("vid")
        private Long vid;

        public Integer getGroupId() {
            return groupId;
        }

        public Long getParentSpecId() {
            return parentSpecId;
        }

        public String getPname() {
            return pname;
        }

        public Long getRefPid() {
            return refPid;
        }

        public Long getSpecId() {
            return specId;
        }

        public String getValueUnit() {
            return valueUnit;
        }

        public String getValue() {
            return value;
        }

        public Long getVid() {
            return vid;
        }
    }
}