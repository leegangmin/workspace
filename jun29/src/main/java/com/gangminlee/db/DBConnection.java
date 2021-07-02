package com.gangminlee.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection dbConnection() {
		Connection conn = null;
		// String url="jdbc:mariadb://127.0.0.1:3306";
		// String url="jdbc:mariadb://localhost:3306";
		String url = "jdbc:mariadb://220.70.33.29:3306/gangminlee";

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(url, "gangminlee", "01234567");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
