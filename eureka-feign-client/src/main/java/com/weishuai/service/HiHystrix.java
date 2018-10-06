package com.weishuai.service;

import org.springframework.stereotype.Component;

/**
 * Created by WS on 2018/10/6.
 */
@Component
public class HiHystrix implements EurekaClientFeign {
    @Override
    public String sayHiFromClientEureka(String name) {
        return "hi: " + name + ", sorry, error!";
    }
}
