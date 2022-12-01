package Arrayyconcepts;

import java.util.Scanner;

public class ArrayOddEvenLab {
	public static void main(String[] args) {
		int even = 0, odd = 0, arr[], size, i;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array: "); 
		size = sc.nextInt();   //Taking Array size from user

		arr = new int[size]; //	Initializing the Array

		System.out.println("Enter " + size + " elements to add in the Array: ");
		for (i = 0; i < size; i++) {  // Inserting elements into the Array
			arr[i] = sc.nextInt();
		}
		
		for (i=0;i<size;i++) 
		{
			if (arr[i]%2==0) // checking for odd and even  value
			{
				even ++ ; //Counting all even numbers
			}
			
			else
			{
				odd ++ ; //Counting all odd numbers
			}
		}
		System.out.println("Total number of even number in this array is:"+even);
		System.out.println("Total number of odd number in this array is:"+odd);
		
	}
}

		

	
