package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import shapes.Circle;

public class CircleTests {

	@Test
	public void circlePerimeterAndAreaShouldBeCalculated() {
		Circle circle = new Circle(2);
		assertEquals("Perimeter must be 12.56", 12.56, circle.perimeter(), 0.1);
		assertEquals("Area must be 12.56", 12.56, circle.area(), 0.01);
		
		Circle circle2 = new Circle(3.5);
		assertEquals("Perimeter must be 21.98", 21.98, circle2.perimeter(), 0.1);
		assertEquals("Area must be 38.46", 38.46, circle2.area(), 0.1);
		
	}
	@Test(expected = IllegalArgumentException.class)
	public void creatingCircleWithNegativeOrZeroRadiusShouldThrowException() {
		Circle circle = new Circle(-1);
		circle.area();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void settingNegativeOrZeroRadiusShouldThrowException() {
		Circle circle = new Circle(5.5);
		circle.setRadius(0);
	}

}
