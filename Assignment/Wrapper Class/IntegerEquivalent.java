public class IntegerEquivalent{
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		System.out.println("Given Number :"+n);
		System.out.println("Binary Equivalent :"+Integer.toBinaryString(n));
		System.out.println("Octal Equivalent :"+Integer.toOctalString(n));
		System.out.println("Hexadecimal Equivalent :"+Integer.toHexString(n));
		
		
	}
}
