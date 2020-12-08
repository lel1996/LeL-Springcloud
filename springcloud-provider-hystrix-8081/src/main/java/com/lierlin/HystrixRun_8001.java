package com.lierlin;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient//在服务启动后注册到eurekaz中
@EnableDiscoveryClient//服务发现
@EnableCircuitBreaker//添加对熔断的支持
public class HystrixRun_8001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixRun_8001.class,args);
    }
}
