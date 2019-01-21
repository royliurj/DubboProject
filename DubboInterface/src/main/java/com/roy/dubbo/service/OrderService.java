package com.roy.dubbo.service;

import com.roy.dubbo.bean.UserAddress;

import java.util.List;

/**
 * @Author: Roy
 * @Date: 2019/1/18 16:19
 */
public interface OrderService {
    public List<UserAddress> initOrder(Integer userId);
}
