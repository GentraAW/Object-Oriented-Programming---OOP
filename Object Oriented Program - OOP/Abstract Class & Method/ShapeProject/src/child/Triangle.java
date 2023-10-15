package child;
import parents.Shape;

public class Triangle extends Shape {
	private double base;
	private double height;
	
	public Triangle(double base, double height, String color) {
		setColor(color);
		this.base = base;
		this.height = height;
	}
	
	//overide dan implementasi method abstact getArea
	@Override
	public double getArea() {
		double area = 0.5 * base * height;
		return area;
	}
	
	
}
