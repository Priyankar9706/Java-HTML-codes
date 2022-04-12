class Arrays5{
	public static void main(String[] args){
	int[] arr={97,12,6,78,29,88};
	int largest1=arr[0];
	int largest2=arr[1];
	int smallest1=arr[1];
	int smallest2=arr[0];
	if(arr[1]>arr[0]){
 		largest1=arr[1];
	        largest2=arr[0];
	 	smallest1=arr[0];
	 	smallest2=arr[1];
	}
	
	for(int i=2;i<arr.length;i++){
		if(arr[i]>largest1){
		  largest2=largest1;
		  largest1=arr[i];
		}else if(arr[i]>largest2){
			largest2=arr[i];	
		}
		if(arr[i]<smallest1){
		  smallest2=smallest1;
		  smallest1=arr[i];
		}else if(arr[i]<smallest2){
			smallest2=arr[i];	
		}
		}
		
		System.out.println("Largest two numbers are: "+largest1+" & "+largest2);
		System.out.println("Smallest two numbers are: "+smallest1+" & "+smallest2);
	
	
	}

}