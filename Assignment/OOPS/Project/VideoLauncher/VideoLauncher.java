import java.util.Scanner;

public class VideoLauncher {
	public static void main(String[] args) {
		boolean exit=true;
	
		while(exit) {
			System.out.println("MAIN MENU");
			System.out.println("=========");
			System.out.println("1.Add Videos :");
			System.out.println("2.Check Out Video :");
			System.out.println("3.Return Video: ");
			System.out.println("4.Receive Rating: ");
			System.out.println("5.List Inventory: ");
			System.out.println("6.Exit :");
			System.out.println("Enter yout choice (1..6): ");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			System.out.println("");
			switch(n){
			case 1: System.out.print("Enter the name of the video you want to add: ");
					sc.nextLine();
					String name=sc.nextLine();
					VideoStore vs=new VideoStore();
					vs.addVideo(name);
					System.out.println("\nVideo "+'"'+name+'"'+" added successfully.");
					break;
					
			case 2:System.out.print("Enter the name of the video you want to check out: ");
				   sc.nextLine();
				   String vname2=sc.nextLine();
				   VideoStore v3=new VideoStore();
				   v3.doCheckout(vname2);
				   System.out.println("\nVideo "+'"'+vname2+'"'+" checked out successfully");
				   break;
			case 3:System.out.print("Enter the name of the video you want to Return: ");
				   sc.nextLine();
				   String vname3=sc.nextLine();
			       VideoStore v4=new VideoStore();
			       v4.doReturn(vname3);
			       System.out.println("\nVideo "+'"'+vname3+'"'+" returned out successfully");
				   break;
			case 4:System.out.print("Enter the name of the video you want to Rate: ");
				   sc.nextLine();
				   String vname=sc.nextLine();
				   System.out.print("Enter the rating for the video: ");
				   int rating=sc.nextInt();
				   VideoStore v2=new VideoStore();
				   v2.receiveRating(vname,rating);
				   System.out.println("\nRating "+'"'+rating+'"'+" has been mapped to the Video "+'"'+vname+'"'+".");
				   break;
			case 5:System.out.println("\n---------------------------------------------------");
				   System.out.println("Video Name\t|\tCheckout Status|\tRating");
				   VideoStore vs5=new VideoStore();
				   vs5.listInventory();
				   System.out.println("\n---------------------------------------------------");
				   break;
			case 6:exit=false;
				   System.out.println("\nExiting...!! Thanks for using the application.");
				   break;
			default:
	}
}
	}
	}
