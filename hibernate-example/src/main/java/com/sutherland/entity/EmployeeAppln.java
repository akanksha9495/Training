package com.sutherland.entity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class EmployeeAppln {
public static void main(String[] args) {
	Configuration config =new Configuration();
	config.configure("hibernate.cfg.xml");
	SessionFactory factory =config.buildSessionFactory();
	Session session= factory.openSession();
	Transaction tran=session.beginTransaction();
	
Employee emp1=new Employee();
emp1.setEmpId(3456);
emp1.setEmpName("James Gosling");
emp1.setSalary(80000);

session.save(emp1);
tran.commit();
session.close();
factory.close();
}
}
