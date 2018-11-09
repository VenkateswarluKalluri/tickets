package com.tickets.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConn {
	public static Connection getConn() throws ClassNotFoundException, SQLException {

		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection	 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training","root","root123");

	return con ;
	}

}

