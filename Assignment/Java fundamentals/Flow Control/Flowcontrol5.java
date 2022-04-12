class Flowcontrol5{
	public static void main(String[] args){
		char c='8';
		if(c>=48 && c<=57){
		System.out.print("Digit");
		}
		else if(c>=65 && c<=90 || c>=97 && c<=122){
		System.out.print("Alphabet");
		}
		else{
		System.out.print("Special character");		
		}

	}
}