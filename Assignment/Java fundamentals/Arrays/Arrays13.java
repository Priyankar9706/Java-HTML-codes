import java.util.*;
class Arrays13{
	public static void main(String[] args){
	int k=0;
	System.out.println("The given array is:");
	for(int i=0;i<2;i++){
		for(int j=0;j<2;j++){
		System.out.print(args[k] +" ");
		k++;	
		}
		System.out.println("");
		}
	
	System.out.println("The reverse of the array is:");
	k=args.length-1;
	for(int i=0;i<2;i++){
		for(int j=0;j<2;j++){
		System.out.print(args[k] +" ");
		k--;	
		}
		System.out.println("");
		}
	}
	
	

}