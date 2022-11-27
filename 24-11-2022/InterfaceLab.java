package OOPsconcepts;

interface LibraryUser
{
	public void registerAccount();
	public void requestBook();
	
}
class KidUser implements LibraryUser
{
	int age;
	String bookType;
	void age (int age)
	{
		this.age=age;
	}
	void bookType (String bookType)
	{
		this.bookType=bookType;
	}
	@Override
	public void registerAccount()
	{
		if (age<12)
		{
			System.out.println("You have sucessfully registered under a kids account!");
		}
		if (age>12)
		{
			System.out.println("Sorry,Age must be less than 12 to register as a kid");
		}
	}
	@Override
	public void requestBook()
	{
		if (bookType.equalsIgnoreCase("kids")) 
		{
			System.out.println("Book issued sucessfully,please return the book within 10 days.");	
		}
		else
		{
			System.out.println("OOPS! You are allowed to take only kids books.");
		}
	}

}

class AdultUser implements LibraryUser
{
	int age;
	String bookType;
	void age (int age)
	{
		this.age=age;
	}
	void bookType (String bookType)
	{
		this.bookType=bookType;
	}
	
	@Override
	public void registerAccount()
	{
		if (age>12)
			System.out.println("You have sucessfully registered under a kids account!");
		if (age<12)
			System.out.println("Sorry,Age must be greater than 12 to register as an adult");
			
	}
	@Override
	public void requestBook()
	{
		if(bookType.equalsIgnoreCase("Fiction"))
			System.out.println("Book issued sucessfully,please return the book within 7 days.");
		else
			System.out.println("OOPS! You are allowed to take only adults books.");
	}
}


public class InterfaceLab {
	public static void main (String []args)
	{
		KidUser obj = new KidUser ();
		obj.age(10);
		obj.bookType("kids");
		obj.registerAccount();
		obj.requestBook();
		System.out.println("-------------------------------------------------------------------");      
		obj.age(18);
		obj.bookType("Fiction");
		obj.registerAccount();
		obj.requestBook();
		
		System.out.println("======================================================================");
		
		
		AdultUser obj2 = new AdultUser ();
		obj2.age(5);
		obj2.bookType("kids");
		obj2.registerAccount();
		obj2.requestBook();
		System.out.println("-------------------------------------------------------------------");      
		obj2.age(23);
		obj2.bookType("Fiction");
		obj2.registerAccount();
		obj2.requestBook();
	}

}
