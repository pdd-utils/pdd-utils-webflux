package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddVirtualGameServerQueryResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("game_server_query_response")
    private GameServerQueryResponse gameServerQueryResponse;

    public GameServerQueryResponse getGameServerQueryResponse() {
        return gameServerQueryResponse;
    }

    public static class GameServerQueryResponse {

        /**
         * 游戏CODE
         */
        @JsonProperty("goods_config_code")
        private String goodsConfigCode;

        /**
         * 游戏ID
         */
        @JsonProperty("goods_config_id")
        private Long goodsConfigId;

        /**
         * 游戏配置名称
         */
        @JsonProperty("goods_config_name")
        private String goodsConfigName;

        /**
         * 区服信息
         */
        @JsonProperty("item_list")
        private List<GameServerQueryResponseItemListItem> itemList;

        public String getGoodsConfigCode() {
            return goodsConfigCode;
        }

        public Long getGoodsConfigId() {
            return goodsConfigId;
        }

        public String getGoodsConfigName() {
            return goodsConfigName;
        }

        public List<GameServerQueryResponseItemListItem> getItemList() {
            return itemList;
        }
    }

    public static class GameServerQueryResponseItemListItem {

        /**
         * 下级区服信息
         */
        @JsonProperty("children")
        private List<GameServerQueryResponseItemListItemChildrenItem> children;

        /**
         * 区服ID
         */
        @JsonProperty("id")
        private Long id;

        /**
         * 名称
         */
        @JsonProperty("name")
        private String name;

        /**
         * 类型 1-区 2-服
         */
        @JsonProperty("type")
        private Integer type;

        public List<GameServerQueryResponseItemListItemChildrenItem> getChildren() {
            return children;
        }

        public Long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public Integer getType() {
            return type;
        }
    }

    public static class GameServerQueryResponseItemListItemChildrenItem {

        /**
         * 区服ID
         */
        @JsonProperty("id")
        private Long id;

        /**
         * 名称
         */
        @JsonProperty("name")
        private String name;

        /**
         * 类型 1-区 2-服
         */
        @JsonProperty("type")
        private Integer type;

        public Long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public Integer getType() {
            return type;
        }
    }
}