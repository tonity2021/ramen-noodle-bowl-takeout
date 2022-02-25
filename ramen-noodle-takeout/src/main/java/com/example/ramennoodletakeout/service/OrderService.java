package com.example.ramennoodletakeout.service;

import com.example.ramennoodletakeout.exceptions.InformationExistException;
import com.example.ramennoodletakeout.exceptions.InformationNotFoundException;
import com.example.ramennoodletakeout.model.Order;
import com.example.ramennoodletakeout.repository.OrderRepository;
import com.example.ramennoodletakeout.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class OrderService {

    private OrderRepository orderRepository;
    private UserRepository userRepository;


    @Autowired
    public void setOrderRepository(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    //create a new order
    public Order createOrder(Order orderObject) {
        System.out.println("service calling createOrder ==>");
        return orderObject;
    }

}
