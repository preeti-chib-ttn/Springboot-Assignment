package com.ttn.bootcamp.springboot_assignment.service;


import com.ttn.bootcamp.springboot_assignment.entity.Employee;
import com.ttn.bootcamp.springboot_assignment.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Q3)Create an Employee table (id, name, designation)
// under H2 database and inserts few sample records under that table at startup.
@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
}
