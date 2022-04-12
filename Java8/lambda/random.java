package com.practice.demo;

import java.util.ArrayList;
import java.util.Random;

public class random {
		public static void main(String[] args) {
			ArrayList<Integer> al=new ArrayList<Integer>();
			Random rand =new Random();
			for(int i=0;i<25;i++) {
				al.add(rand.nextInt(50));
			}
			al.forEach(x->System.out.print(x+" "));
			
		}
}
