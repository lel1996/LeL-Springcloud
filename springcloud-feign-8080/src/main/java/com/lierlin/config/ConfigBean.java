package com.lierlin.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced//@LoadBalanced注解开启均衡负载能力。
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
