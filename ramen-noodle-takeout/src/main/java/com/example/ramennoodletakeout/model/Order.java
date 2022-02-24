package com.example.ramennoodletakeout.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
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
    private Double price;

    public Order() {
    }

    public Order(Long id, String order_size, String special_request, double price) {
        this.id = id;
        this.order_size = order_size;
        this.special_request = special_request;
        this.price = price;

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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
                ", price='" + price + '\'' +
                '}';
    }


}
