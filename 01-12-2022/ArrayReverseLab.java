package Arrayyconcepts;

import java.util.Scanner;

public class ArrayReverseLab {
	public static void main(String[] args) {
		int i, size, arr[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		size = sc.nextInt(); // Getting size from the user

		arr = new int[size]; // Initializing array

		System.out.println("Enter " + size + "  elements to reverse:");

		for (i = (size - 1); i >= 0; i--) // Loop for reversing the Array
		{
			arr[i] = sc.nextInt();
		}

		System.out.println("The reverse of the Array is as follows:");

		for (int a : arr) // Displaying reversed Array
		{
			System.out.println(a);
		}

	}

}
