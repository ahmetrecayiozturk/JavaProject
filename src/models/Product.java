package models;

public class Product {
	int id;
	String name,description,price,stock,category;
	
	public static void addProduct() {
		
	}
	public static void updateProduct() {
		
	}
	public static void deleteProduct() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescraption() {
		return description;
	}
	public void setDescraption(String descraption) {
		this.description = descraption;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	

	
}
