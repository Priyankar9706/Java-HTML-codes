package com.practice.demo;

import java.sql.*;
public class OracleConnection{

	public static void main(String[] args){
	//	Class c=Class.forName("oracle.jdbc.driver.OracleDriver");

		String dbURL="jdbc:oracle:thin:@localhost:1521:xe";
		String username="hr";
		String password="hr";
		try{
		Connection connection=DriverManager.getConnection(dbURL,username,password);
		System.out.println("Connection Established successfully");
		}catch(SQLException e){
		System.out.println("Connection could not be established");
		e.printStackTrace();
		}

	
	}
		
}
