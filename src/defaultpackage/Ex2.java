package defaultpackage;
import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		final float pi = 3.14f;
		float raio = sc.nextFloat();
		float area = raio*raio*pi;
		System.out.printf("Area = %.4f", area);
		sc.close();
	}
}
