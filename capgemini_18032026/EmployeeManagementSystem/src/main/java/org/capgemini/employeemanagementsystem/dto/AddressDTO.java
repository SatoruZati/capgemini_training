package org.capgemini.employeemanagementsystem.dto;

import lombok.Data;

@Data
public class AddressDTO {
    private int addressID;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String country;
    private EmployeeDTO employee;
}
