import java.lang.*;
public class Concatenate{
    public static void main(String[] args) {  
        String str = args[0];  
        String[] s=str.split(",");
        if(Character.isUpperCase(s[1].charAt(0))) {
        	System.out.print((s[0]+" "+s[1]).toLowerCase());
        	return;
        }else if(s[0].charAt(s[0].length()-1)==s[1].charAt(0)){
        	System.out.print((s[0]+s[1].substring(1,s[1].length())).toLowerCase());
        	return;
        }else {
        	System.out.print((s[0]+s[1]).toLowerCase());
        }
    }  
}  