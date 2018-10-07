package com.weishuai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 搭建Zuul服务
 */
@SpringBootApplication  //表明自己是一个SpringBoot工程
@EnableEurekaClient  //开启EurekaClient功能
@EnableZuulProxy  //开启Zuul功能
public class EurekaZuulClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaZuulClientApplication.class, args);
	}
}
