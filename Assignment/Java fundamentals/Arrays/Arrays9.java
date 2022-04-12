import java.util.*;
class Arrays9{
	public static void main(String[] args){
	int[] arr={10,3,10,1,2,9};
	int n=arr.length;
	int j=0; 
	
	for(int i=0;i<n;i++){
		j=i+1;
		if(arr[i]==10){
		while(j<n){
			if(arr[j]!=10){
			arr[i]=arr[j];
			arr[j]=10;
			break;
			}else{
			j++;		
			}
			}
		
		}
	}
	for(int a=0;a<n;a++){
	if(arr[a]==10){
	arr[a]=0;	
	}
	}

        for(int i=0;i<n;i++){
		System.out.print(arr[i]+" ");
		}



	
	}

}