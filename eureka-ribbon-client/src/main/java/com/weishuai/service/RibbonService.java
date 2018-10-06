package com.weishuai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by WS on 2018/10/6.
 */
@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    public String hi(String name){
        return restTemplate.getForObject("http://eureka-client/hi?name="+name, String.class);
    }
}
