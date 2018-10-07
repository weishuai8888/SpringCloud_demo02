package com.weishuai.zuulHystrix;

import org.springframework.http.client.ClientHttpResponse;

/**
 * Created by WS on 2018/10/7.
 */
public interface ZuulFallbackProvider {
    String getRoute();
    ClientHttpResponse fallbackResponse();
}
