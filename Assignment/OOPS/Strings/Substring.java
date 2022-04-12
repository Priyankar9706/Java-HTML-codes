public class Substring{
    public static void main(String[] args) {  
      String s=args[0];
      int l=s.length();
      if(l%2!=0) {
    	  System.out.print("null");
      }else {
    	  System.out.print(s.substring(0,l/2));
      }
    }  
}  