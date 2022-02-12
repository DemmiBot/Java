package defaultpackage;
import java.util.Scanner;

public class Ex1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x1, x2;
		x1 = sc.nextInt();
		x2 = sc.nextInt();
		System.out.printf("%d + %d = %d", x1, x2, x1 + x2);
		sc.close();
	}
}
