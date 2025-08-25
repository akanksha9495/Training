package jbbased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Core.annotations.Customer;

public class AccountMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Account acnt=ctx.getBean("getAccount",Account.class);
		
		System.out.println(acnt.getAcno()+" "+acnt.getBalance()+" "+acnt.getCustName());

	}

}
