class Calculator{
	

	static int powerInt(int num1,int num2){
		return (int)Math.pow((double)num1,(double)num2);
		
	}

	static double powerDouble(double num1,int num2){
		return Math.pow(num1,(double)num2);
	}


	public static void main(String[] args){
		Calculator c=new Calculator();
		System.out.println(c.powerInt(4,5));
		System.out.print(c.powerDouble(4,5));
	
	}	
	
	
	}