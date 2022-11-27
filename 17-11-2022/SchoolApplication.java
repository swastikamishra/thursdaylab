package OOPsconcepts;

class Person
{
	String name;
	String dateOfBirth = "yyyy-MM-dd";
	
	public Person (String name,String dateOfBirth)
	{
		super();
		this.name=name;
		this.dateOfBirth=dateOfBirth;
	}
	
	public Person ()
	{
		super();
	}
	 void display ()
	{
		System.out.println("Name: "+name);
		System.out.println("Date of Birth: "+dateOfBirth);
		
	}
}
	
 class Teacher extends Person
{
	float salary;
	String subject;
	
	public Teacher(String name,String dateOfBirth,float salary,String subject)
	{
		super(name,dateOfBirth);
		this.salary=salary;
		this.subject=subject;
	}

	void getOutput1() 
	{
		super.display();
		System.out.println("Salary: "+salary);
		System.out.println("subject: "+subject);
	}
}
 class Student2 extends Person
 {
	 int studentId;
	 public Student2(String name,String dateOfBirth,int studentId)
	 {
		 super(name,dateOfBirth);
		 this.studentId=studentId;
	 }
	 
	 void getOutput2() 
		{
			super.display();
			System.out.println("Student ID: "+studentId);
			
		}
 }
 class CollegeStudent extends Student2
 {
	 String collegeName,studyingYear;
	 public CollegeStudent (String name,String dateOfBirth,int studentId,String collegeName,String studyingYear)
	 {
		 super(name,dateOfBirth,studentId);
		 this.collegeName=collegeName;
		 this.studyingYear=studyingYear;
		 this.studentId=studentId;
	 }
	 void getOutput3()
	 {
		 super.display();
		 super.getOutput2();
		 System.out.println("Student ID: "+studentId);
		 System.out.println("College Name: "+collegeName);
		 System.out.println("Current studying Year: "+studyingYear);
		 		 
	 }
	 
 }

public class SchoolApplication 
{
public static void main (String []args)
{
	Teacher obj1 = new Teacher ("Joythi","1986-06-12",1000000f,"Hospital Management");
	obj1.getOutput1();
	System.out.println("===================================");
	
	Student2 obj2 = new Student2 ("Arshika","2015-09-11",105);
	obj2.getOutput2();
	System.out.println("===================================");
	
	CollegeStudent obj3 = new CollegeStudent("Swastika","2000-03-16",166,"MGM College","Final Year");
	obj3.getOutput3();
	
	
	
}
}
