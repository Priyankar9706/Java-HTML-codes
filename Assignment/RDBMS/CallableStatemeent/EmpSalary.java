package com.practice.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpSalary {
	static Connection connection;
	static String employee="EMPLOYEES";
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			String dbURL="jdbc:oracle:thin:@localhost:1521:xe";
			String username="hr";
			String password="hr";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		    connection=DriverManager.getConnection(dbURL,username,password);
		    int n=Integer.parseInt(args[0]);
		    PreparedStatement ps=connection.prepareStatement("SELECT * FROM "+employee+" WHERE EMPLOYEE_ID=?");
		    ps.setInt(1, n);
		 
			ResultSet rs=ps.executeQuery();
			int salary=0;
			while(rs.next()) {
				salary=rs.getInt(8);
				double commission=rs.getDouble(9)*salary;
				System.out.println(salary);
				double it=0;
				if(commission==0) {
					it=0.1*salary;
				}else if(commission<500) {
					it=0.15*salary;
				}else {
					it=0.2*salary;
				}
				double netsalary=salary+commission-it;
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+netsalary);
			}
			
			
			
		
			connection.close();
	}catch(SQLException e) {
		e.printStackTrace();
	}
}
}
