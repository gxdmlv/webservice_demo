package com.gx.service.impl;

import com.gx.service.HelloService;

/**
 * @createDate 2020/10/24 17:54
 * @auth gx
 */
public class HelloServiceImpl implements HelloService {


    @Override
    public String sayHello(String name) {
        return "hello "+name;
    }
}
