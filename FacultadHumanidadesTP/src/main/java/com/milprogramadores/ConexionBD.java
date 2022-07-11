package com.milprogramadores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBD {

	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL_BD = "jdbc:mysql://localhost:3306/facultad";
	private static final String USER = "root";
	private static final String PASS = "cristian";
	
	public static Statement getStatement() {
		Connection conn = null;
	try {
		conn = DriverManager.getConnection(URL_BD, USER, PASS);
		return conn.createStatement();
	}catch (SQLException exception ) {
		System.out.println(exception.getLocalizedMessage());
		return null;	
	}
	}	
}
