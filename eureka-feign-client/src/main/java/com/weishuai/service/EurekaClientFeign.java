package com.weishuai.service;

import com.weishuai.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by WS on 2018/10/6.
 */
//@FeignClient：注解声明一个Feign Client；value：远程调用其他服务的服务名；FeignConfig.class：Feign Client的配置类
@FeignClient(value = "eureka-client", configuration = FeignConfig.class)
public interface EurekaClientFeign {
    @GetMapping(value = "/hi")
    String sayHiFromClientEureka(@RequestParam(value = "name") String name);
}
