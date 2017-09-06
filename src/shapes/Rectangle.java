package shapes;

public class Rectangle extends Shape {
	
	private double width, length; 
	
	public Rectangle() {
		setWidth(1);
		setLength(1);
	}
	
	public Rectangle(double width, double length) {
		setWidth(width);
		setLength(length);	
	}
	
	public void setWidth(double width) {
		if(width <= 0) {
			throw new IllegalArgumentException("Width can't be <= 0!");
		}
		else this.width = width;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public void setLength(double length) {
		if(length <= 0) {
			throw new IllegalArgumentException("Length can't be <= 0!");
		}
		else this.length = length;
	}
	
	public double getLenght() {
		return this.length;
	}

	@Override
	public double area() {
		return (double)(width * length);
	}

	@Override
	public double perimeter() {
		return (double)(2 * (width + length));
	}

}
