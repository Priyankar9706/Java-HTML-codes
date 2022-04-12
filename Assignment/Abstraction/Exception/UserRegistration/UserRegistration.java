import java.util.*;
public class UserRegistration{
		void registerUser(String username,String userCountry) throws InvalidCountryException{
			if(!userCountry.equals("India")){
				throw new InvalidCountryException("User Outside India cannot be registered");
			}else{
			  System.out.println("User registration done successfully");
			}
	
		}
		public static void main(String[] args){
			try{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the name of the person: ");
			String name=sc.nextLine();
			System.out.println("Enter the country of origin of the person: ");
			String country=sc.nextLine();
			UserRegistration ur=new UserRegistration();
			ur.registerUser(name,country);
			}catch(Exception e){
			System.out.println(e);
			}	
			}

	}