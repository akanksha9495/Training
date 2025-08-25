package com.suther.employee.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class DatabaseConnection {
	private static Connection conn;
	public static Connection getDBConnection() {
		try { 
			DriverManager.registerDriver(new OracleDriver());
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"mlk","0912");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	public static void close() {
		try {
			conn.close();
		} catch (SQLException e) {
				e.printStackTrace();
		}
	}
}
