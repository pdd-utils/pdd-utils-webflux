package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddDdkOauthWeappQrcodeUrlGenResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddDdkOauthWeappQrcodeUrlGenRequest extends PopBaseHttpRequest<PddDdkOauthWeappQrcodeUrlGenResponse> {

    /**
     * 自定义参数，为链接打上自定义标签。自定义参数最长限制64个字节。
     */
    @JsonProperty("custom_parameters")
    private String customParameters;

    /**
     * 商品ID，仅支持单个查询
     */
    @JsonProperty("goods_id_list")
    private List<Long> goodsIdList;

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
        return "pdd.ddk.oauth.weapp.qrcode.url.gen";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkOauthWeappQrcodeUrlGenResponse> getResponseClass() {
        return PddDdkOauthWeappQrcodeUrlGenResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "custom_parameters", customParameters);
        setUserParam(params, "goods_id_list", goodsIdList);
        setUserParam(params, "goods_sign_list", goodsSignList);
        setUserParam(params, "p_id", pId);
        setUserParam(params, "zs_duo_id", zsDuoId);
    }

    public void setCustomParameters(String customParameters) {
        this.customParameters = customParameters;
    }

    public void setGoodsIdList(List<Long> goodsIdList) {
        this.goodsIdList = goodsIdList;
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