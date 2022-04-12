public class TestEmployee {

	public static void main(String[] args) {
		Employee e=new Employee("Rahul Roy",40000,2018,"IS348722");
		System.out.println("Name: "+e.name);
		System.out.println("Salary: "+e.getSalary());
		System.out.println("Started to work from: "+e.getYear());
		System.out.println("Insurance No.: "+e.getInsNo());
		
	}

}
