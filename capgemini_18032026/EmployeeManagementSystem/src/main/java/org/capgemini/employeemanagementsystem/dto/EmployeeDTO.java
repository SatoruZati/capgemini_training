package org.capgemini.employeemanagementsystem.dto;

import lombok.Data;

import java.util.List;

@Data
public class EmployeeDTO {
    private int employeeID;
    private String employeeName;
    private String employeeEmail;
    private String employeePhone;
    private int age;
    private String department;
    private double salary;
    private String gender;
    private String address;
    private List<AddressDTO> addresses;
}
