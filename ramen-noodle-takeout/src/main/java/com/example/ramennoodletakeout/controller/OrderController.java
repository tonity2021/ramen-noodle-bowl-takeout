package com.example.ramennoodletakeout.controller;

import com.example.ramennoodletakeout.model.Order;
import com.example.ramennoodletakeout.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")

public class OrderController {
    private OrderService orderService;


    @Autowired
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }
//    hello world
//    @GetMapping(path = "/hello/")
//    public String helloWorld() {
//        return "Hello World";
//    }

    //create a new order
    @PostMapping("/order/")
    public Order createOrder(@RequestBody Order orderObject) {
        System.out.println("calling createOrder==>");
        return orderService.createOrder(orderObject);
    }

}
