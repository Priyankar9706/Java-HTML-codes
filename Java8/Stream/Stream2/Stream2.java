package com.practice.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream2 {
	public static void main(String[] args) {
		List<abs> emp=new ArrayList<abs>();
		emp.add(new abs(101,"Rahul",28,"Delhi"));
		emp.add(new abs(102,"Shahrukh",34,"Gujarat"));
		emp.add(new abs(103,"Reshma",26,"Pune"));
		emp.add(new abs(104,"Saroj",28,"Mumbai"));
		emp.add(new abs(105,"Shanti",32,"Pune"));
		List<abs> newList=emp.stream()
		.filter(x->x.getLocation()=="Pune")
		.collect(Collectors.toList());
		System.out.println(newList.toString());
		
	}
}
