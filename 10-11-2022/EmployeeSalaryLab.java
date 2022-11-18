package OOPsconcepts;

import java.util.Scanner;

class Worker
{
	int id;
	String name,designation;
	float BS,AS;
	
	void setData(int id,String name,String designation,float BS,float AS) 
	{
	this.id=id;
	this.name=name;
	this.designation=designation;
	this.BS=BS;
	this.AS=AS;

	}
	
	void displayData()
	{
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Designation: "+designation);
		System.out.println("Basic Salary: "+BS);
		System.out.println("Annual Salary: "+AS); 
	
	}
	float calculateTa()
	{

        if(this.designation.equalsIgnoreCase("manager"))
        {
        	float TA = 2000;
        	return TA;
        
        }
        else
        {
        	float TA = 1500;
        	return TA;
        
        }
    
	}
}

public class EmployeeSalaryLab 
{
public static void main(String[] args) 
{
		int id,n;
		float BS,AS;
		String name,designation;
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number of employees: ");
	    n = sc.nextInt();
	    
	    for (int i=1;i<=n;i++)
	    {
	    
	    	System.out.println("=================================================");
	    	
	    	System.out.println("Enter the Id of the Employee: ");
	        id = sc.nextInt();
	        sc.nextLine();
	        
	        System.out.println("Enter the name of the Employee: ");
	        name = sc.nextLine();
	        
	        System.out.println("Enter the designation of the Employee: ");
	        designation = sc.nextLine();
	        
	        System.out.println("Enter the Basic Salary of the Employee: ");
	        BS = sc.nextInt();
	        
	        
	        AS = BS*12;
	        
	        Worker Salary = new Worker();
		    Salary.setData(id, name, designation, BS, AS);
		    System.out.println("=================================================");
		    Salary.displayData();
		    	
		    	float TA = Salary.calculateTa();
		    	
		    	if (TA==2000)
		    	
		    		System.out.println("The Annual Salary with allowance for Manager: "+TA);
		    		
		    	else
		    		
		    		System.out.println("The Annual Salary with allowance for Employee: "+TA);
		    		
	        
	        }
}
}
