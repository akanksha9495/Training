package sample;

import java.util.Scanner;

public class CheckDaysInMonth {
public static void main(String[] args) {
	        
Scanner sc = new Scanner(System.in);

	 try {
	            System.out.print("Enter month name: ");
	            String input = sc.nextLine().toUpperCase(); 

	            Months month = Months.valueOf(input);
	            int days= getDays(month);
	            System.out.println("No. of days in given month " + input+ " is:"+ days);

	        } 
	 catch (IllegalArgumentException e) {
         try {
             throw new InvalidMonthException("Not a valid month.");
         } catch (InvalidMonthException ex) {
             System.out.println(ex.getMessage());
         }
     } finally {
         System.out.println("Program executes successfully.");
     }
 }
public  static int getDays(Months month) {
    switch (month) {
        case JANUARY:
        case MARCH:
        case MAY:
        case JULY:
        case AUGUST:
        case OCTOBER:
        case DECEMBER:
            return 31;

        case APRIL:
        case JUNE:
        case SEPTEMBER:
        case NOVEMBER:
            return 30;

        case FEBRUARY:
            return 28;

        default:
            return 0;
    }
}
	
	}



