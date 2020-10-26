package com.gx.service;

import javax.jws.WebService;

/**
 * @createDate 2020/10/24 17:53
 * @auth gx
 */
@WebService
public interface HelloService {

    public String sayHello(String name);
}
