package parents;

public abstract class Product {
	private String name;
	
	public Product() {
		
	}
	
	public Product(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	//Abstract method printInformation
	public abstract void printInformation();
}
