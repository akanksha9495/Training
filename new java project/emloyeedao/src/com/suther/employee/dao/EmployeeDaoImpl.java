package com.suther.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.suther.employee.beans.Employee;
import com.suther.employee.utils.DatabaseConnection;
import com.suther.employee.utils.DateConvertion;

public class EmployeeDaoImpl implements EmployeeDao{
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	@Override
	public int addEmployee(Employee emp) {
		conn = DatabaseConnection.getDBConnection();
		int rows = 0;
		String qry = "insert into employee values(?,?,?,?)";
		try {
			pst = conn.prepareStatement(qry);
			pst.setInt(1, emp.getEmpcode());
			pst.setString(2, emp.getEmpname());
			pst.setDouble(3, emp.getSalary()); 
			pst.setDate(4, DateConvertion.convertDate(emp.getDoj())); 
			rows = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DatabaseConnection.close();
		return rows;
	}
	@Override
	public int updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int deleteEmployee(int empcode) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public List<Employee> getEmployeeList() {
		conn = DatabaseConnection.getDBConnection();
		String qry = "select * from employee";
		List<Employee> emplist = new ArrayList<Employee>();
		try {
			pst = conn.prepareStatement(qry);
			rs = pst.executeQuery();
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setEmpcode(rs.getInt(1));
				emp.setEmpname(rs.getString(2));
				emp.setSalary(rs.getDouble(3));
				emp.setDoj(rs.getDate(4).toString());
				emplist.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DatabaseConnection.close();
		return emplist;
	}
	@Override
	public Employee findById(int empcode) {
		// TODO Auto-generated method stub
		return null;
	}

}
