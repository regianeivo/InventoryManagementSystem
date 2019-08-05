package setUp;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Project about Inventory Management System that allows a member of staff to
 * add, view, update and delete different items currently in stock.
 * 
 * @autor Regiane Ivo(2016126)
 * 
 */

public class Menu {
	
	//instantiate Printing and UpdateProducts Objects
	Printing printOut = new Printing();
	UpdateProduct updateProduct = new UpdateProduct();
	
	// library scanner to get the user option
	Scanner in = new Scanner(System.in);

	// will show in the screen the menu with the option to the user
	public void Options(SetUp setUp) {
		System.out.println();
		System.out.println("| Inventory Management |");
		System.out.println();
		System.out.println("[1] Add new Product");
		System.out.println("[2] View All Products");
		System.out.println("[3] Delete Product");
		System.out.println("[4] Edit Product");
		System.out.println("[5] Search Product by Title or ID");
		System.out.println("[6] Cancel");
		System.out.println();
		System.out.print("Please make your choice from the options above: ");
		
		int option = in.nextInt();

		try {
			switch (option) {
			case 1:
				updateProduct.addProduct(setUp);
				Options(setUp);
				break;
			case 2:
				printOut.displayProducts(setUp);
				Options(setUp);
				break;
			case 3:
				updateProduct.deleteProduct(setUp);
				Options(setUp);
				break;
			case 4:
				updateProduct.editProduct(setUp);
				Options(setUp);
				break;
			case 5:
				updateProduct.searchProduct(setUp);
				Options(setUp);
				break;
			case 6:
				System.out.println("This operation was cancelled.");
				System.exit(0);
			default:
				System.out.println("");
				System.out.println("No options match your input! Please, try again.");
				Options(setUp);
			}

		} catch (InputMismatchException e) {
			System.out.println("please, try again");
			in.nextInt();
			Options(setUp);
		}
	}

}