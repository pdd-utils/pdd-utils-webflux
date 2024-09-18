package com.pdd.pop.sdk.http;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.sdk.http.api.pop.request.PddOrderInformationGetRequest;
import com.pdd.pop.sdk.http.api.pop.response.PddOrderInformationGetResponse;
import org.junit.jupiter.api.Test;

class PopHttpClientTest {
    private final static String accessToken = "896325cda0e04cdd876f13b9001a284667076395";
    private final String clientId = "9491303675694a36a2bfb23b506fd9e2";
    private final String clientSecret = "07d822e0b94f386fa2a15aa24b1c24073cbbd418";

    private final PopHttpClient client = new PopHttpClient(clientId, clientSecret);


    @Test
    void orderGet() {
        PddOrderInformationGetRequest request = new PddOrderInformationGetRequest();
        request.setOrderSn("240906-232165250623755");
        PddOrderInformationGetResponse response = client.syncInvoke(request, accessToken)
                .block();
        System.out.println(JsonUtil.transferToJson(response));
    }
}
