import com.automobile.Vehicle;
import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;
class Test{
	public static void main(String[] args){
		Hero hero =new Hero();
		Honda honda = new Honda();
		System.out.println("Model is : "+hero.getModel());
		System.out.println("Model is : "+hero.getRegistrationNumber());
		System.out.println("Owner is : "+hero.getOwnerName());
		System.out.println("Speed is : "+hero.getSpeed());
		hero.cdplayer();
		
		System.out.println("Model is : "+honda.getModel());
		System.out.println("Model is : "+honda.getRegistrationNumber());
		System.out.println("Owner is : "+honda.getOwnerName());
		System.out.println("Speed is : "+honda.getSpeed());
		honda.radio();
		
		
	
	
	}
		
}