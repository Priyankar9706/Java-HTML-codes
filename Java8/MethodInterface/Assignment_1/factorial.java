package com.practice.demo;

public class factorial {

	
	public int myfactorial(int n) {
		if(n<=1)
			return 1;
		return n*myfactorial(n-1);
	}
	public static void main(String[] args) {
		factorial f=new factorial();
		fact fact=f::myfactorial;
		System.out.println(fact.factorial(5));
		
	}
		
}
