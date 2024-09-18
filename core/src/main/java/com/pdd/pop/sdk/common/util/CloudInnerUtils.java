//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.pdd.pop.sdk.common.util;

import com.fasterxml.jackson.core.type.TypeReference;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class CloudInnerUtils {
    public static final String IN_CLOUD_JSON_KEY = "success";
    public static final String IN_CLOUD_JSON_VALUE = "true";
    public static String checkRes = null;

    public CloudInnerUtils() {
    }

    public static boolean isInPddCloud() {
        if (null != checkRes) {
            return "true".equals(checkRes);
        } else {
            HttpURLConnection connection = null;
            InputStream httpInStream = null;
            BufferedReader httpBuffer = null;

            boolean var4;
            try {
                URL url = new URL("http://open-api.pinduoduo.com/pop/user/cloudinner/check");
                connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.setConnectTimeout(1000);
                connection.setReadTimeout(1000);
                connection.connect();
                if (connection.getResponseCode() != 200) {
                    var4 = hasPddCloudSysEnv();
                    return var4;
                }

                httpInStream = connection.getInputStream();
                httpBuffer = new BufferedReader(new InputStreamReader(httpInStream, StandardCharsets.UTF_8));
                StringBuilder sbf = new StringBuilder();
                String readLine;

                while ((readLine = httpBuffer.readLine()) != null) {
                    sbf.append(readLine);
                }

                Map<String, String> map = JsonUtil.transferToObj(sbf.toString(), new TypeReference<>() {
                });
                checkRes = map.get(IN_CLOUD_JSON_KEY);
                return IN_CLOUD_JSON_VALUE.equals(checkRes);
            } catch (Exception var23) {
                var4 = hasPddCloudSysEnv();
            } finally {
                if (null != httpBuffer) {
                    try {
                        httpBuffer.close();
                    } catch (Exception ignored) {
                    }
                }

                if (null != httpInStream) {
                    try {
                        httpInStream.close();
                    } catch (Exception ignored) {
                    }
                }

                if (null != connection) {
                    connection.disconnect();
                }

            }

            return var4;
        }
    }

    public static boolean hasPddCloudSysEnv() {
        String podEnv = System.getenv("PDD_PAAS_CLOUD_POD_ENV");
        return podEnv != null && podEnv.equals("1");
    }
}
