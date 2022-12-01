package Arrayyconcepts;

import java.util.Scanner;

public class ArrayMaxiMinLab {
	public static void main(String[] args) {
		int arr[], i, max, min, size;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		size = sc.nextInt();

		arr = new int[size]; // Initializing array

		System.out.println("Enter the elements to be added in the array: ");
		for (i = 0; i < size; i++) // Adding elements in the array
		{
			arr[i] = sc.nextInt();
		}

		max = arr[0]; // Logic for finding maximum number
		for (i = 1; i < size; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Maximum number in the Array is:" + max);

		min = arr[0]; // Logic for finding minimum number
		for (i = 1; i < size; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Minimum number in the Array is:" + min);

	}

}
