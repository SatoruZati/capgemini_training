package org.capgemini.employeemanagementsystem.controller;

import org.capgemini.employeemanagementsystem.dto.EmployeeDTO;
import org.capgemini.employeemanagementsystem.service.EmployeeService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/mock")
    public EmployeeDTO mock() {
        return employeeService.getMockEmployee();
    }

    @GetMapping
    public List<EmployeeDTO> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public EmployeeDTO getEmployeeById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/by-email")
    public EmployeeDTO getEmployeeByEmail(@RequestParam String email) {
        return employeeService.getEmployeeByEmail(email);
    }

    @GetMapping("/department/{department}")
    public List<EmployeeDTO> getEmployeesByDepartment(@PathVariable String department) {
        return employeeService.getEmployeesByDepartment(department);
    }

    @PostMapping
    public EmployeeDTO createEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeService.createEmployee(employeeDTO);
    }

    @PostMapping("/save-employee")
    public String saveEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeService.saveEmployee(employeeDTO);
    }

    @PutMapping("/{id}")
    public EmployeeDTO updateEmployee(@PathVariable int id, @RequestBody EmployeeDTO employeeDTO) {
        return employeeService.updateEmployee(id, employeeDTO);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable int id) {
        return employeeService.deleteEmployee(id);
    }


}
