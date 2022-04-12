package com.practice.demo;

public class CheckPrime {

	
	CheckPrime(int n){
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				System.out.println("Not Prime");
				return;
			}
		}
		System.out.println("Prime");
	}
	public static void main(String[] args) {
		fact f=CheckPrime::new;
		f.check(47);
		
	}
		
}
