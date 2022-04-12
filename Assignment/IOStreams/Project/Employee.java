package com.practice.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Employee implements Serializable 
{
	public void addEmployee() throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Employee ID: ");
		 int ID=sc.nextInt();
		 sc.nextLine();
		 System.out.print("\nEnter Employee Name: ");
		 String name=sc.nextLine();
		 System.out.print("\nEnter Employee Age: ");
		 int age=sc.nextInt();
		 System.out.println("\nEnter Employee Salary: ");
		 double Salary=sc.nextDouble();
		 String s=ID+" "+name+" "+age+" "+Salary;
		 File file=new File("C:\\Users\\pinku\\Desktop\\employee.txt");
		 BufferedWriter out = new BufferedWriter(new FileWriter(file,true));
		 out.write(s+"\n");
		 out.close();
		 System.out.println("Employee added successfully");
	}
	public void displayAll() {
		File file=new File("C:\\Users\\pinku\\Desktop\\employee.txt");
		 
		 String str ="";
			try {
				BufferedReader br = new BufferedReader(new FileReader(file));
		        String content;
		        while ((content = br.readLine()) != null) {
		        	System.out.println(content+"\n");
		        }
	} catch (IOException e) {
		e.printStackTrace();
	}
}
	public static void main(String[] args) throws IOException {
		boolean flag =true;
		while(flag) {
			Employee e=new Employee();
		System.out.println("Main Menu");
		System.out.println("1. Add an Employee");
		System.out.println("2. Display All");
		System.out.println("3. Exit");
		Scanner  sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch(n) {
		case 1:e.addEmployee();
			  break;
		case 2:e.displayAll();
			break;
		case 3:flag=false;
			   System.out.println("Exiting the System");
			   break;
	    default:System.out.println("Invalid Input!!!!");
		}
		
		}
		}
	
}