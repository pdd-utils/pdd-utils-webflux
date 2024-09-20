package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKttOrderListResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddKttOrderListRequest extends PopBaseHttpRequest<PddKttOrderListResponse> {

    /**
     * 团号
     */
    @JsonProperty("activity_no")
    private String activityNo;

    /**
     * 售后状态, 可选 0-未发起售后 1-退款中 2-退款成功 3-待处理 4-拒绝退款 6-待(顾客)退货 7-待(团长)确认退货 8-(顾客)撤销 9-(系统)关闭
     */
    @JsonProperty("after_sales_status")
    private Integer afterSalesStatus;

    /**
     * 取消状态, 可选 0-未取消 1-已取消
     */
    @JsonProperty("cancel_status")
    private Integer cancelStatus;

    /**
     * 成交启始时间, 必填，毫秒时间戳
     */
    @JsonProperty("confirm_at_begin")
    private Long confirmAtBegin;

    /**
     * 成交结束时间，必填, 毫秒时间戳，成交结束时间 - 成交启始时间 <= 24h
     */
    @JsonProperty("confirm_at_end")
    private Long confirmAtEnd;

    /**
     * 页码, 必填
     */
    @JsonProperty("page_number")
    private Integer pageNumber;

    /**
     * 数量, 必填, 1～100
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 发货状态 0-未发货 1-已发货 2-部分发货 3-已收货
     */
    @JsonProperty("shipping_status")
    private Integer shippingStatus;

    /**
     * 核销状态, 可选 0-未核销 1-已核销 2-部分核销
     */
    @JsonProperty("verification_status")
    private Integer verificationStatus;

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
        return "pdd.ktt.order.list";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKttOrderListResponse> getResponseClass() {
        return PddKttOrderListResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "activity_no", activityNo);
        setUserParam(params, "after_sales_status", afterSalesStatus);
        setUserParam(params, "cancel_status", cancelStatus);
        setUserParam(params, "confirm_at_begin", confirmAtBegin);
        setUserParam(params, "confirm_at_end", confirmAtEnd);
        setUserParam(params, "page_number", pageNumber);
        setUserParam(params, "page_size", pageSize);
        setUserParam(params, "shipping_status", shippingStatus);
        setUserParam(params, "verification_status", verificationStatus);
    }

    public void setActivityNo(String activityNo) {
        this.activityNo = activityNo;
    }

    public void setAfterSalesStatus(Integer afterSalesStatus) {
        this.afterSalesStatus = afterSalesStatus;
    }

    public void setCancelStatus(Integer cancelStatus) {
        this.cancelStatus = cancelStatus;
    }

    public void setConfirmAtBegin(Long confirmAtBegin) {
        this.confirmAtBegin = confirmAtBegin;
    }

    public void setConfirmAtEnd(Long confirmAtEnd) {
        this.confirmAtEnd = confirmAtEnd;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setShippingStatus(Integer shippingStatus) {
        this.shippingStatus = shippingStatus;
    }

    public void setVerificationStatus(Integer verificationStatus) {
        this.verificationStatus = verificationStatus;
    }
}