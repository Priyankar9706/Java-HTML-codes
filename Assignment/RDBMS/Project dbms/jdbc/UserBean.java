package com.jdbc;

public class UserBean {
	private String ID;
	private String Password;
	private String Name;
	private int IncorrectAttempts;
	private int LockStatus;
	private String UserType;
	
	UserBean(){
		
	}
	UserBean(String id,String password,String name,int incorrectAttempts,int lockStatus,String userType){
		this.ID=id;
		this.Password=password;
		this.Name=name;
		this.IncorrectAttempts=incorrectAttempts;
		this.LockStatus=lockStatus;
		this.UserType=userType;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getIncorrectAttempts() {
		return IncorrectAttempts;
	}
	public void setIncorrectAttempts(int incorrectAttempts) {
		IncorrectAttempts = incorrectAttempts;
	}
	public int getLockStatus() {
		return LockStatus;
	}
	public void setLockStatus(int lockStatus) {
		LockStatus = lockStatus;
	}
	public String getUserType() {
		return UserType;
	}
	public void setUserType(String userType) {
		UserType = userType;
	}
	@Override
	public String toString() {
		return "UserBean [ID=" + ID + ", Password=" + Password + ", Name=" + Name + ", IncorrectAttempts="
				+ IncorrectAttempts + ", LockStatus=" + LockStatus + ", UserType=" + UserType + "]";
	}
	
	
}
