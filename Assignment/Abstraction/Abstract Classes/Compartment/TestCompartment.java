import java.util.Random;
class TestCompartment{
	public static void main(String[] args){
	Compartment[] c=new Compartment[10];
	Random rand=new Random();
	FirstClass fc=new FirstClass();
	General g=new General();
	Ladies l=new Ladies();
	Luggage lu=new Luggage();
	for(int i=0;i<10;i++){
	int random=rand.nextInt(4)+1;
	switch(random){
		case 1:c[i]=new FirstClass();
		       System.out.println("The coach no. "+(i+1)+" is "+c[i].notice());
		       break;
		case 2:c[i]=new General();
		       System.out.println("The coach no. "+(i+1)+" is "+c[i].notice());
		       break;
		case 3:c[i]=new Ladies();
		       System.out.println("The coach no. "+(i+1)+" is "+c[i].notice());
		       break;
		case 4:c[i]=new Luggage();
		       System.out.println("The coach no. "+(i+1)+" is "+c[i].notice());
		       break;
	}
	}
		
	}
}