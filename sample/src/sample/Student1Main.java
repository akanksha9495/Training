package sample;

import java.util.ArrayList;
import java.util.Scanner;

public class Student1Main {
    public static void main(String[] args) {
        ArrayList<Student1> studentList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details of 3 students:");

        for (int i = 0; i < 3; i++) {
            System.out.print("Student " + (i + 1) + " Name: ");
            String name = sc.nextLine();

            System.out.print("Student " + (i + 1) + " Reg No: ");
            int regno = sc.nextInt();
            sc.nextLine(); 

            studentList.add(new Student1(regno, name));
        }

        System.out.println("Student Details");
        for (Student1 student : studentList) {
            System.out.println("Reg No: " + student.regno() + ", Name: " + student.stdname());
        }

       
    }
}
