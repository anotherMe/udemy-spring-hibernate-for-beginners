package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	private static final String url = "jdbc:postgresql://192.168.1.203:5432/udemy-hibernate-demo";
	private static final String user = "hbstudent";
	private static final String password = "hbstudent";
	
	public static void main(String[] args) {
		
		try {
			
			Connection conn = DriverManager.getConnection(url, user, password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
