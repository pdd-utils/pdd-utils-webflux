package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsSizespecTemplateUpdateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddGoodsSizespecTemplateUpdateRequest extends PopBaseHttpRequest<PddGoodsSizespecTemplateUpdateResponse> {

    /**
     * 尺码表
     */
    @JsonProperty("size_spec_dto")
    private SizeSpecDto sizeSpecDto;

    @Override
    public String getVersion() {
        return "V1";
    }

    @Override
    public String getDataType() {
        return "JSON";
    }

    @Override
    public Integer getPlatform() {
        return 0;
    }

    @Override
    public String getType() {
        return "pdd.goods.sizespec.template.update";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsSizespecTemplateUpdateResponse> getResponseClass() {
        return PddGoodsSizespecTemplateUpdateResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "size_spec_dto", sizeSpecDto);
    }

    public void setSizeSpecDto(SizeSpecDto sizeSpecDto) {
        this.sizeSpecDto = sizeSpecDto;
    }

    public static class SizeSpecDto {

        /**
         * 尺码表分类id，pdd.goods.sizespec.class.get得到
         */
        @JsonProperty("class_id")
        private Integer classId;

        /**
         * 尺码表内容
         */
        @JsonProperty("content")
        private SizeSpecDtoContent content;

        /**
         * 尺码表id
         */
        @JsonProperty("id")
        private Long id;

        /**
         * 尺码表名称
         */
        @JsonProperty("name")
        private String name;

        public void setClassId(Integer classId) {
            this.classId = classId;
        }

        public void setContent(SizeSpecDtoContent content) {
            this.content = content;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class SizeSpecDtoContent {

        /**
         * 尺码表元数据（表头），pdd.goods.sizespec.meta.get得到
         */
        @JsonProperty("meta")
        private SizeSpecDtoContentMeta meta;

        /**
         * 尺码表行数据
         */
        @JsonProperty("records")
        private List<SizeSpecDtoContentRecordsItem> records;

        public void setMeta(SizeSpecDtoContentMeta meta) {
            this.meta = meta;
        }

        public void setRecords(List<SizeSpecDtoContentRecordsItem> records) {
            this.records = records;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class SizeSpecDtoContentMeta {

        /**
         * 尺码元素
         */
        @JsonProperty("elements")
        private List<SizeSpecDtoContentMetaElementsItem> elements;

        /**
         * 尺码组
         */
        @JsonProperty("groups")
        private List<SizeSpecDtoContentMetaGroupsItem> groups;

        public void setElements(List<SizeSpecDtoContentMetaElementsItem> elements) {
            this.elements = elements;
        }

        public void setGroups(List<SizeSpecDtoContentMetaGroupsItem> groups) {
            this.groups = groups;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class SizeSpecDtoContentMetaElementsItem {

        /**
         * 尺码元数据id
         */
        @JsonProperty("id")
        private Integer id;

        /**
         * 尺码元数据名称
         */
        @JsonProperty("name")
        private String name;

        public void setId(Integer id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class SizeSpecDtoContentMetaGroupsItem {

        /**
         * 尺码元数据id
         */
        @JsonProperty("id")
        private Integer id;

        /**
         * 尺码元数据名称
         */
        @JsonProperty("name")
        private String name;

        public void setId(Integer id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class SizeSpecDtoContentRecordsItem {

        /**
         * 尺码组和尺码表元素的值
         */
        @JsonProperty("values")
        private Map<String, String> values;

        public void setValues(Map<String, String> values) {
            this.values = values;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}