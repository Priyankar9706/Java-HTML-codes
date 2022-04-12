package com.example2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LambdaExpressionImpl1 implements Test {

	@Override
	public int myFunction(int a, int b, int c) {

		return  Arrays.asList(a,b,c).stream()
				.mapToInt(Integer::intValue)
				  .sum();
		
	}

}
