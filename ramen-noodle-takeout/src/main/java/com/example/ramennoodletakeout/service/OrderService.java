package com.example.ramennoodletakeout.service;

import com.example.ramennoodletakeout.exceptions.InformationExistException;
import com.example.ramennoodletakeout.exceptions.InformationNotFoundException;
import com.example.ramennoodletakeout.model.Order;
import com.example.ramennoodletakeout.repository.OrderRepository;
import com.example.ramennoodletakeout.repository.UserRepository;
import com.example.ramennoodletakeout.security.MyUserDetails;
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

        MyUserDetails userDetails = (MyUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        System.out.println(userDetails.getUser().getId());

        List<Order> order = orderRepository.findByUserId(userDetails.getUser().getId());

        if (order.isEmpty()) {
            throw new InformationNotFoundException("no orders found for user id " + userDetails.getUser().getId() + ".");
        } else {
            return order;
        }

    }
    //create a new order
    public Order createOrder(Order orderObject) {
        System.out.println("service calling createOrder ==>");
        MyUserDetails userDetails = (MyUserDetails) SecurityContextHolder.getContext().getAuthentication()
                .getPrincipal();
        Order order = orderRepository.findByUserIdAndName(
                userDetails.getUser().getId(), orderObject.getName());
        if (order != null) {
            throw new InformationExistException("order with name " + order.getName() + " already exists");
        } else {
            orderObject.setUser(userDetails.getUser());
            return orderRepository.save(orderObject);
        }
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
                Order updateOrder= orderRepository.findById(orderId).get();
                updateOrder.setOrder_size(orderObject.getOrder_size());
                updateOrder.setSpecial_request(orderObject.getSpecial_request());
                updateOrder.setName(orderObject.getName());
                return orderRepository.save(updateOrder );
            }
        } else {
            throw new InformationNotFoundException("order with id " +orderId + " not found");
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
