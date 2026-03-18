package org.capgemini.employeemanagementsystem.dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Data;
import org.capgemini.employeemanagementsystem.entity.Address;

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
