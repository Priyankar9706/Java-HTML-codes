class Flowcontrol16{
 public static void main (String[] args)
   {		
      int n=Integer.parseInt(args[0]);
	int temp=0;
     while(n!=0){
	temp=temp*10+n%10;
        n=n/10;
	}
	System.out.print(temp);
   }
}