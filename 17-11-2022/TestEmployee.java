package OOPsconcepts;

class Person1
{
	String name;
	public Person1 (String name) 
	{
		this.name=name;
	}
	
	public String getName() 
	{
		return name;
	}
}

class Employee1 extends Person1
{
	 double annualsalary;
	 int year;
	 String insurance; 
	public Employee1 (String name,double annualsalary,int year,String insurance)
	{
		super(name);
		this.annualsalary=annualsalary;
		this.year=year;
		this.insurance=insurance;
	}
	public double getAnnualsalary() {
		return annualsalary;
	}
	public int getYear() {
		return year;
	}
	public String getInsurance() {
		return insurance;
	}
	
}
public class TestEmployee {
	public static void main (String args[])
	{
		Employee1 emp1 = new Employee1 ("Swastika",4000000,2022,"118BM1381B");
		System.out.println("Name: "+emp1.getName());
		System.out.println("Annual Salary: "+emp1.getAnnualsalary());
		System.out.println("Year: "+emp1.getYear());
		System.out.println("National Insurance: "+emp1.getInsurance());
	}

}
