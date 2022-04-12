package com.practice.demo;

public class Car implements FourWheeler, Vehicle {
	public void message() {
		
		System.out.println("From Car class");
		
	}

	public static void main(String[] args) {
		
		Car c1=new Car();
		c1.message();
		Vehicle c2=new Car();
		c2.message();
		
	}
}
