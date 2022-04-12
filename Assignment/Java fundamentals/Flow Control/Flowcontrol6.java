class Flowcontrol6{
	public static void main(String[] args){
		String gender=args[0];
		int age=Integer.parseInt(args[1]);
		
		switch(gender){
		case "Female": if(age>=1 && age<=58)
				{System.out.print("8.2%");}
				else{System.out.print("9.2%");}
		case "Male": if(age>=1 && age<=58)
				{System.out.print("8.2%");}
				else{System.out.print("10.5%");}
		}
	
	}
}