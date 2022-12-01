package Arrayyconcepts;

import java.util.Scanner;

public class ArrayNegativeNumLab {
	public static void main(String args[]) {
		int arr[] = new int[5]; // Initializing Array

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: "); // Taking elements from user
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("All the negative number are as follows: ");

		for (int i = 0; i < 5; i++)

			if (arr[i] < 0) // To find negative number
			{
				System.out.println(arr[i]);
			}

	}
}
