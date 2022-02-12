package entities;
import java.lang.Math;

public class Triangle {
	public int width;
	public int height;
	
	public int perimeter() {
		return (width*2) + (height*2);
	}
	
	public int area() {
		return width*height;
	}
	public double diagonal() {
		return Math.sqrt(width*width + height*height);
	}
	public String toString() {
		return String.format("width: %d, height: %d, perimeter: %d, area: %d, diagonal: %.2f", width, height, perimeter(), area(), diagonal());
	}
}
