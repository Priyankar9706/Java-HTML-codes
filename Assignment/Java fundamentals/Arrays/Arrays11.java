import java.util.*;
class Arrays11{
	public static void main(String[] args){
	int[] arr={1,4,4,4,1,4};
	int n=arr.length;
	boolean flag=true;
	for(int i=0;i<n;i++){
		if(arr[i]!=1 && arr[i]!=4){
		flag=false;
		}	
	}
	System.out.print(flag);
	
	}

}