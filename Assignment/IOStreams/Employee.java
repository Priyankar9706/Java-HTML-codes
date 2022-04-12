package com.practice.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee implements Serializable 
{
	private String name;
	private Date dateOfBirth;
	private String department;
	private String designation;
	private double Salary;
	
	Employee(){
		
	}
	Employee(String name,Date dateOfBirth,String department,String designation,double Salary){
		this.name=name;
		this.dateOfBirth=dateOfBirth;
		this.department=department;
		this.designation=designation;
		this.Salary=Salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dateOfBirth=" + dateOfBirth + ", department=" + department
				+ ", designation=" + designation + ", Salary=" + Salary + "]";
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		  Date date = new Date();
		  Employee e = new Employee("Ram",date,"Tech","Software Engineer",60000.0);
		  File file = new File("C:\\Users\\pinku\\Desktop\\data.txt");
		  FileOutputStream fileOut = new FileOutputStream(file);
		  ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
		  objectOut.writeObject(e);
		  objectOut.flush();
		  objectOut.close();
		  System.out.println("Serialization.....");
		  System.out.println("The Object  was succesfully written to a file");
		  
		  FileInputStream fileIn=new FileInputStream(file);
		  ObjectInputStream objectIn=new ObjectInputStream(fileIn);
		  String s= objectIn.readObject().toString();
		  objectIn.close();
		  System.out.println("Deserialization....");
		  System.out.println(s);
		  
		  
	}
}