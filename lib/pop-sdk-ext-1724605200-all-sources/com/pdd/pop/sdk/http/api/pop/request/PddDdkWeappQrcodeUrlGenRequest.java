package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddDdkWeappQrcodeUrlGenResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddDdkWeappQrcodeUrlGenRequest extends PopBaseHttpRequest<PddDdkWeappQrcodeUrlGenResponse> {

    /**
     * 多多礼金ID
     */
    @JsonProperty("cash_gift_id")
    private Long cashGiftId;

    /**
     * 自定义参数，为链接打上自定义标签；自定义参数最长限制64个字节；格式为：  {"uid":"11111","sid":"22222"} ，其中 uid 用户唯一标识，可自行加密后传入，每个用户仅且对应一个标识，必填； sid 上下文信息标识，例如sessionId等，非必填。该json字符串中也可以加入其他自定义的key
     */
    @JsonProperty("custom_parameters")
    private String customParameters;

    /**
     * 是否生成店铺收藏券推广链接
     */
    @JsonProperty("generate_mall_collect_coupon")
    private Boolean generateMallCollectCoupon;

    /**
     * 商品goodsSign列表，支持通过goodsSign查询商品。goodsSign是加密后的goodsId, goodsId已下线，请使用goodsSign来替代。使用说明：https: jinbao.pinduoduo.com/qa-system?questionId=252
     */
    @JsonProperty("goods_sign_list")
    private List<String> goodsSignList;

    /**
     * 推广位ID
     */
    @JsonProperty("p_id")
    private String pId;

    /**
     * 招商多多客ID
     */
    @JsonProperty("zs_duo_id")
    private Long zsDuoId;

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
        return "pdd.ddk.weapp.qrcode.url.gen";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkWeappQrcodeUrlGenResponse> getResponseClass() {
        return PddDdkWeappQrcodeUrlGenResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "cash_gift_id", cashGiftId);
        setUserParam(params, "custom_parameters", customParameters);
        setUserParam(params, "generate_mall_collect_coupon", generateMallCollectCoupon);
        setUserParam(params, "goods_sign_list", goodsSignList);
        setUserParam(params, "p_id", pId);
        setUserParam(params, "zs_duo_id", zsDuoId);
    }

    public void setCashGiftId(Long cashGiftId) {
        this.cashGiftId = cashGiftId;
    }

    public void setCustomParameters(String customParameters) {
        this.customParameters = customParameters;
    }

    public void setGenerateMallCollectCoupon(Boolean generateMallCollectCoupon) {
        this.generateMallCollectCoupon = generateMallCollectCoupon;
    }

    public void setGoodsSignList(List<String> goodsSignList) {
        this.goodsSignList = goodsSignList;
    }

    public void setPId(String pId) {
        this.pId = pId;
    }

    public void setZsDuoId(Long zsDuoId) {
        this.zsDuoId = zsDuoId;
    }
}