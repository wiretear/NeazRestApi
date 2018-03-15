package com.era.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class  SpringDBConfig {

	private static final String DB_DRIVER_CLASS = "oracle.jdbc.driver.OracleDriver";
	private static final String DB_URL = "jdbc:oracle:thin:@10.11.201.251:1521:STLBAS";
	private static final String DB_USERNAME = "pass";
	private static final String DB_PASSWORD = "pass";
	
	public static Connection getConnection() {
		Connection con = null;
		try {
			// load the Driver Class
			Class.forName(DB_DRIVER_CLASS);

			// create the connection now
			con = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
