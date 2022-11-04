package basicprogram;

import java.util.Scanner;

public class MultiplicationTable {
public static void main(String args[]) {
	int i,n;
	
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter your number: ");
	n = sc.nextInt();
	
	for (i=1;i<=10;i++)
	{
		System.out.println(n+"x"+i+"="+n*i);
	}
	
}

}
