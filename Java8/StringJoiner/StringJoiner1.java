package com.practice.demo;

import java.util.ArrayList;
import java.util.StringJoiner;

public class StringJoiner1 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Ram");
		list.add("Karan");
		list.add("Bhriguraj");
		list.add("Kishor");
		list.add("Manpreet");
		list.add("Bidit");
		list.add("Moni");
		list.add("Biju");
		list.add("Pragyan");
		list.add("Rahul");
		StringJoiner s=new StringJoiner(",","{","}");
		for(int i=0;i<list.size();i++) {
			s.add(list.get(i));
		}
		System.out.println(s);

	}

}
