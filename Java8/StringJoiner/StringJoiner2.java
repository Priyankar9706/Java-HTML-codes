package com.practice.demo;

import java.util.StringJoiner;

public class StringJoiner2 {
	public static void main(String[] args) {
		StringJoiner s1=new StringJoiner("-");
		StringJoiner s2=new StringJoiner("-");
		s1.add("Aditya");
		s1.add("Bishal");
		s1.add("Chirag");
		s2.add("Dibakar");
		s2.add("Eena");
		s2.add("Faruk");
		System.out.println("s1 mergerd to s2 "+s2.merge(s1));	
		System.out.println("s2 mergerd to s1 "+s1.merge(s2));			
				
	}
}
