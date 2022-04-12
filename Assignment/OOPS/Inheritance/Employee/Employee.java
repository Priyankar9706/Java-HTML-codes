public class Employee extends Person{
	double salary;
	int year;
	String insNo;
	Employee(String name,double salary,int year,String insNo) {
		super(name);
		this.salary=salary;
		this.year=year;
		this.insNo=insNo;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getInsNo() {
		return insNo;
	}
	public void setInsNo(String insNo) {
		this.insNo = insNo;
	}
	
	
}
