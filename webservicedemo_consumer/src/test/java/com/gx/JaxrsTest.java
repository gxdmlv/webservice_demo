package com.gx;

import com.gx.pojo.User;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.jaxrs.provider.json.JSONProvider;

import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * @createDate 2020/10/25 16:05
 * @auth gx
 */
public class JaxrsTest {

    public static void main(String[] args) {

//        JSONProvider myJsonProvider = new JSONProvider();
//        myJsonProvider.setDropRootElement(true);
//        myJsonProvider.setSupportUnwrapped(true);
//        myJsonProvider.setSerializeAsArray(true);
//        List<JSONProvider> providers = new ArrayList<JSONProvider>();
//        providers.add(myJsonProvider);

        List<User> userList = (List<User>) WebClient.create("http://localhost:8080/webservicedemo_jaxrs_spring_server/ws/userService/user")
                .accept(MediaType.APPLICATION_JSON)
                .getCollection(User.class);

        userList.forEach(System.out::println);
    }
}
