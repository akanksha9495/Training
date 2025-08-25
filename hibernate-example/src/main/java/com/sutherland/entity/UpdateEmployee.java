package com.sutherland.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateEmployee {
	public static void main(String[] args) {
		Configuration config =new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory =config.buildSessionFactory();
		Session session= factory.openSession();
		Transaction tran=session.beginTransaction();
		
		Employee  emp1=session.get(Employee.class, 3456);
		emp1.setEmpName("charles Babbage");
		session.save(emp1);
		//session.remove(emp1);
tran.commit();
session.close();
factory.close();
}
}
