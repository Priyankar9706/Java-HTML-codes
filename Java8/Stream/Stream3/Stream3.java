package com.practice.demo;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Stream3 {

	public static void main(String[] args) {
		
		ArrayList<Student> s=new ArrayList<Student>();
		s.add(new Student(1,"Rahul",96));
		s.add(new Student(2,"Suraj",65));
		s.add(new Student(3,"Apoorva",47));
		s.add(new Student(4,"Shikhar",42));
		s.add(new Student(1,"Suresh",39));
		ArrayList<Student> st=(ArrayList<Student>) s.stream()
							.filter(x->x.getMark()>=50)
							.collect(Collectors.toList());
		System.out.println("Total count is: "+st.size());
		
	}

}
