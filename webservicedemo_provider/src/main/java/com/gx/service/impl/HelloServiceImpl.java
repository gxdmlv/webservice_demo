package com.gx.service.impl;

import com.gx.service.HelloService;

/**
 * @createDate 2020/10/24 16:14
 * @auth gx
 */
public class HelloServiceImpl implements HelloService {

    public String sayHello(String name) {
        return "hello "+name;
    }
}
