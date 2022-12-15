package StringConcepts;

import java.util.Scanner;

public class SearchLetterLab2 {
	public static void main(String[] args) {
		String a;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your input here: "); // I love my India
		a = sc.nextLine();

		// Checks if "I" is present in the given String

		if (((a.startsWith("i"))) || ((a.startsWith("I"))))
			System.out.println("The letter is present.");
		else
			System.out.println("No such input can be found");

	}
}
