package com.practice.demo;

public class abs {
	private int id;
	private String name;
	private int age;
	private String location;
	abs(int id,String name,int age,String address){
		this.id=id;
		this.name=name;
		this.location=address;
		this.age=age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "abs [id=" + id + ", name=" + name + ", age=" + age + ", location=" + location + "]";
	}
	
	
	
}
