package com.example1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MyCLassWithLambda implements WordCount {

	@Override
	public int count(String s) {
		
		return (int) Arrays.asList(s.split(" ")).stream()
		.collect(Collectors.toList()).stream().count();
	}
	public static void main(String[] args) {
		WordCount l = new MyCLassWithLambda();
		System.out.println(l.count("Hey this is sheetal"));
	}
}
