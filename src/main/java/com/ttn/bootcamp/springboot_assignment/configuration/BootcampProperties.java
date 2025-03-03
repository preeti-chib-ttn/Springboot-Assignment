package com.ttn.bootcamp.springboot_assignment.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull;

// Q2) Configure few properties under application properties file
// and read there value under Main class.

@Configuration
@ConfigurationProperties(prefix = "bootcamp")
public class BootcampProperties {

    @NonNull
    private String  role;

    @NonNull
    private String  name;

    @NonNull
    private int  year;

    @NonNull
    private int  stipend;

    public int getStipend() {
        return stipend;
    }

    public void setStipend(int stipend) {
        this.stipend = stipend;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    @NonNull
    public String getRole() {
        return role;
    }

    public void setRole(@NonNull String role) {
        this.role = role;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
