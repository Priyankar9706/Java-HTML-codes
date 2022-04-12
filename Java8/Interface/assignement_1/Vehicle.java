package com.practice.demo;

public interface Vehicle {
	default void message() {
		System.out.println("Inside Vehicle");
	}
}
