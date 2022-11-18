package basicprogram;

import java.util.Scanner;

public class Bank {
	public static void main(String argsn []) {
		
		int withdrawl,deposit;
		int totalbal=5000;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the withdrawl amount: ");
		withdrawl = sc.nextInt();
		
		if (withdrawl<=totalbal)
		{
		
		
		totalbal -= withdrawl;
		System.out.println("Withdrawl Sucessfull");
		System.out.println("Your current balance is: "+ totalbal +"/-");
		System.out.println("");
		}
		
		else 
		{
			System.out.println("Insufficient balance");
		}
		{
		
		System.out.println("Enter the amount to be deposited: ");
		deposit = sc.nextInt();
		
		totalbal = totalbal + deposit;
		System.out.println("Your money is sucessfully deposited");
		
		System.out.println("Your total balance is: "+ totalbal+"/-");
		
	}

}
}
