package com.lierlin.controller;

import com.lierlin.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

public class UserController {
    //消费者不应该又service层，应该直接调用提供者提供的方法
    //RestTemplate 供我们直接调用，注册到bean中
    private static final String URL_REST = "http://localhost:8081/springcloud-provider-8001";
    @Autowired
    private RestTemplate restTemplate;//提供多种便捷访问远程http服务的方法，简单的RestFul服务模板

    @RequestMapping("test/{id}")

    public User query(@PathVariable("id") String id) {
        return restTemplate.getForObject(URL_REST + "/selectById/" + id, User.class);
    }
}
