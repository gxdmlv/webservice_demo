package com.gx.pojo;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * @createDate 2020/10/25 13:27
 * @auth gx
 */
//@XmlRootElement
public class User {

    private Integer id;
    private String username;
    private String city;
    private List<Car> cars = new ArrayList<Car>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", city=" + city + ", cars=" + cars + "]";
    }

}
