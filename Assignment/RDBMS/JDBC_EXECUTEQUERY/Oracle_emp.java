package com.practice.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Oracle_emp {

	public static void main(String[] args) {
	
		String dbURL="jdbc:oracle:thin:@localhost:1521:xe";
		String username="hr";
		String password="hr";
		try{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
		Connection connection=DriverManager.getConnection(dbURL,username,password);
		Statement stmt=connection.createStatement();
		ResultSet result=stmt.executeQuery("SELECT EMPLOYEE_ID,First_Name||' '||LAST_NAME AS ENAME FROM EMPLOYEES");

		while(result.next()) {
			System.out.println(result.getInt(1)+" "+result.getString("ENAME"));
		}
		
		}catch(SQLException e){
		System.out.println("Connection could not be established");
		e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}	

	}

}
