package com.automobile.twowheeler;
import com.automobile.Vehicle;
public class Honda extends Vehicle{
	int speed=60;
	public String getModel(){	
		return "Honda";
	}
	public String getRegistrationNumber(){
		return "HD57856";
	}
	public String getOwnerName(){
	
		return "Rajdeep Roy";
		}
	public int getSpeed(){
		return speed;
	}
	public void radio(){
	System.out.println("Radio is available");
	}

}