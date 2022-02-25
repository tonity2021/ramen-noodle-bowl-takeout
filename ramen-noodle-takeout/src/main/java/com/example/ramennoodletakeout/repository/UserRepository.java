package com.example.ramennoodletakeout.repository;
//done
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;



public interface UserRepository extends JpaRepository<User, Long> {

    User findUserById(Long userId);
    //to register
    boolean existsByEmailAddress(String userEmailAddress);

    //to login
    User findUserByEmailAddress(String userEmailAddress);

}