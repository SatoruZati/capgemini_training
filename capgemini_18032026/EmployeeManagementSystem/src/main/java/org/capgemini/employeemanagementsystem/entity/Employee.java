package org.capgemini.employeemanagementsystem.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "employees")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Builder

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeID;
    private String employeeName;
    @Column(unique = true, nullable = false)
    private String employeeEmail;
    private String employeePhone;
    private int age;
    private String department;
    private double salary;
    private String gender;
    private String address;
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Address> addresses;


}
