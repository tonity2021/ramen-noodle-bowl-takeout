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

    //getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + userName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                '}';
    }

}