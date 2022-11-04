package basicprogram;

public class EvenSum {
	public static void main(String args[])
	{
		int i,sum=0;
		for (i =2;i<=10;i=i+2) 
		{
			if (i%2==0) 
			{
				sum = sum+i;
			}
		}
			
     System.out.println("Sum of all even number from 1 to 10 is"+" "+sum);
	
}
	
}
