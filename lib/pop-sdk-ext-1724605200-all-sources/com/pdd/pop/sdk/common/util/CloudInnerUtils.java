package com.pdd.pop.sdk.common.util;

import com.pdd.pop.sdk.common.constant.UrlConstants;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

/**
 * @author xuanli
 * @Description: CloudInnerUtils
 * @date 2020/4/20 21:18
 */
public class CloudInnerUtils {
    
    public static final String IN_CLOUD_JSON_KEY = "success";
    
    public static final String IN_CLOUD_JSON_VALUE = "true";
    
    public static String checkRes = null;
    
    
    /**
     * 是否在拼多多云內部
     * @return
     */
    public static boolean isInPddCloud() {
        
        if(null != checkRes){
            return IN_CLOUD_JSON_VALUE.equals(checkRes);
        }
        
        HttpURLConnection connection = null;
        InputStream httpInStream = null;
        BufferedReader httpBuffer = null;
        
        try {
            URL url = new URL(UrlConstants.CLOUD_INNER_CHECK);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(1000);
            connection.setReadTimeout(1000);
            connection.connect();
            
            if (connection.getResponseCode() == 200) {
                httpInStream = connection.getInputStream();
                // 封装输入流is，并指定字符集
                httpBuffer = new BufferedReader(new InputStreamReader(httpInStream, "UTF-8"));
                // 存放数据
                StringBuffer sbf = new StringBuffer();
                String readLine = null;
                while ((readLine = httpBuffer.readLine()) != null) {
                    sbf.append(readLine);
                }
                HashMap map = JsonUtil.transferToObj(sbf.toString(), HashMap.class);
                checkRes = map.get(IN_CLOUD_JSON_KEY).toString();
                return IN_CLOUD_JSON_VALUE.equals(checkRes);
            }
    
            return hasPddCloudSysEnv();
            
        } catch (Exception e) {
            return hasPddCloudSysEnv();
        } finally {
            // 关闭资源
            if (null != httpBuffer) {
                try {
                    httpBuffer.close();
                } catch (Exception e) {
                }
            }
            if (null != httpInStream) {
                try {
                    httpInStream.close();
                } catch (Exception e) {
                }
            }
            if (null != connection) {
                connection.disconnect();
            }
        }
        
    }
    
    
    public static boolean hasPddCloudSysEnv() {
        String podEnv = System.getenv("PDD_PAAS_CLOUD_POD_ENV");
        if (podEnv != null && podEnv.equals("1")) return true;
        return false;
    }
    
    
    //    public  static void main(String[] arg){
//        Long t = System.currentTimeMillis();
//        for(int i=0;i<10000;i++){
//            CloudInnerUtils.isInPddCloud();
//        }
//        System.out.println(System.currentTimeMillis() -t );
//    }
}
