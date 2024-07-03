package com.myProject.ApprenticeProject.controller;

import com.myProject.ApprenticeProject.model.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/Employee") //Controller to get Employee

public class EmployeeAPIService {

    //Object for employee
    Employee employee; //object

    //POST TESTED IN POSTMAN with Employee objects passed to get an employee - passed
    @GetMapping("/{employeeId}")
// Mapping to get EmployeeID
    public Employee getEmployeeDetails (String employeeId){
        return employee;
    }

    //POST TESTED IN POSTMAN with Employee objects passed to create a new employee - passed
    @PostMapping
    //Requesting the body of the Employee
    public String createEmployeeDetails(@RequestBody Employee employee){//create employee to accept the Employee object
        this.employee = employee;
        return "Employee created successfully";
    }

    //PUT TESTED IN POSTMAN with updating surname in employeeID 1 - passed
    @PutMapping
    public String putEmployeeDetails(@RequestBody Employee employee){//create employee to accept the Employee object
        this.employee = employee;
        return "Employee updated successfully";
    }

    //DELETE TESTED IN POSTMAN with deleting employee 2 - passed
    //Delete mapping specifically set to EmployeeID
    @DeleteMapping("/{employeeId}")
    public String deleteEmployeeDetails(String employeeId){
        this.employee = null;
        return "Employee deleted successfully";
    }

}

