package com.practice.demo;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Function8 {
	static boolean isPrime(int n){
     
        if(n==1||n==0)return false;
        
        for(int i=2; i<n; i++){
              if(n%i==0)return false;
        }
    return true;
  }
	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		Supplier<ArrayList<Integer>> s=()->{
			int count=0;
			for(int i=2;i<100;i++) {
				if(isPrime(i)){
					l.add(i);
					count++;
				}
				if(count==10) {
					return l;
				}
			}
			return l;
		};
		s.get().forEach(System.out::println);
	}

}
