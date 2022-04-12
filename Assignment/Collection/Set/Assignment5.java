package com.practice.demo;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Assignment5 {
	
	public static void main(String[] args) {
		TreeSet<String> t=new TreeSet<String>();
		t.add("Charan");
		t.add("Gopal");
		t.add("Kishan");
		t.add("Ram");
		t.add("Rohit");
		Iterator iterator=t.descendingIterator();
		System.out.println("Reverse set contains: ");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		Iterator i=t.iterator();
		System.out.println("TreeSet contains: ");
		while(iterator.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println(t.contains("Ram"));
		System.out.println(t.contains("Biju"));
		
	}
	
}
