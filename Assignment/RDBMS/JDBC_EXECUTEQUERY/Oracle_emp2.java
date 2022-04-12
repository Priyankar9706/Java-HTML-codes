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
		ResultSet result=stmt.executeQuery("SELECT  First_Name||' '||LAST_NAME AS ENAME,JOB_ID,SALARY,COMMISSION_PCT FROM EMPLOYEES WHERE SALARY>1000 and SALARY<2000");

		while(result.next()) {
			
			System.out.println(result.getString(1)+result.getString(2)+result.getDouble(3)+result.getDouble(4));
		}
		System.out.println("No rows left.....");
		
		}catch(SQLException e){
		System.out.println("Connection could not be established");
		e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}	

	}

}
