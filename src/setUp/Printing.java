package setUp;

/**
 * Project about Inventory Management System that allows a member of staff to add,
 * view, update and delete different items currently in stock.
 * 
 * @autor Regiane Ivo(2016126)
 * 
 */

import product.Product;

public class Printing{

	//it will display a list of products
	public void displayProducts(SetUp setUp) {
		for(int i = 0; i < setUp.listOfProducts.size(); i++) {
			Product p = setUp.listOfProducts.get(i);
			
			//printing using toString of the classes Book, Hardware, Product
			System.out.println(p.toString());
			System.out.println();
			
			
			
		}
	}

	
}
