package ThursdayLabNew;

import java.util.Scanner;

public class RemoveSpecificElement {
	public static void main(String[] args) {
		int size;
		int delete;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		size = sc.nextInt(); //Taking size from the user

		int arr[] = new int[size];

		System.out.println("Enter the number to be pushed in the array: "); //Taking the elements for the array

		for (int i = 0; i < size; i++) { //Loop for inserting the elements in the array
			arr[i] = sc.nextInt();
		}
		System.out.println("The array list is as follows: "); //Displaying the array list
		for (int b : arr) {
			System.out.printf("%3d", b);
		}
		System.out.println("\nEnter the number you wish to delete: "); //Taking the element that is to be deleted
		delete = sc.nextInt();

		for (int i = 0; i < arr.length; i++) { //Loop for traversing the array and deleting the desired element
			if (delete == arr[i]) {
				for (int j = i; j < arr.length - 1; j++) {
					arr[j] = arr[j + 1];
				}
				break; 
			}

		}

		//Displaying the updated array list after removing element
		System.out.println("The updated list after deleting the element is as follows:"); 
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.printf("%3d", arr[i]);
		}
	}

}
