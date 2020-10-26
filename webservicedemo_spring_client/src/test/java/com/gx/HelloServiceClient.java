package com.gx;

import com.gx.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @createDate 2020/10/25 11:04
 * @auth gx
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class HelloServiceClient {

    @Autowired
    HelloService helloService;

    @Test
    public  void remoteTest(){

        System.out.println(helloService.sayHello("gx"));
    }
}
