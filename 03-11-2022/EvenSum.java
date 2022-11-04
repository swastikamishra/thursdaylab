package basicprogram;

import java.util.Scanner;

public class EvenSum {
	public static void main(String args[])
	{
		int i,sum=0,n;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your number: ");
		n = sc.nextInt();
		
		for (i =2;i<=n;i=i+2) 
		{
			if (i%2==0) 
			{
				sum = sum+i;
			}
		}
			
     System.out.println("Sum of all even number from 1 to"+" "+n+" "+"is"+" "+sum);
	
}
	
}
