package Arrayyconcepts;

import java.util.Scanner;

public class ArrayCopyLab {
	public static void main (String []args)
	{
	
	int i,size,arr1 [], arr2[];
	
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the size of the Array: ");
	size = sc.nextInt(); //Taking Array size from the user
	
	arr1 = new int [size]; //Initializing Array 1
	arr2 = new int [size]; //Initializing Array 2
	
	System.out.println("Enter "+size+" elements to add into the Array:");
	
	for(i=0;i<size;i++)
	{
		arr1[i]=sc.nextInt(); //Adding elements in Array 1
	}
	System.out.println("New array copied from previous one is follows:");
	
	for(i=0;i<size;i++)
	{
		arr2[i] = arr1[i];  //Copying Array 1 into Array 2
		
		System.out.println(arr2[i]); //Displaying new copied Array
	}

}
}  
