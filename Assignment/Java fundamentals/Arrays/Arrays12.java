import java.util.*;
class Arrays12{
	public static void main(String[] args){
	int[] a={1,2,3};
	int[] b={4,5,6};
	int[] mid=new int[2];
	int m=a.length/2;
	mid[0]=a[m];
	mid[1]=b[m];
	System.out.print("[ "+mid[0]+", "+mid[1]+" ]");
	
	}

}