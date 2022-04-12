package com.practice.demo;

public class countDig {

	
	static int digitCount(int n) {
		int count=0;
		while(n!=0) {
			n=n/10;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		countDig f=new countDig();
		fact fact=countDig::digitCount;
		System.out.println(fact.digitCount(5455));
		
	}
		
}
