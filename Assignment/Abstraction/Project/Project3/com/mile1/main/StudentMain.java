package com.mile1.main;
import com.mile1.bean.Student;
import com.mile1.service.StudentService;
import com.mile1.service.StudentReport;

public class StudentMain{

	static Student[] data=new Student[4];
	StudentMain(){
		
		this.data[0]=new Student("Sekar",new int[]{85,75,95});
		this.data[1]=new Student(null,new int[]{11,22,33});
		this.data[2]=null;
		this.data[3]=new Student("Manoj",null);
		}
	
	
	public static void main(String[] args){
	StudentMain sm=new StudentMain();
	
	StudentReport sr=new StudentReport();
	for(int i=0;i<sm.data.length;i++){
	
	if(sr.validate(sm.data[i]).equals("VALID")){
		System.out.print("VALID");
		System.out.println("-"+sr.findGrades(sm.data[i]));
	}
	}
	StudentService sso=new StudentService();
	System.out.println("Number of null marks in the data: "+sso.findNumberOfNullMarksArray(sm.data));
	System.out.println("Number of null names in the data: "+sso.findNumberOfNullName(sm.data));
	System.out.println("Number of null objects in the data: "+sso.findNumberOfNullObjects(sm.data));
	
}
	
	

}
	