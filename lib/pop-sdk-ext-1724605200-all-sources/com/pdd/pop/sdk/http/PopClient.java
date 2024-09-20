package com.pdd.pop.sdk.http;

import java.util.concurrent.Future;

/**
 * @author xuanli
 * @Description: TODO
 * @date 2018/12/4 16:40
 */
public interface PopClient {

    /**
     * 同步执行请求
     *
     * @param request : 请求参数
     * @param <T>     响应类
     * @return 继承于 PopBaseHttpResponse的响应
     * @throws Exception
     */
    <T extends PopBaseHttpResponse> T syncInvoke(PopBaseHttpRequest<T> request) throws Exception;

    /**
     * 同步执行请求
     *
     * @param request     : 请求参数
     * @param accessToken : 鉴权token
     * @param <T>         响应类
     * @return 继承于 PopBaseHttpResponse的响应
     * @throws Exception
     */
    <T extends PopBaseHttpResponse> T syncInvoke(PopBaseHttpRequest<T> request, String accessToken) throws Exception;

    /**
     * 同步执行请求
     *
     * @param request     : 请求参数
     * @param accessToken : 鉴权token
     * @param clientInfo  : 客户端信息
     * @param <T>         响应类
     * @return 继承于 PopBaseHttpResponse的响应
     * @throws Exception
     */
    <T extends PopBaseHttpResponse> T syncInvoke(PopBaseHttpRequest<T> request, String accessToken, PopClientInfo clientInfo) throws Exception;

    /**
     * 同步执行请求，可自定义响应类型
     * @param request 请求参数
     * @param valueType 响应类型
     * @param <T> 原始响应类
     * @param <K> 自定义响应类
     * @return 自定义响应
     * @throws Exception
     */
    <T extends PopBaseHttpResponse, K extends PopBaseHttpResponse> K syncInvokeCustomized(PopBaseHttpRequest<T> request, Class<K> valueType) throws Exception;

    /**
     * 同步执行请求，可自定义响应类型
     * @param request 请求参数
     * @param accessToken 鉴权token
     * @param valueType 响应类型
     * @param <T> 原始响应类
     * @param <K> 自定义响应类
     * @return 自定义响应
     * @throws Exception
     */
    <T extends PopBaseHttpResponse, K extends PopBaseHttpResponse> K syncInvokeCustomized(PopBaseHttpRequest<T> request, String accessToken, Class<K> valueType) throws Exception;

    /**
     * 异步执行请求
     *
     * @param request : 请求参数
     * @param <T>响应类
     * @return Future<PopBaseHttpResponse>的响应
     * @throws Exception
     */
    <T extends PopBaseHttpResponse> Future<T> asyncInvoke(final PopBaseHttpRequest<T> request) throws Exception;

    /**
     * 异步执行请求
     *
     * @param request     : 请求参数
     * @param accessToken : 鉴权token
     * @param <T>         响应类
     * @return Future<PopBaseHttpResponse>的响应
     * @throws Exception
     */
    <T extends PopBaseHttpResponse> Future<T> asyncInvoke(final PopBaseHttpRequest<T> request, String accessToken) throws Exception;

    /**
     * 异步执行请求
     *
     * @param request     : 请求参数
     * @param accessToken : 鉴权token
     * @param clientInfo  : 客户端信息
     * @param <T>         响应类
     * @return Future<PopBaseHttpResponse>的响应
     * @throws Exception
     */
    <T extends PopBaseHttpResponse> Future<T> asyncInvoke(final PopBaseHttpRequest<T> request, final String accessToken, PopClientInfo clientInfo) throws Exception;

    /**
     * 异步执行请求，可自定义响应类型
     * @param request 请求参数
     * @param valueType 响应类型
     * @param <T> 原始响应类
     * @param <K> 自定义响应类
     * @return 自定义响应
     * @throws Exception
     */
    <T extends PopBaseHttpResponse, K extends PopBaseHttpResponse> Future<K> asyncInvokeCustomized(final PopBaseHttpRequest<T> request, Class<K> valueType) throws Exception;

    /**
     * 异步执行请求，可自定义响应类型
     * @param request 请求参数
     * @param accessToken 鉴权token
     * @param valueType 响应类型
     * @param <T> 原始响应类
     * @param <K> 自定义响应类
     * @return 自定义响应
     * @throws Exception
     */
    <T extends PopBaseHttpResponse, K extends PopBaseHttpResponse> Future<K> asyncInvokeCustomized(final PopBaseHttpRequest<T> request, String accessToken, Class<K> valueType) throws Exception;

    /**
     * 销毁实例
     */
    void destroy();
}
