package day3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class EditDel {
	public static void main(String[] args) throws SQLException {
		
	DriverManager.registerDriver(new OracleDriver());
    String url = "jdbc:oracle:thin:@10.33.64.103:1521:xe";
    Connection conn = DriverManager.getConnection(url, "Akanksha", "Amyra2610");
    System.out.println("Connected");
    
    String editqry ="update student set stdname=? ,sub2=? where regno=?";
    PreparedStatement pst =conn.prepareStatement(editqry);
    pst.setString(1,"springframework");
    pst.setInt(2,101);
    pst.setInt(3,301);
    int rows= pst.executeUpdate();
    if(rows>0)
    	System.out.println("updated "+ rows);
    else
    	System.out.println("not-updated "+rows);
    
    String delqry="delete from student where regno=?";
    pst=conn.prepareStatement(delqry);
    pst.setInt(1,201);
    rows= pst.executeUpdate();
    if(rows>0)
    System.out.println("deleted "+ rows);
    else
    System.out.println("not-deleted "+ rows);	
}
}
