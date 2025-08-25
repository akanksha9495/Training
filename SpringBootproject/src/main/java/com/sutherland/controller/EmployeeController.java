package com.sutherland.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sutherland.beans.Employee;

import com.sutherland.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
@Autowired
EmployeeService service;

@GetMapping
public List<Employee> getEmployeeList(){
	return service.getEmployeeList();
}
}
