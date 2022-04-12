package com.practice.demo;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Function5 {
	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(24);
		l.add(64);
		l.add(16);
		l.add(8);
		l.add(6);
		l.add(80);
		l.add(81);
		l.add(121);
		l.add(101);
		l.add(18);
		Predicate<Integer> p=x->Math.floor(Math.sqrt(x))-Math.sqrt(x)==0;
		l.stream().filter(p).forEach(System.out::println);
	}
}
