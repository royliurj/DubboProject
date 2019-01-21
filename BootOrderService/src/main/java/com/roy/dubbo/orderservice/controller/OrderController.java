package com.roy.dubbo.orderservice.controller;

import com.roy.dubbo.bean.UserAddress;
import com.roy.dubbo.service.OrderService;
import com.roy.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Roy
 * @Date: 2019/1/21 10:14
 */
@RestController
@ResponseBody
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/init")
    public List<UserAddress> initOrder(@RequestParam Integer userId){
        return orderService.initOrder(userId);
    }
}
