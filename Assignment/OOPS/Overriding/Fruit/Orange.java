public class Orange extends Fruit{
	public void eat(String name,String taste,String size){
		super.eat(name, taste,size);

	}
	public static void main(String[] args) {
		Orange o=new Orange();
		o.eat("Orange", "tart", "small");
	}
	

}