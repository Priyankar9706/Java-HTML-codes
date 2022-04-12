package com.practice.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DAOClass {
	
	static Connection connection;
	static String student="Student";
	
	
	public static void main(String[] args) {
		try {
		String dbURL="jdbc:oracle:thin:@localhost:1521:xe";
		String username="hr";
		String password="hr";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
	    connection=DriverManager.getConnection(dbURL,username,password);
		
		int n=Integer.parseInt(args[0]);
		switch (n) {
		case 1:insert(Integer.parseInt(args[1]),args[2],args[3],args[4],Integer.parseInt(args[5]));
				System.out.println("Data inserted successfully...");
				break;
		case 2:delete(Integer.parseInt(args[1]));
				System.out.println("Data deleted successfully...");
			   break;
		case 3:update(Integer.parseInt(args[1]),Integer.parseInt(args[2]));
				System.out.println("Data updated successfully..");
				break;
		case 4: if(args.length>1) {
				display(Integer.parseInt(args[1]));
				break;
				}else{
					displayAll();
					break;
				}
		default: System.out.println("Invalid input !!!");
		
		
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void displayAll() {
	
		try{
			PreparedStatement ps=connection.prepareStatement("SELECT * FROM "+student);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5));
			}
			connection.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static void display(int roll) {
		try{
			PreparedStatement ps=connection.prepareStatement("SELECT * FROM "+student+"where roll=?");
			ps.setInt(1, roll);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDate(4)+" "+rs.getInt(5));
			}
			connection.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static void update(int roll, int fee) {
		try{
			PreparedStatement ps=connection.prepareStatement("Update"+student+"set fee=? where roll=?");
			ps.setInt(1, roll);
			ps.setInt(2, fee);
			ps.executeUpdate();
			connection.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static void delete(int roll) {
		try{
			PreparedStatement ps=connection.prepareStatement("DELETE FROM"+student+" where Roll=?");
			ps.setInt(1, roll);
			ps.executeUpdate();
			connection.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void insert(int roll, String name, String c, String dob, int fee) {
		try{
			PreparedStatement ps=connection.prepareStatement("INSERT INTO "+student+" VALUES(?,?,?,?,?)");
		    Date date=new SimpleDateFormat("dd-MMM-yyyy").parse(dob);  
			ps.setInt(1, roll);
			ps.setString(2,name);
			ps.setString(3, c);
			ps.setString(4, dob);
			ps.setInt(5, fee);
			ps.executeUpdate();
			connection.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
