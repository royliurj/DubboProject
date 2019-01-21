package com.roy.dubbo.orderservice.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
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

//    @Autowired
//  从远程注册中心获取服务
    @Reference
    UserService userService;

    public List<UserAddress> initOrder(Integer userId) {
        //1. 查询用户的收获地址
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        return userAddressList;
    }
}
