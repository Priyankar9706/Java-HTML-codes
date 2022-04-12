import java.util.*;

class MathOperation{
	public static void main(String[] args){
		
		try{
		int[] arr=new int[5];
		for(int i=0;i<5;i++){
			arr[i]=Integer.parseInt(args[i]);
		}
		  int sum=0;
	          
		  for(int i=0;i<args.length;i++){
			sum=sum+arr[i];
			}
		double avg=sum/5.0;
		System.out.print("Sum = "+sum+" Average = "+avg);
		}
		catch(Exception e){
		System.out.println(e);	
	}
	}
	

}