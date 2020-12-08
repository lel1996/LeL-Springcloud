package com.lierlin.controller;


import com.lierlin.pojo.User;
import com.lierlin.service.UserClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {
    //消费者不应该又service层，应该直接调用提供者提供的方法
    //RestTemplate 供我们直接调用，注册到bean中
    //private static final String URL_REST = "http://localhost:8081/springcloud-provider-8001";
    @Autowired
    private UserClientService userClientService;
    //private RestTemplate restTemplate;//提供多种便捷访问远程http服务的方法，简单的RestFul服务模板
    @RequestMapping("/selectById/{id}")
    public User selectById(@PathVariable("id") int id) {
        return userClientService.selectById(id);
    }
    @GetMapping("/t/selectAll")
    public List<User> selectAll(){
        System.out.println("=============");
        return userClientService.selectAll();
    }
}
