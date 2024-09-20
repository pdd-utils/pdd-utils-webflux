package com.pdd.pop.sdk.http.api.ark.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.ark.response.PddCloudRefundListIncrementGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddCloudRefundListIncrementGetRequest extends PopBaseHttpRequest<PddCloudRefundListIncrementGetResponse> {

    /**
     * 必填，售后状态 0：无售后 2：买家申请退款，待商家处理 3：退货退款，待商家处理 4：商家同意退款，退款中 5：平台同意退款，退款中 6：驳回退款，待买家处理 7：已同意退货退款,待用户发货 8：平台处理中 9：平台拒绝退款，退款关闭 10：退款成功 11：买家撤销 12：买家逾期未处理，退款失败 13：买家逾期，超过有效期 14：换货补寄待商家处理 15：换货补寄待用户处理 16：换货补寄成功 17：换货补寄失败 18：换货补寄待用户确认完成 21：待商家同意维修 22：待用户确认发货 24：维修关闭 25：维修成功 27：待用户确认收货 31：已同意拒收退款，待用户拒收 32：补寄待商家发货
     */
    @JsonProperty("after_sales_status")
    private Integer afterSalesStatus;

    /**
     * 必填，售后类型 1：全部 2：仅退款 3：退货退款 4：换货 5：缺货补寄
     */
    @JsonProperty("after_sales_type")
    private Integer afterSalesType;

    /**
     * 必填，最后更新时间结束时间的UNIX时间戳，指格林威治时间 1970 年01 月 01 日 00 时 00 分 00 秒(北京时间 1970 年 01 月 01 日 08 时00 分 00 秒)起至现在的总秒数 PS：开始时间结束时间间距不超过 30 分钟
     */
    @JsonProperty("end_updated_at")
    private Long endUpdatedAt;

    /**
     * 店铺ID
     */
    @JsonProperty("mall_id")
    private Long mallId;

    /**
     * 订单号。若入参含订单号，则可查询订单下的全部售后单。且入参中除订单号，page，page_size外的其他查询条件不起作用（标记必填的仍旧需要输入）。
     */
    @JsonProperty("order_sn")
    private String orderSn;

    /**
     * 返回页码 默认 1，页码从 1 开始 PS：当前采用分页返回，数量和页数会一起传，如果不传，则采用 默认值
     */
    @JsonProperty("page")
    private Integer page;

    /**
     * 返回数量，默认 100。最大 100
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 必填，最后更新时间开始时间的UNIX时间戳，指格林威治时间 1970 年01月 01 日 00 时 00 分 00 秒(北京时间 1970 年 01 月 01 日 08 时 00分 00 秒)起至现在的总秒数
     */
    @JsonProperty("start_updated_at")
    private Long startUpdatedAt;

    /**
     * 扩展字段
     */
    @JsonProperty("extend_props")
    private String extendProps;

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
        return 1;
    }

    @Override
    public String getType() {
        return "pdd.cloud.refund.list.increment.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddCloudRefundListIncrementGetResponse> getResponseClass() {
        return PddCloudRefundListIncrementGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "after_sales_status", afterSalesStatus);
        setUserParam(params, "after_sales_type", afterSalesType);
        setUserParam(params, "end_updated_at", endUpdatedAt);
        setUserParam(params, "mall_id", mallId);
        setUserParam(params, "order_sn", orderSn);
        setUserParam(params, "page", page);
        setUserParam(params, "page_size", pageSize);
        setUserParam(params, "start_updated_at", startUpdatedAt);
        setUserParam(params, "extend_props", extendProps);
    }

    public void setAfterSalesStatus(Integer afterSalesStatus) {
        this.afterSalesStatus = afterSalesStatus;
    }

    public void setAfterSalesType(Integer afterSalesType) {
        this.afterSalesType = afterSalesType;
    }

    public void setEndUpdatedAt(Long endUpdatedAt) {
        this.endUpdatedAt = endUpdatedAt;
    }

    public void setMallId(Long mallId) {
        this.mallId = mallId;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setStartUpdatedAt(Long startUpdatedAt) {
        this.startUpdatedAt = startUpdatedAt;
    }

    public void setExtendProps(String extendProps) {
        this.extendProps = extendProps;
    }
}