package com.ttn.bootcamp.springboot_assignment.entity;
import jakarta.persistence.*;

//Q3)Create an Employee table (id, name, designation) under H2 database and
// inserts few sample records under that table at startup.
@Table(name="employee")
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="employee_name")
    private String name;

    @Column(name ="employee_designation")
    private  String designation;

    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
