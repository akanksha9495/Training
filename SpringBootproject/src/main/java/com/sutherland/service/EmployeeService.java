package com.sutherland.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sutherland.beans.Employee;

@Service
public class EmployeeService {
static List<Employee> emplist;
static {
	emplist=Arrays.asList(new Employee(302,"reactjs",7000),
			new Employee(101,"spring",5000),
			new Employee(201,"james",8000),
			new Employee(221,"charles",8000),
			new Employee(301,"abcd",6000),
			new Employee(111,"sutherland",7000));
}

public List<Employee> getEmployeeList()
{return emplist;}
}
