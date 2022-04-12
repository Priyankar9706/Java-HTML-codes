package com.example2;

import java.util.Arrays;

public class LambdaExpressionImpl2 implements Test {

	@Override
	public int myFunction(int a, int b, int c) {
		return (int) Arrays.asList(a,b,c).stream().reduce(1, (x,y)->x*y);
	}

}
