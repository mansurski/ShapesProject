package shapes;

public class Triangle extends Shape {

	private double a, b, c;
	
	public Triangle() {
		setA(1);
		setB(1);
		setC(1);
	}
	
	public Triangle(double a, double b, double c) {
		setA(a);
		setB(b);
		setC(c);
	}
	
	public void setA(double a) {
		if(a <= 0) {
			throw new IllegalArgumentException("Side a can't be <= 0!");
		}
		else this.a = a;
	}
	
	public double getA() {
		return this.a;
	}
	
	public void setB(double b) {
		if(b <= 0) {
			throw new IllegalArgumentException("Side b can't be <= 0!");
		}
		else this.b = b;
	}
	
	public double getB() {
		return this.b;
	}
	
	public void setC(double c) {
		if(c <= 0) {
			throw new IllegalArgumentException("Side c can't be <= 0!");
		}
		else this.c = c;
	}
	
	public double getC() {
		return this.c;
	}
	
	@Override
	public double area() {
		double s = (a + b + c) / 2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	@Override
	public double perimeter() {
		return (double)(a + b + c);
	}
	

}
