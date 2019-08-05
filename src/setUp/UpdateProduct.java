package setUp;

/**
 * Project about Inventory Management System that allows a member of staff to add,
 * view, update and delete different items currently in stock.
 * 
 * @autor Regiane Ivo(2016126)
 * 
 */

import java.util.Scanner;

import product.Book;
import product.Hardware;
import product.Product;
import product.Software;

public class UpdateProduct {

	//library scanner that will get the user inputs 
	Scanner scan = new Scanner(System.in);
	String bookTitle = "";
	
	// method that will add a new Product in the List
	public void addProduct(SetUp setUp) {
		System.out.println();
		System.out.println("| Add new Product |");
		System.out.print("Product Title (choices: Hardware/Softare/Book): ");
		String title = scan.next();
		
		// if statement that allow the user choose between book,software or hardware 
		//in case be a book, will allow the user input Book Title
		if (title.equals("Book")) {
			System.out.print("Book Title: ");
			String bookTitle = scan.next();
			
			Book b = new Book(bookTitle);
			
			//will set up the new book at the list of products
			setUp.listOfProducts.add(b);
			
			System.out.println("Did you create a new product!");
			
		//in case be a software, will allow the user input software Licence and operation system fields 
		} else if (title.equals("Software")){
			System.out.print("Software Licence: ");
			String softwarelicence = scan.next();
			
			System.out.print("Operational System: ");
			String softwareOpSystem = scan.next();
			
			Software s = new Software(softwarelicence, softwareOpSystem);
			
			//will set up the new software at the list of products
			setUp.listOfProducts.add(s);
			
			System.out.println("Did you create a new product!");
		
		//in case be a hardware, will allow the user input Brand and capacity fields
		} else if (title.equals("Hardware")) {
			System.out.print("Brand: ");
			String hardwareBrand = scan.next();
			
			System.out.print("Capacity: ");
			String hardwareCapacity = scan.next();
			
			Hardware h = new Hardware(hardwareBrand, hardwareCapacity);
			
			//will set up the new hardware at the list of products
			setUp.listOfProducts.add(h);
			
			System.out.println("Did you create a new product!");
						
		} else {
			System.out.println("");
		}
		
	}
	
	//method that will delete a product in the list
	public void deleteProduct(SetUp setUp) {
		
		System.out.print("Please select the product ID to be deleted: ");
		int option = scan.nextInt();
		
		for (int i = 0; i<setUp.listOfProducts.size(); i++) {
			Product p = setUp.listOfProducts.get(i); 
			
			if(p.getProductId()==(option)) {
				setUp.listOfProducts.remove(i);
			}
		}
		
		System.out.println("Product " + option + " deleted!");
		
	}
	
	//method that will edit a product
	//method not finished
	public void editProduct(SetUp setUp) {

		System.out.print("Please select the product ID to be edited: ");
		String option = scan.next();
		
		
		
	}
	
	//method that will search by Product's Title or Id
	//method not finished
	public void searchProduct(SetUp setUp) {
		
		System.out.println("Please select your search options (choices: ID or Title): ");
		
		String option = scan.next();
		
		if (option.equals("ID")) {
			System.out.print("Input to be edit Product ID: ");
			int productId = scan.nextInt();
			
			
						
             
		} else if(option.equals("Title"));
			System.out.print("Input the product Title (choices: Book, Software, Hardware: ");
			String title = scan.next();
			
			
			
			if (title.equals("Book")) {
							
				 
			} else if (title.equals("Software")){
				
			
			} else if (title.equals("Hardware")) {
				
							
			} else {
				System.out.println("");
			}
			
	
}
}
