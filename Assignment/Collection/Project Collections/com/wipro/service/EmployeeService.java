package com.wipro.service;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.wipro.bean.EmployeeBean;

public class EmployeeService {
	private List<EmployeeBean> listEmp=new ArrayList<>();
	public boolean insertEmployee(EmployeeBean bean) {
		listEmp.add(bean);
		return true;
	}
	public String insertEmployeeByPosition(EmployeeBean bean,int position) {
		if(position>0 && position<listEmp.size()+1) {
		listEmp.add(position-1, bean);
		return "Inserted employee at position: "+position;
		}else {
			listEmp.add(bean);
			return "Inserted employee at end position: "+listEmp.size();
		}
		}
	public List<EmployeeBean> fetchAllEmployees(){
		if(listEmp.isEmpty()) {
			return null;
		}else {
			return listEmp;
		}
	}
	public boolean deleteEmployeeByEmpID(int empID) {
		for(int i=0;i<listEmp.size();i++) {
			if(listEmp.get(i).getEmpID()==empID) {
				listEmp.remove(i);
				return true;
			}
		}
		return false;
	}
	public boolean updateEmployeeByEmpID(int id) {
		ListIterator<EmployeeBean> li=listEmp.listIterator();
		
		while(li.hasNext()) {
			if(li.next().getEmpID()==id){
				System.out.println("What do you want to upate?");
				System.out.println("1. Name");
				System.out.println("2. Designation");
				System.out.println("3. Salary");
				Scanner sc =new Scanner(System.in);
				int n=sc.nextInt();
				sc.nextLine();
				switch(n) {
				case 1:System.out.println("Enter the new name: ");
					   li.next().setName(sc.nextLine());
					   System.out.println("Name updated successfully...");
					   return true;
				case 2:System.out.println("Enter the new designation: ");
					   li.next().setDesignation(sc.nextLine());
					   System.out.println("Designation updated successfully...");
					   return true;
				case 3:System.out.println("Enter the new salary: ");
				   	   li.next().setSalary(sc.nextFloat());
				   	   System.out.println("Salary updated successfully...");
				   	   return true;
				default:return false;
				}
			}
			
		}
		return false;
	}
	public EmployeeBean findEmployeeByEmpID(int empID) {
		ListIterator<EmployeeBean> li=listEmp.listIterator();
		
		while(li.hasNext()) {
			if(li.next().getEmpID()==empID){
				return li.previous();
			}
			
	}
		return null;
	
	
}
}
