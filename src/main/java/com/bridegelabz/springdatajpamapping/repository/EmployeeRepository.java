package com.bridegelabz.springdatajpamapping.repository;

import com.bridegelabz.springdatajpamapping.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
