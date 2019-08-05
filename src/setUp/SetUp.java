package setUp;

/**
 * Project about Inventory Management System that allows a member of staff to add,
 * view, update and delete different items currently in stock.
 * 
 * @autor Regiane Ivo(2016126)
 * 
 */

import java.util.ArrayList;
import java.util.Random;

import setUp.StoredData;
import product.Book;
import product.Hardware;
import product.Product;
import product.Software;


public class SetUp {
	
	// variable that will define the qtd of the products in 20  
	int amtOfProducts = 20;
	
	// getting the data stored in the class Stored Data
	public StoredData sd = new StoredData();
	
	public static ArrayList<Product> listOfProducts = new ArrayList();
	
	Random r = new Random();
	
	//method that will get the data ready
	public void getItReady() {
		createData();
		
	}
	
	// method that will create a list of 20 Products  
	public void createData() {
		
		for (int i = 0; i < amtOfProducts; i++) {
            int randomProduct = (r.nextInt(3) + 1);
            listOfProducts.add(createRandomProduct(randomProduct));
        }
	}
	
	//method that will create a List of products randomly using the data from the class Stored Data 
	private Product createRandomProduct(int number) {
		
		String bookId = sd.bookTitle[r.nextInt(sd.bookTitle.length)];
		String hardwareCapacity = sd.hardwareCapacity[r.nextInt(sd.hardwareCapacity.length)];
		String hardwareBrand = sd.hardwareBrand[r.nextInt(sd.hardwareBrand.length)];
		String softwarelicence = sd.softwareLicence[r.nextInt(sd.softwareLicence.length)];
		String softwareOpSystem = sd.softwareOpSystem[r.nextInt(sd.softwareOpSystem.length)];
		
		switch(number) {
			case 1:
				return new Book(bookId);
			case 2:
				return new Hardware(hardwareCapacity, hardwareBrand);
			case 3:
				return new Software(softwarelicence, softwareOpSystem);
			default:
				return null;
		}
	}
	
	
	
	
	
}
