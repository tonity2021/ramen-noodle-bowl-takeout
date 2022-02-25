package com.example.ramennoodletakeout.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.awt.*;
import java.util.Collection;
import javax.management.relation.Role;
import javax.persistence.*;

@Entity
@Table(name = "orders")

public class Order {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String order_size;
    @Column
    private String special_request;

    @ManyToMany
    @JoinTable(name = "menu_item_orders", joinColumns = @JoinColumn(name = "order_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "menu_id", referencedColumnName = "id"))
    private Collection<Menu> menu_items;


    public Order() {
    }

    public Order(Long id, String order_size, String special_request) {
        this.id = id;
        this.order_size = order_size;
        this.special_request = special_request;

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrder_size() {
        return order_size;
    }

    public void setOrder_size(String order_size) {
        this.order_size = order_size;
    }

    public String getSpecial_request() {
        return special_request;
    }

    public void setSpecial_request(String special_request) {
        this.special_request = special_request;
    }



    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", order_size ='" + order_size + '\'' +
                ", special_request='" + special_request + '\'' +
                '}';
    }


}
