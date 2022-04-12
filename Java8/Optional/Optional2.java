package com.practice.demo;

import java.util.Optional;

public class Optional2 {
	String address;
	public static void main(String[] args) {
		Optional2 obj=new Optional2();
		
		Optional<String> n=Optional.ofNullable(obj.address);
		if(n.isPresent()) {
			System.out.println(obj.address);
		}else {
			System.out.println("India");
		}
	}
}
