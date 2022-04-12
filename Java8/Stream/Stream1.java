package com.practice.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream1 {

	public static void main(String[] args) {
		ArrayList<Integer> li=new ArrayList<Integer>();
		li.add(3);
		li.add(-3);
		li.add(55);
		li.add(25);
		li.add(-22);
		li.add(-12);
		li.add(-98);
		li.add(87);
	List<Integer> list=	li.stream()
		.filter(x->x%2==0 && x<0)
		.collect(Collectors.toList());
	System.out.println(list);
		
	}

}
