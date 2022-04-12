package com.practice.demo;

import java.time.LocalDate;

public class DateTimeAPI4 {

	public static void main(String[] args) {
		LocalDate l=LocalDate.now();
		if(l.isLeapYear())
			System.out.println("This year is a leap year");
		else{
			System.out.println("This s not a leap year");
		}
	}	

}
