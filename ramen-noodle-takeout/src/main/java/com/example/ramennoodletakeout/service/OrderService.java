package com.example.ramennoodletakeout.service;

import com.example.ramennoodletakeout.exceptions.InformationExistException;
import com.example.ramennoodletakeout.model.Order;
import com.example.ramennoodletakeout.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service

public class OrderService {

    private OrderRepository orderRepository;

    @Autowired
    public void setOrderRepository(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }




}
