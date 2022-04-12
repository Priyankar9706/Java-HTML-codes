package com.practice.demo;

import java.util.ArrayList;
import java.util.function.Consumer;

public class function6 {
	static ArrayList<String> list;
	public static void main(String[] args) {
		list=new ArrayList<String>();
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
		
		
		c1.accept(list);
		list.forEach(System.out::println);
	}
	public static Consumer<ArrayList<String>> c1=new Consumer<ArrayList<String>>(){
		@Override
		public void accept(ArrayList<String> s) {
			for(int i=0;i<s.size();i++) {
				StringBuilder sb=new StringBuilder(s.get(i));
				list.set(i, sb.reverse().toString());
			}
		}
	};
}
