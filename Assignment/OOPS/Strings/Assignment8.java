class Assignment8{
	public static void main(String[] args){
	String str=args[0];
	String[] s=str.split("\\*");
	System.out.println(s[0].substring(0,s[0].length()-1)+s[1].substring(1,s[1].length()));			


	}
}