package com.roy.dubbo.service.impl;

import com.roy.dubbo.bean.UserAddress;
import com.roy.dubbo.service.UserService;

import java.util.List;

/**
 * @Author: Roy
 * @Date: 2019/1/25 10:50
 */
public class UserServiceStub implements UserService {

    private final UserService userService;

    /**
     * 传入的是远程代理对象
     * @param userService
     */
    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserAddress> getUserAddressList(Integer userId) {
        if(userId > 0){
            return this.userService.getUserAddressList(userId);
        }
        System.out.println("userId 不合法");
        return null;
    }
}
