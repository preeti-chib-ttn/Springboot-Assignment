package com.ttn.bootcamp.springboot_assignment.repository;

import com.ttn.bootcamp.springboot_assignment.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

//Q3)Create an Employee table (id, name, designation)
// under H2 database and inserts few sample records under that table at startup.
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
