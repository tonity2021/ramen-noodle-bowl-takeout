package com.example.ramennoodletakeout.controller;

import com.example.ramennoodletakeout.model.UserProfile;
import com.example.ramennoodletakeout.service.OrderService;
import com.example.ramennoodletakeout.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
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



}