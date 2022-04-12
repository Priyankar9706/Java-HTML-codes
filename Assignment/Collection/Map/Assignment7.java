package com.practice.demo;

import java.util.ArrayList;
import java.util.HashMap;

public class Assignment7 {
	static HashMap<String,String> mapObj=new HashMap<String,String>();
	HashMap<String,String> mapObj2=new HashMap<String,String>();
	public String saveCountryCapital(String countryName,String capital){
		if(!this.mapObj.containsKey(countryName)) {
			this.mapObj.put(countryName, capital);
			return countryName+" added successfully";
		}else {
			return countryName+" already added";
		}
	}
	public String getCapital(String countryName) {
		if(mapObj.containsKey(countryName)) {
			return mapObj.get(countryName);
		}else {
			return "No Country Found";
		}
	}
	public String getCountry(String capitalName) {
		if(mapObj.containsValue(capitalName)) {
			for(String s:mapObj.keySet()) {
				if(mapObj.get(s)==capitalName) {
					return s;
				}
			}
		}else {
			return "No Capital Found";
		}
		return "";
	}
	
	public void copy(HashMap<String,String> mapObj1) {
		try {
			System.out.println("From mapObj2:");
			for(String str:mapObj.keySet()) {
				mapObj2.put(mapObj1.get(str), str);
				System.out.println(" Country: "+str+" Capital: "+mapObj1.get(str));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<String> country(){
		ArrayList<String> c1=new ArrayList<String>();
		for(String str:mapObj.keySet()) {
			c1.add(str);
		}
		return c1;
	}
	public ArrayList<String> capital(){
		ArrayList<String> c2=new ArrayList<String>();
		for(String str:mapObj.keySet()) {
			c2.add(mapObj.get(str));
		}
		return c2;
	}
	
	public static void main(String[] args){
		Assignment7 s=new Assignment7();
		System.out.println(s.saveCountryCapital("India", "NewDelhi"));
		System.out.println(s.saveCountryCapital("Japan", "Tokyo"));
		System.out.println(s.saveCountryCapital("Bangladesh", "Dhaka"));
		System.out.println(s.saveCountryCapital("India", "Delhi"));
		System.out.println(s.saveCountryCapital("England", "London"));	
		
		System.out.println("Capital of India :"+s.getCapital("India"));
		System.out.println("Capital of China :"+s.getCapital("China"));
		
		System.out.println("Country of NewDelhi :"+s.getCountry("NewDelhi"));
		System.out.println("Country of Brazil :"+s.getCountry("Brazil"));
		
		s.copy(mapObj);
		System.out.println("Country Names from arraylist: ");
		for(int x=0;x<s.country().size();x++){
			System.out.println(s.country().get(x));
		}
		System.out.println("Capital Names from arraylist: ");
		for(int x=0;x<s.capital().size();x++){
			System.out.println(s.capital().get(x));
		}
	}
}
