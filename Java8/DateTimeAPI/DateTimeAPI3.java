package com.practice.demo;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class DateTimeAPI3 {

	public static void main(String[] args) {
		LocalDate joiningDate=LocalDate.of(2020,06,04);
		LocalDate current=LocalDate.now();
		System.out.println("Total Experience: "+Period.between(current, joiningDate).toString());

	}

}
