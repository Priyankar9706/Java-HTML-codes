import java.util.*;
class Arrays7{
	 public static int removeduplicates(int a[], int n)
  	  {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
  
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }
  
        temp[j++] = a[n - 1];
  
 
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }
  
        return j;
    }
	

	public static void main(String[] args){
	int[] arr={97,12,88,6,78,29,88};
	Arrays.sort(arr);
	
        int n = arr.length;
  
        n = removeduplicates(arr, n);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

}