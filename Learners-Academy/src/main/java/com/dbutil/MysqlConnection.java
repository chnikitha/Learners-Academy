package com.dbutil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*; 


public class MysqlConnection {
	public static Connection connection;
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
	    return connection;
	}
}
