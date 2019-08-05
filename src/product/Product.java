package product;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Project about Inventory Management System that allows a member of staff to add,
 * view, update and delete different items currently in stock.
 * 
 * @autor Regiane Ivo(2016126)
 * 
 */

public abstract class Product {
	
	//variables
	protected int productId;
	protected String productTitle;  // book, hardware or software
	private static final AtomicInteger idGenerator = new AtomicInteger(1000); 
	
	//Constructor	
	public Product() {
		//this variable was set to increment +1 to each book isbn create in the list
		this.productId = idGenerator.getAndIncrement();
	}

	//getters and setters
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductTitle() {
		return productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}
	
	
	
	@Override
	public String toString() {
		return "Product [productId = " + productId + ", productTitle=" + productTitle + "]";
	}
}
