package com.weishuai.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
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

    @HystrixCommand(fallbackMethod = "hiError")
    public String hi(String name){
        return restTemplate.getForObject("http://eureka-client/hi?name="+name, String.class);
    }
    public String hiError(String name){
        return "hi: "+ name + ", sorry,error!";
    }
}
