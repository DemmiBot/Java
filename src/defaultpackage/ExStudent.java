package defaultpackage;
import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class ExStudent {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student a = new Student();
		
		System.out.println("Insert student name: ");
		a.name = sc.nextLine();
		
		System.out.println("Insert grade 1: ");
		a.grade1 = sc.nextDouble();

		System.out.println("Insert grade 2: ");
		a.grade2 = sc.nextDouble();
		
		System.out.println("Insert grade 3: ");
		a.grade3 = sc.nextDouble();
		
		System.out.println(a);
		
		sc.close();
	}
}
