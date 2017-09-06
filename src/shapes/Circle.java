package shapes;

public class Circle extends Shape {
	
	private double radius;
	final double pi = 3.14;
	
	public Circle() {
		setRadius(1);
	}
	
	public Circle(double radius) {
		setRadius(radius);
	}
	
	public void setRadius(double radius) {
		if(radius <= 0) {
			throw new IllegalArgumentException("Radius can't be <= 0!");
		}
		else this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	@Override
	public double area() {
		return (double)(pi * Math.pow(radius, 2));
	}

	@Override
	public double perimeter() {
		return (double)(2 * pi * radius);
	}

}
