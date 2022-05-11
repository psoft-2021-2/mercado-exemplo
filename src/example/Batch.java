package example;
import java.util.Date;
import java.util.UUID;

public class Batch {
	
	private String id;
	
	private Product product;
	
	private Long quantity; 
	
	private Date manufacturingDate;
	
	private Date expirationDate; 
	
	public Batch(Product product, Long quantity) {
		
		this.id = UUID.randomUUID().toString();
		this.product = product;
		this.quantity = quantity;
	}
	
	public String getId() {
		return id;
	}

	public Product getProduct() {
		return product;
	}

	public Long getQuantity() {
		return quantity;
	}

	public Date getManufacturingDate() {
		return manufacturingDate;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public String toString() {
		return "Batch ID: " + getId() + " - Product: " + getProduct().getName() + " - " + getQuantity() + " items";
	}
}
