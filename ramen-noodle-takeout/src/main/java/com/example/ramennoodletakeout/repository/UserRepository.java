package com.example.ramennoodletakeout.repository;
//done

import com.example.ramennoodletakeout.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

//  User findUserById(Long userId);

  //to register

    boolean existsByEmailAddress(String userEmailAddress);

   //to login

    User findUserByEmailAddress(String userEmailAddress);

}



