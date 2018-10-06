package com.weishuai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * 服务消费者
 * 使用RestTemplate和Ribbon来消费服务
 * 在RestTemplate和Ribbon上使用熔断器
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class EurekaRibbonClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaRibbonClientApplication.class, args);
	}
}
