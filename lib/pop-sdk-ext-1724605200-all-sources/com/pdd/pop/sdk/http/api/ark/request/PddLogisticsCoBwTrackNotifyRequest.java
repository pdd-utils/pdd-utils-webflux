package com.pdd.pop.sdk.http.api.ark.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.ark.response.PddLogisticsCoBwTrackNotifyResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddLogisticsCoBwTrackNotifyRequest extends PopBaseHttpRequest<PddLogisticsCoBwTrackNotifyResponse> {

    /**
     * 轨迹结构体集合
     */
    @JsonProperty("data")
    private List<DataItem> data;

    /**
     * 合作伙伴身份标识，拼多多会给每个合作伙伴分配ship_id
     */
    @JsonProperty("ship_id")
    private String shipId;

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
        return "pdd.logistics.co.bw.track.notify";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddLogisticsCoBwTrackNotifyResponse> getResponseClass() {
        return PddLogisticsCoBwTrackNotifyResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "data", data);
        setUserParam(params, "ship_id", shipId);
    }

    public void setData(List<DataItem> data) {
        this.data = data;
    }

    public void setShipId(String shipId) {
        this.shipId = shipId;
    }

    public static class DataItem {

        /**
         * type=1时，保税仓海关注册编号，线下文档提供；type=2时由拼多多提供
         */
        @JsonProperty("bw_code")
        private String bwCode;

        /**
         * type=1时，保税仓海关注册名称，线下文档提供；type=2时由拼多多提供
         */
        @JsonProperty("bw_name")
        private String bwName;

        /**
         * 国家或地区二字码，条件必填，type=1时选填，type=2时必填
         */
        @JsonProperty("country")
        private String country;

        /**
         * 所属海关监管区名称，线下文档提供，条件必填，type=1必填，type=2选填
         */
        @JsonProperty("customs_area")
        private String customsArea;

        /**
         * 所属海关监管区编码，条件必填。type=1必填，type=2选填
         */
        @JsonProperty("customs_area_code")
        private String customsAreaCode;

        /**
         * 申报口岸编码，条件必填，type=1必填，type=2选填
         */
        @JsonProperty("declaration_port_code")
        private String declarationPortCode;

        /**
         * 申报口岸名称，条件必填，type=1必填，type=2选填
         */
        @JsonProperty("declaration_port_name")
        private String declarationPortName;

        /**
         * 快递公司编码，物流企业编码，如：ZTO（中通快递），线下文档提供
         */
        @JsonProperty("declaration_ship_id")
        private String declarationShipId;

        /**
         * 运单号，物流企业申报运单包裹面单号
         */
        @JsonProperty("declaration_track_no")
        private String declarationTrackNo;

        /**
         * 操作描述
         */
        @JsonProperty("description")
        private String description;

        /**
         * 二级状态码，status为FAIL、CCLSUCCESS时必填；枚举：CCLSUCCESS_101(BBC),CCLSUCCESS_102(一般贸易),CCLSUCCESS_103(BC),CCLSUCCESS_104(CC),CCLSUCCESS_105(邮关),FAIL_101(检疫审核未过),FAIL_102(单证审核未过),FAIL_103(海关抽检未过),FAIL_104(订购人购买超过年度限额,超过个人年度购买额),FAIL_151(海关系统维护),FAIL_152(查验),FAIL_153(订购人姓名或身份证信息不一致),FAIL_199(其他原因)
         */
        @JsonProperty("fail_reason")
        private String failReason;

        /**
         * 数据ID，单次请求单条轨迹唯一
         */
        @JsonProperty("id")
        private String id;

        /**
         * 操作时间，格式:yyyy-MM-dd HH:mm:ss
         */
        @JsonProperty("operate_time")
        private String operateTime;

        /**
         * 订单号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * 备注信息
         */
        @JsonProperty("remark")
        private String remark;

        /**
         * 操作状态，枚举：APPLY(清关申报),CCLSUCCESS(清关完成，具体清关类型见fail_reason二级状态),FAIL(清关失败, 具体原因见fail_reason二级状态),ACCEPT(仓库接单),ALLOCATE(分配订单),SORT(拣货),PACKAGE(打包),PRINT(打单),DEPARTURE(出库),OTHER(其他),CANCEL(取消出库)
         */
        @JsonProperty("status")
        private String status;

        /**
         * 出库单号
         */
        @JsonProperty("stock_out_no")
        private String stockOutNo;

        /**
         * 轨迹类型，非必填，默认1。1:保税仓 2:海外仓
         */
        @JsonProperty("type")
        private Integer type;

        /**
         * 重量，单位g，条件必填，type=1时选填，type=2时必填
         */
        @JsonProperty("weight")
        private String weight;

        public void setBwCode(String bwCode) {
            this.bwCode = bwCode;
        }

        public void setBwName(String bwName) {
            this.bwName = bwName;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public void setCustomsArea(String customsArea) {
            this.customsArea = customsArea;
        }

        public void setCustomsAreaCode(String customsAreaCode) {
            this.customsAreaCode = customsAreaCode;
        }

        public void setDeclarationPortCode(String declarationPortCode) {
            this.declarationPortCode = declarationPortCode;
        }

        public void setDeclarationPortName(String declarationPortName) {
            this.declarationPortName = declarationPortName;
        }

        public void setDeclarationShipId(String declarationShipId) {
            this.declarationShipId = declarationShipId;
        }

        public void setDeclarationTrackNo(String declarationTrackNo) {
            this.declarationTrackNo = declarationTrackNo;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setFailReason(String failReason) {
            this.failReason = failReason;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setOperateTime(String operateTime) {
            this.operateTime = operateTime;
        }

        public void setOrderSn(String orderSn) {
            this.orderSn = orderSn;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public void setStockOutNo(String stockOutNo) {
            this.stockOutNo = stockOutNo;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        public void setWeight(String weight) {
            this.weight = weight;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}