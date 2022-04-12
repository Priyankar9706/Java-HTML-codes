package com.practice.demo;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Function4 {
	public static void main(String[] args) {
			ArrayList<Employee> list=new ArrayList<Employee>();
			list.add(new Employee(101,"Ram",25000));
			list.add(new Employee(102,"Karan",15000));
			list.add(new Employee(103,"Bhriguraj",38000));
			list.add(new Employee(104,"Kishor",9000));
			list.add(new Employee(105,"Manpreet",8000));
			list.add(new Employee(106,"Bidit",15000));
			list.add(new Employee(108,"Moni",17500));
			list.add(new Employee(107,"Biju",2000));
			list.add(new Employee(109,"Pragyan",15000));
			Predicate<Employee> p=x->x.getSalary()<10000;
			list.stream().filter(p).forEach(System.out::println);
			
	}
}
