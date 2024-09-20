package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddDdkStatisticsDataQueryResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("statistics_data_response")
    private StatisticsDataResponse statisticsDataResponse;

    public StatisticsDataResponse getStatisticsDataResponse() {
        return statisticsDataResponse;
    }

    public static class StatisticsDataResponse {

        /**
         * 
         */
        @JsonProperty("data_list")
        private List<StatisticsDataResponseDataListItem> dataList;

        public List<StatisticsDataResponseDataListItem> getDataList() {
            return dataList;
        }
    }

    public static class StatisticsDataResponseDataListItem {

        /**
         * 自定义参数，为链接打上自定义标签；自定义参数最长限制64个字节；格式为： {"uid":"11111","sid":"22222"} ，其中 uid 用户唯一标识，可自行加密后传入，每个用户仅且对应一个标识，必填； sid 上下文信息标识，例如sessionId等，非必填。该json字符串中也可以加入其他自定义的key。（如果使用GET请求，请使用URLEncode处理参数）
         */
        @JsonProperty("custom_parameters")
        private String customParameters;

        /**
         * 结束时间，格式: "yyyy-MM-dd"
         */
        @JsonProperty("end_time")
        private String endTime;

        /**
         * GMV,单位为分
         */
        @JsonProperty("order_amount")
        private Long orderAmount;

        /**
         * 订单数
         */
        @JsonProperty("order_num")
        private Long orderNum;

        /**
         * 推广位ID
         */
        @JsonProperty("p_id")
        private String pId;

        /**
         * 开始时间，格式: "yyyy-MM-dd"
         */
        @JsonProperty("start_time")
        private String startTime;

        public String getCustomParameters() {
            return customParameters;
        }

        public String getEndTime() {
            return endTime;
        }

        public Long getOrderAmount() {
            return orderAmount;
        }

        public Long getOrderNum() {
            return orderNum;
        }

        public String getPId() {
            return pId;
        }

        public String getStartTime() {
            return startTime;
        }
    }
}