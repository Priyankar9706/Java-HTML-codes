package com.practice.demo;

import java.util.Scanner;

public class StringFormat {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String s=Integer.toBinaryString(n);

	System.out.println(String.format("%08d",Integer.parseInt(s)));	
	
	}
}
