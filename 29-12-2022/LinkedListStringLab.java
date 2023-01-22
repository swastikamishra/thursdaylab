package ThursdayLabNew;

import java.util.LinkedList;

import javax.sql.rowset.serial.SQLOutputImpl;

public class LinkedListStringLab {
	public static void main (String [] args) 
	{
		//Creating a LinkedList and adding elements to it: 
		LinkedList<String> ListD = new LinkedList<String>();
		ListD.add("Tea");
		ListD.add("Coffee");
		ListD.add("Fries");
		ListD.add("Burger");
		
		//Displaying the list:
		
		System.out.println("The list containing all the elements is as follows: "+ListD);
		
		System.out.println("=====================================================================================================================================");
		
		//Adding elements at index '2' of the list:
		
		ListD.add(2,"Peri Peri Fries");
		
		//Displaying the updated list:
		
		System.out.println("The updated list after adding element at index 2 is as follows: "+ListD);
		System.out.println("=====================================================================================================================================");
		
		//Retrieve and replacing the first element of the list:
		
		ListD.set(0,"Mocha Frappe");
		
		//Displaying the updated list:
		
		System.out.println("After replacing first element,the list is as follows: "+ListD);
		System.out.println("=====================================================================================================================================");
	    
		//Converting LinkedList To Array:
		
		String [] array = ListD.toArray(new String [ListD.size()]);
		System.out.println("Converted LinkedList to Array is follows: ");
		System.out.println(" ");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	
	}
	
	

}
