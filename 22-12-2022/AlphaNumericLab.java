package ThursdayLabNew;

import java.util.Scanner;

public class AlphaNumericLab {
public static void main (String args[]) {
	
	String str;
	int sum = 0;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter your input here: "); //Taking input from user
	str = sc.nextLine();
	
	for(int i = 0;i<str.length();i++) //Loop to find the alphanumeric character
	{
	if(str.charAt(i)>='1' && str.charAt(i)<='9')
	{
		sum =( sum+str.charAt(i)-'0');
	}
	}
	//Displaying the output
    System.out.println("The sum of all the digits within the alphanumeric String "+str+" is: "+sum);
    
}
}
