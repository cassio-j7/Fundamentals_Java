package entities;

public class Product {
	
	//modificador de acesso private para não permite que outras classe acessem meus atributos (encapsulamento)
	private String name;
	private double price;
	private int quantity;
	
	//Sobrecarga
	public Product() {}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Sobrecarga	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double totalValueStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		 this.quantity += quantity;
		
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return  "Product: " + name +
				", Price: R$" + String.format("%.2f",price) +
				", quantity in stock: " + quantity + " units in stock.";					
	}

}
