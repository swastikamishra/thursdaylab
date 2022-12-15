package StringConcepts;

public class FirstLastOccurenceLab {
	
	public static void main (String []args)
	{
		
		String a = "Hello world";
		//To search and display first occurrence
		System.out.println("The first occurrence of the character is at index: "+a.indexOf('o'));
		//To search and display last occurrence
		System.out.println("The last occurrence of the character is at index: "+a.lastIndexOf('o'));
		
		
}
}
