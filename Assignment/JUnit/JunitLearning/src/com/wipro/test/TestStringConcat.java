package com.wipro.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestStringConcat {
	@Test
	public void doconcat() {
		DailyTasks d=new DailyTasks();
		String s=d.doStringConcat("Hello","Ram");
		assertEquals("Hello Ram",s);
		
	}
	public static void main(String[] args) {
		TestStringConcat tsc=new TestStringConcat();
		tsc.doconcat();
		
	}
}
