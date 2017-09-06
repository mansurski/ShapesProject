package shapes;

//rectangle is shape
public class Rectangle extends Shape {
	//we can describe rectangle with its width and length
	private double mWidth, mLength; 
	
	public Rectangle(double width, double length) {
		setWidth(width);
		setLength(length);	
	}
	
	//check for negative width
	public void setWidth(double width) {
		if(width <= 0) {
			throw new IllegalArgumentException("Width can't be <= 0!");
		}
		mWidth = width;
	}
	
	public double getWidth() {
		return mWidth;
	}
	//check for negative length
	public void setLength(double length) {
		if(length <= 0) {
			throw new IllegalArgumentException("Length can't be <= 0!");
		}
		mLength = length;
	}
	
	public double getLenght() {
		return mLength;
	}
	//overriden method for calculating area of rectangle
	@Override
	public double area() {
		return mWidth * mLength;
	}
	//overriden method for calculating perimeter of rectangle
	@Override
	public double perimeter() {
		return 2 * (mWidth + mLength);
	}

}
