package org.capgemini.employeemanagementsystem.repository;

import org.capgemini.employeemanagementsystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	Optional<Employee> findByEmployeeEmail(String employeeEmail);

	List<Employee> findByDepartmentIgnoreCase(String department);
}


