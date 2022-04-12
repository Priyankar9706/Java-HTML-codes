import java.util.*;
class Arrays10{
	public static void main(String[] args){
	int[] arr={10,3,5,1,2,9};
	int n=arr.length;
	int[] a=new int[n];
	int i=0;
	int j=n-1; 
	
	for(int k=0;k<n;k++){
		if(arr[k]%2==0){
			a[i]=arr[k];
			i++;
		}else{
			a[j]=arr[k];
			j--;
			}
	}
	for(int b=0;b<n;b++){
		
		System.out.print(a[b]+" ");
	}
	
	}

}