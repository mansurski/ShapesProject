package shapes;

public class Rectangle extends Shape {
	
	private double mWidth, mLength; 
	
	public Rectangle(double width, double length) {
		setWidth(width);
		setLength(length);	
	}
	
	public void setWidth(double width) {
		if(width <= 0) {
			throw new IllegalArgumentException("Width can't be <= 0!");
		}
		mWidth = width;
	}
	
	public double getWidth() {
		return mWidth;
	}
	
	public void setLength(double length) {
		if(length <= 0) {
			throw new IllegalArgumentException("Length can't be <= 0!");
		}
		mLength = length;
	}
	
	public double getLenght() {
		return mLength;
	}

	@Override
	public double area() {
		return mWidth * mLength;
	}

	@Override
	public double perimeter() {
		return 2 * (mWidth + mLength);
	}

}
