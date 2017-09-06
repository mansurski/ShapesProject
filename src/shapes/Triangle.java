package shapes;

public class Triangle extends Shape {

	private double a, b, c;
	
	public Triangle(double a, double b, double c) {
		if(!isTriangle(a, b, c)) throw new IllegalArgumentException("Not valid triangle sides");
		if (a <= 0 || b <= 0 || c<= 0) {
			throw new IllegalArgumentException("Triangle sides can't be <= 0");
		}
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void setA(double a) {
		if(a <= 0) {
			throw new IllegalArgumentException("Side a can't be <= 0!");
		}
		if(!isTriangle(a, b, c)) throw new IllegalArgumentException("Not valid triangle sides");
		this.a = a;
	}
	
	public double getA() {
		return this.a;
	}
	
	public void setB(double b) {
		if(!isTriangle(a, b, c)) throw new IllegalArgumentException("Not valid triangle sides");

		if(b <= 0) {
			throw new IllegalArgumentException("Side b can't be <= 0!");
		}
		else this.b = b;
	}
	
	public double getB() {
		return this.b;
	}
	
	public void setC(double c) {
		if(!isTriangle(a, b, c)) throw new IllegalArgumentException("Not valid triangle sides");

		if(c <= 0) {
			throw new IllegalArgumentException("Side c can't be <= 0!");
		}
		else this.c = c;
	}
	
	public double getC() {
		return this.c;
	}
	
	private boolean isTriangle(double a, double b, double c) {
		if (a+b > c && a+c > b && b+c > a) return true;
		return false;
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
