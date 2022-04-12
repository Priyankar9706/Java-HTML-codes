import java.util.*;
class Arrays8{
	public static void main(String[] args){
	int[] arr={10,3,6,1,2,9};
        int n = arr.length;
 	int sum=0;
	int j=0;
	int temp=0;
	for(int i=0;i<n;i++){
		if(arr[i]!=6){
		sum=sum+arr[i];
		temp=sum;
		}else{
		 temp=temp+arr[i];
		 for(j=i+1;j<n;j++){
			if(arr[j]!=7){
			temp=temp+arr[j];
			}else{
			i=j;
			break;
			}
					}
			}
		if(j==n){
		break;
		}
		}	
		System.out.print(temp);
	}

}