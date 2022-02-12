package defaultpackage;
import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class ExTriangulo {
	public static void main(String args[]) {
		
		Locale.setDefault(Locale.US);
		Triangle a = new Triangle();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o COMPRIMENTO: ");
		a.width = sc.nextInt();
		
		System.out.println("Insira a ALTURA: ");
		a.height = sc.nextInt();
		
		System.out.println(a);
		
		sc.close();
		
	}
}
