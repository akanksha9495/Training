package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeList {
public static void main(String[] args) {
	ArrayList<Employee> emplist=new ArrayList<Employee>();
	emplist.add(new Employee(201, "sutherland",5000));
	emplist.add(new Employee(501,"james gosling",8000));
	Collections.sort(emplist);
	for(Employee emp: emplist)
//		System.out.println(emp);
		System.out.println(emp.getCode()+" "+emp.getEmpname()+" "+ emp.getSalary());
	//namewise sorting
	Collections.sort(emplist,(emp1,emp2)->{
		return emp1.getEmpname().compareTo(emp2.getEmpname());
		
	});
	for(Employee emp:emplist)
		System.out.println(emp.getCode()+" "+emp.getEmpname()+" "+ emp.getSalary());
	
	
	//salarywise sorting
	Collections.sort(emplist,(emp1,emp2)->{
		return (int)(emp2.getSalary()-emp1.getSalary());
	});
	for(Employee emp:emplist)
		System.out.println(emp.getCode()+" "+emp.getEmpname()+" "+ emp.getSalary());
	
	//predicate
	List<Employee> salarywise=emplist.stream().filter((emp)->emp.getSalary()>7000).map((e)->e).collect(Collectors.toList());
	salarywise.forEach((e)->System.out.println(e));
	Optional<Employee> emp1= emplist.stream().filter((emp)-> emp.getCode()==201).map(employee->employee).findFirst();
	if(emp1.isEmpty())
		System.out.println("employee details not found..");
		else
			System.out.println(emp1);
	

			//take i/p from user
	Scanner sc=new Scanner(System.in);
	try {
	System.out.print("enter employee id: ");
	int id=sc.nextInt();
	
	Optional<Employee> empOpt=emplist.stream().filter(emp->emp.getCode() ==id).findFirst();
	if(empOpt.isPresent()) {
		Employee emp=empOpt.get();
		System.out.println("Employee details found..");
		System.out.println("Code:"+emp.getCode());
		System.out.println("Name:"+emp.getEmpname());
		System.out.println("Salary:"+emp.getSalary());
	}
	else
		System.out.println("Employee details not found..");
	}
	catch(Exception e) {
		System.out.println("Invalid input! pls enter valid id");
	}

			
	
}
}

//Predicate<Employee> checkCode= emp->emp.getCode()==101;
//try{
//Employee emp =emplist.stream().filter(checkCode).map(e->e).findFirst().orElseThrow(()->new EmployeeNotFoundException());
//system.out.println(emp);
//}

//catch(EmployeenotFoundException e){
//system.out.println(e.getMessage());
//}
