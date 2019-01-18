package com.roy.dubbo.userservice.service.impl;

import com.roy.dubbo.bean.UserAddress;
import com.roy.dubbo.service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: Roy
 * @Date: 2019/1/18 15:54
 */
public class UserServiceImpl implements UserService {

    private final List<UserAddress> list = new ArrayList<UserAddress>();

    {
        list.add(new UserAddress(1,"北京",1));
        list.add(new UserAddress(2,"天津",1));
        list.add(new UserAddress(3,"上海",2));
        list.add(new UserAddress(4,"广州",3));
    }

    @Override
    public List<UserAddress> getUserAddressList(final Integer userId) {

        System.out.println("接收到请求：UserId = " + userId);
        List<UserAddress> result = list.stream().filter(u -> u.getUserId().equals(userId)).collect(Collectors.toList());
        System.out.println("返回结果：" + result);
        return result;
    }
}
