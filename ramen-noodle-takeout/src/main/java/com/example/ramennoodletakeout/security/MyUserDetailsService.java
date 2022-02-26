package com.example.ramennoodletakeout.security;


import com.example.ramennoodletakeout.model.User;
import com.example.ramennoodletakeout.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;


@Service
public class MyUserDetailsService implements UserDetailsService {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService){
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String email){
        User user = userService.findUserByEmailAddress(email);
        return new MyUserDetails(user);
    }

}