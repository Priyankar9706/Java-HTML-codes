package com.practice.demo;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashSetDemo {
	static HashSet set=new HashSet<>();
	boolean addCountry(String countryName) {
		set.add(countryName);
		return true;
		
	}
	String findCountry(String countryName){
		if(set.contains(countryName)) {
		 return countryName;
		}else {
			return "Country Not Found";
		}
		
	}
	void printAllCountries() {
		
			        
			        Iterator i=set.iterator();
			        System.out.println("Using Iterator: ");
			        while(i.hasNext()) {
			        	System.out.println(i.next());
			        }
			        
		
		
		
	}
	public static void main(String[] args) {
		HashSetDemo hsd=new HashSetDemo();
		
		System.out.println(hsd.addCountry("India"));
		System.out.println(hsd.addCountry("USA"));
		System.out.println(hsd.addCountry("France"));
		System.out.println(hsd.addCountry("India"));

		System.out.println(hsd.findCountry("India"));
		System.out.println(hsd.findCountry("Russia"));

		hsd.printAllCountries();
		
	 
	}
}
