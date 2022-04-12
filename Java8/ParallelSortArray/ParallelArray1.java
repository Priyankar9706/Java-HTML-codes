package com.practice.demo;

import java.util.Arrays;

public class ParallelArray1 {
	public static void main(String[] args) {
		int[] arr= {24,54,16,57,5,95,478,33,10,11};
		Arrays.parallelSort(arr);
		System.out.println("MaxValue: "+arr[arr.length-1]);
		System.out.println("MinValue: "+arr[0]);
	
	}
}
