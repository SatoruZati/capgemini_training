package org.capgemini.employeemanagementsystem.service;

import org.capgemini.employeemanagementsystem.dto.AddressDTO;
import org.capgemini.employeemanagementsystem.dto.EmployeeDTO;
import org.capgemini.employeemanagementsystem.entity.Address;
import org.capgemini.employeemanagementsystem.entity.Employee;
import org.capgemini.employeemanagementsystem.repository.EmployeeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    // With a single constructor, Spring injects dependencies automatically.
    // So @Autowired is optional here; constructor injection keeps dependency required and test-friendly.
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeDTO getMockEmployee() {
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

    @Override
    @Transactional
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
        Employee employee = toEntity(employeeDTO);
        Employee savedEmployee = employeeRepository.save(employee);
        return toDTO(savedEmployee);
    }

    @Override
    @Transactional(readOnly = true)
    public List<EmployeeDTO> getAllEmployees() {
        return employeeRepository.findAll()
                .stream()
                .map(this::toDTO)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public EmployeeDTO getEmployeeById(int employeeId) {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee not found: " + employeeId));
        return toDTO(employee);
    }

    @Override
    @Transactional
    public EmployeeDTO updateEmployee(int employeeId, EmployeeDTO employeeDTO) {
        Employee existingEmployee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee not found: " + employeeId));

        existingEmployee.setEmployeeName(employeeDTO.getEmployeeName());
        existingEmployee.setEmployeeEmail(employeeDTO.getEmployeeEmail());
        existingEmployee.setEmployeePhone(employeeDTO.getEmployeePhone());
        existingEmployee.setAge(employeeDTO.getAge());
        existingEmployee.setDepartment(employeeDTO.getDepartment());
        existingEmployee.setSalary(employeeDTO.getSalary());
        existingEmployee.setGender(employeeDTO.getGender());
        existingEmployee.setAddress(employeeDTO.getAddress());

        List<Address> updatedAddresses = new ArrayList<>();
        if (employeeDTO.getAddresses() != null) {
            for (AddressDTO addressDTO : employeeDTO.getAddresses()) {
                Address address = Address.builder()
                        .addressID(addressDTO.getAddressID())
                        .street(addressDTO.getStreet())
                        .city(addressDTO.getCity())
                        .state(addressDTO.getState())
                        .zip(addressDTO.getZip())
                        .country(addressDTO.getCountry())
                        .employee(existingEmployee)
                        .build();
                updatedAddresses.add(address);
            }
        }

        if (existingEmployee.getAddresses() == null) {
            existingEmployee.setAddresses(new ArrayList<>());
        }
        existingEmployee.getAddresses().clear();
        existingEmployee.getAddresses().addAll(updatedAddresses);

        Employee savedEmployee = employeeRepository.save(existingEmployee);
        return toDTO(savedEmployee);
    }

    @Override
    @Transactional
    public String deleteEmployee(int employeeId) {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee not found: " + employeeId));
        employeeRepository.delete(employee);
        return "Employee deleted successfully";
    }

    @Override
    @Transactional(readOnly = true)
    public EmployeeDTO getEmployeeByEmail(String employeeEmail) {
        Employee employee = employeeRepository.findByEmployeeEmail(employeeEmail)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee not found with email: " + employeeEmail));
        return toDTO(employee);
    }

    @Override
    @Transactional(readOnly = true)
    public List<EmployeeDTO> getEmployeesByDepartment(String department) {
        return employeeRepository.findByDepartmentIgnoreCase(department)
                .stream()
                .map(this::toDTO)
                .toList();
    }

    private Employee toEntity(EmployeeDTO employeeDTO) {
        // Setter style: good for step-by-step mapping when values come from many places.
        // Trade-off: object can stay partially filled if a field is missed.
        Employee employee = new Employee();
        employee.setEmployeeID(employeeDTO.getEmployeeID());
        employee.setEmployeeName(employeeDTO.getEmployeeName());
        employee.setEmployeeEmail(employeeDTO.getEmployeeEmail());
        employee.setEmployeePhone(employeeDTO.getEmployeePhone());
        employee.setAge(employeeDTO.getAge());
        employee.setDepartment(employeeDTO.getDepartment());
        employee.setSalary(employeeDTO.getSalary());
        employee.setGender(employeeDTO.getGender());
        employee.setAddress(employeeDTO.getAddress());

        List<Address> addresses = new ArrayList<>();
        if (employeeDTO.getAddresses() != null) {
            for (AddressDTO addressDTO : employeeDTO.getAddresses()) {
                Address address = new Address();
                address.setAddressID(addressDTO.getAddressID());
                address.setStreet(addressDTO.getStreet());
                address.setCity(addressDTO.getCity());
                address.setState(addressDTO.getState());
                address.setZip(addressDTO.getZip());
                address.setCountry(addressDTO.getCountry());
                address.setEmployee(employee);
                addresses.add(address);
            }
        }
        employee.setAddresses(addresses);
        return employee;
    }

    private EmployeeDTO toDTO(Employee employee) {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setEmployeeID(employee.getEmployeeID());
        employeeDTO.setEmployeeName(employee.getEmployeeName());
        employeeDTO.setEmployeeEmail(employee.getEmployeeEmail());
        employeeDTO.setEmployeePhone(employee.getEmployeePhone());
        employeeDTO.setAge(employee.getAge());
        employeeDTO.setDepartment(employee.getDepartment());
        employeeDTO.setSalary(employee.getSalary());
        employeeDTO.setGender(employee.getGender());
        employeeDTO.setAddress(employee.getAddress());

        List<AddressDTO> addressDTOs = new ArrayList<>();
        if (employee.getAddresses() != null) {
            for (Address address : employee.getAddresses()) {
                AddressDTO addressDTO = new AddressDTO();
                addressDTO.setAddressID(address.getAddressID());
                addressDTO.setStreet(address.getStreet());
                addressDTO.setCity(address.getCity());
                addressDTO.setState(address.getState());
                addressDTO.setZip(address.getZip());
                addressDTO.setCountry(address.getCountry());
                addressDTOs.add(addressDTO);
            }
        }
        employeeDTO.setAddresses(addressDTOs);
        return employeeDTO;
    }

    @Override
    @Transactional
    public String saveEmployee(EmployeeDTO employeeDTO) {
        // Builder style: creates the object in a single fluent block.
        // Better readability for many fields and reduces missed assignments in long setter chains.
        Employee employee = Employee.builder()
                .employeeName(employeeDTO.getEmployeeName())
                .employeeEmail(employeeDTO.getEmployeeEmail())
                .employeePhone(employeeDTO.getEmployeePhone())
                .age(employeeDTO.getAge())
                .department(employeeDTO.getDepartment())
                .salary(employeeDTO.getSalary())
                .gender(employeeDTO.getGender())
                .address(employeeDTO.getAddress())
                .build();

        List<Address> addressList = new ArrayList<>();
        if (employeeDTO.getAddresses() != null) {
            // for-loop kept intentionally to demonstrate explicit DTO -> entity conversion.
            for (AddressDTO address : employeeDTO.getAddresses()) {
                Address addressEntity = Address.builder()
                        .street(address.getStreet())
                        .city(address.getCity())
                        .state(address.getState())
                        .zip(address.getZip())
                        .country(address.getCountry())
                        .employee(employee)
                        .build();

                addressList.add(addressEntity);
            }
        }

        employee.setAddresses(addressList);
        employeeRepository.save(employee);

        return "Employee saved successfully";
    }
}

