package defaultpackage;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class ExEmployee {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee a = new Employee();
		
		System.out.println("Insira o nome do funcionario: ");
		a.name = sc.nextLine();
		
		System.out.println("Insira o salario bruto: ");
		a.grossSalary = sc.nextDouble();
		
		System.out.println("Insira o valor de imposto: ");
		a.tax = sc.nextDouble();
		
		System.out.println("Employee data: " + a);
		
		a.increaseSalary(sc.nextDouble());
		
		System.out.println("Updated employee data: " + a);
		
		sc.close();
	}
}
