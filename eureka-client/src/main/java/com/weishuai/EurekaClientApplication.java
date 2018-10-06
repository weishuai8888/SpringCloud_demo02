package com.weishuai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Provider Service：服务提供者（是一个Eureka Client）
 */
@SpringBootApplication
@EnableEurekaClient //开启EurekaClient功能
public class EurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}
}
