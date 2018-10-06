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
    @Bean
    public Retryer feignRetryer(){
        return new Retryer.Default(100, TimeUnit.SECONDS.toMillis(1), 5);
    }
}
