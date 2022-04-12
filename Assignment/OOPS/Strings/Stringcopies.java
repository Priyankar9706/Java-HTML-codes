public class Stringcopies{
    public static void main(String[] args) {  
      String s=args[0];
      int l=s.length();
      String str="";
      for(int i=0;i<l;i++) {
    	  str=str+s.charAt(0)+s.charAt(1);
      }
      System.out.println(str);
    }  
}  