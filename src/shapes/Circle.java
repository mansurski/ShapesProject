package shapes;

//the circle is shape
public class Circle extends Shape {
	//we can describe circle with its radius
	private double mRadius;
	
	//the constant PI
	public static final double PI = Math.PI;
	
	public Circle(double radius) {
		setRadius(radius);
	}

	//check for negative radius in setter
	public void setRadius(double radius) {
		if(radius <= 0) {
			throw new IllegalArgumentException("Radius can't be <= 0!");
		}
		mRadius = radius;
	}
	
	public double getRadius() {
		return mRadius;
	}
	
	//the overriden method for calculating the area of given circle
	@Override
	public double area() {
		return PI * Math.pow(mRadius, 2);
	}

	//the overriden method for calculating the perimeter of given circle
	@Override
	public double perimeter() {
		return 2 * PI * mRadius;
	}

}
