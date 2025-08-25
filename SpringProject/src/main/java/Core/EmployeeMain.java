package Core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
	public static void main(String[] args) {
		
		Employee emp =(Employee) ctx.getBean("empl");
		System.out.println(emp.getCode()+" "+emp.getEmpname()+" "+emp.getAddr());

}
}