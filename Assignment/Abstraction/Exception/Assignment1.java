import java.util.*;

class Assignment1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		try{
		System.out.println("Enter the number of elements in the array");
		int n=sc.nextInt();
		System.out.println("Enter the elements in the array");
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(sc.next());
		}
		System.out.println("Enter the index of the array element you want to access");
		int k=sc.nextInt();
		System.out.println("The array element at index "+k+" = "+arr[k]);
		System.out.println("The array element successfully accessed");
		}
		catch(Exception e){
		System.out.println(e);	
	}
	}
	

}