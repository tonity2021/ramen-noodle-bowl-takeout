package com.example.ramennoodletakeout.model;

import com.fasterxml.jackson.annotation.JsonIgnore;



import java.util.Collection;
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
    @JsonIgnore
    private Collection<Menu> menu_items;
    private User user;


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
                '}';
    }


}
