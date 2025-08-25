package com.suther.employee.main;

import java.util.List;

import com.suther.employee.beans.Employee;
import com.suther.employee.dao.EmployeeDao;
import com.suther.employee.dao.EmployeeDaoImpl;

public class GetEmployeeList {
	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDaoImpl();
		List<Employee> list = dao.getEmployeeList();
		list.forEach((e)->
			System.out.println(e.getEmpcode()+e.getEmpname()+
					e.getSalary()+e.getDoj()));  
	}

}
