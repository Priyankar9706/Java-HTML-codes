class Arrays3{
	public static void main(String[] args){
	int[] arr={1,9,5,4,10,7};
	int n=Integer.parseInt(args[0]);
	for(int i=0;i<arr.length;i++){
	if(arr[i]==n){
	System.out.print(i);
	return;	
	}
	}
	System.out.print(-1);
	
	}

}