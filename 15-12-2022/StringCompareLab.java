package StringConcepts;
import java.util.Scanner;
public class StringCompareLab {
	public static void main (String []args)
	{
        String str1;
		String str2;
	
		Scanner sc = new Scanner (System.in);
		
		//Taking String 1 input from user
		System.out.println("Enter String 1 here: ");
		str1 = sc.nextLine();
		
		//Taking String 2 input from user
		System.out.println("Enter String 2 here: ");
		str2 = sc.nextLine();
		
		//Comparing String 1 and String 2
		System.out.println("String 1 and String 2 are Equal: "+str1.equalsIgnoreCase(str2));
			
		}
		
	}


