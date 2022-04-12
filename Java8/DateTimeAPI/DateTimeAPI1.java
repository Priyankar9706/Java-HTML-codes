package com.practice.demo;

import java.time.LocalDate;

public class DateTimeAPI1 {

	public static void main(String[] args) {
	
		LocalDate ld=LocalDate.now();
		System.out.println("Today Date "+ld);
		System.out.println("Date after 10 days "+ld.plusDays(10));
	}

}
