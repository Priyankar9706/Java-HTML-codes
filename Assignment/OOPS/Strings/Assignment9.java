public class Assignment9{
    public static void main(String[] args) {  
      String a=args[0];
      String b=args[1];
      int l1=a.length();
      int l2=b.length();
      int i=0,j=0;
	String str="";
      while(i!=l1 && j!=l2){
	str=str+a.charAt(i)+b.charAt(j);
	i++;
	j++;
	}
	if(i==l1){
	str=str+b.substring(j,l2);
	}else if(j==l2){
	str=str+a.substring(i,l1);
	}
	System.out.print(str);
    }  
}  