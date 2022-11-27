package OOPsconcepts;
class Animal
{
	
	public void eat()
	
	{
		System.out.println("This is eat method");
	}
	
	public void sleep ()
	{
		System.out.println("This is sleep method");	
	}
}

class Bird extends Animal
{
	@Override
	public void eat()
	{
		super.eat();
		System.out.println("This is overidden eat method");
		
	}
	
	@Override
	public void sleep()
	{
		super.sleep();
		System.out.println("This is overidden sleep method");
		
	}
	
	
	public void fly ()
	{
		System.out.println("Self Method fly for child class");
	}
}

public class DemoAnimal {
	public static void main (String args [])
	{
		Animal obj2 = new Animal();
		obj2.eat();
		obj2.sleep();
		
		System.out.println("===================================");
		
		Bird obj = new Bird();
		obj.eat();
		obj.sleep();
		obj.fly();
		
	}

}

