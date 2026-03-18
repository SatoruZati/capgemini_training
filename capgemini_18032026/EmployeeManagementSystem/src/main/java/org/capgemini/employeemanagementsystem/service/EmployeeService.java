package org.capgemini.employeemanagementsystem.service;

import org.capgemini.employeemanagementsystem.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {
    EmployeeDTO getMockEmployee();

    EmployeeDTO createEmployee(EmployeeDTO employeeDTO);

    List<EmployeeDTO> getAllEmployees();

    EmployeeDTO getEmployeeById(int employeeId);

    EmployeeDTO updateEmployee(int employeeId, EmployeeDTO employeeDTO);

    String deleteEmployee(int employeeId);

    String saveEmployee(EmployeeDTO employeeDTO);

    EmployeeDTO getEmployeeByEmail(String employeeEmail);

    List<EmployeeDTO> getEmployeesByDepartment(String department);
}

