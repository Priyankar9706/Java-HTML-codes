package com.practice.demo;

import java.util.Optional;

public class Optional3 {

	public static void main(String[] args) throws InvalidEmployeeException {
		try {
		abs a = null;
		
		Optional<abs> n=Optional.ofNullable(a);
		if(n.isPresent()) {
			System.out.println(a.toString());
		}else {

			throw new InvalidEmployeeException("Employee object is null");		
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
