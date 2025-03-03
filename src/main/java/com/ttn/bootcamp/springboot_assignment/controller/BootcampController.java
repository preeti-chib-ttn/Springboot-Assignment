package com.ttn.bootcamp.springboot_assignment.controller;

import com.ttn.bootcamp.springboot_assignment.service.BootcampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Q2) Configure few properties under application properties file
// and read there value under Main class.

// Done in the class that's why added
@RestController
public class BootcampController {
    @Autowired
    BootcampService bootcampService;
    @GetMapping("/bootcampDetails")
    public String getShortcut(){
        return bootcampService.getBootcampDetails()+"hello";
    }
}
