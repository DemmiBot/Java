package defaultpackage;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.OrderStatus;
import entities.Product2;

public class Composição {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Client data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Email: ");
		String email = sc.nextLine();
		System.out.println("Birth date(DD/MM/YYYY): ");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date birthDate = sdf.parse(sc.nextLine());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Insert OrderStatus:	PENDING_PAYMENT,\r\n"
				+ "	PROCESSING,\r\n"
				+ "	SHIPPED,\r\n"
				+ "	DELIVERED;: ");
		Order order = new Order(client, OrderStatus.valueOf(sc.nextLine()));
		
		System.out.println("Insert how many items: ");
		//for(int i=0;i !=sc.nextInt();) { do this while i is not 0
		int orderSize = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<orderSize;i++) {
			
			System.out.println("Insert product name: ");
			String productName = sc.nextLine();
			
			System.out.println("Insert product price: ");
			double price = sc.nextDouble();
			
			System.out.println("How many?\n");
			int quantity = sc.nextInt();
			sc.nextLine();
			
			Product2 product = new Product2(productName, price);
			OrderItem item = new OrderItem(product, quantity);
			order.addItem(item);
		}
		
		System.out.println(order);
		sc.close();
	}
}
