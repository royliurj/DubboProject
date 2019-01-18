package com.roy.dubbo.bean;

import java.io.Serializable;

/**
 * @Author: Roy
 * @Date: 2019/1/18 15:52
 */
public class UserAddress implements Serializable {

    private Integer id;
    private String address;
    private Integer userId;

    public UserAddress(Integer id, String address, Integer userId) {
        this.id = id;
        this.address = address;
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String   toString() {
        return "UserAddress{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", userId=" + userId +
                '}';
    }
}
