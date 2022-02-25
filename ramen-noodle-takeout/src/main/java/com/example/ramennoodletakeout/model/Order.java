package com.example.ramennoodletakeout.model;

import com.fasterxml.jackson.annotation.JsonIgnore;


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
    @Column
    private String name;


    //many orders belong to a user
    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User user;

    public Order() {
    }


    public Order(Long id, String order_size, String special_request, String name) {
        this.id = id;
        this.order_size = order_size;
        this.special_request = special_request;
        this.name = name;

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
    public String getName() {return name;}

    public void setName(String name) {this.name = name;}


    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", order_size ='" + order_size + '\'' +
                ", special_request='" + special_request + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


}
