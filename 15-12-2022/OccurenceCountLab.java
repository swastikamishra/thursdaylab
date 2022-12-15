package StringConcepts;

import java.util.Scanner;

public class OccurenceCountLab {
	
	public static void main (String []args)
	{
		int i;
		String a;
		char b;
		int count = 0;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your input String: ");
		a = sc.nextLine();
		
		System.out.println("Enter the character you wish to search for:");
		b = sc.next().charAt(0);
		
		// To search for the character
		
		for(i = 0;i<a.length();i++)
		
		if(a.charAt(i)== b)
		{
			count++; //To count and store the occurrence of the character
		}
        System.out.println("The total number of time "+b+" has occured is "+count);
			
		
	}

}
