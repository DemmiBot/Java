package defaultpackage;
import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class ExProdutos {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product arroz = new Product();
		
		System.out.println("Enter product data:");
		System.out.println("Name: ");
		arroz.name = sc.nextLine();
		System.out.println("Price: ");
		arroz.price = sc.nextDouble();
		System.out.println("Quantity: ");
		arroz.quantity = sc.nextInt();
		
		System.out.println("Product data: " + arroz);
		/*System.out.printf("Product data: %s, %.2fR$, %d Units, Total: %.2fR$\n",
				arroz.name, arroz.price, arroz.quantity, arroz.valueInStock());*/
		
		System.out.println("Enter number of products to be added: ");
		arroz.addProducts(sc.nextInt());
		
		System.out.println("Updated product data: " + arroz);
		/*System.out.printf("Updated product data: %s, %.2fR$, %d Units, Total: %.2fR$\n",
				arroz.name, arroz.price, arroz.quantity, arroz.valueInStock());*/
		
		System.out.println("Enter number of products to be removed: ");
		arroz.removeProducts(sc.nextInt());
		
		System.out.println("Updated product data: " + arroz);
		/*System.out.printf("Updated product data: %s, %.2fR$, %d Units, Total: %.2fR$\n",
				arroz.name, arroz.price, arroz.quantity, arroz.valueInStock());*/
		
		sc.close();
	}
}
