package product;

/**
 * Project about Inventory Management System that allows a member of staff to add,
 * view, update and delete different items currently in stock.
 * 
 * @autor Regiane Ivo(2016126)
 * 
 */

//sub class extending abstract Class Product
public class Hardware extends Product{

	//variables
	private String hardwareCapacity;
	private String hardwareBrand;
	
	//constructor
	public Hardware(String hardwareCapacity, String hardwareBrand) {
		this.hardwareCapacity = hardwareCapacity;
		this.hardwareBrand = hardwareBrand;
		this.productTitle = "Hardware";
	}

	//getters and setters
	public String getHardwareCapacity() {
		return hardwareCapacity;
	}

	public void setHardwareCapacity(String hardwareCapacity) {
		this.hardwareCapacity = hardwareCapacity;
	}

	public String getHardwareBrand() {
		return hardwareBrand;
	}

	public void setHardwareBrand(String hardwareBrand) {
		this.hardwareBrand = hardwareBrand;
	}

	@Override
	public String toString() {
		return "Hardware [Product ID: " + productId +
				" / Hardware Capacity: " + hardwareCapacity + 
				" / Hardware Brand: " + hardwareBrand + "]";
	}
	
	
	
}
