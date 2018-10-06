package com.weishuai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by WS on 2018/10/6.
 */
@Service
public class HiService {
    @Autowired
    private EurekaClientFeign eurekaClientFeign;
    public String sayHi(String name){
        return eurekaClientFeign.sayHiFromClientEureka(name);
    }
}
