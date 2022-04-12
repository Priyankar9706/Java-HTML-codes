class Flowcontrol1A{
	public static void main(String[] args){
		int n=Integer.parseInt(args[0]);
		if(n>0){
			System.out.print(args[0] +" is a positive");
		}else if(n<0){
			System.out.print(args[0] +" is a negative");
		}else{
			System.out.print(args[0] +" is a zero");
			}
	}
}