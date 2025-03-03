package com.ttn.bootcamp.springboot_assignment.service;

import com.ttn.bootcamp.springboot_assignment.configuration.BootcampProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Q2) Configure few properties under application properties file
// and read there value under Main class.
@Service
public class BootcampService {

    @Autowired
    BootcampProperties bootcampProperties;

   public String getBootcampDetails(){
       return "Your role is: "+bootcampProperties.getRole()+" in "+bootcampProperties.getName()
               +" Bootcamp "+bootcampProperties.getYear()
               +",  your stipend is: "+bootcampProperties.getStipend();
   }
}
