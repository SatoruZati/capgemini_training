package com.example.Spring_Framework;

public class Employee {

    private String employeeID;
    private String employeeName;
    private double employeeSalary;
    private String employeeDepartment;
    private String employeeEmail;
    private int employeeAge;
    private String employeePhone;

    // No-arg constructor required for Spring setter injection
    public Employee() {
        super();
        System.out.println("Employee No Args Constructor");
    }

    // Constructor injection (single string for simple demo)
    public Employee(String employeeID) {
        this.employeeID = employeeID;
    }

    // Full constructor for direct instantiation
    public Employee(String employeeID, String employeeName, double employeeSalary, String employeeDepartment, String employeeEmail, int employeeAge, String employeePhone) {
        super();
        System.out.println("Employee All Args Constructor");
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.employeeDepartment = employeeDepartment;
        this.employeeEmail = employeeEmail;
        this.employeeAge = employeeAge;
        this.employeePhone = employeePhone;
    }


    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    @Override
    //    toString
    public String toString() {
        return "Employee{" +
                "employeeID='" + employeeID + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", employeeDepartment='" + employeeDepartment + '\'' +
                ", employeeEmail='" + employeeEmail + '\'' +
                ", employeeAge=" + employeeAge +
                ", employeePhone='" + employeePhone + '\'' +
                '}';
    }

}
