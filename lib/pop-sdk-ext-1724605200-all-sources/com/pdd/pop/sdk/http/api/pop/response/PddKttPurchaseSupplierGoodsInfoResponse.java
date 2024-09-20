package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddKttPurchaseSupplierGoodsInfoResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("response")
    private Response response;

    public Response getResponse() {
        return response;
    }

    public static class Response {

        /**
         * 
         */
        @JsonProperty("error_code")
        private Integer errorCode;

        /**
         * 
         */
        @JsonProperty("error_msg")
        private String errorMsg;

        /**
         * 
         */
        @JsonProperty("result")
        private ResponseResult result;

        /**
         * 
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
         * 结果集
         */
        @JsonProperty("result")
        private List<ResponseResultResultItem> result;

        /**
         * 总数
         */
        @JsonProperty("total")
        private Integer total;

        public List<ResponseResultResultItem> getResult() {
            return result;
        }

        public Integer getTotal() {
            return total;
        }
    }

    public static class ResponseResultResultItem {

        /**
         * 品牌信息
         */
        @JsonProperty("brand_info")
        private ResponseResultResultItemBrandInfo brandInfo;

        /**
         * 类目信息
         */
        @JsonProperty("category_info")
        private ResponseResultResultItemCategoryInfo categoryInfo;

        /**
         * 商品发布时间
         */
        @JsonProperty("create_time")
        private String createTime;

        /**
         * 商品详情图
         */
        @JsonProperty("detail_gallery")
        private List<ResponseResultResultItemDetailGalleryItem> detailGallery;

        /**
         * 专属价团长列表
         */
        @JsonProperty("exclusive_price_user_info_list")
        private List<ResponseResultResultItemExclusivePriceUserInfoListItem> exclusivePriceUserInfoList;

        /**
         * 商品描述
         */
        @JsonProperty("goods_desc")
        private String goodsDesc;

        /**
         * 商品前台状态 1：在售中 2：已下架 3：发布中 4：已驳回 5：未发布
         */
        @JsonProperty("goods_front_status")
        private Integer goodsFrontStatus;

        /**
         * 商品ID
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 商品名称
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * 商品属性
         */
        @JsonProperty("goods_property_info")
        private List<ResponseResultResultItemGoodsPropertyInfoItem> goodsPropertyInfo;

        /**
         * 是否控佣
         */
        @JsonProperty("is_commission_restrict")
        private Boolean isCommissionRestrict;

        /**
         * 是否控价
         */
        @JsonProperty("is_price_restrict")
        private Boolean isPriceRestrict;

        /**
         * 报名驳回理由
         */
        @JsonProperty("refuse_reason")
        private String refuseReason;

        /**
         * 佣金配置 基数：100000
         */
        @JsonProperty("restrict_commission")
        private Integer restrictCommission;

        /**
         * sku列表
         */
        @JsonProperty("sku_list")
        private List<ResponseResultResultItemSkuListItem> skuList;

        /**
         * 视频
         */
        @JsonProperty("video_info")
        private List<ResponseResultResultItemVideoInfoItem> videoInfo;

        /**
         * 可见类型 可见类型 0：全部可见，1：白名单可见
         */
        @JsonProperty("visible_type")
        private Integer visibleType;

        /**
         * 可见用户列表
         */
        @JsonProperty("visible_user_info_list")
        private List<ResponseResultResultItemVisibleUserInfoListItem> visibleUserInfoList;

        public ResponseResultResultItemBrandInfo getBrandInfo() {
            return brandInfo;
        }

        public ResponseResultResultItemCategoryInfo getCategoryInfo() {
            return categoryInfo;
        }

        public String getCreateTime() {
            return createTime;
        }

        public List<ResponseResultResultItemDetailGalleryItem> getDetailGallery() {
            return detailGallery;
        }

        public List<ResponseResultResultItemExclusivePriceUserInfoListItem> getExclusivePriceUserInfoList() {
            return exclusivePriceUserInfoList;
        }

        public String getGoodsDesc() {
            return goodsDesc;
        }

        public Integer getGoodsFrontStatus() {
            return goodsFrontStatus;
        }

        public Long getGoodsId() {
            return goodsId;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public List<ResponseResultResultItemGoodsPropertyInfoItem> getGoodsPropertyInfo() {
            return goodsPropertyInfo;
        }

        public Boolean getIsCommissionRestrict() {
            return isCommissionRestrict;
        }

        public Boolean getIsPriceRestrict() {
            return isPriceRestrict;
        }

        public String getRefuseReason() {
            return refuseReason;
        }

        public Integer getRestrictCommission() {
            return restrictCommission;
        }

        public List<ResponseResultResultItemSkuListItem> getSkuList() {
            return skuList;
        }

        public List<ResponseResultResultItemVideoInfoItem> getVideoInfo() {
            return videoInfo;
        }

        public Integer getVisibleType() {
            return visibleType;
        }

        public List<ResponseResultResultItemVisibleUserInfoListItem> getVisibleUserInfoList() {
            return visibleUserInfoList;
        }
    }

    public static class ResponseResultResultItemBrandInfo {

        /**
         * 品牌logo
         */
        @JsonProperty("brand_logo")
        private String brandLogo;

        /**
         * 品牌名称
         */
        @JsonProperty("brand_name")
        private String brandName;

        /**
         * 品牌唯一ID
         */
        @JsonProperty("brand_sn")
        private String brandSn;

        public String getBrandLogo() {
            return brandLogo;
        }

        public String getBrandName() {
            return brandName;
        }

        public String getBrandSn() {
            return brandSn;
        }
    }

    public static class ResponseResultResultItemCategoryInfo {

        /**
         * 类目ID
         */
        @JsonProperty("category_id")
        private Integer categoryId;

        /**
         * 类目名称
         */
        @JsonProperty("category_name")
        private String categoryName;

        /**
         * 默认属性
         */
        @JsonProperty("default_property_info")
        private List<ResponseResultResultItemCategoryInfoDefaultPropertyInfoItem> defaultPropertyInfo;

        public Integer getCategoryId() {
            return categoryId;
        }

        public String getCategoryName() {
            return categoryName;
        }

        public List<ResponseResultResultItemCategoryInfoDefaultPropertyInfoItem> getDefaultPropertyInfo() {
            return defaultPropertyInfo;
        }
    }

    public static class ResponseResultResultItemCategoryInfoDefaultPropertyInfoItem {

        /**
         * 是否必填
         */
        @JsonProperty("is_required")
        private Boolean isRequired;

        /**
         * 属性名
         */
        @JsonProperty("name")
        private String name;

        /**
         * 属性值
         */
        @JsonProperty("values")
        private List<String> values;

        public Boolean getIsRequired() {
            return isRequired;
        }

        public String getName() {
            return name;
        }

        public List<String> getValues() {
            return values;
        }
    }

    public static class ResponseResultResultItemDetailGalleryItem {

        /**
         * 视频封面链接
         */
        @JsonProperty("cover_url")
        private String coverUrl;

        /**
         * 元素类型 0：图片 1：视频
         */
        @JsonProperty("type")
        private Integer type;

        /**
         * 链接
         */
        @JsonProperty("url")
        private String url;

        public String getCoverUrl() {
            return coverUrl;
        }

        public Integer getType() {
            return type;
        }

        public String getUrl() {
            return url;
        }
    }

    public static class ResponseResultResultItemExclusivePriceUserInfoListItem {

        /**
         * 头像
         */
        @JsonProperty("avatar")
        private String avatar;

        /**
         * 昵称
         */
        @JsonProperty("nick_name")
        private String nickName;

        /**
         * 用户编号
         */
        @JsonProperty("user_no")
        private String userNo;

        public String getAvatar() {
            return avatar;
        }

        public String getNickName() {
            return nickName;
        }

        public String getUserNo() {
            return userNo;
        }
    }

    public static class ResponseResultResultItemGoodsPropertyInfoItem {

        /**
         * 是否必填
         */
        @JsonProperty("is_required")
        private Boolean isRequired;

        /**
         * 属性名
         */
        @JsonProperty("name")
        private String name;

        /**
         * 属性值
         */
        @JsonProperty("values")
        private List<String> values;

        public Boolean getIsRequired() {
            return isRequired;
        }

        public String getName() {
            return name;
        }

        public List<String> getValues() {
            return values;
        }
    }

    public static class ResponseResultResultItemSkuListItem {

        /**
         * 专属价
         */
        @JsonProperty("exclusive_price")
        private Long exclusivePrice;

        /**
         * 商品编码
         */
        @JsonProperty("external_sku_id")
        private String externalSkuId;

        /**
         * 团购价
         */
        @JsonProperty("group_price")
        private Long groupPrice;

        /**
         * 采购价
         */
        @JsonProperty("price")
        private Long price;

        /**
         * 库存类型 0：普通库存, 1：无限库存
         */
        @JsonProperty("quantity_type")
        private Integer quantityType;

        /**
         * 剩余库存
         */
        @JsonProperty("remain_quantity")
        private Long remainQuantity;

        /**
         * skuId
         */
        @JsonProperty("sku_id")
        private Long skuId;

        /**
         * 销量
         */
        @JsonProperty("sold_quantity")
        private Long soldQuantity;

        /**
         * 规格列表
         */
        @JsonProperty("spec_list")
        private List<ResponseResultResultItemSkuListItemSpecListItem> specList;

        /**
         * sku状态 0：正常 1：下架
         */
        @JsonProperty("status")
        private Integer status;

        /**
         * sku图
         */
        @JsonProperty("thumb_url")
        private String thumbUrl;

        /**
         * 总库存
         */
        @JsonProperty("total_quantity")
        private Long totalQuantity;

        public Long getExclusivePrice() {
            return exclusivePrice;
        }

        public String getExternalSkuId() {
            return externalSkuId;
        }

        public Long getGroupPrice() {
            return groupPrice;
        }

        public Long getPrice() {
            return price;
        }

        public Integer getQuantityType() {
            return quantityType;
        }

        public Long getRemainQuantity() {
            return remainQuantity;
        }

        public Long getSkuId() {
            return skuId;
        }

        public Long getSoldQuantity() {
            return soldQuantity;
        }

        public List<ResponseResultResultItemSkuListItemSpecListItem> getSpecList() {
            return specList;
        }

        public Integer getStatus() {
            return status;
        }

        public String getThumbUrl() {
            return thumbUrl;
        }

        public Long getTotalQuantity() {
            return totalQuantity;
        }
    }

    public static class ResponseResultResultItemSkuListItemSpecListItem {

        /**
         * 规格名，如红色
         */
        @JsonProperty("name")
        private String name;

        /**
         * 父规格名，如颜色
         */
        @JsonProperty("parent_name")
        private String parentName;

        /**
         * 规格ID
         */
        @JsonProperty("spec_id")
        private Long specId;

        public String getName() {
            return name;
        }

        public String getParentName() {
            return parentName;
        }

        public Long getSpecId() {
            return specId;
        }
    }

    public static class ResponseResultResultItemVideoInfoItem {

        /**
         * 视频封面链接
         */
        @JsonProperty("cover_url")
        private String coverUrl;

        /**
         * 元素类型 0：图片 1：视频
         */
        @JsonProperty("type")
        private Integer type;

        /**
         * 链接
         */
        @JsonProperty("url")
        private String url;

        public String getCoverUrl() {
            return coverUrl;
        }

        public Integer getType() {
            return type;
        }

        public String getUrl() {
            return url;
        }
    }

    public static class ResponseResultResultItemVisibleUserInfoListItem {

        /**
         * 头像
         */
        @JsonProperty("avatar")
        private String avatar;

        /**
         * 昵称
         */
        @JsonProperty("nick_name")
        private String nickName;

        /**
         * 用户编号
         */
        @JsonProperty("user_no")
        private String userNo;

        public String getAvatar() {
            return avatar;
        }

        public String getNickName() {
            return nickName;
        }

        public String getUserNo() {
            return userNo;
        }
    }
}