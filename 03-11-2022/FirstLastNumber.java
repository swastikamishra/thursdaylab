package basicprogram;

import java.util.Scanner;

public class FirstLastNumber {
public static void main(String args[])
{
	int n,firstdigit=0,lastdigit=0;
	
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter your number: ");
	n = sc.nextInt();
	
	lastdigit = n%10;
	System.out.println("Last digit is" + " " + lastdigit);
	
	while (n>0)
	{
		firstdigit= n%10;
		n = n/10;
	}
	
	System.out.println("First digit is" + " " + firstdigit);
	
}
}
