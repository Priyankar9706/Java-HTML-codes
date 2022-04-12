package com.wipro.test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestSort {
	@Test
	public void doSorting(){
		DailyTasks dt=new DailyTasks();
		int[] arr={1,5,7,4,3};
		int[] arr1={1,3,4,5,7};
		int[] arr2=dt.sortValues(arr);
		assertArrayEquals(arr1,arr2);
	}
	public static void main(String[] args) {
		TestSort ts=new TestSort();
		ts.doSorting();
		
	}
}
