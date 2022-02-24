package com.example.ramennoodletakeout.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.*;

@Entity
@Table(name = "menus")

public class Menu {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String food_description;


    public Menu() {
    }

    public Menu(Long id, String food_description) {
        this.id = id;
        this.food_description = food_description;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFood_description() {
        return food_description;
    }

    public void setFood_description(String food_description) {
        this.food_description = food_description;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", food_description ='" + food_description + '\'' +
                '}';
    }

}
