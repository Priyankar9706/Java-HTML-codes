package com.practice.demo;

import java.util.ArrayList;

public class Function2 {
public static void main(String[] args) {
	ArrayList<Integer> li=new ArrayList<Integer>();
	li.add(25);
	li.add(1);
	li.add(37);
	li.add(65);
	li.add(41);
	li.add(50);
	li.add(97);
	li.add(56);
	li.add(85);
	li.add(80);
	int sum=0;
	for(Integer i:li) {
		sum=sum+i;
	}
	System.out.println("Sum: "+sum);
}
	
}
