package ThursdayLabNew;

class Bank //This is the parent class
{
	int getRateOfIntrest()
	{
		return(0);
	}
}
//This is the child class inheriting and overriding parent class method with implementation
class HDFC extends Bank 
{
	int getRateOfInterest()
	{
		return(10);
	}
}
//This is the child class inheriting and overriding parent class method with implementation
class PMC extends Bank 
{
	int getRateOfInterest()
	{
		return(5);
	}
}
//This is the child class inheriting and overriding parent class method with implementation
class SBI extends Bank
{
	int getRateOfInterest()
	{
		return(7);
	}
}


public class BankOverrideLab {
	public static void main (String []args)
	{
		//Creating object of each class in order to display the output
		HDFC obj1 = new HDFC();
		PMC obj2 = new PMC();
		SBI obj3 = new SBI();
		
		System.out.println("Rate of Interest for HDFC is:"+obj1.getRateOfInterest());
		System.out.println("Rate of Interest for PMC is: "+obj2.getRateOfInterest());
		System.out.println("Rate of Interest for SBI is: "+obj3.getRateOfInterest());
	} 
	

}
