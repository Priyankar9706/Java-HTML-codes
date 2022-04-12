public class Assignment10{
    public static void main(String[] args) {  
      String[] s=args[0].split(",");
      int n=Integer.parseInt(s[1]); 
      String str="";
      for(int i=0;i<n;i++){
	str=str+s[0].substring(s[0].length()-n,s[0].length());
	}
	System.out.print(str);
	



	
	}
}  