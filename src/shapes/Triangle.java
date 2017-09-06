package shapes;
//triangle is shape
public class Triangle extends Shape {
	//we can describe triangle with 3 sides
	private double mSideA, mSideB, mSideC;
	
	//constructing valid triangle
	public Triangle(double sideA, double sideB, double sideC) {
		if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
			throw new IllegalArgumentException("Triangle sides can't be <= 0!");
		}
		if(!isValidTriangle(sideA, sideB, sideC)) 
			throw new IllegalArgumentException("Not valid triangle sides!");
		mSideA = sideA;
		mSideB = sideB;
		mSideC = sideC;
	}
	
	//setting only valid sides for triangle
	public void setSideA(double sideA) {
		if(sideA <= 0)
			throw new IllegalArgumentException("Side a can't be <= 0!");
		if(!isValidTriangle(sideA, mSideB, mSideC)) 
			throw new IllegalArgumentException("Not valid side A!");
		mSideA = sideA;
	}
	
	public double getSideA() {
		return mSideA;
	}
	//setting only valid sides for triangle
	public void setSideB(double sideB) {
		if(sideB <= 0)
			throw new IllegalArgumentException("Side b can't be <= 0!");
		if(!isValidTriangle(mSideA, sideB, mSideC))
			throw new IllegalArgumentException("Not valid side B!");
		else mSideB = sideB;
	}
	
	public double getSideB() {
		return mSideB;
	}
	//setting only valid sides for triangle
	public void setSideC(double sideC) {
		if(sideC <= 0)
			throw new IllegalArgumentException("Side c can't be <= 0!");
		if(!isValidTriangle(mSideA, mSideB, sideC)) 
			throw new IllegalArgumentException("Not valid side C!");
		mSideC = sideC;
	}
	
	public double getSideC() {
		return mSideC;
	}
	//method to check if the given 3 sides describes triangle
	private boolean isValidTriangle(double sideA, double sideB, double sideC) {
		if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) 
			return true;
		return false;
	}
	//overriden method for calculating area of triangle	
	@Override
	public double area() {
		//s is halfperimeter
		double s = (mSideA + mSideB + mSideC) / 2;
		//Heron's formula
		return Math.sqrt(s * (s - mSideA) * (s - mSideB) * (s - mSideC));
	}
	//overriden method for calculating perimeter of triangle
	@Override
	public double perimeter() {
		return mSideA + mSideB + mSideC;
	}
	

}
