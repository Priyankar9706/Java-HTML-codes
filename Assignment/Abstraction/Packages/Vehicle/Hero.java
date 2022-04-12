package com.automobile.twowheeler;
import com.automobile.Vehicle;
	public class Hero extends Vehicle{
	int speed=80;
	public String getModel(){	
		return "Hero";
	}
	public String getRegistrationNumber(){
		return "HR91565";
	}
	public String getOwnerName(){
	
		return "Manash Singh";
		}
	public int getSpeed(){
		return speed;
	}
	public void cdplayer(){
		System.out.println("CD Player is available");
	}

}