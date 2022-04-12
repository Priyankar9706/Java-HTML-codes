public class Bird extends Animal{
	void eat() {
		System.out.println("Birds eat");
	}
	void sleep() {
		System.out.println("Birds sleep");
	}
	void fly() {
		System.out.println("Birds can fly");
	}
	
	public static void main(String[] args) {
		Animal a=new Animal();
		Bird b=new Bird();
		a.eat();
		a.sleep();
		b.eat();
		b.sleep();
		b.fly();

	}

}
