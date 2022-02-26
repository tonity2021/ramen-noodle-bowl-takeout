package com.example.ramennoodletakeout.controller;

import com.example.ramennoodletakeout.model.UserProfile;
import com.example.ramennoodletakeout.service.OrderService;
import com.example.ramennoodletakeout.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/auth")

public class ProfileController {
    private ProfileService profileService;

    @Autowired
    public void setProfileService(ProfileService profileService) {
        this.profileService = profileService;
    }

    @Autowired
    public void setReservationService(OrderService orderService) {
        this.profileService= profileService;
    }

    //create a user profile
    @PostMapping("/users/profile/")
    public UserProfile createProfile(@RequestBody UserProfile userProfileObject) {
        System.out.println("calling createProfile ==>");
        return profileService.createProfile(userProfileObject);
    }

}
