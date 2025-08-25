package com.sutherland.beans;



public class Employee {
	private int code;
	private String empname;
	private double Salary;
	
	public Employee(int code, String empname, double salary) {
		super();
		this.code = code;
		this.empname = empname;
		Salary = salary;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	
	
	}
