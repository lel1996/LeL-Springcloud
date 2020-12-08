package com.lierlin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//���Խ��ܱ�ķ���ע�����
public class Run_8082 {
    public static void main(String[] args) {
        SpringApplication.run(Run_8082.class,args);
    }
}
