class Arrays1{
	public static void main(String[] args){
	int[] arr={1,3,4,5,6,8};
	float sum=0;
	
	for(int i=0;i<arr.length;i++){
	   sum=sum+arr[i];	
	}
	float avg=sum/arr.length;
        System.out.print("Sum ="+sum+" Average = "+avg);
	
	}

}