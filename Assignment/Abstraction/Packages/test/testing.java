import test.foundation;
class testing{
	public static void main(String[] args){
		foundation f=new foundation();
		System.out.println("error: var1 has private access in foundation");
		System.out.println("var2 is not public in foundation; cannot be accessed from outside package");
		System.out.println("var3 has protected access in foundation");
		System.out.println(f.var4);

	
	}

	
	
	}