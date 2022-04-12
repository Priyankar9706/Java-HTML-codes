package com.practice.demo;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Function7 {
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
		Consumer<ArrayList<Integer>> c=list->{
			for(int i=0;i<list.size();i++) {
				if(list.get(i)%2==0) {
					System.out.println(list.get(i)+" even");
				}else {
					System.out.println(list.get(i)+" odd");
				}
			}
		};
		c.accept(l);
	}
}
