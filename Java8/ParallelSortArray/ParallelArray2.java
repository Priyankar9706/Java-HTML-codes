package com.practice.demo;

import java.util.Arrays;
import java.util.Scanner;

public class ParallelArray2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] c=s.toCharArray();
		Arrays.parallelSort(c);
		String str="";
		for(int i=0;i<c.length;i++) {
			str=str+c[i];
		}
		System.out.println(str);
		
	}
}
