package Core.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Core.Employee;

public class CustomerMain {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("annotationbased.xml");
		Customer cust =(Customer) ctx.getBean("cust",Customer.class);
		System.out.println(cust.getCode()+" "+cust.getCustName()+" "+cust.getAddress());

	}

}
