package com.ttn.bootcamp.springboot_assignment.controller;
import com.ttn.bootcamp.springboot_assignment.entity.Employee;
import com.ttn.bootcamp.springboot_assignment.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//Q3)Create an Employee table (id, name, designation)
// under H2 database and inserts few sample records under that table at startup.
// Done in the class that's why added
@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/save/employee")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }
}
