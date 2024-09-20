package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;

import java.util.Map;


public class PddGoodsSizespecTemplateGetResponse extends PopBaseHttpResponse {

    /**
     * 响应
     */
    @JsonProperty("response")
    private Response response;

    public Response getResponse() {
        return response;
    }

    public static class Response {

        /**
         * 错误码
         */
        @JsonProperty("error_code")
        private Integer errorCode;

        /**
         * 错误描述
         */
        @JsonProperty("error_msg")
        private String errorMsg;

        /**
         * 结果
         */
        @JsonProperty("result")
        private ResponseResult result;

        /**
         * 请求成功
         */
        @JsonProperty("success")
        private Boolean success;

        public Integer getErrorCode() {
            return errorCode;
        }

        public String getErrorMsg() {
            return errorMsg;
        }

        public ResponseResult getResult() {
            return result;
        }

        public Boolean getSuccess() {
            return success;
        }
    }

    public static class ResponseResult {

        /**
         * 尺码表分类id
         */
        @JsonProperty("class_id")
        private Long classId;

        /**
         * 尺码表内容
         */
        @JsonProperty("content")
        private ResponseResultContent content;

        /**
         * 创建时间
         */
        @JsonProperty("create_at")
        private Long createAt;

        /**
         * 扩展类型
         */
        @JsonProperty("extend_type")
        private Integer extendType;

        /**
         * 尺码表id
         */
        @JsonProperty("id")
        private Long id;

        /**
         * 是否尺码表分类默认
         */
        @JsonProperty("is_default")
        private Boolean isDefault;

        /**
         * 尺码表属于的店铺
         */
        @JsonProperty("mall_id")
        private Long mallId;

        /**
         * 尺码表名称
         */
        @JsonProperty("name")
        private String name;

        /**
         * 是否可复用
         */
        @JsonProperty("reusable")
        private Boolean reusable;

        /**
         * 更新时间
         */
        @JsonProperty("update_at")
        private Long updateAt;

        /**
         * 使用的商品数
         */
        @JsonProperty("used")
        private Long used;

        public Long getClassId() {
            return classId;
        }

        public ResponseResultContent getContent() {
            return content;
        }

        public Long getCreateAt() {
            return createAt;
        }

        public Integer getExtendType() {
            return extendType;
        }

        public Long getId() {
            return id;
        }

        public Boolean getIsDefault() {
            return isDefault;
        }

        public Long getMallId() {
            return mallId;
        }

        public String getName() {
            return name;
        }

        public Boolean getReusable() {
            return reusable;
        }

        public Long getUpdateAt() {
            return updateAt;
        }

        public Long getUsed() {
            return used;
        }
    }

    public static class ResponseResultContent {

        /**
         * 尺码表元数据（表头）
         */
        @JsonProperty("meta")
        private ResponseResultContentMeta meta;

        /**
         * 尺码表图片
         */
        @JsonProperty("pic_url")
        private String picUrl;

        /**
         * 尺码表行数据
         */
        @JsonProperty("records")
        private List<ResponseResultContentRecordsItem> records;

        public ResponseResultContentMeta getMeta() {
            return meta;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public List<ResponseResultContentRecordsItem> getRecords() {
            return records;
        }
    }

    public static class ResponseResultContentMeta {

        /**
         * 可批量的尺码元素id
         */
        @JsonProperty("batchable_element_ids")
        private List<Integer> batchableElementIds;

        /**
         * 尺码元素
         */
        @JsonProperty("elements")
        private List<ResponseResultContentMetaElementsItem> elements;

        /**
         * 尺码组
         */
        @JsonProperty("groups")
        private List<ResponseResultContentMetaGroupsItem> groups;

        public List<Integer> getBatchableElementIds() {
            return batchableElementIds;
        }

        public List<ResponseResultContentMetaElementsItem> getElements() {
            return elements;
        }

        public List<ResponseResultContentMetaGroupsItem> getGroups() {
            return groups;
        }
    }

    public static class ResponseResultContentMetaElementsItem {

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

        public Integer getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

    public static class ResponseResultContentMetaGroupsItem {

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

        public Integer getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

    public static class ResponseResultContentRecordsItem {

        /**
         * 尺码组和尺码表元素的值
         */
        @JsonProperty("values")
        private Map<String, String> values;

        public Map<String, String> getValues() {
            return values;
        }
    }
}