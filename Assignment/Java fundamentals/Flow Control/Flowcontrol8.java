class Flowcontrol8{
	public static void main(String[] args){
		String c=args[0];
		String color="";
		switch(c)
		{
		  case "R":color+="Red";
			   break;
		  case "B":color+="Blue";
			break;
                  case "G":color+="Green";
			break;
                  case "O":color+="Orange";
			break;
                  case "Y":color+="Yellow";
			break;
		  case "W":color+="White";	
			break;
		  default: color+="Invalid Code";
		}
		System.out.print(color);
		
	
	}
}