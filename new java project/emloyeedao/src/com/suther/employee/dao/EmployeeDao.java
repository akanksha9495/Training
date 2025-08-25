package com.suther.employee.dao;

import java.util.List;

import com.suther.employee.beans.Employee;

public interface EmployeeDao {
	int addEmployee(Employee emp);
	int updateEmployee(Employee emp);
	int deleteEmployee(int empcode);
	List<Employee> getEmployeeList();
	Employee findById(int empcode);
}
