package com.practice.demo;

import java.util.TreeMap;

public class Assignment8 {
	public TreeMap<String,String> contactList=new TreeMap<String,String>();
	public String getPhoneNumber(String name) {
		if(contactList.containsKey(name)) {
			return contactList.get(name);
		}
		return "";
		
	}
	public String getName(String number) {
		if(contactList.containsValue(number)) {
			for(String s:contactList.keySet()) {
				if(contactList.get(s)==number) {
					return s;
				}
			}
		}
		return "";
		
	}
	public void printAll() {
		System.out.println("All Details->");
		for(String s:contactList.keySet()) {
			System.out.println(s+": "+contactList.get(s));
	}
	}
	public static void main(String[] args) {
		Assignment8 a=new Assignment8();
		a.contactList.put("Abhilash", "9547806423");
		a.contactList.put("Chirag",   "7002564556");
		a.contactList.put("Kishor",   "7844898555");
		a.contactList.put("Priyankar","6000050024");
		System.out.println("Phnone Number of Abhilash: "+a.getPhoneNumber("Abhilash"));
		System.out.println("Phone Number of Kishor: "+a.getPhoneNumber("Kishor"));
		
		System.out.println("Phnone Number of 9547806423 belongs to: "+a.getName("9547806423"));
		System.out.println("Phone Number of 6000050024 belongs to: "+a.getName("6000050024"));

		a.printAll();
	}
}
