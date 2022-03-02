package com.example.ramennoodletakeout.service;

import com.example.ramennoodletakeout.exceptions.InformationExistException;
import com.example.ramennoodletakeout.exceptions.InformationNotFoundException;
import com.example.ramennoodletakeout.model.Order;
import com.example.ramennoodletakeout.repository.OrderRepository;
import com.example.ramennoodletakeout.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

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

// create a new order
    public Order createOrder(@RequestBody Order orderObject) {
        System.out.println("calling createOrder");
        Order order = orderRepository.findByName(orderObject.getName());
        if (order != null) {
            throw new InformationExistException("order for " + order.getName() + " already exists");
        } else {
            return orderRepository.save(orderObject);
        }
    }

    //get order by Id
    public Optional getOrder(Long orderId) {
        System.out.println("service getOrder( ==>");
        Optional order = orderRepository.findById(orderId);
        if (order.isPresent()) {
            return order;
        } else {
            throw new InformationNotFoundException("order with id " + orderId + " not found");
        }
    }

    //get all orders
    public List<Order> getAllOrders() {
        System.out.println("calling getAllOrders");
        return orderRepository.findAll();
    }

    //update order
    public Order updateOrder(Long orderId, Order orderObject) {
        System.out.println("service calling updateOrder ==>");
        Optional<Order> order = orderRepository.findById(orderId);
        if (order.isPresent()) {
            if (orderObject.getName().equals(order.get().getName())) {
                System.out.println("Same");
                throw new InformationExistException("order " + order.get().getName() + " already exists");
            } else {
                Order updateOrder = orderRepository.findById(orderId).get();
                updateOrder.setOrderSize(orderObject.getOrderSize());
                updateOrder.setSpecialRequest(orderObject.getSpecialRequest());
                updateOrder.setName(orderObject.getName());
                return orderRepository.save(updateOrder);
            }
        } else {
            throw new InformationNotFoundException("order with id " + orderId + " not found");
        }
    }

    //cancel order
    public Optional<Order> deleteOrder(Long orderId) {
        System.out.println("service calling deleteOrder ==>");
        Optional<Order> order = orderRepository.findById(orderId);

        if (((Optional<?>) order).isPresent()) {
            orderRepository.deleteById(orderId);
            return order;
        } else {
            throw new InformationNotFoundException("order with id " + orderId + " not found");
        }
    }

}
