package product;

/**
 * Project about Inventory Management System that allows a member of staff to add,
 * view, update and delete different items currently in stock.
 * 
 * @autor Regiane Ivo(2016126)
 * 
 */

//sub class extending abstract Class Product
public class Software extends Product{

	//variables
	private String softwarelicence;
	private String softwareOpSystem;
	
	//constructor
	public Software(String softwarelicence, String softwareOpSystem) {
		this.softwarelicence = softwarelicence;
		this.softwareOpSystem = softwareOpSystem;
		this.productTitle = "Software";
	}

	//getters and setters
	public String getSoftwarelicence() {
		return softwarelicence;
	}

	public void setSoftwarelicence(String softwarelicence) {
		this.softwarelicence = softwarelicence;
	}

	public String getSoftwareOpSystem() {
		return softwareOpSystem;
	}

	public void setSoftwareOpSystem(String softwareOpSystem) {
		this.softwareOpSystem = softwareOpSystem;
	}

	//toString
	@Override
	public String toString() {
	return "Software [Product ID: " + productId +
				" / Software Licence: "	+ softwarelicence + 
				" / Software Operation System: " + softwareOpSystem + "]";
	}
	
	
	
	
}
