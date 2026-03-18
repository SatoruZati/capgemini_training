package org.capgemini.employeemanagementsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@EqualsAndHashCode(exclude = "employee")
@Builder
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int addressID;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String country;

    @ManyToOne(fetch = jakarta.persistence.FetchType.LAZY)
    @JoinColumn(name = "employee_id", referencedColumnName = "employeeID")
    private Employee employee;
}
