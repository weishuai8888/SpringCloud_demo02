package com.weishuai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Register Service服务注册中心（是一个Eureka Server）
 * 可以做集群
 * 做集群的时候，启动第一个服务会报错“Cannot execute request on any known server”，但不会影响使用。
 * 启动完其他服务，在重启此服务就不会报错。
 */
@SpringBootApplication
@EnableEurekaServer //开启EurekaServer功能
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}
