class Arrays6{
	public static void main(String[] args){
	int[] arr={97,12,6,78,29,88};
	for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                  int temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
	for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
	}
	
	}

}