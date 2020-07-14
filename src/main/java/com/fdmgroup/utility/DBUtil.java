package com.fdmgroup.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static final String DB_URL = "jdbc:oracle:thin:Birva@//localhost:1521/xe";
	private static final String DB_USERNAME = "Birva";
	private static final String DB_PASSWORD = "123456";

	private static Connection conn = null;

	public static Connection getConnection() {
		if (conn == null) {
			try {
				conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return conn;
	}

	public static void closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
