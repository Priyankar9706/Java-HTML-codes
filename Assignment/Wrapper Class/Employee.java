package com.practice.demo;

public class Employee implements Cloneable{
	double salary;
	String name;
	int year;
	Employee(String name,int year,double salary){
		this.name=name;
		this.year=year;
		this.salary=salary;
	}
	Employee cloneTest() {
		try {
			return (Employee) super.clone();
		}catch(CloneNotSupportedException e) {
			System.out.println("Cloning Not Allowed");
			return this;
			}
		
	}
	public static void main(String[] args) {
		Employee e1=new Employee("Ram",2015,30000);
		Employee e2;
		e2=e1.cloneTest();
		System.out.println("Name- "+e1.name+"\nSalary- "+e1.salary+"\nYear of joining- "+e1.year);
		System.out.println("Name- "+e2.name+"\nSalary- "+e2.salary+"\nYear of joining- "+e2.year);
		e1.name="Manoj";
		System.out.println("Name- "+e1.name+"\nSalary- "+e1.salary+"\nYear of joining- "+e1.year);
		System.out.println("Name- "+e2.name+"\nSalary- "+e2.salary+"\nYear of joining- "+e2.year);
		

	} 
	
}
