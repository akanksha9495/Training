package com.suther.employee.main;

import com.suther.employee.beans.Employee;
import com.suther.employee.dao.EmployeeDao;
import com.suther.employee.dao.EmployeeDaoImpl;

public class AddEmployee {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpcode(102);
		emp.setEmpname("charles babbage");
		emp.setSalary(75000);
		emp.setDoj("06-08-1955");
		EmployeeDao dao = new EmployeeDaoImpl();
		int rows = dao.addEmployee(emp);
		if(rows>0)
			System.out.println("inserted");
		else
			System.out.println("not inserted");  
	}

}
