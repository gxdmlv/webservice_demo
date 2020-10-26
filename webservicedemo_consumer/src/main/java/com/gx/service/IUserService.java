package com.gx.service;

import com.gx.pojo.User;

import javax.ws.rs.*;
import java.util.List;

/**
 * @createDate 2020/10/25 14:45
 * @auth gx
 */
//@Path("/userService")//基础访问路径，如果不写则需要在spring配置文件中指定基础访问路径
@Produces("*/*")
public abstract class IUserService {




    @POST//匹配请求方式
    @Path("/user")//匹配请求路径
    @Consumes({ "application/xml", "application/json" })//服务器匹配请求的参数类型
    public abstract void saveUser(User user);

    @PUT
    @Path("/user")
    @Consumes({ "application/xml", "application/json" })
    public abstract void updateUser(User user);

    @GET//匹配请求方式
    @Path("/user")//匹配请求路径
    @Produces({ "application/xml", "application/json" })//服务器指定返回的数据类型
    public abstract List<User> findAllUsers();

    @GET
    @Path("/user/{id}")
    @Consumes("application/xml")
    @Produces({ "application/xml", "application/json" })
    public abstract User finUserById(@PathParam("id") Integer id);

    @DELETE
    @Path("/user/{id}")
    @Consumes({"application/xml", "application/json"})
    public abstract void deleteUser(@PathParam("id") Integer id);
}
