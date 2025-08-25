package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class TestJdbc {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DriverManager.registerDriver(new OracleDriver());
		String url = "jdbc:oracle:thin:@10.32.2.139:1521:xe"; //IP4 address to be given in the place of localhost  for TNS protocol error
		Connection conn = DriverManager.getConnection(url, "abc", "123"); 
		System.out.println("connected");
		String qry = "insert into sample values(?,?,?)";
		PreparedStatement pst = conn.prepareStatement(qry);
		pst.setInt(1, 11);
		pst.setString(2, "james gosling");
		pst.setDouble(3, 500);
		int rows = pst.executeUpdate();
		System.out.println("inserted "+rows);  
	}

}
