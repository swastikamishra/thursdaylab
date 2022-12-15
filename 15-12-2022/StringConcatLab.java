package StringConcepts;

import java.util.Scanner;

public class StringConcatLab {
	
	public static void main (String []args)
	{
		String str1;
		String str2;
		String str3;
		Scanner sc = new Scanner (System.in);
		
		//Taking String 1 input from user
		System.out.println("Enter String 1 here: ");
		str1 = sc.nextLine();
		
		//Taking String 2 input from user
		System.out.println("Enter String 2 here: ");
		str2 = sc.nextLine();
		
		//Concatenating and storing string 1 and string 2
		str3 = str1.concat(" "+str2);
		
		System.out.println("Concatenated String is as follows: "+str3);
		
	}

}
