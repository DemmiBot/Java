package defaultpackage;
import entities.Employee2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class EmployeeEx2 {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert No of employees: ");
		int quantityOfEmployees = sc.nextInt();
		
		
		List<Employee2> list = new ArrayList<>();
		
		for(int i=0;i<quantityOfEmployees;i++) {
			System.out.println("Insert employee ID: ");
			int id = sc.nextInt();
			System.out.println("Insert employee name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Insert employee salary: ");
			double salary = sc.nextDouble();
			Employee2 employee = new Employee2(name, salary, id);
			list.add(employee);
		}
		
		for(Employee2 x :list) {
			System.out.println(x);
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		
		boolean idStatus = false;
		
		for(Employee2 x :list) {
			if(x.id==id) {
				idStatus = true;
				System.out.println("Enter the percentage: ");
				x.increaseSalary(sc.nextDouble());
			}
		}
		
		if(idStatus==false) {
			System.out.println("There is no employee with this id!");
		}
		
		for(Employee2 x :list) {
			System.out.println(x);
		}
		
		sc.close();
	}
}
