package com.practice.demo;

import java.util.Arrays;

public class ParallelArray3 {
	public static void main(String[] args) {
		int[] arr= {24,54,16,57,5,6,478,33,10,11};
		Arrays.parallelSort(arr, 0, 5);
		for(int i=0;i<10;i++) {
		System.out.print(arr[i]+" ");
		}
	}
}
