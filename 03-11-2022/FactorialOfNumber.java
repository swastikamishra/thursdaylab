package basicprogram;

import java.util.Scanner;

public class FactorialOfNumber {
public static void main(String args[])
{
	int i,sum=1,n;
	
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter your number: ");
	n = sc.nextInt();
	
	for (i=1;i<=n;i++)
	{
		sum = sum*i;
	}
	System.out.println("The Factorial of given number is"+" "+sum);
}

}
