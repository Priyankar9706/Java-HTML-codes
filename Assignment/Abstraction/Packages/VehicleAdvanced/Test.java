import com.automobile.Vehicle;
import com.automobile.fourwheeler.Ford;
import com.automobile.fourwheeler.Logan;
class Test{
	public static void main(String[] args){
		Logan logan =new Logan();
		Ford ford = new Ford();
		System.out.println("Model is : "+ford.getModel());
		System.out.println("Registration Number is : "+ford.getRegistrationNumber());
		System.out.println("Owner is : "+ford.getOwnerName());
		System.out.println("Speed is : "+ford.speed());
		System.out.println("Temperature is : "+ford.tempControl());
		
		System.out.println("Model is : "+logan.getModel());
		System.out.println("Registration Number is : "+logan.getRegistrationNumber());
		System.out.println("Owner is : "+logan.getOwnerName());
		System.out.println("Speed is : "+logan.speed());
		System.out.println("GPS is : "+logan.gps());
		
		
	
	
	}
		
}