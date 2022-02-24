package entities;

public class Product2 {
	private String name;
	private double price;
	//public int quantity;
	public Product2(){
		
	}
	
	public Product2(String name, double price) {
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

	public String toString() {
		return name + ", price=" + price + "R$";
	}

	/*Pode se usar String.format para formatar tipo printf*/


}
