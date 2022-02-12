package entities;

public class Employee2 {
	
	private String name;
	private double salary;
	public int id;
	//private int id;
	
	public Employee2(String name, double salary, int id) {
		this.name = name;
		this.salary = salary;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public int getId() {
		return id;
	}

	public void increaseSalary(double percentage) {
		salary += salary*(percentage/100);
	}
	
	public String toString() {
		return ("ID: "+id+"\nEmployee: " + name + "\nSalary: " + salary + "R$");
	}
}
