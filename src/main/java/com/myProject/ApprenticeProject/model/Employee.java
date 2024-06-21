package com.myProject.ApprenticeProject.model;

// Employee Class created for Employee properties
public class Employee {
    private String employeeName;
    private int employeeId;
    private String employeeEmail;
    private int employeeContactNum;

    //Empty Constructor
    public Employee() {
    }

    public Employee(String employeeName, int employeeId, String employeeEmail, int employeeContactNum) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.employeeEmail = employeeEmail;
        this.employeeContactNum = employeeContactNum;
    }

    // Getters and Setter for Employee
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public int getEmployeeContactNum() {
        return employeeContactNum;
    }

    public void setEmployeeContactNum(int employeeContactNum) {
        this.employeeContactNum = employeeContactNum;
    }

}
