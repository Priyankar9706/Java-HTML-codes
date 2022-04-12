import java.util.*;
class Arrays14{
	public static void main(String[] args){
	int[][] arr=new int[3][3];
	int k=0;
	int max=0;
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			arr[i][j]=Integer.parseInt(args[k]);
			if(max<arr[i][j]){
			max=arr[i][j];	
			}
			k++;
			}	
		}	
	System.out.println("The given array is:");
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			System.out.print(arr[i][j]+" "); 
			}
		System.out.println("");	
		}	
		System.out.println("The biggest number is the given array is "+max);
	}
	
}