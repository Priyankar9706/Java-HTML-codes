package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class jdbcMain {
	static Connection connection;
	static String s="Demo";
	String dbURL="jdbc:oracle:thin:@localhost:1521:xe";
	String username="hr";
	String password="hr";
	
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			jdbcMain j=new jdbcMain();
			
			System.out.println(j.getUserType("AB1001"));
			System.out.println(j.getIncorrectAttempts("TA1002"));
			System.out.println(j.changeUserType("RS1003"));
			System.out.println(j.getLockStatus());
			System.out.println(j.changeName("AB1001", "Shivam"));
			System.out.println(j.changePassword("RS1111"));
			UserBean bean1=new UserBean("KN1004","KN1004","Ashish",3,2,"Employee");
			UserBean bean2=new UserBean("FN1005","FN1005","Ram",2,3,"Employee");
			System.out.println(j.addUser_1(bean1));
			System.out.println(j.addUser_2(bean2));
			System.out.println(j.getUsers("Admin"));
			System.out.println(j.storeAllRecords());
			String[] s=j.getNames();
			for(int a=0;a<s.length;a++) {
			System.out.print(s[a]+" ");
			}
			
		}catch(Exception e) {
			e.printStackTrace();;
		}
	}
	public String getUserType(String userID) {
		try {
		connection=DriverManager.getConnection(dbURL,username,password);	
		PreparedStatement ps=connection.prepareStatement("SELECT * FROM "+s+" WHERE userId=?");
		ps.setString(1, userID);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
		return rs.getString(6);
		}
		return null;
		
	}catch(Exception e) {
		e.printStackTrace();
		return null;
	}
	}
	
	public String getIncorrectAttempts(String userID) {
		try {
		connection=DriverManager.getConnection(dbURL,username,password);	
		PreparedStatement ps=connection.prepareStatement("SELECT * FROM "+s+" WHERE userId=?");
		ps.setString(1, userID);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
		if(rs.getInt(4)==0) {
			return "No Incorrect Attempt";
		}else if(rs.getInt(4)==1){
			return "One Time";
		}
		
		return "Incorrect Attempt Exceeded";
		}
		return "Incorrect Attempt Exceeded";
	}catch(Exception e) {
		e.printStackTrace();
		return null;
	}
	}
	
	public String changeUserType(String userID) {
		try {
		connection=DriverManager.getConnection(dbURL,username,password);	
		PreparedStatement ps=connection.prepareStatement("Update "+s+" set UserType=? WHERE userId=?");
		ps.setString(1, "Admin");
		ps.setString(2, userID);
		if(ps.executeUpdate()!=0) {
			return "Update Success";
		}else {
			return "Update Failed";
		}
		
		
	}catch(Exception e) {
		e.printStackTrace();
		return "";
	}
	}
	
	public int getLockStatus() {
		try {
		connection=DriverManager.getConnection(dbURL,username,password);	
		PreparedStatement ps=connection.prepareStatement("SELECT LockStatus FROM "+s);
		ResultSet rs=ps.executeQuery();
		int count=0;
		while(rs.next()) {
			if(rs.getInt(1)==0) {
				count++;
			}
		}
		return count;
		
	}catch(Exception e) {
		e.printStackTrace();
		return 0;
	}
	}
	
	public String changeName(String id,String name) {
		try {
			connection=DriverManager.getConnection(dbURL,username,password);	
			PreparedStatement ps=connection.prepareStatement("Update "+s+" set Name=? WHERE userId=?");
			ps.setString(1, name);
			ps.setString(2, id);
			if(ps.executeUpdate()!=0) {
				return "Success";
			}else {
				return "Failed";
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
			return "";
		}
	}
	
	public String changePassword(String pass) {
		try {
			connection=DriverManager.getConnection(dbURL,username,password);	
			PreparedStatement ps=connection.prepareStatement("Update "+s+" set Password=? WHERE UserType=?");
			
			ps.setString(1, pass);
			ps.setString(2, "Admin");
			if(ps.executeUpdate()!=0) {
				return "Changed";
			}else {
				return "0";
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
			return "";
		}
	}
	public String addUser_1(UserBean bean) {
		try {
			connection=DriverManager.getConnection(dbURL,username,password);	
			PreparedStatement ps=connection.prepareStatement("INSERT INTO "+s+" VALUES(?,?,?,?,?,?)");
			ps.setString(1, bean.getID());
			ps.setString(2, bean.getPassword());
			ps.setString(3, bean.getName());
			ps.setInt(4, bean.getIncorrectAttempts());
			ps.setInt(5, bean.getLockStatus());
			ps.setString(6, bean.getUserType());
			if(ps.executeUpdate()!=0) {
				return "Success";
			}else {
				return "Fail";
			
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			return "";
		}
		
	}
	
	public String addUser_2(UserBean bean) {
		try {
			connection=DriverManager.getConnection(dbURL,username,password);	
			PreparedStatement ps=connection.prepareStatement("INSERT INTO "+s+" VALUES(?,?,?,?,?,?)");
			ps.setString(1, bean.getID());
			ps.setString(2, bean.getPassword());
			ps.setString(3, bean.getName());
			ps.setInt(4, bean.getIncorrectAttempts());
			ps.setInt(5, bean.getLockStatus());
			ps.setString(6, bean.getUserType());
			if(ps.executeUpdate()!=0) {
				return "Success";
			}else {
				return "Fail";
			
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			return "";
		}
		
	}
	public ArrayList<UserBean> getUsers(String userType){
		ArrayList<UserBean> list=new ArrayList<UserBean>();
		try {
			connection=DriverManager.getConnection(dbURL,username,password);	
			PreparedStatement ps=connection.prepareStatement("SELECT * FROM "+s+" WHERE UserType=?");
			ps.setString(1, userType);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				UserBean u=new UserBean();
				u.setID(rs.getString(1));
				u.setPassword(rs.getString(2));
				u.setName(rs.getString(3));
				u.setIncorrectAttempts(rs.getInt(4));
				u.setLockStatus(rs.getInt(5));
				u.setUserType(rs.getString(6));
				list.add(u);
			}
			return list;
			
		}catch(Exception e) {
			e.printStackTrace();
			return list;
		}
	}
		
		public ArrayList<UserBean> storeAllRecords(){
			ArrayList<UserBean> l=new ArrayList<UserBean>();
			try {
				connection=DriverManager.getConnection(dbURL,username,password);	
				PreparedStatement ps=connection.prepareStatement("SELECT * FROM "+s);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					UserBean u=new UserBean();
					u.setID(rs.getString(1));
					u.setPassword(rs.getString(2));
					u.setName(rs.getString(3));
					u.setIncorrectAttempts(rs.getInt(4));
					u.setLockStatus(rs.getInt(5));
					u.setUserType(rs.getString(6));
					l.add(u);
				}
				return l;
				
			}catch(Exception e) {
				e.printStackTrace();
				return l;
			}
	}
	public String[] getNames() {
		
		try {
			connection=DriverManager.getConnection(dbURL,username,password);	
			PreparedStatement ps=connection.prepareStatement("SELECT Name FROM "+s);
			int rows=ps.executeUpdate();
			ResultSet rs=ps.executeQuery();
			
			
			String[] names=new String[rows];
			int i=0;
			while(rs.next()) {
				names[i]=rs.getString(1);
				i++;
			}
			return names;
			
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

