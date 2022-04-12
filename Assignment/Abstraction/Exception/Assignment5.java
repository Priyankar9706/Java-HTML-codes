class Assignment5{
	public static void main(String[] args){
		try{	
		String name=args[0];
		int  age=Integer.parseInt(args[1]);
		if(age<18){
			throw new Exception("Underaged!!!");
			}else if(age>=60){
			throw new Exception("Overaged!!!");
			}else{
			System.out.println("Eligibility criteria is fullfilled");
			}
		
		}catch(Exception e){
			System.out.println(e);
			System.out.println("Thankyou for the input provided...");	
		}
	
	
	}

	}