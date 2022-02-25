package com.example.ramennoodletakeout.repository;

import com.example.ramennoodletakeout.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//interface class that holds order list and methods
public interface OrderRepository extends JpaRepository<Order, Long> {


    Order findByName(String orderName);

    List<Order> findByUserId(Long userId);

//    Order findByUserIdAndName(Long userId, String name);

    Order findByIdAndUserId(Long OrderId, Long UserId);

}
