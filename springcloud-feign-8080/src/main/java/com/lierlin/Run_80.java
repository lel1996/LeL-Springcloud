package com.lierlin;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableDiscoveryClient//ͨ��@EnableDiscoveryClientע������ӷ��ַ�������
//@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.lierlin.service"})
public class Run_80 {
    public static void main(String[] args) {
        SpringApplication.run(Run_80.class,args);
    }
}
