package com.lierlin.controller;

import com.lierlin.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

public class UserController {
    //�����߲�Ӧ����service�㣬Ӧ��ֱ�ӵ����ṩ���ṩ�ķ���
    //RestTemplate ������ֱ�ӵ��ã�ע�ᵽbean��
    private static final String URL_REST = "http://localhost:8081/springcloud-provider-8001";
    @Autowired
    private RestTemplate restTemplate;//�ṩ���ֱ�ݷ���Զ��http����ķ������򵥵�RestFul����ģ��

    @RequestMapping("test/{id}")

    public User query(@PathVariable("id") String id) {
        return restTemplate.getForObject(URL_REST + "/selectById/" + id, User.class);
    }
}
