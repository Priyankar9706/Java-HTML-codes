package com.practice.demo;

import java.util.ArrayList;

public class showEmp {
	public static void main(String[] args) {
		ArrayList<abs> abs=new ArrayList<abs>();
		abs.add(new abs(1,"Sohan","Delhi",20000)) ;
		abs.add(new abs(2,"Rahul","Assam",50000));
		abs.add(new abs(3,"Kamlesh","Rajasthan",80000));
		abs.add(new abs(4,"Riya","Delhi",25000));
		abs.add(new abs(5,"Nihar","Mumbai",58000));
		abs.forEach(li->System.out.println(li.toString()));
		
	}
}
