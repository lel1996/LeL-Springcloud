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
    //�����߲�Ӧ����service�㣬Ӧ��ֱ�ӵ����ṩ���ṩ�ķ���
    //RestTemplate ������ֱ�ӵ��ã�ע�ᵽbean��
    //private static final String URL_REST = "http://localhost:8081/springcloud-provider-8001";
    @Autowired
    private UserClientService userClientService;
    //private RestTemplate restTemplate;//�ṩ���ֱ�ݷ���Զ��http����ķ������򵥵�RestFul����ģ��
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
