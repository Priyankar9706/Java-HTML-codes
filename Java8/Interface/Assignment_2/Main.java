package com.example2;

public class Main {

	public static void main(String[] args) {
		Test t1 = new LambdaExpressionImpl1();
		Test t2 = new LambdaExpressionImpl2();
		System.out.println(t1.myFunction(2, 3, 4));
		System.out.println(t2.myFunction(2, 3, 4));
	}

}
