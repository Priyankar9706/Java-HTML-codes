package com.mile1.service;
import com.mile1.bean.Student;
public class StudentService{
	static	int count1=0;
	static int count2=0;
	static int count3=0;
	public int findNumberOfNullMarksArray(Student s[]){
	
	for(int i=0;i<s.length;i++){
	
	if(s[i]!=null && s[i].marks==null){count1++;}
		
	}
	return count1;
	
	}
	public int findNumberOfNullObjects(Student s[]){
	
	for(int i=0;i<s.length;i++){
	if(s[i]==null){count2++;}
		}
	return count2;
	
	}
	
	

	public int findNumberOfNullName(Student s[]){
		
		for(int i=0;i<s.length;i++){
	if(s[i]!=null && s[i].name==null){count3++;}
		
	}
	return count3;
}
}