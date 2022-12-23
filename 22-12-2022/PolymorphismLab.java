package ThursdayLabNew;

//Parents class / super class
class Friend  
{
	public void friendsM()
	{
		System.out.println("This is the main Friend method");
	}
	public void friendsM2()
	{
		System.out.println("This is the main Friend2 method");
	}
}

//Child class inheriting methods from parents class and overriding with own implementation
class Friend2 extends Friend
{
	@Override
	public void friendsM()
	{
		super.friendsM();
		System.out.println("This is the overriden friendM method");
	}
	@Override
	public void friendsM2()
	{
		System.out.println("This is the overriden friendM2 method");
	}
	//This is child class's own implementation
	public void friendsM3()
	{
		System.out.println("This is class Friends2's own method ");
	}
}

public class PolymorphismLab {
	public static void main (String args [])
	{
	//Creating object of the most recent class
		Friend2 obj  = new Friend2();
		obj.friendsM();
		obj.friendsM2();
		obj.friendsM3();
		
	}

}
