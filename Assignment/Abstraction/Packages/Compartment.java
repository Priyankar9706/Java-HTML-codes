package com.wipro.automobile.ship;
public class Compartment{
	int height;
	int width;
	int breadth;
	Compartment(int height,int width,int breadth){
		
		this.height=height;
		this.width=width;
		this.breadth=breadth;

	}
	public static void main(String[] args){
		Compartment c=new Compartment(30,60,20);
		System.out.println("Height = "+c.height);
		System.out.println("Width =  "+c.width);
		System.out.println("Breadth =  "+c.breadth);
	
	
	}
			
		

	}