package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddDdkGoodsPromotionRightAuthResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddDdkGoodsPromotionRightAuthRequest extends PopBaseHttpRequest<PddDdkGoodsPromotionRightAuthResponse> {

    /**
     * 推广商品视频素材url
     */
    @JsonProperty("demo_url")
    private String demoUrl;

    /**
     * 渠道duoId
     */
    @JsonProperty("duo_id")
    private Long duoId;

    /**
     * 商品GoodsId
     */
    @JsonProperty("goods_id")
    private Long goodsId;

    /**
     * 商家资质证明图片url列表，1到3张图
     */
    @JsonProperty("mall_certificate_url")
    private List<String> mallCertificateUrl;

    /**
     * 推广视频预览码url
     */
    @JsonProperty("promotion_code_url")
    private String promotionCodeUrl;

    /**
     * 推广结束时间戳，毫秒
     */
    @JsonProperty("promotion_end_time")
    private Long promotionEndTime;

    /**
     * 推广开始时间戳，毫秒
     */
    @JsonProperty("promotion_start_time")
    private Long promotionStartTime;

    /**
     * 商品图片素材url列表，0到3张图
     */
    @JsonProperty("thumb_pic_url")
    private List<String> thumbPicUrl;

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
        return "pdd.ddk.goods.promotion.right.auth";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkGoodsPromotionRightAuthResponse> getResponseClass() {
        return PddDdkGoodsPromotionRightAuthResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "demo_url", demoUrl);
        setUserParam(params, "duo_id", duoId);
        setUserParam(params, "goods_id", goodsId);
        setUserParam(params, "mall_certificate_url", mallCertificateUrl);
        setUserParam(params, "promotion_code_url", promotionCodeUrl);
        setUserParam(params, "promotion_end_time", promotionEndTime);
        setUserParam(params, "promotion_start_time", promotionStartTime);
        setUserParam(params, "thumb_pic_url", thumbPicUrl);
    }

    public void setDemoUrl(String demoUrl) {
        this.demoUrl = demoUrl;
    }

    public void setDuoId(Long duoId) {
        this.duoId = duoId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public void setMallCertificateUrl(List<String> mallCertificateUrl) {
        this.mallCertificateUrl = mallCertificateUrl;
    }

    public void setPromotionCodeUrl(String promotionCodeUrl) {
        this.promotionCodeUrl = promotionCodeUrl;
    }

    public void setPromotionEndTime(Long promotionEndTime) {
        this.promotionEndTime = promotionEndTime;
    }

    public void setPromotionStartTime(Long promotionStartTime) {
        this.promotionStartTime = promotionStartTime;
    }

    public void setThumbPicUrl(List<String> thumbPicUrl) {
        this.thumbPicUrl = thumbPicUrl;
    }
}