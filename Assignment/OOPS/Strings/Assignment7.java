public class Assignment7{
    public static void main(String[] args) {  
      String s=args[0];
      int l=s.length();
      if(s.charAt(0)=='x' && s.charAt(l-1)=='x'){
	System.out.print(s.substring(1,l-1));
     }else if(s.charAt(0)=='x'){
	System.out.print(s.substring(1,l));
	}else if(s.charAt(l-1)=='x'){
	System.out.print(s.substring(0,l-1));
	} else{
	
	System.out.print(s.substring(0,l));
	}
}
}  