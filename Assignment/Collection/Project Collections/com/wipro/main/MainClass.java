package com.wipro.main;

import java.util.Scanner;

import com.wipro.bean.EmployeeBean;
import com.wipro.service.EmployeeService;

public class MainClass {

	public static void main(String[] args) {
		EmployeeService es=new EmployeeService();
		boolean flag=true;
		while(flag){
			
			System.out.println("MAIN MENU");
			System.out.println("1. Add Employee");
			System.out.println("2. Add Employee By Positon");
			System.out.println("3. List All Employee");
			System.out.println("4. Delete Employee");
			System.out.println("5. Update Employee");
			System.out.println("6. Find Employee");
			System.out.println("7. Exit");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			switch(n){
				case 1:EmployeeBean bean =new EmployeeBean();
					   System.out.print("Enter Employee Id: ");
					   bean.setEmpID(sc.nextInt());
					   sc.nextLine();
					   System.out.print("\nEnter Employee Name: ");
					   bean.setName(sc.nextLine());
					   System.out.print("\nEnter Employee Designation: ");
					   bean.setDesignation(sc.nextLine());
					   System.out.print("\nEnter Employee Salary: ");
					   bean.setSalary(sc.nextFloat());
					   if(es.insertEmployee(bean)) {
						   System.out.println("\nEmployee added successfully...");
					   }else {
						   System.out.println("\nEmployee was not added !!! ");
					   }
					   break;
				case 2:EmployeeBean bean2 =new EmployeeBean();
				   System.out.print("Enter Employee Id: ");
				   bean2.setEmpID(sc.nextInt());
				   sc.nextLine();
				   System.out.print("\nEnter Employee Name: ");
				   bean2.setName(sc.nextLine());
				   System.out.print("\nEnter Employee Designation: ");
				   bean2.setDesignation(sc.nextLine());
				   System.out.print("\nEnter Employee Salary: ");
				   bean2.setSalary(sc.nextFloat());
				   System.out.println("Enter the positon no.: ");
				   int pos=sc.nextInt();
				   System.out.println(es.insertEmployeeByPosition(bean2, pos));
				   break;
				case 3:for(int i=0;i<es.fetchAllEmployees().size();i++) {
					   System.out.println(es.fetchAllEmployees().get(i).toString());
						}
						break;
				case 4:System.out.println("Enter the emloyee id to be deleted: ");
						int id=sc.nextInt();
						if(es.deleteEmployeeByEmpID(id)) {
							 System.out.println("\nEmployee deleted successfully...");
						   }else {
							   System.out.println("\nEmployee  not found !!! ");
						   }
						break;
				case 5:System.out.println("Enter the emloyee id to be updated: ");
					int id2=sc.nextInt();
					es.updateEmployeeByEmpID(id2);
					break;
				case 6:System.out.println("Enter the id of the employee to be found: ");
						int id3=sc.nextInt();
						if(es.findEmployeeByEmpID(id3)!=null) {
						System.out.print(es.findEmployeeByEmpID(id3).toString());
						}else {
							System.out.println("No employee with the given iid was found...");
						}
						break;
				case 7: flag=false;
						System.out.println("Thankyou....Exiting the system");
					  
			}
		}

	}

}
