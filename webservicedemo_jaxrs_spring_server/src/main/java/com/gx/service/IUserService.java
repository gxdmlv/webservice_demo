package com.gx.service;

import com.gx.pojo.User;

import javax.jws.WebParam;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @createDate 2020/10/25 14:45
 * @auth gx
 */
//@Path("/userService")//基础访问路径，如果不写则需要在spring配置文件中指定基础访问路径

public interface IUserService {




    @POST//匹配请求方式
    @Path("/user")//匹配请求路径
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({ MediaType.APPLICATION_JSON })
    public void saveUser( User user);

    @PUT
    @Path("/user")
    public void updateUser(User user);

    @GET//匹配请求方式
    @Path("/user")//匹配请求路径
    @Produces({MediaType.APPLICATION_JSON})//服务器指定返回的数据类型
    public List<User> findAllUsers();

    @GET
    @Path("/user/{id}")
    @Produces({ MediaType.APPLICATION_JSON })
    public User finUserById(@PathParam("id") Integer id);

    @DELETE
    @Path("/user/{id}")
    public void deleteUser(@PathParam("id") Integer id);
}
