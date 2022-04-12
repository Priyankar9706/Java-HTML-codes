package com.practice.demo;

import java.time.LocalTime;

public class DateTimeAPI5 {

	public static void main(String[] args) {
		LocalTime l=LocalTime.now();
		System.out.println("Current time: "+l);
		System.out.println("Time after 25 minutes: "+l.plusMinutes(25));

	}

}
