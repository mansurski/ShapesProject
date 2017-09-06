package shapes;
//random testing
public class TestShape {
	
	public static void main(String... args) {
		
		double a = 3, b = 4, c = 5;
		Shape triangle = new Triangle(a, b ,c);
		((Triangle)triangle).setSideA(1);
		Shape rectangle = new Rectangle(a,b);
		System.out.println(rectangle.area());
	}
}
