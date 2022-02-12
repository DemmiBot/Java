package defaultpackage;
import java.util.Scanner;
import java.util.Locale;

public class Aula2 {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		System.out.printf("%.1f", x);
		sc.close();
	}
}
