package com.bridegelabz.springdatajpamapping.controller;

import com.bridegelabz.springdatajpamapping.entity.Employee;
import com.bridegelabz.springdatajpamapping.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepository empRepository;
    @PostMapping("/saveEmployee")
    public ResponseEntity<String> saveEmployees(@RequestBody List<Employee> empData){
        empRepository.saveAll(empData);
        return ResponseEntity.ok("Data Saved");
    }
    
}
