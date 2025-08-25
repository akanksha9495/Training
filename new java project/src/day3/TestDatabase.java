package day3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class TestDatabase {
    public static void main(String[] args) throws SQLException {
    
        DriverManager.registerDriver(new OracleDriver());

        
        String url = "jdbc:oracle:thin:@10.33.64.103:1521:xe";
        Connection conn = DriverManager.getConnection(url, "Akanksha", "Amyra2610");
        System.out.println("Connected");

       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter customer Name: ");
        String name = scanner.nextLine();

        String qry = "insert into customer values(?, ?)";
        PreparedStatement pst = conn.prepareStatement(qry);
        pst.setInt(1, 101);
        pst.setString(2, "sutherland");

       
        int rows = pst.executeUpdate();
        System.out.println("Inserted " + rows + " row(s)");

        
       
        conn.close();
      
    }
}
