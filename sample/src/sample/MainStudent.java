package sample;

import java.util.ArrayList;
import java.util.Scanner;

public class MainStudent {
	public static void main(String[] args) {
		ArrayList<Student> studentlist=new ArrayList<Student>();
		System.out.println("enter details:");
		Scanner sc= new Scanner (System.in);
		
		for(int i=0;i<1;i++) {
			System.out.print("name: ");
			String name=sc.nextLine();
			System.out.print("regno:"); 
			int regno=sc.nextInt();
			sc.nextLine();
			System.out.print("sub1 marks:"); 
			int sub1=sc.nextInt();
			sc.nextLine();
			System.out.print("sub2 marks:"); 
			int sub2=sc.nextInt();
			sc.nextLine();
			System.out.print("sub3 marks:"); 
			int sub3=sc.nextInt();
			sc.nextLine();
			
			studentlist.add(new Student(regno,name,sub1,sub2,sub3));
		}
		
		
		for(Student std: studentlist) {
//			System.out.println(std.getRegno()+" "+ std.getStudentname()+" "+std.getSub1()+" "+std.getSub2()+" "+std.getSub3());
			 
			System.out.println(std.getStudentname());
			int total= std.getSub1()+std.getSub2()+ std.getSub3();
			double avg=total/3;
			System.out.println(avg);
			
			if(std.getSub1()<40 || std.getSub2()<40 || std.getSub3()<40) {
				System.out.println("fail");
			}
			else {
				System.out.println("pass");
			}
			
		}
	}
}
