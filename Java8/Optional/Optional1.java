package com.practice.demo;

import java.util.Optional;

public class Optional1 {
	String names[]=new String[5];
	public static void main(String[] args) {
		Optional1 obj=new Optional1();
		
		Optional<String> n=Optional.ofNullable(obj.names[0]);
		if(n.isPresent()) {
			System.out.println(obj.names[0].length());
		}else {
			System.out.println("The string is null");
		}
	}
		
}
