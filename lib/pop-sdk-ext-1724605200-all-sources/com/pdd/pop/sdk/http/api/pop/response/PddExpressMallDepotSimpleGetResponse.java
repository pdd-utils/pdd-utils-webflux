package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddExpressMallDepotSimpleGetResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("open_api_response")
    private List<OpenApiResponseItem> openApiResponse;

    public List<OpenApiResponseItem> getOpenApiResponse() {
        return openApiResponse;
    }

    public static class OpenApiResponseItem {

        /**
         * 仓库Id
         */
        @JsonProperty("depot_id")
        private Long depotId;

        /**
         * 仓库id的string表示
         */
        @JsonProperty("depot_str")
        private String depotStr;

        /**
         * 仓库类型(暂时1表示自建仓)
         */
        @JsonProperty("depot_type")
        private Integer depotType;

        /**
         * 仓库名称
         */
        @JsonProperty("name")
        private String name;

        public Long getDepotId() {
            return depotId;
        }

        public String getDepotStr() {
            return depotStr;
        }

        public Integer getDepotType() {
            return depotType;
        }

        public String getName() {
            return name;
        }
    }
}