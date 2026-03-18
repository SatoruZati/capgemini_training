package org.capgemini.employeemanagementsystem.controller;

import org.capgemini.employeemanagementsystem.dto.AddressDTO;
import org.capgemini.employeemanagementsystem.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @GetMapping("/mock")
    public EmployeeDTO mock(){

        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setEmployeeName("Lando Norris");
        employeeDTO.setAge(24);
        employeeDTO.setDepartment("Racing");
        employeeDTO.setEmployeeEmail("landonorrismclaren@gmail.com");
        employeeDTO.setGender("Male");
        employeeDTO.setSalary(25000000.00);

        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setStreet("88 Manson Street, London");
        addressDTO.setCity("London");
        addressDTO.setState("England");
        addressDTO.setZip("SW1A 1AA");
        addressDTO.setCountry("United Kingdom");

        employeeDTO.setAddresses(List.of(addressDTO));

        return employeeDTO;
    }

}
