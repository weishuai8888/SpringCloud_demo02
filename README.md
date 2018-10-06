# SpringCloud_demo02
深入理解SpringCloud与微服务构建
eureka-server:Register Service（服务注册中心）
eureka-client与eureka-client-copy:Provider Service（服务提供者），两者spring.application.name相同
eureka-ribbon-client：Consumer Service（服务消费者）；
    RestTemplate和Ribbon实现负载均衡；
    在RestTemplate和Ribbon上使用熔断器；
    使用Hystrix Dashboard监控熔断器的状态（端口号不匹配，没成功）
eureka-feign-client:声明式调用feign（自带负载均衡）
    在feign上使用熔断器
    使用Hystrix Dashboard监控熔断器的状态（端口号不匹配，没成功）