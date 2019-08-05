package setUp;

/**
 * Project about Inventory Management System that allows a member of staff to add,
 * view, update and delete different items currently in stock.
 * 
 * @autor Regiane Ivo(2016126)
 * 
 */

public class Main {

	public static void main(String[] args) {
		
		SetUp setUp = new SetUp();
		Menu menu = new Menu();
		setUp.getItReady();
		menu.Options(setUp);
		
      
	}
}
