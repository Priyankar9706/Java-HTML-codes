package com.mile1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mile1.bean.Student;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentTest {
	@Test
	public void TC1() {
		Student s=new Student("Ram",new int[] {90,60,93});
		StudentReport sr=new StudentReport();
		String str1=sr.validate(s);
		assertEquals("VALID",str1);
		String str2=sr.findGrades(s);
		assertEquals("grade is "+'"'+"A"+'"',str2);
	}
	@Test
	public void TC2() {
		Student s=new Student("Rohan",new int[] {40,60,93});
		StudentReport sr=new StudentReport();
		String str1=sr.validate(s);
		assertEquals("VALID",str1);
		String str2=sr.findGrades(s);
		assertEquals("grade is "+'"'+"B"+'"',str2);
	}
	@Test
	public void TC3() {
		Student s=new Student("Rohan",new int[] {30,60,93});
		StudentReport sr=new StudentReport();
		String str1=sr.validate(s);
		assertEquals("VALID",str1);
		String str2=sr.findGrades(s);
		assertEquals("grade is "+'"'+"F"+'"',str2);
	}
	@Test
	public void TC4() {
		Student s=null;
		StudentReport sr=new StudentReport();
		String str1=sr.validate(s);
		assertEquals("object is null",str1);
		
	}
	@Test
	public void TC5() {
		Student s=new Student(null,new int[] {30,60,93});
		StudentReport sr=new StudentReport();
		String str1=sr.validate(s);
		assertEquals("name is null",str1);
		
	}
	@Test
	public void TC6() {
		Student s=new Student("Rohan",null);
		StudentReport sr=new StudentReport();
		String str1=sr.validate(s);
		assertEquals("mark array is null",str1);
		
	}
	@Test
	public void TC7() {
		Student[] s=new Student[3];
		s[0]=new Student("Harsh",null);
		s[1]=new Student(null,new int[] {51,45,66});
		s[2]=null;
		StudentService ss=new StudentService();
		int x=ss.findNumberOfNullName(s);
		assertEquals(1,x);
		
	}
	@Test
	public void TC8() {
		Student[] s=new Student[3];
		s[0]=new Student("Harsh",null);
		s[1]=new Student(null,new int[] {51,45,66});
		s[2]=null;
		StudentService ss=new StudentService();
		int x=ss.findNumberOfNullObjects(s);
		assertEquals(1,x);
		
	}
	@Test
	public void TC9() {
		Student[] s=new Student[3];
		s[0]=new Student("Harsh",null);
		s[1]=new Student(null,new int[] {51,45,66});
		s[2]=null;
		StudentService ss=new StudentService();
		int x=ss.findNumberOfNullMarksArray(s);
		assertEquals(1,x);
		
	}
	public static void main(String[] args) {
		StudentTest st=new StudentTest();
		st.TC1();
		st.TC2();
		st.TC3();
		st.TC4();
		st.TC5();
		st.TC6();
		st.TC7();
		st.TC8();
		st.TC9();
	}
}
