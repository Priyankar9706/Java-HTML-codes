package com.practice.demo;

import java.util.Arrays;

public class TreeSetDemo {
	public static void main(String[] args)
	{
		Employee[] employeeArray = new Employee[4];

		employeeArray[0] = new Employee("Peter", 24, 80000);
		employeeArray[1] = new Employee("Ram", 12, 75000);
		employeeArray[2] = new Employee("Alex", 34, 120000);
		employeeArray[3] = new Employee("John", 28, 60000);

		System.out.println("Before Sort = " + Arrays.toString(employeeArray));

		EmployeeSalaryComparator employeeSalaryComparator = new EmployeeSalaryComparator();

		Arrays.sort(employeeArray, employeeSalaryComparator);
		System.out.println("\nAfter Sort = " + Arrays.toString(employeeArray));
	}
}
