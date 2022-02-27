package com.example.ramennoodletakeout.controller;

import com.example.ramennoodletakeout.model.Order;
import com.example.ramennoodletakeout.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/api")

public class OrderController {
    private OrderService orderService;


    @Autowired
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }
    //hello world
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

    //get all orders
    @GetMapping("/orders/")
    public List<Order> getOrder() {
        System.out.println("calling getOrders==>");
        return orderService.getAllOrders();
    }

    //get order by ID
    @GetMapping(path = "/order/{orderId}")
    public Optional<Order> getOrder(@PathVariable Long orderId) {
        return orderService.getOrder(orderId);

    }

    //modify order by ID
    @PutMapping("/order/{orderId}/")
    public Order updateOrder(@PathVariable(value = "orderId") Long orderId, @RequestBody Order orderObject) {
        System.out.println("calling updateOrder ==>");
        return orderService.updateOrder(orderId, orderObject);
    }

    //delete order by ID
    @DeleteMapping("/order/{orderId}")
    public Optional<Order> deleteOrder(@PathVariable(value = "orderId") Long orderId) {
        System.out.println("calling deleteRez ==>");
        return orderService.deleteOrder(orderId);
    }


}