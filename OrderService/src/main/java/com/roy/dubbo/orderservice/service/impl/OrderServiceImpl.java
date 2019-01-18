package com.roy.dubbo.orderservice.service.impl;

import com.roy.dubbo.bean.UserAddress;
import com.roy.dubbo.service.OrderService;
import com.roy.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Roy
 * @Date: 2019/1/18 16:20
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;

    public void initOrder(Integer userId) {
        //1. 查询用户的收获地址
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        System.out.println("返回结果： " + userAddressList);
    }
}
