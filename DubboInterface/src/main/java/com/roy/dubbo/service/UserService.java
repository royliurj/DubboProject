package com.roy.dubbo.service;

import com.roy.dubbo.bean.UserAddress;

import java.util.List;

/**
 * @Author: Roy
 * @Date: 2019/1/18 15:54
 */
public interface UserService {

    public List<UserAddress> getUserAddressList(Integer userId);
}
