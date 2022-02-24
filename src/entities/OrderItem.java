package entities;

public class OrderItem {
	private int quantity;
	Product2 item;
	
	public OrderItem(Product2 produto, int quantity) {
		this.quantity = quantity;
		item = produto;
	}

	public double subTotal() {
		return quantity*item.getPrice();
	}

	@Override
	public String toString() {
		return "quantity: " + quantity + " units of item: " + item + "|| Order total: " + subTotal()+ "\n";
	}
	
	
}
