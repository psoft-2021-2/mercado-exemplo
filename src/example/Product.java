package example;
import java.util.UUID;

public class Product {
	
	private String id;
	
	private String name; 
	
	private String manufacturer;

	public Product(String name, String manufacturer) {
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.manufacturer = manufacturer;
	}
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Product ID: " + getId() + " - Manufacturer: " + getManufacturer();
	}
}
