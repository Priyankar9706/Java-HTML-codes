public class Apple extends Fruit{
	public void eat(String name,String taste,String size){
		super.eat(name, taste, size);
	
	}
	public  static void main(String[] args) {
		Apple a=new Apple();
		a.eat("Apple", "sweet", "small");
	}
	}


