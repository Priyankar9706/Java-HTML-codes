public class Assignment6{
    public static void main(String[] args) {  
      if(args.length==0){
	System.out.print("");
	return;
	}else if(args.length==1){
	System.out.print(args[0]);
	return;
	}
      String a=args[0];
      String b=args[1];
      if(a.length()>b.length()){
	System.out.print(b+a+b);
	}else{
	System.out.print(a+b+a);
	}
    }  
}  