package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private Client client;
	private Date moment = new Date();
	public SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy HH:mm");
	private OrderStatus status = OrderStatus.PROCESSING;
	private List<OrderItem> orders = new ArrayList<>();

	public Order(Client client, OrderStatus status) {
		super();
		this.client = client;
		this.status = status;
	}

	public void addItem(OrderItem item) {
		orders.add(item);
	}
	
	public void removeItem(OrderItem item) {
		orders.remove(item);
	}
	
	double total() {
		double total = 0;
		for(OrderItem x: orders) {
			total += x.subTotal();
		}
		return total;
	}
	
	public OrderStatus getStatus(){
		return status;
	}
	
	public String toString() {
		return ("Order moment: " + sdf.format(moment) + "\n"
				+ "Order status: "+ status +"\n"
				+ client + "\n"
				+ "Order items: " + orders +"\n"
				+ "Total Price: "+ total()
				);
	}
	
	
}
