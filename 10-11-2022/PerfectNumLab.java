package basicprogram;

import java.util.Scanner;

public class PerfectNumLab {
	public static void main (String args []) 
	{
       int i,sum=0,n,num;
       System.out.println("Enter your range:");

       Scanner sc = new Scanner (System.in);
		
		num = sc.nextInt(); 
		
       System.out.println("Perfect number from 1 to "+num+":");
		for (n=1;n<=num;n++)
		{ 
			  sum=0;
			for(i=1;i<n;i++) 
			{
		
			if (n%i==0)
			
				sum = sum +i;
			}

			if (n==sum)
				System.out.println(sum);
		}
		
	}
	
	 

}
