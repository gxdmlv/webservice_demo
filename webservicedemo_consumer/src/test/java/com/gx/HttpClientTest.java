package com.gx;

import com.alibaba.fastjson.JSONObject;
import com.gx.pojo.Car;
import com.gx.pojo.User;
import com.gx.util.HttpClientResult;
import com.gx.util.HttpClientUtil;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/**
 * @createDate 2020/10/31 15:09
 * @auth gx
 */
public class HttpClientTest {


    @Test
    public void doGetTest() throws Exception {
        String url = "http://localhost:8080/webservicedemo_jaxrs_spring_server/ws/userService/user/1";
        HttpClientResult result = HttpClientUtil.doGet(url);


        System.out.println(result.getContent());
    }


    @Test
    public void doPostJsonTest() throws Exception {

        String url = "http://localhost:8080/webservicedemo_jaxrs_spring_server/ws/userService/user";
        User user = new User();
        user.setId(22);
        user.setUsername("zhangsan");
        user.setCity("nanjing");
        user.setCars(Arrays.asList(new Car()));

        JSONObject jsonObject = (JSONObject) JSONObject.toJSON(user);
        System.out.println(jsonObject.toString());
        HttpClientResult result = HttpClientUtil.doPost(url,jsonObject);
        System.out.println(result.toString());
    }


}
