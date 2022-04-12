package com.practice.demo;

import java.time.LocalTime;

public class DateTimeAPI6 {
	public static void main(String[] args) {
		LocalTime l=LocalTime.now();
	
		System.out.println("Current time: "+l);
		System.out.println("Time before 5 hour & 30 minutes: "+l.minusHours(5).minusMinutes(30));

	}
}
