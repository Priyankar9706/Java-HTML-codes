package com.practice.demo;

import java.time.DayOfWeek;
import java.time.LocalDate;

import java.time.temporal.TemporalAdjusters;

public class DateTimeAPI2 {

	public static void main(String[] args) {
		LocalDate current = LocalDate.now().plusMonths(1);
	
		LocalDate date=current.with(TemporalAdjusters.dayOfWeekInMonth(2,DayOfWeek.SUNDAY));
		System.out.println("Date of 2nd Sunday of nextMonth is "+date);
		    
	
		}
	}
	

