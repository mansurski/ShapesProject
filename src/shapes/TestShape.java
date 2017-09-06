package shapes;

public class TestShape {
	
	public static void main(String... args) {
		
		double a = -1, b = 10;
		Shape rectangle = new Rectangle(a,b);
		System.out.println(rectangle.area());
		
	}
}
