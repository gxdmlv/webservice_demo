package com.gx.service;

import javax.jws.WebService;

/**
 * @createDate 2020/10/24 16:12
 * @auth gx
 */

/**
 * @webservice : 标注一个webservice
 */
@WebService
public interface HelloService {

    //对外发布的接口方法
    public String sayHello(String name);
}
