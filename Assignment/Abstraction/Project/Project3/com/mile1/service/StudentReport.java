package com.mile1.service;
import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
public class StudentReport{
	public String findGrades(Student studentObject){
		int sum=0;
		for(int i=0;i<studentObject.marks.length;i++){
			if(studentObject.marks[i]<35){
			return "grade is "+'"'+ "F"+'"';
			}else{
			sum=sum+studentObject.marks[i];
			}
		}
		if(sum<150){return "grade is "+'"'+ "C"+'"'; }
		else if(sum<200){return "grade is "+'"'+ "B"+'"';}
		else if(sum<250){return "grade is "+'"'+ "A"+'"';}
		else {return "grade is "+'"'+ "A+"+'"';}
	}
	public String validate(Student s){
		try{
		if(s==null){
		throw new NullStudentObjectException();
			}
		else if(s.name==null){
		throw new NullNameException();
		}
		else if(s.marks==null){
		throw new NullMarksArrayException();
		}
		else{ return "VALID";}
		}catch(Exception e){
		System.out.println(e.toString());
		return e.toString();
	}
	
	}
	
}
