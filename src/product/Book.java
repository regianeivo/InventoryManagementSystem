package product;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Project about Inventory Management System that allows a member of staff to add,
 * view, update and delete different items currently in stock.
 * 
 * @autor Regiane Ivo(2016126)
 * 
 */

//sub class extending abstract Class Product
public class Book extends Product {

	//variables
	private int bookIsbn;
	private String bookTitle;
	private static final AtomicInteger idGenerator = new AtomicInteger(55000); 
																			   
	//constructor
	public Book(String bookTitle) {
		this.bookTitle = bookTitle;
		this.productTitle = "Book";
		//this variable was set to increment +1 to each book isbn create in the list 
		this.bookIsbn = idGenerator.getAndIncrement();
		
	}

	
	//getters and setters
	public int getBookIsbn() {
		return bookIsbn;
	}

	public void setBookIsbn(int bookIsbn) {
		this.bookIsbn = bookIsbn;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

//toString
	@Override
	public String toString() {
		return "Book [product ID: " + productId + 
				" / Book Title: " + bookTitle + 
				" / Book Isbn: " + bookIsbn + "]";

	}



	
}

	
	
		
	
	

