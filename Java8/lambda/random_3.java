package com.practice.demo;

import java.util.ArrayList;


public class random_3 {
		public static void main(String[] args) {
			ArrayList<String> al=new ArrayList<String>();
			al.add("Akash");
			al.add("Harish");
			al.add("Naman");
			al.add("Tanmay");
			al.add("Anurag");
			al.add("Chirag");
			al.add("Naveed");
			al.add("Zakir");
			al.add("Anubhav");
			al.add("Vipul");
			
			
			al.forEach(l->{
					if(l.length()%2!=0){
						System.out.println(l+" ");
				
					}
					});
			
		}
}
