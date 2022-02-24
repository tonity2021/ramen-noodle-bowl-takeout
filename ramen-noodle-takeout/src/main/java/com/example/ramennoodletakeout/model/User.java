package com.example.ramennoodletakeout.model;

public class User {


    private Long id;
    private String userName;
    private String password;
    private String emailAddress;
    private String phoneNumber;
    private String homeAddress;


    public User(Long id, String userName, String password, String emailAddress, String phoneNumber, String homeAddress) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.homeAddress = homeAddress;
    }
}