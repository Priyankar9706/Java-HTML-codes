
public class Book{
	private String name;
	Author author;
	private double price;
	private int qtyInStock;
	Book(String name,Author author,double price,int qtyInStock){
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
		}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	public static void main(String[] args) {
		Author a=new Author("Chetan Bhagat","chetanbhagat123@gmail.com",'M');
		Book b=new Book("2 States",a,250,55);
		System.out.println("Name of the book: "+b.getName());
		System.out.println("Name of the author: "+b.getAuthor().name);
		System.out.println("Email of the author: "+b.getAuthor().email);
		System.out.println("Gender of the author: "+b.getAuthor().gender);
		System.out.println("Price of the book: "+b.getPrice());
		System.out.println("Quantity in stock: "+b.getQtyInStock());
		
		
		
	}
	
}
