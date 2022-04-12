package com.practice.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class Function3{
	

		public static void main(String[] args) {
			List<String> list = Arrays.asList("apple","radar","reviver","civic","level","fruit","mango","eye","hey","ten");
			list.stream().filter(x->pred.test(x)).forEach(System.out::println);

			
		}

	
	 public static Predicate<String> pred = new Predicate<String>() {
	@Override
	public boolean test(String t) {
		StringBuilder sb= new StringBuilder(t);
		return t.equalsIgnoreCase(sb.reverse().toString());
	
		
		
	}
};
}