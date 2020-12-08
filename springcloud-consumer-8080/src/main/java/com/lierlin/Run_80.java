package com.lierlin;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient//通过@EnableDiscoveryClient注解来添加发现服务能力
public class Run_80 {
    public static void main(String[] args) {
        SpringApplication.run(Run_80.class,args);
    }
}
