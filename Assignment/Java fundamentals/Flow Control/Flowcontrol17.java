class Flowcontrol17{
 public static void main (String[] args)
   {	
      	
      int num=Integer.parseInt(args[0]);
      int n=num;	
      int temp=0;
     while(n!=0){
	temp=temp*10+n%10;
        n=n/10;
	}
	if(temp==num){
	System.out.print(num +" is a palindrome");
	}else{
	System.out.print(num +" is not a palindrome");
	}
   }
}