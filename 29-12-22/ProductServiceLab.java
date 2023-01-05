package ThursdayLabNew;

import java.util.ArrayList;
import java.util.Scanner;

import ShoppingKartProject1.OrderDetails;
import ShoppingKartProject1.ShoppingKartOperations;

public class ProductServiceLab {
	
//ArrayList to store and display product 
static ArrayList <ProductLab>  product = new ArrayList<ProductLab>();
//ArrayList to store and display OrderDetails
static ArrayList <OrderDetailsLab> orders = new ArrayList <OrderDetailsLab>();
static Scanner sc = new Scanner (System.in);

static void addProduct()
{
	int Id;
	String Name;
	String Brand;
	double  price;
	int stock;
	
	System.out.println("Enter product Id: ");
	Id =  sc.nextInt();
	
	sc.nextLine();
	System.out.println("Enter product Name: ");
	Name = sc.nextLine();
	System.out.println("Enter product Brand: ");
	Brand = sc.nextLine();
	System.out.println("Enter product Price: ");
	price = sc.nextDouble();
	System.out.println("Enter product Stock: ");
	stock = sc.nextInt();  
	
	product.add(new ProductLab (Id,Name,Brand,price,stock));
	
	System.out.println("Product has been added sucessfully!");
	
}

//To update a product using Id

static void updateProductById(int Id) throws GlobalExceptionForProduct
{
	boolean status = false;
	for(int i =0;i<product.size();i++)
	{
		if(Id == product.get(i).getId())
		{
			System.out.println("Enter new product Id: ");
			int id =  sc.nextInt();
			
			sc.nextLine();
			System.out.println("Enter new product Name: ");
			String Name = sc.nextLine();
			System.out.println("Enter new product Brand: ");
			String Brand = sc.nextLine();
			System.out.println("Enter new product Price: ");
			Double price = sc.nextDouble();
			System.out.println("Enter new product Stock: ");
			int stock = sc.nextInt(); 
			
			product.set(i, new ProductLab(id,Name,Brand,price,stock));
			
			System.out.println("Product has been updated sucessfully!");
			status = true;
		}
	}
	if (status ==false) 
	
		 throw new GlobalExceptionForProduct("Product Id not found");
	
}

//To display a product using Id

static void getProductById(int Id) throws GlobalExceptionForProduct
{
	boolean status = false;
	for(int i = 0;i<product.size();i++)
	{
		if(Id == product.get(i).getId())
		{
			System.out.println("Product Name: "+product.get(i).getName());
			System.out.println("Product Brand: "+product.get(i).getBrand());
			System.out.println("Product Price: "+product.get(i).getPrice());
			System.out.println("Product Stock: "+product.get(i).getStock());
			status = true;
		}
	}
	if (status ==false) 
		
		 throw new GlobalExceptionForProduct("No such Id related product can be found!");
	
}

//To delete a product using Id

static void deleteProductById(int Id) throws GlobalExceptionForProduct
{
	boolean status = false;
	for(int i = 0;i<product.size();i++)
	{
		if(Id == product.get(i).getId())
		{
			product.remove(i);
			System.out.println("Product bearing Id "+Id+" has been deleted sucessfully! ");
			status = true;
		}
	}
	if (status == false)
		throw new GlobalExceptionForProduct("No such Id related product can be found!");
}

//To display all the products that have been added
static void displayAllProduct()
{
 for(int i =0;i<product.size();i++)
 {
	    System.out.println("Product Name: "+product.get(i).getName());
		System.out.println("Product Brand: "+product.get(i).getBrand());
		System.out.println("Product Price: "+product.get(i).getPrice());
		System.out.println("Product Stock: "+product.get(i).getStock());
		System.out.println("---------------------------------------------------------------------------------------");
}
 
}
// To delete all the products that have been added 

static void deleteAllProduct()
{
	product.clear();
	
		System.out.println("All the products has been removed sucessfully!");
		System.out.println("Cart is empty!");
		
}

//To place an order

static void orderProduct ()
{
	{
		boolean status = false;
		sc.nextLine();
		System.out.println("Enter product name: ");
		String name = sc.nextLine();
		System.out.println("=======================================================================================");
		for (int i = 0; i < product.size(); i++) 
		{
			if (product.get(i).getName().equalsIgnoreCase(name)) 
			{
				    
				    System.out.println("Product Id: "+product.get(i).getId());
				    System.out.println("Product Name: "+product.get(i).getName());
					System.out.println("Product Brand: "+product.get(i).getBrand());
					System.out.println("Product Price: "+product.get(i).getPrice());
					

				if (product.get(i).getStock() < 0) 
				{

					System.out.println("OOPS! This product is currently unavailable!");
					System.out.println("=======================================================================================");
				} 
				else 
				{
					System.out.println("Product Stock: " + product.get(i).getStock());
					System.out.println("=======================================================================================");
					status = true;
				}
			}
		}
		
		if (status == true) {
			System.out.println("Press 1 To go back to Main menu\nPress 2 To Continue Booking");
			int confirmation = sc.nextInt();
			if (confirmation == 1) {

				ShoppingKartArrayListOperations.mainMenu();

			} else if (confirmation == 2) {
				System.out.println("For booking the product, please enter product Id:");
				int Id = sc.nextInt();

				for (int i = 0; i < product.size(); i++) {
					if (product.get(i).getId() == Id) {
						System.out.println("Enter quantity: ");
						int quantity = sc.nextInt();

						if (product.get(i).getStock() >= quantity) 
						{
							System.out.println(" ");
							System.out.println("Your Booking has been done successfully!");
							System.out.println("---------------------------------------------------------------------------------------------");
							double total = quantity * product.get(i).getPrice();
							System.out.println("Please find your booking details below : ");
							System.out.println(" ");
							System.out.println("Product Name: " + product.get(i).getName());
							System.out.println("Product Brand: " + product.get(i).getBrand());
							System.out.println("Product Quantity: " + quantity);
							System.out.println("Total amount: " + total);
							
							//Updating quantity after booking

							product.get(i).setStock(product.get(i).getStock() - quantity);
							orders.add(new OrderDetailsLab(name,product.get(i).getBrand(),quantity,Id,total));

							break;
						}
					}
				}
			}
		} 
		else
			System.out.println("OOPS! No such product found!");
}
	
}

//To display all the placed orders

static void displayAllOrder()
{
	System.out.println("Your order history is as follows:  ");
	System.out.println(" ");
	for(int i =0;i<orders.size();i++)
	 {
		    System.out.println("Product Name: "+orders.get(i).getName2());
			System.out.println("Product Brand: "+orders.get(i).getBrand2());
			System.out.println("Product Price: "+orders.get(i).getTotalAmount());
			System.out.println("Product Stock: "+orders.get(i).getStock2());
			System.out.println("---------------------------------------------------------------------------------------");
	}
}

//To cancel an order

static void cancelOrderById(int Id) throws GlobalExceptionForProduct
{
	boolean status = false;
	for(int i = 0;i<product.size();i++)
	{
		if(Id == product.get(i).getId())
		{
			product.remove(i);
			System.out.println("Product bearing Id "+Id+" has been deleted sucessfully! ");
			status = true;
		}
	}
	if (status == false)
		throw new GlobalExceptionForProduct("No such Id related product can be found!");
}
}

	
