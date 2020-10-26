package com.gx.server;

import com.gx.service.impl.HelloServiceImpl;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * @createDate 2020/10/24 16:21
 * @auth gx
 */
public class HelloServiceServer {


    public static void main(String[] args) {
        //创建服务工厂
        JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();

        //设置url
        jaxWsServerFactoryBean.setAddress("http://localhost:8888/ws/hello");

        //设置服务类
        jaxWsServerFactoryBean.setServiceBean(new HelloServiceImpl());

        //发布服务
        jaxWsServerFactoryBean.create();


        System.out.println("服务已发布......");
    }
}
