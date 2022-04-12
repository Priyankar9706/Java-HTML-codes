package com.wipro.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestCheckPresence {
	@Test
	public void check(){
		DailyTasks dt=new DailyTasks();
		boolean b=dt.checkPresence("Hello","o");
		assertTrue(b);
		
		
		
		
	}
	public static void main(String[] args) {
		TestCheckPresence tcp=new TestCheckPresence();
		tcp.check();
		
	}
}
