package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddDdkOauthGoodsDetailResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddDdkOauthGoodsDetailRequest extends PopBaseHttpRequest<PddDdkOauthGoodsDetailResponse> {

    /**
     * 自定义参数，为链接打上自定义标签；自定义参数最长限制64个字节；格式为：  {"uid":"11111","sid":"22222"} ，其中 uid 用户唯一标识，可自行加密后传入，每个用户仅且对应一个标识，必填； sid 上下文信息标识，例如sessionId等，非必填。该json字符串中也可以加入其他自定义的key。（如果使用GET请求，请使用URLEncode处理参数）
     */
    @JsonProperty("custom_parameters")
    private String customParameters;

    /**
     * 商品主图类型：1-场景图，2-白底图，默认为0
     */
    @JsonProperty("goods_img_type")
    private Integer goodsImgType;

    /**
     * 商品goodsSign，支持通过goodsSign查询商品。goodsSign是加密后的goodsId, goodsId已下线，请使用goodsSign来替代。使用说明：https: jinbao.pinduoduo.com/qa-system?questionId=252
     */
    @JsonProperty("goods_sign")
    private String goodsSign;

    /**
     * 是否获取sku信息，默认false不返回。（特殊渠道权限，需额外申请）
     */
    @JsonProperty("need_sku_info")
    private Boolean needSkuInfo;

    /**
     * 推广位id
     */
    @JsonProperty("pid")
    private String pid;

    /**
     * 搜索id，建议填写，提高收益。来自pdd.ddk.goods.recommend.get、pdd.ddk.goods.search、pdd.ddk.top.goods.list.query等接口
     */
    @JsonProperty("search_id")
    private String searchId;

    /**
     * 招商多多客ID
     */
    @JsonProperty("zs_duo_id")
    private Long zsDuoId;

    /**
     * 风控参数
     */
    @JsonProperty("risk_params")
    private Map<String, String> riskParams;

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
        return "pdd.ddk.oauth.goods.detail";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkOauthGoodsDetailResponse> getResponseClass() {
        return PddDdkOauthGoodsDetailResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "custom_parameters", customParameters);
        setUserParam(params, "goods_img_type", goodsImgType);
        setUserParam(params, "goods_sign", goodsSign);
        setUserParam(params, "need_sku_info", needSkuInfo);
        setUserParam(params, "pid", pid);
        setUserParam(params, "search_id", searchId);
        setUserParam(params, "zs_duo_id", zsDuoId);
        setUserParam(params, "risk_params", riskParams);
    }

    public void setCustomParameters(String customParameters) {
        this.customParameters = customParameters;
    }

    public void setGoodsImgType(Integer goodsImgType) {
        this.goodsImgType = goodsImgType;
    }

    public void setGoodsSign(String goodsSign) {
        this.goodsSign = goodsSign;
    }

    public void setNeedSkuInfo(Boolean needSkuInfo) {
        this.needSkuInfo = needSkuInfo;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }

    public void setZsDuoId(Long zsDuoId) {
        this.zsDuoId = zsDuoId;
    }

    public void setRiskParams(Map<String, String> riskParams) {
        this.riskParams = riskParams;
    }
}