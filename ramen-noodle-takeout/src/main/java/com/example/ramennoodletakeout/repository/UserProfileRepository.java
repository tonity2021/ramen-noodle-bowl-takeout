package com.example.ramennoodletakeout.repository;


import com.example.ramennoodletakeout.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
   UserProfile findByUserId(Long UserId);

}