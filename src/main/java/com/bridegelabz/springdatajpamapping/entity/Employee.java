package com.bridegelabz.springdatajpamapping.entity;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.transaction.Transactional;

@Entity
@Transactional
@NoArgsConstructor
@Table(name = "employee_details")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "emp_id")
    private Long empId;
    private String empName;
    private Integer empAge;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_add_id")
    private Address address;
}
