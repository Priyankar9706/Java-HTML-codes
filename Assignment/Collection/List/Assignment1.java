import java.util.*;
public class Assignment1 {
	public void printAll(ArrayList<String> s) {
		Iterator<String> i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Ram");
		list.add("Abhishek");
		list.add("Karan");
		list.add("Bhoomi");
		list.add("Kishan");
		list.add("Rahul");
		list.add("Rohit");
		Assignment1 a=new Assignment1();
		a.printAll(list);
	}
}