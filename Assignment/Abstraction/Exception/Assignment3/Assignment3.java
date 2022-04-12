import java.util.*;
public class Assignment3{
	public static void main(String[] args){
		
		try{
		Scanner sc=new Scanner(System.in);
		int[] arr1=new int[3];
		int[] arr2=new int[3];		
		System.out.println("Enter the name of 1st student: ");
		String s1=sc.nextLine();
		System.out.println("Enter the marks of the 3 subjects of 1st student: ");
		for(int i=0;i<3;i++){
			int a=Integer.parseInt(sc.next());
				while(true){
				if(a>=0 && a<=100){
				arr1[i]=a;
				break;
				}else if(a<0){
				throw new MyException("Entered number is a -ve number!!!");
				}else if(a>100){
				throw new MyException("Entered number is out of range!!!");
				}
			}
		}
		System.out.println("Enter the name of 2nd student: ");
		sc.nextLine();
		String s2=sc.nextLine();
		System.out.println("Enter the marks of the 3 subjects of 2nd student: ");
		for(int i=0;i<3;i++){
			int b=Integer.parseInt(sc.next());
			
				while(true){
				if(b>=0 && b<=100){
				arr2[i]=b;
				break;
				}else if(b<0){
				throw new MyException("Entered number is a -ve number!!!");
				}else if(b>100){
				throw new MyException("Entered number is out of range!!!");
				}
				}
		}
		double avg1=(arr1[0]+arr1[1]+arr2[2])/3.0;
		double avg2=(arr2[0]+arr2[1]+arr2[2])/3.0;
		System.out.println("Average marks of " +s1+" = "+avg1);
		System.out.println("Average marks of " +s2+" = "+avg2);	
		}
		catch(Exception e){
		System.out.println(e);	
	}
	}
}
	

