package com.weishuai.config;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * Created by WS on 2018/10/6.
 */
@Configuration //表明是一个配置类
public class FeignConfig {
    @Bean//注入Retryer的Bean后，Feign在远程调用失败后会进行重试
    //下面的代码，通过覆盖默认的Retryer的Bean，更改了FeignClient的请求失败重试策略，重试间隔为100毫秒，最大重试时间为1秒，重试次数为5次。
    public Retryer feignRetryer(){
        return new Retryer.Default(100, TimeUnit.SECONDS.toMillis(1), 5);
    }
}
