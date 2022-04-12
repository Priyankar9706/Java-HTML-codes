package com.practice.demo;

import java.util.ArrayList;


public class weekdays{
		public static void main(String[] args) {
			ArrayList<String> al=new ArrayList<String>();
			al.add("Sunday");
			al.add("Monday");
			al.add("Tuesday");
			al.add("Wednesday");
			al.add("Thursday");
			al.add("Friday");
			al.add("Saturday");
			
			
			al.forEach(l->System.out.print(l+" "));
			
		}
}
