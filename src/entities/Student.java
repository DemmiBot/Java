package entities;

public class Student {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double gradeAnual() {
		return (grade1+grade2+grade3);
	}
	public String status() {
		if(gradeAnual()>=60) {
			return "PASS";
		} else {
			return String.format("FAILED! \nMISSING %.2f POINTS!", 60.0-gradeAnual());
		}
	}
	public String toString() {
		return String.format("%s \nGrade 1: %.2f \nGrade 2: %.2f \nGrade 3: %.2f \nSTATUS: %s", name, grade1, grade2, grade3, status());
	}
}
