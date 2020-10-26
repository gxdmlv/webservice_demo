package com.gx.pojo;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @createDate 2020/10/25 13:29
 * @auth gx
 */
@XmlRootElement(name = "Car")
public class Car {

    private Integer id;
    private String carName;
    private Double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car [id=" + id + ", carName=" + carName + ", price=" + price + "]";
    }
}
